package org.tehhub.service;

import org.techhub.repository.UpdateHotelRepository;
import org.techhubModel.UpdateHotelModel;

public class UpdateHotelService {
	UpdateHotelRepository updateRepo=new UpdateHotelRepository();
	public boolean isUpdate(UpdateHotelModel m)
	{
		return updateRepo.isHotelUpdate(m);
		
	}
}
