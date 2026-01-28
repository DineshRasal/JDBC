package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PersonDao {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step:1 Reading details from hibernate configuration file
		Configuration conf=new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		//Step:2 
		
		SessionFactory factory=conf.buildSessionFactory();
		
		//Step: 3
		
		Session session=factory.openSession();
		
		//Step: 4
		
		Transaction tx=session.beginTransaction();
		
		Person p=new Person("Shyam",22,"Pune",50000);
		
		session.save(p);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("Details Added Successfully");
		
		
	}
}
