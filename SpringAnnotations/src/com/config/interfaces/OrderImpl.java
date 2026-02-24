package com.config.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Oi")
public class OrderImpl implements OrderInterface {
	
	@Autowired
	private OrderInterface dao;
	
	
	public OrderInterface getDao() {
		return dao;
	}


	public void setDao(OrderInterface dao) {
		this.dao = dao;
	}

	@Override
	public void placeOreder() {
		
		System.out.println("Inside OrderImpl Class");
		dao.createOrder();
	}


}
