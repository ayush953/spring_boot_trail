package com.nciipc.household.model.DTO;

import java.math.BigInteger;


public interface EligibleMenPerHhDTO {
	
	
	public String getState();
	
	
	public BigInteger getNoOfCompletedHhUrban();
	
	public BigInteger getNoOfDeFactoEligibleMenInCompletedHhUrban();
	
	public Float getMeanNoOfDeFactoEligibleMenPerHhUrban();
	
	public BigInteger getNoOfCompletedHhRural();
	
	public BigInteger getNoOfDeFactoEligibleMenInCompletedHhRural();
	
	public Float getMeanNoOfDeFactoEligibleMenPerHhRural();

	
}
