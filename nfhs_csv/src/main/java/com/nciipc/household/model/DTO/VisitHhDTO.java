package com.nciipc.household.model.DTO;

import java.math.BigInteger;

import javax.persistence.Id;

public interface VisitHhDTO {

	public String getState();
	
	public String getVisit_1();
	
	public String getVisit_2();
	
	public String getVisit_3();
		
	public String getPerSum();
	
	public BigInteger getNum();
}
