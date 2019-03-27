package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	public void saveProduct(Product product){
		System.out.println(sessionFactory);
		Session session=sessionFactory.openSession();//NullPointerException
		Transaction tr=session.beginTransaction();
		session.save(product);
		tr.commit();
		session.close();
	}
	
	
}
