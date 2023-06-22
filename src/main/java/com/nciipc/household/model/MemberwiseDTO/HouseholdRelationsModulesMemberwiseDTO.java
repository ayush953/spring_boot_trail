package com.nciipc.household.model.MemberwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface HouseholdRelationsModulesMemberwiseDTO {
	public String getMember();
	public BigInteger getTtNoOfWomenEligibleForDomesticViolence();
	public Float getEligibleWomenNotInterviewedBecauseOfPrivacyNotObtained();
	public Date getDate();
}
