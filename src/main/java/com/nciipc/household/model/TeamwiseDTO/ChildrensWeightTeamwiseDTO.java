package com.nciipc.household.model.TeamwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface ChildrensWeightTeamwiseDTO 
{
	public String getTeam();
	public Float getMesured();
	public Float getChildNotPresent();
	public Float getRefused();
	public Float getOther();
	public Float getMissing();
	public Float getTotal();
	public BigInteger getNumberOfChildren();
	public Float getWeightOutOfRange();
	public Float getDateOfBirthIncomplete();
	public Float getChildrenWithValidData();
	public Float getWeightForHeightZScoreOutOfRange();
	public Date getdate();
}
