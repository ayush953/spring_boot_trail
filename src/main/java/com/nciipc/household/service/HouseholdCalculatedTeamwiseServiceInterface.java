package com.nciipc.household.service;

import java.util.List;

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

public interface HouseholdCalculatedTeamwiseServiceInterface {
	
	public List<EligibleMenPerHhTeamwiseDTO> getAllEligibleMenPerHhTeamwise(Integer stateId);

	public List<EligibleWomenPerHhTeamwiseDTO> getAllEligibleWomenPerHhTeamwise(Integer stateId );
	
	public List<HhVisitTeamwiseDTO> getAllVisitHhTeamwise(Integer stateId );

	List<HhCompletionRateTeamwiseDTO> getAllHhCompletionRateTeamwise(Integer stateId);

	List<AgeDisplacementMenLowerLimitTeamwiseDTO> getAllAgeDisplacementMenLowerLimitTeamwise(Integer stateId);

	List<AgeDisplacementMenUpperLimitTeamwiseDTO> getAllAgeDisplacementMenUpperLimitTeamwise(Integer stateId);

	List<AgeDisplacementWomenLowerLimitTeamwiseDTO> getAllAgeDisplacementWomenLowerLimitTeamwise(Integer stateId);

	List<AgeDisplacementWomenUpperLimitTeamwiseDTO> getAllAgeDisplacementWomenUpperLimitTeamwise(Integer stateId);

	List<EligibleWomenResponseRateTeamwiseDTO> getAllEligibleWomenResponseRateTeamwise(Integer stateId);

	List<EligibleMenResponseRateTeamwiseDTO> getAllEligibleMenResponseRateTeamwise(Integer stateId);

	List<WomenVisit1549VisitsTeamwiseDTO> getAllWomenVisit1549VisitsTeamwise(Integer stateId);

	List<MenVisit1554VisitsTeamwiseDTO> getAllMenVisit1554VisitsTeamwise(Integer stateId);

	List<HouseholdRelationsModulesTeamwiseDTO> getAllHouseholdRelationsModulesTeamwise(Integer stateId);

	List<ContraceptivePrevalenceRateTeamwiseDTO> getAllContraceptivePrevalenceRateTeamwise(Integer stateId);

	List<VaccinationHealthCardsTeamwiseDTO> getAllVaccinationHealthCardsTeamwise(Integer stateId);

	List<BirthDisplacementTeamwiseDTO> getAllBirthDisplacementTeamwise(Integer stateId);
	
	List<SexRatioOfChildrenTeamwiseDTO> getAllSexRatioOfChildrenTeamwise(Integer stateId);
	
	List<WomensHeightTeamwiseDTO> getAllWomensHeightTeamwise(Integer stateId);
	
	List<WomensWeightTeamwiseDTO> getAllWomensWeightTeamwise(Integer stateId);
	
	List<BirthWeightHealthcardTeamwiseDTO> getAllBirthWeightHealthcardTeamwise(Integer stateId);
	
	List<InterviewStartTimeTeamwiseDTO> getAllInterviewStartTimeTeamwise(Integer stateId);
	
	List<MensHeightTeamwiseDTO> getAllMensHeightTeamwise(Integer stateId);
	
	List<NoFoodConsumptionOfChildFrom6To23MonthsTeamwiseDTO> getAllNoFoodConsumptionOfChildFrom6To23MonthsTeamwise(Integer stateId);

	List<ChildrensHeightTeamwiseDTO> getAllChildrensHeightTeamwise(Integer stateId);
	
	List<ChildrensWeightTeamwiseDTO> getAllChildrensWeightTeamwise(Integer stateId);
	
	List<ChildrensWeightHeapingFirstDecimalTeamwiseDTO> getAllChildrensWeightHeapingFirstDecimalTeamwise(Integer stateId);
	
	List<ChildrensWeightHeapingSecondDecimalTeamwiseDTO2> getAllChildrensWeightHeapingSecondDecimalTeamwise(Integer stateId);

	List<MensWeightHeapingFirstDecimalTeamwiseDTO> getAllMensWeightHeapingFirstDecimalTeamwise(Integer stateId);

	List<MensWeightHeapingSecondDecimalTeamwiseDTO> getAllMensWeightHeapingSecondDecimalTeamwise(Integer stateId);
	
	List<MensWeightTeamwiseDTO> getAllMensWeightTeamwise(Integer stateId);

	List<MensHeightHeapingFirstDecimalTeamwiseDTO> getAllMensHeightHeapingFirstDecimalTeamwise(Integer stateId);
	
}
