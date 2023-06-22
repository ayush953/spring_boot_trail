package com.nciipc.household.model.TeamwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface InterviewStartTimeTeamwiseDTO {

	public String getTeam();
	public BigInteger getSlot_6am_7_59am();
	public BigInteger getSlot_8am_8pm();
	public BigInteger getSlot_8_01pm_5_59am();
	public BigInteger getAllEligibleWomen();
	public Date getdate();
}
