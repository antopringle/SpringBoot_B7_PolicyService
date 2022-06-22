package com.customer.ms.customerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.ms.customerservice.model.CustomerM;
import com.customer.ms.customerservice.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRespository;
	
	public List<CustomerM> findAll() {
		//CustomerRepository customerRespository = new CustomerRepository();
		return customerRespository.findAll();
	}

}
