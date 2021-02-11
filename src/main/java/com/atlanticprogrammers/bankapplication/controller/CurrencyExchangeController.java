package com.atlanticprogrammers.bankapplication.controller;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.atlanticprogrammers.bankapplication.model.CurrencyExchange;
import com.atlanticprogrammers.bankapplication.model.CurrencyList;
import com.atlanticprogrammers.bankapplication.repository.CurrencyExchangeRepository;
import com.atlanticprogrammers.bankapplication.repository.CurrencyRepository;

@RestController
@RequestMapping("/api/currency/exchange")
public class CurrencyExchangeController {
	
	@Autowired
	private CurrencyExchangeRepository currencyExchangeRepository;
	
	@Autowired
	private CurrencyRepository currencyRepository;
	
	@GetMapping("/currencyList")
	public List<CurrencyList> getAllCurrencies() {
		return currencyRepository.findAll();
	}
	
	@GetMapping
	public List<CurrencyExchange> getAllCurrencyExchanges() {
		return currencyExchangeRepository.findAll();
	}
	
	@GetMapping("/{currencyType}")
	public List<CurrencyExchange> getAllCurrencyExchangesByCurrencyType(@PathVariable String currencyType) {
		List<CurrencyExchange> findAllByBankName = currencyExchangeRepository.findAllByCurrencyType(currencyType);
		return currencyExchangeRepository.findAllByCurrencyType(currencyType);
	}
	
	@GetMapping("/{bankName}/{currencyType}")
	public CurrencyExchange getCurrencyExchangesByCurrencyTypeAndBankName(@PathVariable String bankName, @PathVariable String currencyType) {
		 return currencyExchangeRepository.findByBankNameAndCurrencyType(bankName,currencyType);
	}
	
	@PostMapping("/currencyList")
	@ResponseStatus(HttpStatus.OK)
	public void inserCurrency(@RequestBody CurrencyList currencyList) {
		currencyRepository.save(currencyList);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public CurrencyExchange inserCurrencyExchange(@RequestBody CurrencyExchange currencyExchange) {
		currencyExchange.setLastUpdateDate(new Date());
		currencyExchange.setAvailable(true);
		return currencyExchangeRepository.save(currencyExchange);
	}
	
	@PutMapping("/update")
	@ResponseStatus(HttpStatus.OK)
	public CurrencyExchange updateCurrencyExchange(@RequestBody CurrencyExchange currencyExchange) {
		currencyExchange.setLastUpdateDate(new Date());
		return currencyExchangeRepository.save(currencyExchange);
	}
}


