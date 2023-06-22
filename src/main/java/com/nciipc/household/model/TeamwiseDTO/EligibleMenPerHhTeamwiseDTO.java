package com.nciipc.household.model.TeamwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface EligibleMenPerHhTeamwiseDTO {
	
	public String getTeam();
	
	public BigInteger getNoOfCompletedHhUrban();
	public BigInteger getNoOfDeFactoEligibleMenInCompletedHhUrban();
	public Float getMeanNoOfDeFactoEligibleMenPerHhUrban();
	public BigInteger getNoOfCompletedHhRural();
	public BigInteger getNoOfDeFactoEligibleMenInCompletedHhRural();
	public Float getMeanNoOfDeFactoEligibleMenPerHhRural();
	public Date getdate();

}
