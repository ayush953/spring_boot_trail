package com.nciipc.household.model.DTO;

import java.math.BigInteger;
import java.sql.Date;


public interface EligibleMenPerHhDTO {
	
	
	public String getState();
	
	
	public BigInteger getNoOfCompletedHhUrban();
	
	public BigInteger getNoOfDeFactoEligibleMenInCompletedHhUrban();
	
	public Float getMeanNoOfDeFactoEligibleMenPerHhUrban();
	
	public BigInteger getNoOfCompletedHhRural();
	
	public BigInteger getNoOfDeFactoEligibleMenInCompletedHhRural();
	
	public Float getMeanNoOfDeFactoEligibleMenPerHhRural();
	public Date getdate();
	
	public String toString();
	
}
