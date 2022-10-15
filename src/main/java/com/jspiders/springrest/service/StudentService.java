package com.jspiders.springrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springrest.dao.StudentDAO;
import com.jspiders.springrest.dto.Student;

@Service
public class StudentService implements StudentServiceInterface {

	@Autowired
	private StudentDAO dao;

	@Override
	public Student insert(Student student) {
		if (student != null) {
			Student insertedStudent = dao.insert(student);
			return insertedStudent;
		}
		return null;
	}

	@Override
	public Student search(int id) {
		if (id > 0) {
			Student student = dao.search(id);
			return student;
		}
		return null;
	}

	@Override
	public Student remove(int id) {
		if (id > 0) {
			Student student = dao.remove(id);
		}
		return null;
	}

	@Override
	public Student update(int id, String name, String email, String contact) {
		if (id > 0) {
			Student student = dao.update(id, contact, contact, contact);
			return student;
		}
		return null;
	}

	

}