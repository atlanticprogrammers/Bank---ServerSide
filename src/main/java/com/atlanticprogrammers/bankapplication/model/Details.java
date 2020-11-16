package com.atlanticprogrammers.bankapplication.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details", catalog = "bank")
public class Details {

	@EmbeddedId
	@AttributeOverrides(
			{ 
				@AttributeOverride(name = "banckCode", column = @Column(name = "banckCode")),
				@AttributeOverride(name = "loanType", column = @Column(name = "loanType")),
				@AttributeOverride(name = "duration", column = @Column(name = "duration")),
			}
	)
	@Id
	private DetailsId detailsId;
	private double interestRate;

	public Details() {
	}

	public Details(DetailsId detailsId, double interestRate) {
		this.detailsId = detailsId;
		this.interestRate = interestRate;
	}

	public DetailsId getDetailsId() {
		return detailsId;
	}

	public void setDetailsId(DetailsId detailsId) {
		this.detailsId = detailsId;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
