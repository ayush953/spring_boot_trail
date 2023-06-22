package com.nciipc.household.model.DTO;

import java.math.BigInteger;
import java.sql.Date;

public interface HouseholdRelationsModulesDTO {
	
	public String getState();
	public BigInteger getTtNoOfWomenEligibleForDomesticViolence();
	public Float getEligibleWomenNotInterviewedBecauseOfPrivacyNotObtained();
	public Date getDate();
}
