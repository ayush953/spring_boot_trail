package com.nciipc.household.model.MemberwiseDTO;

import java.math.BigInteger;

public interface VaccinationHealthCardsMemberwiseDTO {
	public String getMember();
	public Float getPerOfChildrenReportedToHaveVaccinationCard();
	public Float getPerOfChildrenWhoseVaccineCardWasSeen();
	public BigInteger getNumberOfChildren();
	public Float getProportionOfCardsSeen();
	
}
