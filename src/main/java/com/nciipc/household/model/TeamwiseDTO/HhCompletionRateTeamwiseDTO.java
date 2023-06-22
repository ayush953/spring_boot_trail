package com.nciipc.household.model.TeamwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface HhCompletionRateTeamwiseDTO {

	public String getTeam();
	public Float getCompleted();
	public Float getNoHhMemberAtHomeOrNoRespondentAtHome();
	public Float getEntireHhAbsentAtTimeOfVisit();
	public Float getPostponed();
	public Float getRefused();
	public Float getDwellingVacantOrAddressNotADwelling();
	public Float getDwellingDestroyed();
	public Float getDwellingNotFound();
	public Float getOther();
	public Float getPercentVal();
	public BigInteger getNumberVal();
	public Date getdate();
}
