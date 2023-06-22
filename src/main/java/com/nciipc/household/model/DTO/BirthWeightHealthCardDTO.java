package com.nciipc.household.model.DTO;

import java.math.BigInteger;
import java.sql.Date;

public interface BirthWeightHealthCardDTO {

	public String getState();
	public BigInteger getCard();
	public BigInteger getRecall();
	public BigInteger getCount();
	public Date getdate();
}
