package org.tehhub.service;

import java.util.List;

import org.techhub.repository.CityRepository;
import org.techhubModel.AddHotelModel;
import org.techhubModel.CityaAddModel;

public class CityService {
	CityRepository CityRepo=new CityRepository();
	public boolean AddCity(CityaAddModel model)
	{
		return CityRepo.isCityAdd(model);
	}
	public List<AddHotelModel> isHotelFetch()
	{
		return CityRepo.fetchHotels();
	}
	public List<CityaAddModel> isCityFetch()
	{
		return CityRepo.fetchCity();
		
	}
}
