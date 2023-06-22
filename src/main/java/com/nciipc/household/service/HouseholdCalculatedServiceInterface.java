package com.nciipc.household.service;

import java.util.List;

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

public interface HouseholdCalculatedServiceInterface {

	public List<EligibleMenPerHhDTO> getAllEligibleMenPerHh();

	public List<EligibleWomenPerHhDTO> getAllEligibleWomenPerHh();

	public List<VisitHhDTO> getAllVisitHh();

	public List<Test> getTestData();

	public List<HhCompletionRateDTO> getAllHhCompletionRate();

	public List<AgeDisplacementMenLowerLimitDTO> findAllAgeDisplacementMenLowerLimit();

	public List<AgeDisplacementMenUpperLimitDTO> findAllAgeDisplacementMenUpperLimit();

	public List<AgeDisplacementWomenLowerLimitDTO> findAllAgeDisplacementWomenLowerLimit();

	public List<AgeDisplacementWomenUpperLimitDTO> findAllAgeDisplacementWomenUpperLimit();
	
	public List<EligibleMenResponseRateDTO> findAllEligibleMenResponseRate();
	
	public List<EligibleWomenResponseRateDTO> findAllEligibleWomenResponseRate();
	
	public List<WomenVisit1549VisitsDTO> findAllWomenVisit1549Visits();
	
	public List<HouseholdRelationsModulesDTO> getAllHouseholdRelationsModules();
	
	public List<ContraceptivePrevalenceRateDTO> getAllContraceptivePrevalenceRate();
	
	public List<BirthDisplacementDTO> getAllBirthDisplacement();
	
	public List<VaccinationHealthCardsDTO> getAllVaccinationHealthCards();
	
	public List<MenVisit1554VisitsDTO> getAllMenVisit1554Visits();
	
	//
	
	public List<SexRatioOfChildrenDTO> getAllSexRatioOfChildren();
	
	public List<WomensHeightDTO> getAllWomensHeight();
	
	public List<WomensWeightDTO> getAllWomensWeight();
	
	public List<InterviewStartTimeDTO> getAllInterviewStartTime();
	
	public List<BirthWeightHealthCardDTO> getAllBirthWeightHealthCard();
	
	public List<MensHeightDTO> getAllMensHeight();
	
	public List<NoFoodConsumptionOfChildFrom6To23MonthsDTO> getAllNoFoodConsumptionOfChildFrom6To23Months();
	
	public List<ChildrensHeightDTO> getAllChildrensHeight();
	
	public List<ChildrensWeightDTO> getAllChildrensWeight();
	
	public List<ChildrensWeightHeapingFirstDecimalDTO> getAllChildrensWeightHeapingFirstDecimal();
	
	public List<ChildrensWeightHeapingSecondDecimalDTO> getAllChildrensWeightHeapingSecondDecimal();
	
	public List<MensWeightHeapingFirstDecimalDTO> getAllMensWeightHeapingFirstDecimal();
	
	public List<MensWeightHeapingSecondDecimalDTO> getAllMensWeightHeapingSecondDecimal();
	
	public List<MensWeightDTO> getAllMensWeight();
	
	public List<MensHeightHeapingFirstDecimalDTO> getAllMensHeightHeapingFirstDecimal();
	
}
