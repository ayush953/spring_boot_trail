package com.nciipc.household.model.DTO;

import java.math.BigInteger;

public interface VaccinationHealthCardsDTO {

	public String getState();
	public Float getPerOfChildrenReportedToHaveVaccinationCard();
	public Float getPerOfChildrenWhoseVaccineCardWasSeen();
	public BigInteger getNumberOfChildren();
	public Float getProportionOfCardsSeen();
	
}
