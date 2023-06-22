package com.nciipc.household.model.DTO;

import java.math.BigInteger;
import java.sql.Date;

public interface EligibleWomenPerHhDTO {
	
	public String getState();
	
	public BigInteger getNoOfCompletedHhUrban();
	
	public BigInteger getNoOfDeFactoEligibleWomenInCompletedHhUrban();
	
	public Float getMeanNoOfDeFactoEligibleWomenPerHhUrban();
	
	public BigInteger getNoOfCompletedHhRural();
	
	public BigInteger getNoOfDeFactoEligibleWomenInCompletedHhRural();
	
	public Float getMeanNoOfDeFactoEligibleWomenPerHhRural();
	
	public Date getdate();

}
