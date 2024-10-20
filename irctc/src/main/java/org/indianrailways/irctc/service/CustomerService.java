
package org.indianrailways.irctc.service;

import java.util.List;

import org.indianrailways.irctc.entity.CustomerEntity;

public interface CustomerService {
  public void processUserInfo(CustomerEntity customerEntity);
  
  public List<CustomerEntity> getAllUsers(CustomerEntity customerEntity);
}
