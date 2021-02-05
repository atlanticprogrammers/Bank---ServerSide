package com.atlanticprogrammers.bankapplication.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "currencyExchange", catalog = "bank")
public class CurrencyExchange {

	@Id
	private String banckName;
	
	private boolean usdAvailable;
	private double usdSellingRate;
	private double usdBuyingRate;
	private Date usdLastUpdateDate;
	
	private boolean gbpAvailable;
	private double gbpSellingRate;
	private double gbpBuyingRate;
	private Date gbpLastUpdateDate;
	
	private boolean euroAvailable;
	private double euroSellingRate;
	private double euroBuyingRate;
	private Date euroLastUpdateDate;
	
	public CurrencyExchange() { }

	public String getBanckName() {
		return banckName;
	}

	public boolean isUsdAvailable() {
		return usdAvailable;
	}

	public void setUsdAvailable(boolean usdAvailable) {
		this.usdAvailable = usdAvailable;
	}

	public double getUsdSellingRate() {
		return usdSellingRate;
	}

	public void setUsdSellingRate(double usdSellingRate) {
		this.usdSellingRate = usdSellingRate;
	}

	public double getUsdBuyingRate() {
		return usdBuyingRate;
	}

	public void setUsdBuyingRate(double usdBuyingRate) {
		this.usdBuyingRate = usdBuyingRate;
	}

	public Date getUsdLastUpdateDate() {
		return usdLastUpdateDate;
	}

	public void setUsdLastUpdateDate(Date usdLastUpdateDate) {
		this.usdLastUpdateDate = usdLastUpdateDate;
	}

	public boolean isGbpAvailable() {
		return gbpAvailable;
	}

	public void setGbpAvailable(boolean gbpAvailable) {
		this.gbpAvailable = gbpAvailable;
	}

	public double getGbpSellingRate() {
		return gbpSellingRate;
	}

	public void setGbpSellingRate(double gbpSellingRate) {
		this.gbpSellingRate = gbpSellingRate;
	}

	public double getGbpBuyingRate() {
		return gbpBuyingRate;
	}

	public void setGbpBuyingRate(double gbpBuyingRate) {
		this.gbpBuyingRate = gbpBuyingRate;
	}

	public Date getGbpLastUpdateDate() {
		return gbpLastUpdateDate;
	}

	public void setGbpLastUpdateDate(Date gbpLastUpdateDate) {
		this.gbpLastUpdateDate = gbpLastUpdateDate;
	}

	public boolean isEuroAvailable() {
		return euroAvailable;
	}

	public void setEuroAvailable(boolean euroAvailable) {
		this.euroAvailable = euroAvailable;
	}

	public double getEuroSellingRate() {
		return euroSellingRate;
	}

	public void setEuroSellingRate(double euroSellingRate) {
		this.euroSellingRate = euroSellingRate;
	}

	public double getEuroBuyingRate() {
		return euroBuyingRate;
	}

	public void setEuroBuyingRate(double euroBuyingRate) {
		this.euroBuyingRate = euroBuyingRate;
	}

	public Date getEuroLastUpdateDate() {
		return euroLastUpdateDate;
	}

	public void setEuroLastUpdateDate(Date euroLastUpdateDate) {
		this.euroLastUpdateDate = euroLastUpdateDate;
	}

	public void setBanckName(String banckName) {
		this.banckName = banckName;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [banckName=" + banckName + ", usdAvailable=" + usdAvailable + ", usdSellingRate="
				+ usdSellingRate + ", usdBuyingRate=" + usdBuyingRate + ", usdLastUpdateDate=" + usdLastUpdateDate
				+ ", gbpAvailable=" + gbpAvailable + ", gbpSellingRate=" + gbpSellingRate + ", gbpBuyingRate="
				+ gbpBuyingRate + ", gbpLastUpdateDate=" + gbpLastUpdateDate + ", euroAvailable=" + euroAvailable
				+ ", euroSellingRate=" + euroSellingRate + ", euroBuyingRate=" + euroBuyingRate
				+ ", euroLastUpdateDate=" + euroLastUpdateDate + "]";
	}

}
