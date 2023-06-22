package com.nciipc.household.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	@Override
	public List<EligibleWomenResponseRateMemberwiseDTO> getAllEligibleWomenResponseRateMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllEligibleWomenResponseRateMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<WomenVisit1549VisitsMemberwiseDTO> getAllWomenVisit1549VisitsMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllWomenVisit1549VisitsMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<EligibleMenResponseRateMemberwiseDTO> getAllEligibleMenResponseRateMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllEligibleMenResponseRateMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<MenVisit1554VisitsMemberwiseDTO> getAllMenVisit1554VisitsMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllMenVisit1554VisitsMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<AgeDisplacementWomenLowerLimitMemberwiseDTO> getAllAgeDisplacementWomenLowerLimitMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllAgeDisplacementWomenLowerLimitMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<AgeDisplacementWomenUpperLimitMemberwiseDTO> getAllAgeDisplacementWomenUpperLimitMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllAgeDisplacementWomenUpperLimitMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<AgeDisplacementMenLowerLimitMemberwiseDTO> getAllAgeDisplacementMenLowerLimitMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllAgeDisplacementMenLowerLimitMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<AgeDisplacementMenUpperLimitMemberwiseDTO> getAllAgeDisplacementMenUpperLimitMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllAgeDisplacementMenUpperLimitMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<BirthDisplacementMemberwiseDTO> getAllBirthDisplacementMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllBirthDisplacementMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<VaccinationHealthCardsMemberwiseDTO> getAllVaccinationHealthCardsMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllVaccinationHealthCardsMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<HouseholdRelationsModulesMemberwiseDTO> getAllHouseholdRelationsModulesMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllHouseholdRelationsModulesMemberwise(stateId,teamNo);
	}
	
	@Override
	public List<ContraceptivePrevalenceRateMemberwiseDTO> getAllContraceptivePrevalenceRateMemberwise(Integer stateId, Integer teamNo){
		return memberwiseReportsRepo.findAllContraceptivePrevalenceRateMemberwise(stateId,teamNo);
	}

	@Override
	public List<SexRatioOfChildrenMemberwiseDTO> getAllSexRatioOfChildrenMemberwise(Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllSexRatioOfChildrenMemberwise(stateId, teamNo);
	}

	@Override
	public List<WomensHeightMemberwiseDTO> getAllWomensHeightMemberwise(Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllWomensHeightMemberwise(stateId, teamNo);
	}

	@Override
	public List<WomensWeightMemberwiseDTO> getAllWomensWeightMemberwise(Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllWomensWeightMemberwise(stateId, teamNo);
	}

	@Override
	public List<BirthWeightHealthcardMemberwiseDTO> getAllBirthWeightHealthcardMemberwise(Integer stateId,
			Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllBirthWeightHealthcardMemberwise(stateId, teamNo);
	}

	@Override
	public List<InterviewStartTimeMemberwiseDTO> getAllInterviewStartTimeMemberwise(Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllInterviewStartTimeMemberwise(stateId, teamNo);
	}

	@Override
	public List<MensHeightMemberwiseDTO> getAllMensHeightMemberwise(Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllMensHeightMemberwise(stateId, teamNo);
	}

	@Override
	public List<NoFoodConsumptionOfChildFrom6To23MonthsMemberwiseDTO> getAllNoFoodConsumptionOfChildFrom6To23MonthsMemberwise(
			Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllNoFoodConsumptionOfChildFrom6To23MonthsMemberwise(stateId, teamNo);
	}
	
	@Override
	public List<ChildrensHeightMemberwiseDTO> getAllChildrensHeightMemberwise(Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllChindrensHeightMemberwise(stateId, teamNo);
	}

	@Override
	public List<ChildrensWeightMemberwiseDTO> getAllChildrensWeightMemberwise(Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllChildrensWeightMemberwise(stateId, teamNo);
	}

	@Override
	public List<ChildrensWeightHeapingFirstDecimalMemberwiseDTO> getAllChildrensWeightHeapingFirstDecimalMemberwise(
			Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllChildrensWeightHeapingFirstDecimalMemberwise(stateId,teamNo);
	}

	@Override
	public List<ChildrensWeightHeapingSecondDecimalMemberwiseDTO2> getAllChildrensWeightHeapingSecondDecimalMemberwise(
			Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllChildrensWeightHeapingSecondDecimalMemberwise(stateId, teamNo);
	}

	@Override
	public List<MensWeightHeapingFirstDecimalMemberwiseDTO> getAllMensWeightHeapingFirstDecimalMemberwise(
			Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllMensWeightHeapingFirstDecimalMemberwise(stateId, teamNo);
	}

	@Override
	public List<MensWeightHeapingSecondDecimalMemberwiseDTO> getAllMensWeightHeapingSecondDecimalMemberwise(
			Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllMensWeightHeapingSecondDecimalMemberwise(stateId, teamNo);
	}

	@Override
	public List<MensWeightMemberwiseDTO> getAllMensWeightMemberwise(Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllMensWeightMemberwise(stateId, teamNo);
	}

	@Override
	public List<MensHeightHeapingFirstDecimalMemberwiseDTO> getAllMensHeightHeapingFirstDecimalMemberwise(
			Integer stateId, Integer teamNo) {
		// TODO Auto-generated method stub
		return memberwiseReportsRepo.findAllMensHeightHeapingFirstDecimalMemberwise(stateId, teamNo);
	}
	
	
}
