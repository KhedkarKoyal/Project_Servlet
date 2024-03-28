package org.tehhub.service;

import java.util.List;

import org.techhub.repository.ViewHotelsRepository;
import org.techhubModel.ViewHotelModel;

public class ViewHotelService {
	ViewHotelsRepository viewHotel=new ViewHotelsRepository();
public List<ViewHotelModel> isViewHotel()
{
	return viewHotel.isViewHotel();
	
}
}
