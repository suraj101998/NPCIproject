package com.NPCI.project.response;

import java.sql.Date;

import lombok.Data;

@Data
public class UserDepartmentResponse {
	
	private String CUSTOMER_NAME;
	private int ACCOUNT_NUMBER;
	private String transaction_type;
	private String transaction_id;
	private String transaction_to;
	private Date transaction_date;
	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}
	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}
	public int getACCOUNT_NUMBER() {
		return ACCOUNT_NUMBER;
	}
	public void setACCOUNT_NUMBER(int aCCOUNT_NUMBER) {
		ACCOUNT_NUMBER = aCCOUNT_NUMBER;
	}
	public String getTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(String transaction_type) {
		this.transaction_type = transaction_type;
	}
	public String getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(String transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getTransaction_to() {
		return transaction_to;
	}
	public void setTransaction_to(String transaction_to) {
		this.transaction_to = transaction_to;
	}
	public Date getTransaction_date() {
		return transaction_date;
	}
	public void setTransaction_date(Date transaction_date) {
		this.transaction_date = transaction_date;
	}
	
	

}
