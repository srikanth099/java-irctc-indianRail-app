package org.indianrailways.irctc.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.indianrailways.irctc.entity.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void saveCustomer(CustomerEntity customerEntity) {
		try {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customerEntity);
		transaction.commit();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public List<CustomerEntity> findAllUsers(CustomerEntity customerEntity) {
		try {
		String hqlQuery="from CustomerEntity";
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hqlQuery);
		return query.getResultList();
		}catch (Exception e) {
			// TODO: handle exception
		}
		return collection;

		
	}
}
