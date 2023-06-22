package com.nciipc.household.model.DTO;

import java.math.BigInteger;
import java.sql.Date;

public interface WomensHeightDTO {
	
	public String getState();
	public Float getMesured();
	public Float getWomenNotPresent();
	public Float getWomenRefused();
	public Float getOther();
	public Float getMissing();
	public Float getTotal();
	public BigInteger getNumberOfWomen();
	public Float getWomenHtOutOfRange();
	public Float getWomenWithValidHtData();
	public Date getDate();
}
