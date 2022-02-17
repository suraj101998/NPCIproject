package com.NPCI.project.service;

import java.util.List;

import com.NPCI.project.entity.Customers;
import com.NPCI.project.response.UserDepartmentResponse;

public interface CustomerService {
	
	public List<Customers> getAllCustomers();
	public Customers getCustomerById(int userId);
	public Customers addOrUpdateCustomer(Customers user);
	public Customers deleteCustomer(int userId) throws Exception;
	public List<UserDepartmentResponse> getUserDepartMent();

}
