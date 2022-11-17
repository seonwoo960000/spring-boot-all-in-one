package com.example.personalprojecttemplate.domain.account;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.personalprojecttemplate.domain.account.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}