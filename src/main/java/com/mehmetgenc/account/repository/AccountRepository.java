package com.mehmetgenc.account.repository;

import com.mehmetgenc.account.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
