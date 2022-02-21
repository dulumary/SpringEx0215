package com.marondal.ex.lesson04.dao;

import org.springframework.stereotype.Repository;

import com.marondal.ex.lesson04.model.User;

@Repository
public interface UserDAO {
	public User selectLastUser();
}
