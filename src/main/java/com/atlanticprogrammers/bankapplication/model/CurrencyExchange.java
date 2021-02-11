package com.atlanticprogrammers.bankapplication.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currencyExchange", catalog = "bank")
public class CurrencyExchange {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String bankName;
	private String currencyType;
	private boolean isAvailable;
	private double sellingRate;
	private double buyingRate;
	private Date lastUpdateDate;
	
	public CurrencyExchange() {}
	
	public CurrencyExchange(String bankName, String currencyType, boolean isAvailable, double sellingRate,
			double buyingRate, Date lastUpdateDate) {
		this.bankName = bankName;
		this.currencyType = currencyType;
		this.isAvailable = isAvailable;
		this.sellingRate = sellingRate;
		this.buyingRate = buyingRate;
		this.lastUpdateDate = lastUpdateDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getCurrencyType() {
		return currencyType;
	}
	public void setCurrencyType(String currencyType) {
		this.currencyType = currencyType;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public double getSellingRate() {
		return sellingRate;
	}
	public void setSellingRate(double sellingRate) {
		this.sellingRate = sellingRate;
	}
	public double getBuyingRate() {
		return buyingRate;
	}
	public void setBuyingRate(double buyingRate) {
		this.buyingRate = buyingRate;
	}
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", bankName=" + bankName + ", currencyType=" + currencyType
				+ ", isAvailable=" + isAvailable + ", sellingRate=" + sellingRate + ", buyingRate=" + buyingRate
				+ ", lastUpdateDate=" + lastUpdateDate + "]";
	}
}
