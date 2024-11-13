package com.sp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sp.entity.BankAccount;

public interface iBankAccountRepostionry extends JpaRepository<BankAccount, Long> {

}
