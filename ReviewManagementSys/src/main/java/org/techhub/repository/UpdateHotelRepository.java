package org.techhub.repository;

import org.techhubModel.UpdateHotelModel;

public class UpdateHotelRepository extends DBConfig {
	public boolean isHotelUpdate(UpdateHotelModel model)
	{
		try {
			stmt=conn.prepareStatement("update AddHotel set AddHotel=? where hid=?");
			stmt.setString(1, model.getHotel());
			stmt.setInt(2, model.getHid());
			int val=stmt.executeUpdate();
			
			return val>0?true:false;
		}
		catch(Exception e)
		{
			System.out.println("Errorrr  is "+e);
			return false;
		}
		
		
	}

}
