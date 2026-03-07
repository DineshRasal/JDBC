package com.rasal.rushi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rasal.rushi.dao.Student;

@Controller
public class StudentController {

	
@RequestMapping("/student")
public ModelAndView getStudent(Model model) {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("student");
	
	//Student s1=new Student();
	//s1.setId(101);
	//s1.setName("Rushi");
	//s1.setAge(22);
	
	//mv.addObject("student", s1);
	
	List<Student> l1=new ArrayList<Student>();
	Student s1=new Student(101,"Ram",35);
	Student s2=new Student(102,"Krishna",22);
	Student s3=new Student(103,"Shyam",25);
	l1.add(s1);
	l1.add(s2);
	l1.add(s3);
	
	mv.addObject("studentlist", l1);
	return mv;
}
}
