package com.nciipc.household.service;

import java.util.List;

import com.nciipc.household.model.DTO.HouseholdRelationsModulesDTO;
import com.nciipc.household.model.TeamwiseDTO.AgeDisplacementMenLowerLimitTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.AgeDisplacementMenUpperLimitTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.AgeDisplacementWomenLowerLimitTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.AgeDisplacementWomenUpperLimitTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.BirthDisplacementTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.ContraceptivePrevalenceRateTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.EligibleMenPerHhTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.EligibleMenResponseRateTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.EligibleWomenPerHhTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.EligibleWomenResponseRateTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.HhCompletionRateTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.HhVisitTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.HouseholdRelationsModulesTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.MenVisit1554VisitsTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.VaccinationHealthCardsTeamwiseDTO;
import com.nciipc.household.model.TeamwiseDTO.WomenVisit1549VisitsTeamwiseDTO;

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
}
