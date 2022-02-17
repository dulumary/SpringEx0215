package com.marondal.ex.lesson03.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.marondal.ex.lesson03.model.Review;

@Repository
public interface ReviewDAO {
	
	// id 값을 전달 받아서 해당하는 리뷰 값을 리턴한다.
	public Review selectReview(@Param("id") int id);
}
