package com.mehmetgenc.account.repository;

import com.mehmetgenc.account.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
