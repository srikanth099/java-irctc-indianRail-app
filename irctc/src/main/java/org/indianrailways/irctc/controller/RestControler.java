package org.indianrailways.irctc.controller;

import java.util.List;

import org.indianrailways.irctc.entity.CustomerEntity;
import org.indianrailways.irctc.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller 1
//@ResponseBody 2
@RestController // spring framework will provide @RestController insted of 1,2 @Anootation
public class RestControler {
	
	@Autowired
	private CustomerServiceImpl customerServiceImpl;
	
	
}
