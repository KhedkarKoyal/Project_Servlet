package org.tehhub.service;

import org.techhub.repository.UserRepository;
import org.techhubModel.userLoginModel;

public class UserService {
	UserRepository userRepo = new UserRepository();

	public boolean userLogin(userLoginModel model) {
		return userRepo.isUserLogin(model);
	}
	
	public boolean userReg(userLoginModel model)
	{
		return userRepo.isUserReg(model);
	}
}

