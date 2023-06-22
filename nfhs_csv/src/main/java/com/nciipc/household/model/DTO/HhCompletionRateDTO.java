package com.nciipc.household.model.DTO;

public interface HhCompletionRateDTO {
	
	public String getState();
	public String getCompleted();
	public String getNoHhMemberAtHomeOrNoRespondentAtHome();
	public String getEntireHhAbsentAtTimeOfVisit();
	public String getPostponed();
	public String getRefused();
	public String getDwellingVacantOrAddressNotADwelling();
	public String getDwellingDestroyed();
	public String getDwellingNotFound();
	public String getOther();
	public String getPercentVal();
	public String getNumberVal();

}
