package com.nciipc.household.model.TeamwiseDTO;

import java.math.BigInteger;
import java.sql.Timestamp;


public interface EligibleWomenPerHhTeamwiseDTO {

	public String getTeam();
	public BigInteger getNoOfCompletedHhUrban();
	public BigInteger getNoOfDeFactoEligibleWomenInCompletedHhUrban();
	public Float getMeanNoOfDeFactoEligibleWomenPerHhUrban();
	public BigInteger getNoOfCompletedHhRural();
	public BigInteger egtNoOfDeFactoEligibleWomenInCompletedHhRural();
	public Float getMeanNoOfDeFactoEligibleWomenPerHhRural();
}
