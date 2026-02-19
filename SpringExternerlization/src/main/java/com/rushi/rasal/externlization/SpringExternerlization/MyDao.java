package com.rushi.rasal.externlization.SpringExternerlization;

public class MyDao {
	private String dbSource;
	
	public MyDao(String dbSource) {
		super();
		this.dbSource=dbSource;
	}
	
	@Override
	public String toString() {
		return "MyDao [dbSource=" +dbSource +"]";
	}
}
