package com.atlanticprogrammers.bankapplication.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.atlanticprogrammers.bankapplication.model.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Integer> {
	List<CurrencyExchange> findAllByCurrencyType(@Param("currencyType") String currencyType);
	
	CurrencyExchange findByBankNameAndCurrencyType(String bankName, String currencyType);
}
