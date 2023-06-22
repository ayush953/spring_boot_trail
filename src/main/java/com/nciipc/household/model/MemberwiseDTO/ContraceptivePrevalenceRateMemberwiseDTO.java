package com.nciipc.household.model.MemberwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface ContraceptivePrevalenceRateMemberwiseDTO {
	public String getMember();
	public Float getAnyMethod();
    public BigInteger getNumberVal();
    public Date getDate();
}
