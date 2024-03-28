package org.techhub.repository;

import java.util.ArrayList;
import java.util.List;

import org.techhubModel.AddHotelModel;
import org.techhubModel.DeteteHotelModel;

public class DeleteHotelRepository extends DBConfig{
public boolean isDelete(int hid)
{
	try {
		stmt=conn.prepareStatement("delete from AddHotel where hid=?");
		stmt.setInt(1, hid);
		int val=stmt.executeUpdate();
		return val>0?true:false;
	}catch(Exception e)
	{
		System.out.println("Error is "+e);
		return false;
	}
}
	
}
