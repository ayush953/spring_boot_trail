package com.nciipc.household.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
