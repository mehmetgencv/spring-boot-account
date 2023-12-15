package com.mehmetgenc.account.service;

import com.mehmetgenc.account.model.Customer;
import com.mehmetgenc.account.repository.CustomerRepository;
import com.mehmetgenc.account.exception.CustomerNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findCustomerById(String id){
        return customerRepository.findById(id).
                orElseThrow(
                ()-> new CustomerNotFoundException("Customer could not find by id: " + id));
    }
}
