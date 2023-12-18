package com.mehmetgenc.account.repository;

import com.mehmetgenc.account.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
