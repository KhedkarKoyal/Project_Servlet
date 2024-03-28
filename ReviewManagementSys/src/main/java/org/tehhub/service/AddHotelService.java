package org.tehhub.service;

import org.techhub.repository.AddHotelRepository;
import org.techhubModel.AddHotelModel;

public class AddHotelService {
AddHotelRepository aHotelRepo=new AddHotelRepository();
public boolean isAddHotel(AddHotelModel addHotel)
{
	return aHotelRepo.isAddHotel(addHotel);
	
}



}
