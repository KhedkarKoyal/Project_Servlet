package org.techhub.repository;

import java.util.ArrayList;
import java.util.List;

import org.techhubModel.AddHotelDetailsModel;
import org.techhubModel.AddHotelModel;
import org.techhubModel.CityaAddModel;

public class CityRepository extends DBConfig {	
public boolean isCityAdd(CityaAddModel  model)
{
	
	try{
		
		stmt=conn.prepareStatement("insert into city values('0',?)");
		stmt.setString(1, model.getCname());
		System.out.println();
		int val=stmt.executeUpdate();
		return val>0?true:false;
	}
	catch(Exception e)
	{
		System.out.println("is error----->"+e);
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
}
public List<CityaAddModel>fetchCity(){
	List<CityaAddModel> list1=new ArrayList<CityaAddModel>();
	try {
		stmt=conn.prepareStatement("select * from city");
		rs=stmt.executeQuery();
		while(rs.next())
		{
			CityaAddModel mk=new CityaAddModel();
			mk.setCid(rs.getInt(1));
			mk.setCname(rs.getString(2));
			list1.add(mk);
		}
		return list1.size()>0?list1:null;
	}
	catch(Exception e)
	{
		System.out.println("error is "+e);
	}
	return null;
	
}
	public boolean isHotelDetails(AddHotelDetailsModel model) {
		try {
			stmt=conn.prepareStatement("insert into hoteldetails values('0',?,?,?,?,?)");
			stmt.setString(1, model.getAddress());
			stmt.setString(2, model.getCity());
			stmt.setString(3, model.getContact());
			stmt.setString(4, model.getEmail());
			stmt.setInt(5, model.getId());
			int val=stmt.executeUpdate();
			return val>0?true:false;
		}catch(Exception e)
		{
			System.out.println("e---->"+e);
			return false;
		}
	}
	
	
	public List<AddHotelDetailsModel>getHotelDeatlis(){
		List<AddHotelDetailsModel> list=new ArrayList<AddHotelDetailsModel>();
		try {
			stmt=conn.prepareStatement("select h.Addhotel,hd.Email,hd.contact,hd.Address from AddHotel h left join hoteldetails hd on h.hid=hd.hid");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				AddHotelDetailsModel m=new AddHotelDetailsModel();
				m.setId(rs.getInt(1));
				m.setAddHotel(rs.getString(2));
				list.add(m);
				
			}
			return list.size()>0?list:null;
			
			
		}catch(Exception e)
		{
			System.out.println("error is----->"+e);
		}
		return null;
		
	}
	
	
}
