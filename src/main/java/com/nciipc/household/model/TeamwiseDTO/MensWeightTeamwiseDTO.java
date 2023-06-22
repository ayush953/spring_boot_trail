package com.nciipc.household.model.TeamwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface MensWeightTeamwiseDTO 
{
	public String getTeam();
	public Float getMesured();
	public Float getManNotPresent();
	public Float getManRefused();
	public Float getOther();
	public Float getMissing();
	public Float getTotal();
	public BigInteger getNumberOfMen();
	public Float getAmongMenMeasuredWeightOutOfRange();
	public Float getMenWithValidWeightData();
	public Date getdate();
}
