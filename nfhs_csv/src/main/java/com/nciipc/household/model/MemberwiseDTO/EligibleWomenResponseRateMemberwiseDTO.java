package com.nciipc.household.model.MemberwiseDTO;

import java.math.BigInteger;
import java.sql.Timestamp;

public interface EligibleWomenResponseRateMemberwiseDTO {
	public String getMember();
	public Float getCompleted();
	public Float getNotAtHome();
	public Float getPostponed();
	public Float getRefused();
	public Float getPartlyCompleted();
	public Float getIncapacited();
	public Float getOther();
	public Float getPercentVal();
	public BigInteger getNumberVal();
	public Timestamp getDateAttribute();
}
