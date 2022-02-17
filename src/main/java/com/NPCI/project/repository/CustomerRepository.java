package com.NPCI.project.repository;


import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.NPCI.project.entity.Customers;

@Repository
public interface CustomerRepository extends CrudRepository<Customers, Integer> {

	
}