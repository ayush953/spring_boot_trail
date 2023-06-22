package com.nciipc.household.model.MemberwiseDTO;

import java.math.BigInteger;
import java.sql.Date;

public interface HhVisitMemberwiseDTO {
	public String getMember();
	
    public Float getVisit_1();
	
	public Float getVisit_2();
	
	public Float getVisit_3();
		
	public Float getPerSum();
	
	public BigInteger getNum();
	
	public Date getdate();
}
