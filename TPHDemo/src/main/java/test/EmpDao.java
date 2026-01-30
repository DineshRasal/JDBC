package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpDao {

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
		
	Employee e1=new Employee();
	e1.setName("Rushi");
	
	
	Reg_Emp r1=new Reg_Emp();
	r1.setName("Vivek");
	r1.setSalary(50000);
	r1.setBonus(5555);
	
	Contract_Emp ce1= new Contract_Emp();
	ce1.setName("Sahil");
	ce1.setPay_per_hour(8);
	ce1.setContract_period("6 Months");
	
	
		
	
		
		session.persist(e1);
		session.persist(r1);
		session.persist(ce1);
		
		tx.commit();
		session.close();
		factory.close();
		
		System.out.println("Details Added Successfully");
		
				
	}

}
