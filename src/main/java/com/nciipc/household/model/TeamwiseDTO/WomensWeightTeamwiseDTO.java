package com.nciipc.household.model.TeamwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface WomensWeightTeamwiseDTO {

	public String getTeam();
	public Float getMesured();
	public Float getWomenNotPresent();
	public Float getWomenRefused();
	public Float getOther();
	public Float getMissing();
	public Float getTotal();
	public BigInteger getNumberOfWomen();
	public Float getWomenWtOutOfRange();
	public Float getWomenWithValidWtData();
	public Date getdate();
}
