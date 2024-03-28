package org.tehhub.service;

import org.techhub.repository.AdminLoginRepository;
import org.techhubModel.AdminLoginModel;

public class AdminLoginService {
	AdminLoginRepository  adRepo=new AdminLoginRepository ();
	public boolean isAdminLogin(AdminLoginModel model)
	{
		return adRepo.isAdminLogin(model);
		
	}
}
