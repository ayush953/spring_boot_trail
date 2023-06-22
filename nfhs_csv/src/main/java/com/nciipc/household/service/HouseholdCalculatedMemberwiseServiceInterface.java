package com.nciipc.household.service;

import java.util.List;

import com.nciipc.household.model.MemberwiseDTO.EligibleMenPerHhMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.EligibleWomenPerHhMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HhCompletionRateMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HhVisitMemberwiseDTO;

public interface HouseholdCalculatedMemberwiseServiceInterface {

	List<EligibleMenPerHhMemberwiseDTO> getAllEligibleMenPerHhMemberwise(Integer stateId, Integer teamNo);

	List<HhCompletionRateMemberwiseDTO> getAllHhCompletionRateMemberwise(Integer stateId, Integer teamNo);

	List<HhVisitMemberwiseDTO> getAllVisitHhMemberwise(Integer stateId, Integer teamNo);

	List<EligibleWomenPerHhMemberwiseDTO> getAllEligibleWomenPerHhMemberwise(Integer stateId, Integer teamNo);

}
