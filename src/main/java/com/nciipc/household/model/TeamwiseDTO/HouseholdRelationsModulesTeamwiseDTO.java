package com.nciipc.household.model.TeamwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface HouseholdRelationsModulesTeamwiseDTO {

	public String getTeam();
	public BigInteger getTtNoOfWomenEligibleForDomesticViolence();
	public Float getEligibleWomenNotInterviewedBecauseOfPrivacyNotObtained();
	public Date getDate();
}
