package com.marondal.ex.lesson04.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.marondal.ex.lesson04.model.User;

@Repository
public interface UserDAO {
	public User selectLastUser();
	
	public int insertUser(
			@Param("name") String name,
			@Param("yyyymmdd") String yyyymmdd,
			@Param("introduce") String introduce,
			@Param("email") String email);
	
	public int selectNameCount(@Param("name") String name);
}
