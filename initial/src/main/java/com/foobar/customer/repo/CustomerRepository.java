package com.foobar.customer.repo;

import com.foobar.customer.domain.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    Customer findById(Long id);
}
