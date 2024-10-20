package org.indianrailways.irctc.service.impl;

import java.util.List;

import org.indianrailways.irctc.entity.CustomerEntity;
import org.indianrailways.irctc.repository.CustomerRepository;
import org.indianrailways.irctc.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void processUserInfo(CustomerEntity customerEntity) {
		customerRepository.saveCustomer(customerEntity);
		// TODO Auto-generated method stub
		
	}

	public List<CustomerEntity> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CustomerEntity> getAllUsers(CustomerEntity customerEntity) {
		customerRepository.
		// TODO Auto-generated method stub
		return null;
	}

}
