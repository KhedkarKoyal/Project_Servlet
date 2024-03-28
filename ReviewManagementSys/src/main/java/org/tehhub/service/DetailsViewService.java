package org.tehhub.service;

import java.util.List;

import org.techhub.repository.DetailsRepository;
import org.techhubModel.DetailsViewModel;


public class DetailsViewService {
	DetailsRepository detail=new DetailsRepository();
	public List<DetailsViewModel> isViewHotel()
	{
		return detail.isDetailView();
		
	}
	public boolean isDetailDelete(int did)
	{
		
		return detail.isDelete(did);
		
		
	}
}