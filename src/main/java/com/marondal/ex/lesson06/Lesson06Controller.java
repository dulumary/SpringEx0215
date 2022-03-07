package com.marondal.ex.lesson06;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.ex.lesson04.bo.UserBO;

@Controller
@RequestMapping("/lesson06")
public class Lesson06Controller {
	
	@Autowired
	private UserBO userBO;
	
	@GetMapping("/user_input")
	public String userInput() {
		
		return "lesson06/userInput";
	}
	
	
	// WEB REST API
	@PostMapping("/add_user")
	@ResponseBody
	public String addUser(
			@RequestParam("name") String name,
			@RequestParam("yyyymmdd") String yyyymmdd,
			@RequestParam("introduce") String introduce,
			@RequestParam("email") String email) {
		
		int count = userBO.addUser(name, yyyymmdd, introduce, email);
		
		if(count == 1) {
			return "success";
		} else {
			return "fail";
		}
		
	}
	
	// 이름 중복 확인 API
	@GetMapping("/is_duplicate")
	@ResponseBody
	public Map<String, Boolean> isDuplicate(@RequestParam("name") String name) {
		boolean isDuplicate = userBO.isDuplicate(name);
		// 중복인경우 
		// {"is_duplicate":true}
		// 중복이 아닌경우
		// {"is_duplicate":false}
		
		Map<String, Boolean> resultMap = new HashMap<>();
//		if(isDuplicate) {
//			resultMap.put("is_duplicate", true);	
//		} else {
//			resultMap.put("is_duplicate", false);
//		}
		
		resultMap.put("is_duplicate", isDuplicate);
		
		return resultMap;
		
	}
	
	
	

}
