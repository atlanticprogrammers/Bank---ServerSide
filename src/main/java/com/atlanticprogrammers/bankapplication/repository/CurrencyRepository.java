package com.atlanticprogrammers.bankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atlanticprogrammers.bankapplication.model.CurrencyList;

public interface CurrencyRepository extends JpaRepository<CurrencyList, String> {

}
