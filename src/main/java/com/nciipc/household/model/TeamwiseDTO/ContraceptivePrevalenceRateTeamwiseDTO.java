package com.nciipc.household.model.TeamwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface ContraceptivePrevalenceRateTeamwiseDTO {

	public String getTeam();
	public Float getAnyMethod();
    public BigInteger getNumberVal();
    public Date getDate();
    
}
