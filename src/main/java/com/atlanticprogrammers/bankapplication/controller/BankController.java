package com.atlanticprogrammers.bankapplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.atlanticprogrammers.bankapplication.model.Bank;
import com.atlanticprogrammers.bankapplication.repository.BankRepository;
import com.atlanticprogrammers.bankapplication.repository.DetailsRepository;

@RestController
@RequestMapping("/api/loans/interest")
public class BankController {

	@Autowired
	private BankRepository bankRepository;
	
	@Autowired
	private DetailsRepository detailsRepository;
	
	@GetMapping
	public  List<Bank> getAllBanks() {
		return bankRepository.findAll();
	}
	
	@GetMapping("/{id}")
	public Bank getSingalBank(@PathVariable(value = "id") String banckCode) {
		return bankRepository.findById(banckCode).get();
	}
	
	@PostMapping
	public void insertBank(@RequestBody Bank bank) {
		bankRepository.save(bank);
	}
	
	@PutMapping("/bank/{id}")
	public void updateBankDetails(@PathVariable(value = "id") String banckCode, @RequestBody Bank bank) {
		Bank findById = bankRepository.findById(banckCode).get();
		bankRepository.deleteById(banckCode);
		bankRepository.save(bank);
	}
	
   @DeleteMapping("/bank/{id}")
   public void deleteBank(@PathVariable(value = "id") String banckCode) {
		bankRepository.deleteById(banckCode);
   }
}
