package com.nciipc.household.model.MemberwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface EligibleWomenPerHhMemberwiseDTO {
	public String getMember();
	public BigInteger getNoOfCompletedHhUrban();
	public BigInteger getNoOfDeFactoEligibleWomenInCompletedHhUrban();
	public Float getMeanNoOfDeFactoEligibleWomenPerHhUrban();
	public BigInteger getNoOfCompletedHhRural();
	public BigInteger egtNoOfDeFactoEligibleWomenInCompletedHhRural();
	public Float getMeanNoOfDeFactoEligibleWomenPerHhRural();
	public Date getdate();
}
