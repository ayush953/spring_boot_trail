package com.nciipc.household.model.MemberwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface EligibleMenPerHhMemberwiseDTO {
	public String getMember();
	public BigInteger getNoOfCompletedHhUrban();
	public BigInteger getNoOfDeFactoEligibleMenInCompletedHhUrban();
	public Float getMeanNoOfDeFactoEligibleMenPerHhUrban();
	public BigInteger getNoOfCompletedHhRural();
	public BigInteger getNoOfDeFactoEligibleMenInCompletedHhRural();
	public Float getMeanNoOfDeFactoEligibleMenPerHhRural();
	public Date getdate();
}
