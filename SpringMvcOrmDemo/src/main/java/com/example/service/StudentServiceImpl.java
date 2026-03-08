package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Student;
import com.rushi.rasal.SpringJDBCDao.StudentDao;
@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDAO;
 
	@Override
	public void saveStudent(Student s) {
		studentDAO.saveStudent(s);
		
	}
 
	

	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentDAO.getAllStudents();
	}
 
}
 