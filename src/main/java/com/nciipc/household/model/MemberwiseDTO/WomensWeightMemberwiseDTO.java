package com.nciipc.household.model.MemberwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface WomensWeightMemberwiseDTO {

	public String getMember();
	public Float getMesured();
	public Float getWomenNotPresent();
	public Float getWomenRefused();
	public Float getOther();
	public Float getMissing();
	public Float getTotal();
	public BigInteger getNumberOfWomen();
	public Float getWomenWtOutOfRange();
	public Float getWomenWithValidWtData();
	public Date getdate();
}
