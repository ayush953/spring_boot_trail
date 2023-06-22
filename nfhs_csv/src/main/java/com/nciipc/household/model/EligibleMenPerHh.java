package com.nciipc.household.model;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "eligible_men_per_hh")
public class EligibleMenPerHh {
	
	@Id
	private Integer stateId;
	
	private BigInteger noOfCompletedHhUrban;
	
	private BigInteger noOfDeFactoEligibleMenInCompletedHhUrban;
	
	private Float meanNoOfDeFactoEligibleMenPerHhUrban;
	
	private BigInteger noOfCompletedHhRural;
	
	private BigInteger noOfDeFactoEligibleMenInCompletedHhRural;
	
	private Float meanNoOfDeFactoEligibleMenPerHhRural;
	
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public BigInteger getNoOfCompletedHhUrban() {
		return noOfCompletedHhUrban;
	}
	public void setNoOfCompletedHhUrban(BigInteger noOfCompletedHhUrban) {
		this.noOfCompletedHhUrban = noOfCompletedHhUrban;
	}
	public BigInteger getNoOfDeFactoEligibleMenInCompletedHhUrban() {
		return noOfDeFactoEligibleMenInCompletedHhUrban;
	}
	public void setNoOfDeFactoEligibleMenInCompletedHhUrban(BigInteger noOfDeFactoEligibleMenInCompletedHhUrban) {
		this.noOfDeFactoEligibleMenInCompletedHhUrban = noOfDeFactoEligibleMenInCompletedHhUrban;
	}
	public Float getMeanNoOfDeFactoEligibleMenPerHhUrban() {
		return meanNoOfDeFactoEligibleMenPerHhUrban;
	}
	public void setMeanNoOfDeFactoEligibleMenPerHhUrban(Float meanNoOfDeFactoEligibleMenPerHhUrban) {
		this.meanNoOfDeFactoEligibleMenPerHhUrban = meanNoOfDeFactoEligibleMenPerHhUrban;
	}
	public BigInteger getNoOfCompletedHhRural() {
		return noOfCompletedHhRural;
	}
	public void setNoOfCompletedHhRural(BigInteger noOfCompletedHhRural) {
		this.noOfCompletedHhRural = noOfCompletedHhRural;
	}
	public BigInteger getNoOfDeFactoEligibleMenInCompletedHhRural() {
		return noOfDeFactoEligibleMenInCompletedHhRural;
	}
	public void setNoOfDeFactoEligibleMenInCompletedHhRural(BigInteger noOfDeFactoFligibleMenInCompletedHhRural) {
		this.noOfDeFactoEligibleMenInCompletedHhRural = noOfDeFactoFligibleMenInCompletedHhRural;
	}
	public Float getMeanNoOfDeFactoEligibleMenPerHhRural() {
		return meanNoOfDeFactoEligibleMenPerHhRural;
	}
	public void setMeanNoOfDeFactoEligibleMenPerHhRural(Float meanNoOfDeFactoEligibleMenPerHhRural) {
		this.meanNoOfDeFactoEligibleMenPerHhRural = meanNoOfDeFactoEligibleMenPerHhRural;
	}
	@Override
	public String toString() {
		return "EligibleMenPerHh [stateId=" + stateId + ", noOfCompletedHhUrban=" + noOfCompletedHhUrban
				+ ", noOfDeFactoEligibleMenInCompletedHhUrban=" + noOfDeFactoEligibleMenInCompletedHhUrban
				+ ", meanNoOfDeFactoEligibleMenPerHhUrban=" + meanNoOfDeFactoEligibleMenPerHhUrban
				+ ", noOfCompletedHhRural=" + noOfCompletedHhRural + ", noOfDeFactoFligibleMenInCompletedHhRural="
				+ noOfDeFactoEligibleMenInCompletedHhRural + ", meanNoOfDeFactoEligibleMenPerHhRural="
				+ meanNoOfDeFactoEligibleMenPerHhRural + "]";
	}
	
	

}
