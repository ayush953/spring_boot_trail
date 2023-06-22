package com.nciipc.household.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nciipc.household.model.Test;
import com.nciipc.household.model.DTO.AgeDisplacementMenLowerLimitDTO;
import com.nciipc.household.model.DTO.AgeDisplacementMenUpperLimitDTO;
import com.nciipc.household.model.DTO.AgeDisplacementWomenLowerLimitDTO;
import com.nciipc.household.model.DTO.AgeDisplacementWomenUpperLimitDTO;
import com.nciipc.household.model.DTO.BirthDisplacementDTO;
import com.nciipc.household.model.DTO.BirthWeightHealthCardDTO;
import com.nciipc.household.model.DTO.ChildrensHeightDTO;
import com.nciipc.household.model.DTO.ChildrensWeightDTO;
import com.nciipc.household.model.DTO.ChildrensWeightHeapingFirstDecimalDTO;
import com.nciipc.household.model.DTO.ChildrensWeightHeapingSecondDecimalDTO;
import com.nciipc.household.model.DTO.ContraceptivePrevalenceRateDTO;
import com.nciipc.household.model.DTO.EligibleMenPerHhDTO;
import com.nciipc.household.model.DTO.EligibleMenResponseRateDTO;
import com.nciipc.household.model.DTO.EligibleWomenPerHhDTO;
import com.nciipc.household.model.DTO.EligibleWomenResponseRateDTO;
import com.nciipc.household.model.DTO.HhCompletionRateDTO;
import com.nciipc.household.model.DTO.HouseholdRelationsModulesDTO;
import com.nciipc.household.model.DTO.InterviewStartTimeDTO;
import com.nciipc.household.model.DTO.MenVisit1554VisitsDTO;
import com.nciipc.household.model.DTO.MensHeightDTO;
import com.nciipc.household.model.DTO.MensHeightHeapingFirstDecimalDTO;
import com.nciipc.household.model.DTO.MensWeightDTO;
import com.nciipc.household.model.DTO.MensWeightHeapingFirstDecimalDTO;
import com.nciipc.household.model.DTO.MensWeightHeapingSecondDecimalDTO;
import com.nciipc.household.model.DTO.NoFoodConsumptionOfChildFrom6To23MonthsDTO;
import com.nciipc.household.model.DTO.SexRatioOfChildrenDTO;
import com.nciipc.household.model.DTO.VaccinationHealthCardsDTO;
import com.nciipc.household.model.DTO.VisitHhDTO;
import com.nciipc.household.model.DTO.WomenVisit1549VisitsDTO;
import com.nciipc.household.model.DTO.WomensHeightDTO;
import com.nciipc.household.model.DTO.WomensWeightDTO;
import com.nciipc.household.repository.ReportsRepo;
import com.nciipc.household.repository.TestRepo;

@Service
public class HouseholdServiceCalculatedImplmentation implements HouseholdCalculatedServiceInterface {
	
	@Autowired
	private ReportsRepo reportsRepo; 
			
	@Autowired
	private TestRepo testRepo;
	
	@Override
	public List<Test> getTestData(){
		return testRepo.findAll();
	}
	
	@Override
	public List<EligibleMenPerHhDTO> getAllEligibleMenPerHh(){
		return reportsRepo.findAllEligibleMenPerHh();
	}
	
	@Override
	public List<EligibleWomenPerHhDTO> getAllEligibleWomenPerHh(){
		return reportsRepo.findAllEligibleWomenPerHh();
	}
	
	@Override
	public List<VisitHhDTO> getAllVisitHh(){
		return reportsRepo.findAllVisitHh();
	}
	
	@Override
	public List<HhCompletionRateDTO> getAllHhCompletionRate(){
		return reportsRepo.getAllHhCompletionRate();
	}
	
	@Override
	public List<AgeDisplacementMenLowerLimitDTO> findAllAgeDisplacementMenLowerLimit(){
		return reportsRepo.findAllAgeDisplacementMenLowerLimit();
	}
	
	@Override
	public List<AgeDisplacementMenUpperLimitDTO> findAllAgeDisplacementMenUpperLimit(){
		return reportsRepo.findAllAgeDisplacementMenUpperLimit();
	}
	
	@Override
	public List<AgeDisplacementWomenLowerLimitDTO> findAllAgeDisplacementWomenLowerLimit(){
		return reportsRepo.findAllAgeDisplacementWomenLowerLimit();
	}
	
	@Override
	public List<AgeDisplacementWomenUpperLimitDTO> findAllAgeDisplacementWomenUpperLimit(){
		return reportsRepo.findAllAgeDisplacementWomenUpperLimit();
	}
	
	@Override
	public List<EligibleMenResponseRateDTO> findAllEligibleMenResponseRate(){
		return reportsRepo.findAllEligibleMenResponseRate();
	}
	
	@Override
	public List<EligibleWomenResponseRateDTO> findAllEligibleWomenResponseRate(){
		return reportsRepo.findAllEligibleWomenResponseRate();
	}
	
	@Override
	public List<WomenVisit1549VisitsDTO> findAllWomenVisit1549Visits(){
		return reportsRepo.findAllWomenVisit1549Visits();
	}
	
	@Override
	public List<HouseholdRelationsModulesDTO> getAllHouseholdRelationsModules(){
	System.out.println(reportsRepo.findAllHouseholdRelationsModules());
		return reportsRepo.findAllHouseholdRelationsModules();
	}
	
	@Override
	public List<ContraceptivePrevalenceRateDTO> getAllContraceptivePrevalenceRate(){
		return reportsRepo.findAllContraceptivePrevalenceRate();
	}
	
	@Override
	public List<BirthDisplacementDTO> getAllBirthDisplacement(){
		return reportsRepo.findAllBirthDisplacement();
	}
	
	@Override
	public List<VaccinationHealthCardsDTO> getAllVaccinationHealthCards(){
		return reportsRepo.findVaccinationHealthCards();
	}
	
	@Override
	public List<MenVisit1554VisitsDTO> getAllMenVisit1554Visits(){
		return reportsRepo.findAllMenVisit1554Visits();
	}
//	@Override
//	public List<InterviewStartTimeDTO> getAllInterviewStartTime(){
//		return reportsRepo.findAllInterviewStartTime();
//	}

	@Override
	public List<SexRatioOfChildrenDTO> getAllSexRatioOfChildren() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllSexRatioOfChildren();
	}

	@Override
	public List<WomensHeightDTO> getAllWomensHeight() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllWomensHeight();
	}

	@Override
	public List<WomensWeightDTO> getAllWomensWeight() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllWomensWeight();
	}

	@Override
	public List<InterviewStartTimeDTO> getAllInterviewStartTime() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllInterviewStartTime();
	}

	@Override
	public List<BirthWeightHealthCardDTO> getAllBirthWeightHealthCard() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllBirthWeightHealthCard();
	}

	@Override
	public List<MensHeightDTO> getAllMensHeight() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllMensHeight();
	}

	@Override
	public List<NoFoodConsumptionOfChildFrom6To23MonthsDTO> getAllNoFoodConsumptionOfChildFrom6To23Months() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllNoFoodConsumptionOfChildFrom6To23Months();
	}
	
	@Override
	public List<ChildrensHeightDTO> getAllChildrensHeight()
	{
		List<ChildrensHeightDTO> data=reportsRepo.findAllChildrensHeight();
		return data ;
	}

	@Override
	public List<ChildrensWeightDTO> getAllChildrensWeight() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllChildrensWeight();
	}

	@Override
	public List<ChildrensWeightHeapingFirstDecimalDTO> getAllChildrensWeightHeapingFirstDecimal() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllChildrensWeightHeapingFirstDecimal();
	}

	@Override
	public List<ChildrensWeightHeapingSecondDecimalDTO> getAllChildrensWeightHeapingSecondDecimal() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllChildrensWeightHeapingSecondDecimal();
	}

	@Override
	public List<MensWeightHeapingFirstDecimalDTO> getAllMensWeightHeapingFirstDecimal() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllMensWeightHeapingFirstDecimal();
	}

	@Override
	public List<MensWeightHeapingSecondDecimalDTO> getAllMensWeightHeapingSecondDecimal() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllMensWeightHeapingSecondDecimal();
	}

	@Override
	public List<MensWeightDTO> getAllMensWeight() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllMensWeight();
	}

	@Override
	public List<MensHeightHeapingFirstDecimalDTO> getAllMensHeightHeapingFirstDecimal() {
		// TODO Auto-generated method stub
		return reportsRepo.findAllMensHeightHeapingFirstDecimal();
	}
	
}
