package org.techhub.repository;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.techhubModel.DetailsViewModel;
import org.techhubModel.ViewHotelModel;

public class DetailsRepository extends DBConfig {

	List<DetailsViewModel> list = new ArrayList<DetailsViewModel>();

	public List<DetailsViewModel> isDetailView() {
		
		try {
			Statement st = conn.createStatement();
			rs = st.executeQuery(
					" select h.did,ad.hid,ad.AddHotel,h.Address,h.City,h.Email,h.Contact from Hoteldetails h inner join AddHotel ad on ad.hid=h.hid");
		
			while (rs.next()) {
	
			//	System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+rs.getString(6));
				DetailsViewModel view = new DetailsViewModel();
				//view.setDid(rs.getInt(1));
				view.setDid(rs.getInt(1));
				view.setId(rs.getInt(2));
				view.setAddHotel(rs.getString(3));
				view.setAddress(rs.getString(4));
				view.setCity(rs.getString(5));
				view.setContact(rs.getString(6));
				view.setEmail(rs.getString(7));
				

				list.add(view);
				
			}
			
			return list;
		} catch (Exception ex) {
System.out.println("error is....... "+ex);
		}
		return null;

	}

	public boolean isDelete(int did) {
		System.out.println(did);
		try {
			stmt = conn.prepareStatement("delete from  hoteldetails where did=?");
			stmt.setInt(1, did);
			int val = stmt.executeUpdate();
			
			return val > 0 ? true : false;
		} catch (Exception e) {
			System.out.println("Error is " + e.toString());
			return false;
		}

	}

}
