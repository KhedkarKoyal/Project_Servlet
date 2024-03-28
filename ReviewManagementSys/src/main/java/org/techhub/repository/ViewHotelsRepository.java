package org.techhub.repository;

import java.util.ArrayList;
import java.util.List;

import org.techhubModel.ViewHotelModel;

public class ViewHotelsRepository extends DBConfig {
	List<ViewHotelModel> list=new ArrayList<ViewHotelModel>();
	public List<ViewHotelModel> isViewHotel()
	{
		try {
			stmt=conn.prepareStatement("select * from Addhotel ;");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				ViewHotelModel view=new ViewHotelModel();
				view.setId(rs.getInt(1));
				view.setAddHotel(rs.getString(2));
				
				list.add(view);
				
			}
		return list;
		}catch(Exception e)
		{
			System.out.println("Error is"+e);
			
		}
		return null;
	
		
	}

}
