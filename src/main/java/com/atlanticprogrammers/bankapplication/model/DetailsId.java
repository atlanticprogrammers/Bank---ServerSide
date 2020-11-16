package com.atlanticprogrammers.bankapplication.model;

import javax.persistence.Embeddable;

@Embeddable
public class DetailsId implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private String banckCode;
	private String loanType;
	private int duration;

	public DetailsId() {
	}

	public DetailsId(String banckCode, String loanType, int duration) {
		this.banckCode = banckCode;
		this.loanType = loanType;
		this.duration = duration;
	}

	public String getBanckCode() {
		return banckCode;
	}

	public void setBanckCode(String banckCode) {
		this.banckCode = banckCode;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((banckCode == null) ? 0 : banckCode.hashCode());
		result = prime * result + duration;
		result = prime * result + ((loanType == null) ? 0 : loanType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DetailsId other = (DetailsId) obj;
		if (banckCode == null) {
			if (other.banckCode != null)
				return false;
		} else if (!banckCode.equals(other.banckCode))
			return false;
		if (duration != other.duration)
			return false;
		if (loanType == null) {
			if (other.loanType != null)
				return false;
		} else if (!loanType.equals(other.loanType))
			return false;
		return true;
	}
}
