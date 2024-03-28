package org.tehhub.service;

import java.util.List;

import org.techhub.repository.DeleteHotelRepository;
import org.techhubModel.AddHotelModel;
import org.techhubModel.DeteteHotelModel;

public class DeleteHotelService {
	DeleteHotelRepository del=new DeleteHotelRepository();
	public boolean isHotelDelete(int hid)
	{
		return del.isDelete(hid);
	}
	
	
}
