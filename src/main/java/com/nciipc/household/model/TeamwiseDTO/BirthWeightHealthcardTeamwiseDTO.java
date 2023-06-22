package com.nciipc.household.model.TeamwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface BirthWeightHealthcardTeamwiseDTO {

	public String getTeam();
	public BigInteger getCard();
	public BigInteger getRecall();
	public BigInteger getCount();
	public Date getdate();
}
