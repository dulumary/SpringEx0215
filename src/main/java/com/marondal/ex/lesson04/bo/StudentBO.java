package com.marondal.ex.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.ex.lesson04.dao.StudentDAO;
import com.marondal.ex.lesson04.model.Student;

@Service
public class StudentBO {
	
	@Autowired
	private StudentDAO studentDAO;
	
	public int addStudent(Student student) {
		return studentDAO.insertStudent(student);
	}

}
