package com.marondal.ex.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.ex.lesson04.dao.UserDAO;
import com.marondal.ex.lesson04.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	
	public User getLastUser() {
		return userDAO.selectLastUser();
	}

}
