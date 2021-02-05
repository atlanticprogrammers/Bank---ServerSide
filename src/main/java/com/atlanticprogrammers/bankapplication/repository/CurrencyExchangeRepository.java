package com.atlanticprogrammers.bankapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.atlanticprogrammers.bankapplication.model.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, String> {

}
