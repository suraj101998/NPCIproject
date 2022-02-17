package com.NPCI.project.transactions.impl;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.NPCI.project.transactions.UserDao;
import com.NPCI.project.transactions.support.NameParametersJdbcDaoSupportClass;
import com.NPCI.project.response.UserDepartmentResponse;

@Repository
public class UserDaoImpl extends NameParametersJdbcDaoSupportClass implements UserDao {

	@Override
	public List<UserDepartmentResponse> getUserDepartment() {
		
		List<UserDepartmentResponse> users = null;
		
		try {
			String query = "select CUSTOMER_NAME,ACCOUNT_NUMBER,transaction_type,transaction_id,transaction_amount,transaction_to,transaction_date from transactions join customers on  transactions.customer_id = customers.CUSTOMER_ID";
			users = getNamedParameterJdbcTemplate()
					.getJdbcOperations()
					.query(
							query, 
							new BeanPropertyRowMapper<UserDepartmentResponse>(
									UserDepartmentResponse.class
									));
		} catch (Exception ex) {
			ex.getStackTrace();
		}
		
		return users;
	}
}
