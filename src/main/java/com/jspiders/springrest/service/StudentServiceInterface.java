package com.jspiders.springrest.service;

import com.jspiders.springrest.dto.Student;

public interface StudentServiceInterface {

	Student insert(Student student);
	
	Student search(int id);
	
	Student remove(int id);
	
	Student update(int id, String name, String email, String contact);
}