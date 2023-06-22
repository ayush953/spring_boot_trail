package com.nciipc.household.model.MemberwiseDTO;

public interface HhCompletionRateMemberwiseDTO {
	public String getMember();
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
