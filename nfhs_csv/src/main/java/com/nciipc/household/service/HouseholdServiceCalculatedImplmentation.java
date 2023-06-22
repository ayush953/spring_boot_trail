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
import com.nciipc.household.model.DTO.ContraceptivePrevalenceRateDTO;
import com.nciipc.household.model.DTO.EligibleMenPerHhDTO;
import com.nciipc.household.model.DTO.EligibleMenResponseRateDTO;
import com.nciipc.household.model.DTO.EligibleWomenPerHhDTO;
import com.nciipc.household.model.DTO.EligibleWomenResponseRateDTO;
import com.nciipc.household.model.DTO.HhCompletionRateDTO;
import com.nciipc.household.model.DTO.HouseholdRelationsModulesDTO;
import com.nciipc.household.model.DTO.MenVisit1554VisitsDTO;
import com.nciipc.household.model.DTO.VaccinationHealthCardsDTO;
import com.nciipc.household.model.DTO.VisitHhDTO;
import com.nciipc.household.model.DTO.WomenVisit1549VisitsDTO;
import com.nciipc.household.repository.ReportsRepo;
import com.nciipc.household.repository.TeamwiseReportsRepo;
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
	
}
