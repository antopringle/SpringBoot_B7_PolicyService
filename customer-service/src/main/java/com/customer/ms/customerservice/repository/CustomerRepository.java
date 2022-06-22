package com.customer.ms.customerservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.customer.ms.customerservice.model.CustomerM;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerM, String>{

}
