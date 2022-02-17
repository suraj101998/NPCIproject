package com.NPCI.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.NPCI.project.transactions.UserDao;
import com.NPCI.project.entity.Customers;
import com.NPCI.project.service.CustomerService;
import com.NPCI.project.response.UserDepartmentResponse;
import com.NPCI.project.repository.CustomerRepository;


@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository userRepository;
	
	@Autowired
	private UserDao userDao;

	@Override
	public List<Customers> getAllCustomers() {
		// TODO Auto-generated method stub
		return (List<Customers>) userRepository.findAll();
	}

	@Override
	public Customers getCustomerById(int userId) {
		// TODO Auto-generated method stub
		return userRepository.findById(userId).orElse(null);
	}

	@Override
	public Customers addOrUpdateCustomer(Customers user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public Customers deleteCustomer(int userId) throws Exception {
		
		Customers deletedCustomer = null;
		try {
			deletedCustomer = userRepository.findById(userId).orElse(null);
			
			if(deletedCustomer == null) {
				throw new Exception("User is not available in database");
			}else {
				userRepository.deleteById(userId);
			}
		}catch(Exception ex) {
			throw ex;
		}
		return null;
	}

	@Override
	public List<UserDepartmentResponse> getUserDepartMent() {
		
		return userDao.getUserDepartment();
	}
	

}
