package com.nciipc.household.model.TeamwiseDTO;

import java.math.BigInteger;

public interface VaccinationHealthCardsTeamwiseDTO {

	public String getTeam();
	public Float getPerOfChildrenReportedToHaveVaccinationCard();
	public Float getPerOfChildrenWhoseVaccineCardWasSeen();
	public BigInteger getNumberOfChildren();
	public Float getProportionOfCardsSeen();
	
}
