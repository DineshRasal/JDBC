package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface StudentService {
	void saveStudent(Student s);
	List<Student> getStudent();
}
