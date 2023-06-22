package com.nciipc.household.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

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
import com.nciipc.household.service.HouseholdCalculatedTeamwiseServiceInterface;

@Controller
@CrossOrigin(origins = "*")
public class HouseholdTeamwiseController {
	

	public static final Logger log = LoggerFactory.getLogger(HouseholdController.class);

	@Autowired
	private HouseholdCalculatedTeamwiseServiceInterface householdCalculatedTeamwiseServiceInterface;
	
	@GetMapping("/getAllEligibleMenPerHhTeamwise/{stateId}")
	@ResponseBody
	public List<EligibleMenPerHhTeamwiseDTO> getAllEligibleMenPerHhTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllEligibleMenPerHhTeamwise() Controller. stateId :"+stateId);
		List<EligibleMenPerHhTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllEligibleMenPerHhTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
	
		return data;
	}
	
	@GetMapping("/getAllEligibleWomenPerHhTeamwise/{stateId}")
	@ResponseBody
	public List<EligibleWomenPerHhTeamwiseDTO> getAllEligibleWomenPerHhTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<EligibleWomenPerHhTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllEligibleWomenPerHhTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllVisitHhTeamwise/{stateId}")
	@ResponseBody
	public List<HhVisitTeamwiseDTO> getAllVisitHhTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<HhVisitTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllVisitHhTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllHhCompletionRateTeamwise/{stateId}")
	@ResponseBody
	public List<HhCompletionRateTeamwiseDTO> getAllHhCompletionRateTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<HhCompletionRateTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllHhCompletionRateTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllAgeDisplacementMenLowerLimitTeamwise/{stateId}")
	@ResponseBody
	public List<AgeDisplacementMenLowerLimitTeamwiseDTO> getAllAgeDisplacementMenLowerLimitTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<AgeDisplacementMenLowerLimitTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllAgeDisplacementMenLowerLimitTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllAgeDisplacementMenUpperLimitTeamwise/{stateId}")
	@ResponseBody
	public List<AgeDisplacementMenUpperLimitTeamwiseDTO> getAllAgeDisplacementMenUpperLimitTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<AgeDisplacementMenUpperLimitTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllAgeDisplacementMenUpperLimitTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllAgeDisplacementWomenLowerLimitTeamwise/{stateId}")
	@ResponseBody
	public List<AgeDisplacementWomenLowerLimitTeamwiseDTO> getAllAgeDisplacementWomenLowerLimitTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<AgeDisplacementWomenLowerLimitTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllAgeDisplacementWomenLowerLimitTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllAgeDisplacementWomenUpperLimitTeamwise/{stateId}")
	@ResponseBody
	public List<AgeDisplacementWomenUpperLimitTeamwiseDTO> getAllAgeDisplacementWomenUpperLimitTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<AgeDisplacementWomenUpperLimitTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllAgeDisplacementWomenUpperLimitTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllEligibleWomenResponseRateTeamwise/{stateId}")
	@ResponseBody
	public List<EligibleWomenResponseRateTeamwiseDTO> getAllEligibleWomenResponseRateTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<EligibleWomenResponseRateTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllEligibleWomenResponseRateTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllEligibleMenResponseRateTeamwise/{stateId}")
	@ResponseBody
	public List<EligibleMenResponseRateTeamwiseDTO> getAllEligibleMenResponseRateTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<EligibleMenResponseRateTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllEligibleMenResponseRateTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllWomenVisit1549VisitsTeamwise/{stateId}")
	@ResponseBody
	public List<WomenVisit1549VisitsTeamwiseDTO> getAllWomenVisit1549VisitsTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<WomenVisit1549VisitsTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllWomenVisit1549VisitsTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllMenVisit1554VisitsTeamwise/{stateId}")
	@ResponseBody
	public List<MenVisit1554VisitsTeamwiseDTO> getAllMenVisit1554VisitsTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<MenVisit1554VisitsTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllMenVisit1554VisitsTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllHouseholdRelationsModulesTeamwise/{stateId}")
	@ResponseBody
	public List<HouseholdRelationsModulesTeamwiseDTO> getAllHouseholdRelationsModulesTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<HouseholdRelationsModulesTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllHouseholdRelationsModulesTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllContraceptivePrevalenceRateTeamwise/{stateId}")
	@ResponseBody
	public List<ContraceptivePrevalenceRateTeamwiseDTO> getAllContraceptivePrevalenceRateTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<ContraceptivePrevalenceRateTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllContraceptivePrevalenceRateTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllVaccinationHealthCardsTeamwise/{stateId}")
	@ResponseBody
	public List<VaccinationHealthCardsTeamwiseDTO> getAllVaccinationHealthCardsTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<VaccinationHealthCardsTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllVaccinationHealthCardsTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllBirthDisplacementTeamwise/{stateId}")
	@ResponseBody
	public List<BirthDisplacementTeamwiseDTO> getAllBirthDisplacementTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllVisitHhTeamwise() Controller. stateId :"+stateId);
		List<BirthDisplacementTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllBirthDisplacementTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
}
