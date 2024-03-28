package org.techhub.repository;

import org.techhubModel.AdminLoginModel;

public class AdminLoginRepository extends DBConfig{
	
	public boolean isAdminLogin(AdminLoginModel model) 
	{
		try {
			stmt=conn.prepareStatement("select * from adminlogin where username=? and password=?");
			stmt.setString(1, model.getUsername());
			stmt.setString(2, model.getPassword());
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
			System.out.println("error is"+e);
		return false;
		}
		
	}

}
