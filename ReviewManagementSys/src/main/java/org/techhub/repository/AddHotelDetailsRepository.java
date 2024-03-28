package org.techhub.repository;

import java.util.ArrayList;
import java.util.List;

import org.techhubModel.AddHotelDetailsModel;
import org.techhubModel.AddHotelModel;

public class AddHotelDetailsRepository extends DBConfig {
	public boolean isHotelDetail(AddHotelDetailsModel model)
 {
	 System.out.println(model);
	 try {
		 stmt=conn.prepareStatement("insert into hoteldetails values('0',?,?,?,?,?)");
		 stmt.setString(1, model.getAddress());
		 stmt.setString(2, model.getCity());
		 stmt.setString(3, model.getEmail());
		 stmt.setString(4, model.getContact());
		 stmt.setString(5,model.getHotel());
		 int val=stmt.executeUpdate();
	 }
	 catch(Exception e)
	 {
		 System.out.println(e.toString());
		 System.out.println("error is==> "+e);
	 }
	return false;
	 
 }

public List<AddHotelModel> fetchHotels() {
	List<AddHotelModel> list=new ArrayList<AddHotelModel>();
	try
	{
	stmt=conn.prepareStatement("select * from addhotel");
	rs=stmt.executeQuery();
	while(rs.next())
	{
		AddHotelModel m=new AddHotelModel();
		m.setId(rs.getInt(1));
		m.setAddHotel(rs.getString(2));
		list.add(m);
		
	}
	return list.size()>0?list:null;
	}
	catch(Exception ex)
	{
	System.out.println(ex.toString());
	return null;
}
	
}}
