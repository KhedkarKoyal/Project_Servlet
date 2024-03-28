package org.techhub.repository;

//import java.sql.ResultSet;

import org.techhubModel.AddHotelModel;

public class AddHotelRepository extends DBConfig{
	public boolean isAddHotel(AddHotelModel amodel)
	{
		try {
			stmt=conn.prepareStatement("insert into AddHotel values('0',?)");
			//stmt.setInt(1, amodel.getId());
			stmt.setString(1,amodel.getAddHotel());
			int val=stmt.executeUpdate();
			if(val>0)
			{
				
				return true;
			}
			else {
				
				return false;
			}
			
		}
		catch(Exception e){
			System.out.println("error is "+e);
		}
		return false;
		
	}

}
