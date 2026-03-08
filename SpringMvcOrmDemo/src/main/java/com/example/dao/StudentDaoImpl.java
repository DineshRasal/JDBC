package com.example.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import org.hibernate.SessionFactory;
import com.rushi.rasal.SpringJDBCDao.Student;
import com.rushi.rasal.SpringJDBCDao.StudentDao;

@Repository
public class StudentDaoImpl implements StudentDao {
	private SessionFactory sessionFactory;
	@Override
	public void save(Student student) {
		sessionFactory.getCurrentSession().save(student);
		
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("from Student").list();
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
