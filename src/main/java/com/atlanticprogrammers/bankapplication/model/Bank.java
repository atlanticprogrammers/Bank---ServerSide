package com.atlanticprogrammers.bankapplication.model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bank", catalog = "bank")
public class Bank {
	
	@Id
	private String banckCode;
	private String name;
	@OneToMany(targetEntity = Details.class, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "bank_fk", referencedColumnName = "banckCode" )
	private List<Details> detailses;
	
	public Bank() {}

	public Bank(String banckCode, String name) {
		this.banckCode = banckCode;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bank [banckCode=" + banckCode + ", name=" + name +  "]";
	}

	public String getBanckCode() {
		return banckCode;
	}

	public void setBanckCode(String banckCode) {
		this.banckCode = banckCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Details> getDetailses() {
		return detailses;
	}

	public void setDetailses(List<Details> detailses) {
		this.detailses = detailses;
	}
}
