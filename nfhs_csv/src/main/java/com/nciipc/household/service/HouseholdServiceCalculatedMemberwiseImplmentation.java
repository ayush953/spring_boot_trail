package com.nciipc.household.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nciipc.household.model.MemberwiseDTO.EligibleMenPerHhMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.EligibleWomenPerHhMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HhCompletionRateMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HhVisitMemberwiseDTO;
import com.nciipc.household.repository.MemberwiseReportsRepo;

@Service
public class HouseholdServiceCalculatedMemberwiseImplmentation
		implements HouseholdCalculatedMemberwiseServiceInterface {

	@Autowired
	private MemberwiseReportsRepo memberwiseReportsRepo;
	
	@Override
	public List<EligibleMenPerHhMemberwiseDTO> getAllEligibleMenPerHhMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllEligibleMenPerHhMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<HhCompletionRateMemberwiseDTO> getAllHhCompletionRateMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllHhCompletionRateMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<HhVisitMemberwiseDTO> getAllVisitHhMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllVisitHhMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<EligibleWomenPerHhMemberwiseDTO> getAllEligibleWomenPerHhMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllEligibleWomenPerHhMemberwise(stateId,teamNo);
	}
}
