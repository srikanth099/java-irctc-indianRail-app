package org.indianrailways.irctc.controller;

import org.indianrailways.irctc.entity.CustomerEntity;
import org.indianrailways.irctc.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	@RequestMapping(value="/savePassenger")
	public ModelAndView savePassenger(CustomerEntity customerEntity) {
		System.out.println(customerEntity);
		customerServiceImpl.processUserInfo(customerEntity);
		return new ModelAndView("index.jsp");
	}
	
	
	

}
