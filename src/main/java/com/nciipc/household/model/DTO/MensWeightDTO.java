package com.nciipc.household.model.DTO;

import java.math.BigInteger;
import java.sql.Date;

public interface MensWeightDTO 
{
	public String getState();
	public Float getMesured();
	public Float getManNotPresent();
	public Float getManRefused();
	public Float getOther();
	public Float getMissing();
	public Float getTotal();
	public BigInteger getNumberOfMen();
	public Float getAmongMenMeasuredWeightOutOfRange();
	public Float getMenWithValidWeightData();
	public Date getdate();
}
