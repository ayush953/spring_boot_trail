package com.nciipc.household.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nciipc.household.model.TeamwiseDTO.AgeDisplacementMenLowerLimitTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.AgeDisplacementMenUpperLimitTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.AgeDisplacementWomenLowerLimitTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.AgeDisplacementWomenUpperLimitTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.BirthDisplacementTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.BirthWeightHealthcardTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.ChildrensHeightTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.ChildrensWeightHeapingFirstDecimalTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.ChildrensWeightHeapingSecondDecimalTeamwiseDTO2;
import com.nciipc.household.model.TeamwiseDTO.ChildrensWeightTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.ContraceptivePrevalenceRateTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.EligibleMenPerHhTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.EligibleMenResponseRateTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.EligibleWomenPerHhTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.EligibleWomenResponseRateTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.HhCompletionRateTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.HhVisitTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.HouseholdRelationsModulesTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.InterviewStartTimeTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.MenVisit1554VisitsTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.MensHeightHeapingFirstDecimalTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.MensHeightTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.MensWeightHeapingFirstDecimalTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.MensWeightHeapingSecondDecimalTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.MensWeightTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.NoFoodConsumptionOfChildFrom6To23MonthsTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.SexRatioOfChildrenTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.VaccinationHealthCardsTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.WomenVisit1549VisitsTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.WomensHeightTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.WomensWeightTeamwiseDTO;
import com.nciipc.household.repository.TeamwiseReportsRepo;

@Service
public class HouseholdServiceCalculatedTeamwiseImplmentation implements HouseholdCalculatedTeamwiseServiceInterface {
	
	@Autowired
	private TeamwiseReportsRepo teamwiseReportsRepo;
	
	@Override
	public List<EligibleWomenPerHhTeamwiseDTO> getAllEligibleWomenPerHhTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllEligibleWomenPerHhTeamwise(stateId);
	}
	
	@Override
	public List<HhVisitTeamwiseDTO> getAllVisitHhTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllVisitHhTeamwise(stateId);
	}

	@Override
	public List<EligibleMenPerHhTeamwiseDTO> getAllEligibleMenPerHhTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllEligibleMenPerHhTeamwise(stateId);
	}
	
	@Override
	public List<HhCompletionRateTeamwiseDTO> getAllHhCompletionRateTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllHhCompletionRateTeamwise(stateId);
	}
	
	@Override
	public List<AgeDisplacementMenLowerLimitTeamwiseDTO> getAllAgeDisplacementMenLowerLimitTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllAgeDisplacementMenLowerLimitTeamwise(stateId);
	}
	
	@Override
	public List<AgeDisplacementMenUpperLimitTeamwiseDTO> getAllAgeDisplacementMenUpperLimitTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllAgeDisplacementMenUpperLimitTeamwise(stateId);
	}
	
	@Override
	public List<AgeDisplacementWomenLowerLimitTeamwiseDTO> getAllAgeDisplacementWomenLowerLimitTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllAgeDisplacementWomenLowerLimitTeamwise(stateId);
	}
	
	@Override
	public List<AgeDisplacementWomenUpperLimitTeamwiseDTO> getAllAgeDisplacementWomenUpperLimitTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllAgeDisplacementWomenUpperLimitTeamwise(stateId);
	}
	
	@Override
	public List<EligibleWomenResponseRateTeamwiseDTO> getAllEligibleWomenResponseRateTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllEligibleWomenResponseRateTeamwise(stateId);
	}
	
	@Override
	public List<EligibleMenResponseRateTeamwiseDTO> getAllEligibleMenResponseRateTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllEligibleMenResponseRateTeamwise(stateId);
	}
	
	@Override
	public List<WomenVisit1549VisitsTeamwiseDTO> getAllWomenVisit1549VisitsTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllWomenVisit1549VisitsTeamwise(stateId);
	}
	
	@Override
	public List<MenVisit1554VisitsTeamwiseDTO> getAllMenVisit1554VisitsTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllMenVisit1554VisitsTeamwise(stateId);
	}
	
	@Override
	public List<HouseholdRelationsModulesTeamwiseDTO> getAllHouseholdRelationsModulesTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllHouseholdRelationsModulesTeamwise(stateId);
	}
	
	@Override
	public List<ContraceptivePrevalenceRateTeamwiseDTO> getAllContraceptivePrevalenceRateTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllContraceptivePrevalenceRateTeamwise(stateId);
	}
	
	@Override
	public List<VaccinationHealthCardsTeamwiseDTO> getAllVaccinationHealthCardsTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findVaccinationHealthCardsTeamwise(stateId);
	}
	
	@Override
	public List<BirthDisplacementTeamwiseDTO> getAllBirthDisplacementTeamwise(Integer stateId ){
		return teamwiseReportsRepo.findAllBirthDisplacementTeamwise(stateId);
	}

	@Override
	public List<SexRatioOfChildrenTeamwiseDTO> getAllSexRatioOfChildrenTeamwise(Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllSexRatioOfChildrenTeamwise(stateId);
	}

	@Override
	public List<WomensHeightTeamwiseDTO> getAllWomensHeightTeamwise(Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllWomensHeightTeamwise(stateId);
	}

	@Override
	public List<WomensWeightTeamwiseDTO> getAllWomensWeightTeamwise(Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllWomensWeightTeamwise(stateId);
	}

	@Override
	public List<BirthWeightHealthcardTeamwiseDTO> getAllBirthWeightHealthcardTeamwise(Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllBirthWeightHealthcardTeamwise(stateId);
	}

	@Override
	public List<InterviewStartTimeTeamwiseDTO> getAllInterviewStartTimeTeamwise(Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllInterviewStartTimeTeamwise(stateId);
	}

	@Override
	public List<MensHeightTeamwiseDTO> getAllMensHeightTeamwise(Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllMensHeightTeamwise(stateId);
	}

	@Override
	public List<NoFoodConsumptionOfChildFrom6To23MonthsTeamwiseDTO> getAllNoFoodConsumptionOfChildFrom6To23MonthsTeamwise(
			Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllNoFoodConsumptionOfChildFrom6To23MonthsTeamwise(stateId);
	}
	
	@Override
	public List<ChildrensHeightTeamwiseDTO> getAllChildrensHeightTeamwise(Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllChildrensHeightTeamwise(stateId);
	}

	@Override
	public List<ChildrensWeightTeamwiseDTO> getAllChildrensWeightTeamwise(Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllChildrensWeightTeamwise(stateId);
	}

	@Override
	public List<ChildrensWeightHeapingFirstDecimalTeamwiseDTO> getAllChildrensWeightHeapingFirstDecimalTeamwise(
			Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllChildrensWeightHeapingFirstDecimalTeamwise(stateId);
	}

	@Override
	public List<ChildrensWeightHeapingSecondDecimalTeamwiseDTO2> getAllChildrensWeightHeapingSecondDecimalTeamwise(
			Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllChildrensWeightHeapingSecondDecimalTeamwise(stateId);
	}

	@Override
	public List<MensWeightHeapingFirstDecimalTeamwiseDTO> getAllMensWeightHeapingFirstDecimalTeamwise(Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllMensWeightHeapingFirstDecimalTeamwise(stateId);
	}

	@Override
	public List<MensWeightHeapingSecondDecimalTeamwiseDTO> getAllMensWeightHeapingSecondDecimalTeamwise(
			Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllMensWeightHeapingSecondDecimalTeamwise(stateId);
	}

	@Override
	public List<MensWeightTeamwiseDTO> getAllMensWeightTeamwise(Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllMensWeightTeamwise(stateId);
	}

	@Override
	public List<MensHeightHeapingFirstDecimalTeamwiseDTO> getAllMensHeightHeapingFirstDecimalTeamwise(Integer stateId) {
		// TODO Auto-generated method stub
		return teamwiseReportsRepo.findAllMensHeightHeapingFirstDecimalTeamwise(stateId);
	}

}
