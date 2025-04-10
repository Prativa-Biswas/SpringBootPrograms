package com.nit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.Entity.BankAccount;

public interface IBankRepository extends JpaRepository<BankAccount, Long> {

	
}
