package com.atlanticprogrammers.bankapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currencyList", catalog = "bank")
public class CurrencyList {

	@Id
	private String currencyName;
	
	public CurrencyList() { }

	public CurrencyList(String currencyName) {
		this.currencyName = currencyName;
	}

	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	@Override
	public String toString() {
		return "CurrencyList [currencyName=" + currencyName + "]";
	}

}
