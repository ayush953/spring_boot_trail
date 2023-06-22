package com.nciipc.household.service;

import java.io.Serializable;
import java.util.List;

import com.nciipc.household.model.QHSECOVER;

public interface HouseholdServiceInterface extends Serializable {
	
	public void saveData_QHSECOVER();
	
	public void saveData_QHSEC01X();
	
	public List<QHSECOVER> getData_QHSECOVER();

}
