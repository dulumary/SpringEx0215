package com.marondal.ex.lesson03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.ex.lesson03.bo.ReviewBO;
import com.marondal.ex.lesson03.model.Review;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	@ResponseBody
	@RequestMapping("/lesson03/ex01")
	public Review review(
//			@RequestParam("id") int id) {  // 기본 사용법 필수 파라미터
//			@RequestParam(value="id", required=true) int id) {  // 필수 파라미터 
//			@RequestParam(value="id", required=false) Integer id) {  // 비 필수 파라미터 
			@RequestParam(value="id", defaultValue="1") int id) {
		
//		if(id == null) {
//			id = 1;
//		}
		
		return reviewBO.getReview(id);
		
	}
	
	
	

}
