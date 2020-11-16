package com.atlanticprogrammers.bankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atlanticprogrammers.bankapplication.model.Bank;

public interface BankRepository extends JpaRepository<Bank, String>  {

}
