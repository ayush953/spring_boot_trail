package com.nciipc.household.model.DTO;

import java.math.BigInteger;
import java.sql.Date;

public interface MensHeightDTO {

	public String getState();
	public Float getMeasured();
	public Float getMenNotPresent();
	public Float getMenRefused();
	public Float getOther();
	public Float getMissing();
	public Float getTotal();
	public BigInteger getNumberOfMen();
	public Float getMenHtOutOfRange();
	public Float getMenWithValidHtData();
	public Date getdate();
}
