package com.example.dao;

import java.util.List;

import com.example.model.Student;

public interface StudentDao {
	void saveStudent(Student s);
	List<Student> getAllStudents();
}
