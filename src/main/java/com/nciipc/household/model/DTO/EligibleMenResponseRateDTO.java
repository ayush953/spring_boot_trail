package com.nciipc.household.model.DTO;

import java.math.BigInteger;
import java.sql.Date;

public interface EligibleMenResponseRateDTO {

	public String getState();
	public Float getCompleted();
	public Float getNotAtHome();
	public Float getPostponed();
	public Float getRefused();
	public Float getPartlyCompleted();
	public Float getIncapacited();
	public Float getOther();
	public Float getPercentVal();
	public BigInteger getNumberVal();
	public Date getdate();
//	public Timestamp getDateAttribute();
}
