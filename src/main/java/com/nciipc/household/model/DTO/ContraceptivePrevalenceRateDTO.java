package com.nciipc.household.model.DTO;

import java.math.BigInteger;
import java.sql.Date;

public interface ContraceptivePrevalenceRateDTO {

	public String getState();
	public Float getAnyMethod();
    public BigInteger getNumberVal();
    public Date getDate();
}
