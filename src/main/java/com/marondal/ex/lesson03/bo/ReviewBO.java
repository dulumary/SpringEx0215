package com.marondal.ex.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.ex.lesson03.dao.ReviewDAO;
import com.marondal.ex.lesson03.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	// id 값을 전달 받아서 해당하는 리뷰 값을 리턴한다. 
	public Review getReview(int id) {
		
		return reviewDAO.selectReview(id);
	}
	
	
	
}
