package com.nciipc.household.model.MemberwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface BirthWeightHealthcardMemberwiseDTO {

	public String getMember();
	public BigInteger getCard();
	public BigInteger getRecall();
	public BigInteger getCount();
	public Date getdate();
}
