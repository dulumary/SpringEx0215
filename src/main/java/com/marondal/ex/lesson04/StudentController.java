package com.marondal.ex.lesson04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.marondal.ex.lesson04.bo.StudentBO;
import com.marondal.ex.lesson04.model.Student;

@Controller
@RequestMapping("/lesson04")
public class StudentController {
	
	@Autowired
	private StudentBO studentBO;
	
	@GetMapping("/ex02/input")
	public String studentInput() {
		return "lesson04/ex02Input";
	}
	
	@GetMapping("/ex02/add_student")
	public String addStudent(@ModelAttribute Student student, Model model) {
		
		int count = studentBO.addStudent(student);
		
		model.addAttribute("student", student);
		
		return "lesson04/ex02Info";
		
	}

}
