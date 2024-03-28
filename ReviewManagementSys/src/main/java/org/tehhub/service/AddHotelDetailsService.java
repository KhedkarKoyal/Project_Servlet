package org.tehhub.service;

import java.util.List;

import org.techhub.repository.AddHotelDetailsRepository;
import org.techhubModel.AddHotelDetailsModel;
import org.techhubModel.AddHotelModel;

public class AddHotelDetailsService {
	AddHotelDetailsRepository hotelDetails=new AddHotelDetailsRepository();
	public boolean isHotelDetail(AddHotelDetailsModel model)
	{
		
		return  hotelDetails.isHotelDetail(model);
		
	}
	public List<AddHotelModel> fetchHotels() {
		return hotelDetails.fetchHotels();
		
	}
	
}
