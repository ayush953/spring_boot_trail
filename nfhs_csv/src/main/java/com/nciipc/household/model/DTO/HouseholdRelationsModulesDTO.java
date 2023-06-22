package com.nciipc.household.model.DTO;

import java.math.BigInteger;

public interface HouseholdRelationsModulesDTO {
	
	public String getState();
	public BigInteger getTtNoOfWomenEligibleForDomesticViolence();
	public Float getEligibleWomenNotInterviewedBecauseOfPrivacyNotObtained();

}
