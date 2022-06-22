package com.customer.ms.customerservice.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.customer.ms.customerservice.model.Customer;

@Component
public class CustomerDAO {

	private static final Map<String, Customer> cusMap = new HashMap<String, Customer>();
	
	static {
		initCus();
	}
	
	private static void initCus() {
		
		Customer cus1 = new Customer("C01", "Alan", "NY");
		Customer cus2 = new Customer("C02", "Don", "NJ");
		Customer cus3 = new Customer("C03", "Smith", "CT");
		
		cusMap.put(cus1.getCusId(), cus1);
		cusMap.put(cus2.getCusId(), cus2);
		cusMap.put(cus3.getCusId(), cus3);
	}
		
		public List<Customer> getCustomers(){
		   Collection<Customer>	c = cusMap.values();
		   List<Customer> cusList =  new ArrayList<Customer>();
		   cusList.addAll(c);
		   return cusList;
		}
		
		public Customer getCustomerById(String cusId) {
			return cusMap.get(cusId);
		}
		
		public Customer addCustomer(Customer customer){
			cusMap.put(customer.getCusId(), customer);
			return customer;
		}
		
}
