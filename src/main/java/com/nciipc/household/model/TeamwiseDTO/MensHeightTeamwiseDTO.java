package com.nciipc.household.model.TeamwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface MensHeightTeamwiseDTO {

	public String getTeam();
	public Float getMeasured();
	public Float getMenNotPresent();
	public Float getMenRefused();
	public Float getOther();
	public Float getMissing();
	public Float getTotal();
	public BigInteger getNumberOfMen();
	public Float getMenHtOutOfRange();
	public Float getMenWithValidHtData();
	public Date getdate();
}
