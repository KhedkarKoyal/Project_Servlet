package org.techhub.repository;

import org.techhubModel.userLoginModel;

public class UserRepository extends DBConfig{

	public boolean isUserLogin(userLoginModel m)
	{
		try {
			
			stmt=conn.prepareStatement("select * from userReg where email=? and contact=?");
			stmt.setString(1, m.getUsername());
			stmt.setString(2, m.getPassword());
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return true;
				
			}
			else {
				return false;
			}
		}catch(Exception e)
		{
			System.out.println("error is....."+e);
			return false;
			}	
	}

public boolean isUserReg(userLoginModel m)
{
	try {
		stmt=conn.prepareStatement("insert into userreg values('0',?,?,?,?)");
		stmt.setString(1, m.getName());
		stmt.setString(2, m.getEmail());
		stmt.setString(3, m.getContact());
		stmt.setString(4, m.getAddress());
		int val=stmt.executeUpdate();
		return val>0?true:true;
	}catch(Exception e)
	{
		System.out.println("error is........>"+e);
		return false;
	}
}
}