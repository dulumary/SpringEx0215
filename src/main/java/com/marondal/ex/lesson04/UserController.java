package com.marondal.ex.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marondal.ex.lesson04.bo.UserBO;
import com.marondal.ex.lesson04.model.User;

@RequestMapping("/lesson04")
@Controller
public class UserController {
	
	@Autowired
	private UserBO userBO;

	@RequestMapping("/ex01")
	public String getUserView(Model model) {
		// 가장 최근 추가된 사용자 정보 
		User user = userBO.getLastUser();
		
		model.addAttribute("result", user);
		
		return "lesson04/ex01";
	}
}
