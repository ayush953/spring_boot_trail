package com.nciipc.household.service;

import java.util.List;

import com.nciipc.household.model.MemberwiseDTO.AgeDisplacementMenLowerLimitMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.AgeDisplacementMenUpperLimitMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.AgeDisplacementWomenLowerLimitMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.AgeDisplacementWomenUpperLimitMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.BirthDisplacementMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.BirthWeightHealthcardMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.ChildrensHeightMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.ChildrensWeightHeapingFirstDecimalMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.ChildrensWeightHeapingSecondDecimalMemberwiseDTO2;
import com.nciipc.household.model.MemberwiseDTO.ChildrensWeightMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.ContraceptivePrevalenceRateMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.EligibleMenPerHhMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.EligibleMenResponseRateMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.EligibleWomenPerHhMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.EligibleWomenResponseRateMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HhCompletionRateMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HhVisitMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HouseholdRelationsModulesMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.InterviewStartTimeMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.MenVisit1554VisitsMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.MensHeightHeapingFirstDecimalMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.MensHeightMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.MensWeightHeapingFirstDecimalMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.MensWeightHeapingSecondDecimalMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.MensWeightMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.NoFoodConsumptionOfChildFrom6To23MonthsMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.SexRatioOfChildrenMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.VaccinationHealthCardsMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.WomenVisit1549VisitsMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.WomensHeightMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.WomensWeightMemberwiseDTO;

public interface HouseholdCalculatedMemberwiseServiceInterface {

	List<EligibleMenPerHhMemberwiseDTO> getAllEligibleMenPerHhMemberwise(Integer stateId, Integer teamNo);

	List<HhCompletionRateMemberwiseDTO> getAllHhCompletionRateMemberwise(Integer stateId, Integer teamNo);

	List<HhVisitMemberwiseDTO> getAllVisitHhMemberwise(Integer stateId, Integer teamNo);

	List<EligibleWomenPerHhMemberwiseDTO> getAllEligibleWomenPerHhMemberwise(Integer stateId, Integer teamNo);

	List<EligibleWomenResponseRateMemberwiseDTO> getAllEligibleWomenResponseRateMemberwise(Integer stateId,
			Integer teamNo);

	List<WomenVisit1549VisitsMemberwiseDTO> getAllWomenVisit1549VisitsMemberwise(Integer stateId, Integer teamNo);

	List<EligibleMenResponseRateMemberwiseDTO> getAllEligibleMenResponseRateMemberwise(Integer stateId, Integer teamNo);

	List<MenVisit1554VisitsMemberwiseDTO> getAllMenVisit1554VisitsMemberwise(Integer stateId, Integer teamNo);

	List<AgeDisplacementWomenLowerLimitMemberwiseDTO> getAllAgeDisplacementWomenLowerLimitMemberwise(Integer stateId,
			Integer teamNo);

	List<AgeDisplacementWomenUpperLimitMemberwiseDTO> getAllAgeDisplacementWomenUpperLimitMemberwise(Integer stateId,
			Integer teamNo);

	List<AgeDisplacementMenLowerLimitMemberwiseDTO> getAllAgeDisplacementMenLowerLimitMemberwise(Integer stateId,
			Integer teamNo);

	List<AgeDisplacementMenUpperLimitMemberwiseDTO> getAllAgeDisplacementMenUpperLimitMemberwise(Integer stateId,
			Integer teamNo);

	List<BirthDisplacementMemberwiseDTO> getAllBirthDisplacementMemberwise(Integer stateId, Integer teamNo);

	List<VaccinationHealthCardsMemberwiseDTO> getAllVaccinationHealthCardsMemberwise(Integer stateId, Integer teamNo);

	List<HouseholdRelationsModulesMemberwiseDTO> getAllHouseholdRelationsModulesMemberwise(Integer stateId,
			Integer teamNo);

	List<ContraceptivePrevalenceRateMemberwiseDTO> getAllContraceptivePrevalenceRateMemberwise(Integer stateId,
			Integer teamNo);

	List<SexRatioOfChildrenMemberwiseDTO> getAllSexRatioOfChildrenMemberwise(Integer stateId, Integer teamNo);
	
	List<WomensHeightMemberwiseDTO> getAllWomensHeightMemberwise(Integer stateId, Integer teamNo);
	
	List<WomensWeightMemberwiseDTO> getAllWomensWeightMemberwise(Integer stateId, Integer teamNo);
	
	List<BirthWeightHealthcardMemberwiseDTO> getAllBirthWeightHealthcardMemberwise(Integer stateId, Integer teamNo);
	
	List<InterviewStartTimeMemberwiseDTO> getAllInterviewStartTimeMemberwise(Integer stateId, Integer teamNo);
	
	List<MensHeightMemberwiseDTO> getAllMensHeightMemberwise(Integer stateId, Integer teamNo);
	
	List<NoFoodConsumptionOfChildFrom6To23MonthsMemberwiseDTO> getAllNoFoodConsumptionOfChildFrom6To23MonthsMemberwise(Integer stateId, Integer teamNo);

	List<ChildrensHeightMemberwiseDTO> getAllChildrensHeightMemberwise(Integer stateId,
			Integer teamNo);
	
	List<ChildrensWeightMemberwiseDTO> getAllChildrensWeightMemberwise(Integer stateId,
			Integer teamNo);
	
	List<ChildrensWeightHeapingFirstDecimalMemberwiseDTO> getAllChildrensWeightHeapingFirstDecimalMemberwise(Integer stateId,
			Integer teamNo);
	
	List<ChildrensWeightHeapingSecondDecimalMemberwiseDTO2> getAllChildrensWeightHeapingSecondDecimalMemberwise(Integer stateId,
			Integer teamNo);

	
	List<MensWeightHeapingFirstDecimalMemberwiseDTO> getAllMensWeightHeapingFirstDecimalMemberwise(Integer stateId,
			Integer teamNo);
	
	List<MensWeightHeapingSecondDecimalMemberwiseDTO> getAllMensWeightHeapingSecondDecimalMemberwise(Integer stateId,
			Integer teamNo);

	List<MensWeightMemberwiseDTO> getAllMensWeightMemberwise(Integer stateId,
			Integer teamNo);
	
	List<MensHeightHeapingFirstDecimalMemberwiseDTO> getAllMensHeightHeapingFirstDecimalMemberwise(Integer stateId,
			Integer teamNo);
}
