package com.nciipc.household.service;

import java.util.List;

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
	
}
