package com.nciipc.household.model.MemberwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface ChildrensHeightMemberwiseDTO 
{
	public String getMember();
	public Float getMesured();
	public Float getChildNotPresent();
	public Float getRefused();
	public Float getOther();
	public Float getMissing();
	public Float getTotal();
	public BigInteger getNumberOfChildren();
	public Float getHeightOutOfRange();
	public Float getDateOfBirthIncomplete();
	public Float getChildrenWithValidData();
	public Float getHeightForAgeZScoreOutOfRange();
	public Date getdate();
}
