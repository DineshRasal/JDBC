package com.config.interfaces;

import org.springframework.stereotype.Component;

@Component
public class OrederDaoimpl implements orderDaoInterface {

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside orderDao Implementation ");
	}

	

}
