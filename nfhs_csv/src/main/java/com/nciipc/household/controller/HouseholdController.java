package com.nciipc.household.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nciipc.household.model.QHSECOVER;
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
import com.nciipc.household.service.HouseholdCalculatedServiceInterface;
import com.nciipc.household.service.HouseholdServiceInterface;

@Controller
@CrossOrigin(origins = "*")
public class HouseholdController {

	public static final Logger log = LoggerFactory.getLogger(HouseholdController.class);

	@Autowired
	private HouseholdServiceInterface serviceImpl;

	@Autowired
	private HouseholdCalculatedServiceInterface householdCalculatedServiceInterface;

	@GetMapping("/feedData")
	public String setDatainDB() {
		
		try {
			// serviceImpl.saveData_QHSECOVER();

			serviceImpl.saveData_QHSEC01X();

		} catch (Exception e) {
			log.error("Exception in saveData() :: {} ", e);
		}
		return "success";
	}

	@GetMapping("/showDataForQHSECOVER")
	@ResponseBody
	public List<QHSECOVER> showData(Model model) {
		log.info("Inside showData() Controller");
		List<QHSECOVER> data = null;
		try {
			data = serviceImpl.getData_QHSECOVER();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}

	@GetMapping("/getTestData")
	@ResponseBody
	public List<Test> getTestData(Model model) {
		log.info("Inside showData() Controller");
		List<Test> data = null;
		try {
			data = householdCalculatedServiceInterface.getTestData();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}

	@GetMapping("/getAllEligibleMenPerHh")
	@ResponseBody
	public List<EligibleMenPerHhDTO> getAllEligibleMenPerHh(Model model) {
		log.info("Inside getAllEligibleMenPerHh() Controller");
		List<EligibleMenPerHhDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllEligibleMenPerHh();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}

	@GetMapping("/getAllEligibleWomenPerHh")
	@ResponseBody
	public List<EligibleWomenPerHhDTO> getAllEligibleWomenPerHh(Model model) {
		log.info("Inside getAllEligibleWomenPerHh() Controller");
		List<EligibleWomenPerHhDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllEligibleWomenPerHh();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}

	@GetMapping("/getAllVisitHh")
	@ResponseBody
	public List<VisitHhDTO> getAllVisitHh(Model model) {
		log.info("Inside getAllVisitHh() Controller");
		List<VisitHhDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllVisitHh();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}

	@GetMapping("/getAllHhCompletionRate")
	@ResponseBody
	public List<HhCompletionRateDTO> getAllHhCompletionRate(Model model) {
		log.info("Inside getAllHhCompletionRate() Controller");
		List<HhCompletionRateDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllHhCompletionRate();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}

	@GetMapping("/getAllAgeDisplacementMenLowerLimit")
	@ResponseBody
	public List<AgeDisplacementMenLowerLimitDTO> getAllAgeDisplacementMenLowerLimit(Model model) {
		log.info("Inside getAllAgeDisplacementMenLowerLimit() Controller");
		List<AgeDisplacementMenLowerLimitDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.findAllAgeDisplacementMenLowerLimit();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}

	@GetMapping("/getAllAgeDisplacementMenUpperLimit")
	@ResponseBody
	public List<AgeDisplacementMenUpperLimitDTO> getAllAgeDisplacementMenUpperLimit(Model model) {
		log.info("Inside getAllAgeDisplacementMenUpperLimit() Controller");
		List<AgeDisplacementMenUpperLimitDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.findAllAgeDisplacementMenUpperLimit();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}

	@GetMapping("/getAllAgeDisplacementWomenLowerLimit")
	@ResponseBody
	public List<AgeDisplacementWomenLowerLimitDTO> getAllAgeDisplacementWomenLowerLimit(Model model) {
		log.info("Inside getAllAgeDisplacementWomenLowerLimit() Controller");
		List<AgeDisplacementWomenLowerLimitDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.findAllAgeDisplacementWomenLowerLimit();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}

	@GetMapping("/getAllAgeDisplacementWomenUpperLimit")
	@ResponseBody
	public List<AgeDisplacementWomenUpperLimitDTO> getAllAgeDisplacementWomenUpperLimit(Model model) {
		log.info("Inside getAllAgeDisplacementWomenUpperLimit() Controller");
		List<AgeDisplacementWomenUpperLimitDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.findAllAgeDisplacementWomenUpperLimit();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllEligibleMenResponseRate")
	@ResponseBody
	public List<EligibleMenResponseRateDTO> getAllEligibleMenResponseRate(Model model) {
		log.info("Inside getAllEligibleMenResponseRate() Controller");
		List<EligibleMenResponseRateDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.findAllEligibleMenResponseRate();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllEligibleWomenResponseRate")
	@ResponseBody
	public List<EligibleWomenResponseRateDTO> getAllEligibleWomenResponseRate(Model model) {
		log.info("Inside getAllEligibleWomenResponseRate() Controller");
		List<EligibleWomenResponseRateDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.findAllEligibleWomenResponseRate();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllWomenVisit1549Visits")
	@ResponseBody
	public List<WomenVisit1549VisitsDTO> getAllWomenVisit1549Visits(Model model) {
		log.info("Inside getAllWomenVisit1549Visits() Controller");
		List<WomenVisit1549VisitsDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.findAllWomenVisit1549Visits();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllHouseholdRelationsModules")
	@ResponseBody
	public List<HouseholdRelationsModulesDTO> getAllHouseholdRelationsModules(Model model) {
		log.info("Inside getAllHouseholdRelationsModules() Controller");
		List<HouseholdRelationsModulesDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllHouseholdRelationsModules();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllContraceptivePrevalenceRate")
	@ResponseBody
	public List<ContraceptivePrevalenceRateDTO> getAllContraceptivePrevalenceRate(Model model) {
		log.info("Inside getAllContraceptivePrevalenceRate() Controller");
		List<ContraceptivePrevalenceRateDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllContraceptivePrevalenceRate();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllBirthDisplacement")
	@ResponseBody
	public List<BirthDisplacementDTO> getAllBirthDisplacement(Model model) {
		log.info("Inside getAllBirthDisplacement() Controller");
		List<BirthDisplacementDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllBirthDisplacement();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllVaccinationHealthCards")
	@ResponseBody
	public List<VaccinationHealthCardsDTO> getAllVaccinationHealthCards(Model model) {
		log.info("Inside getAllVaccinationHealthCards() Controller");
		List<VaccinationHealthCardsDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllVaccinationHealthCards();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllMenVisit1554Visits")
	@ResponseBody
	public List<MenVisit1554VisitsDTO> getAllMenVisit1554Visits(Model model) {
		log.info("Inside getAllAgeDisplacementWomenUpperLimit() Controller");
		List<MenVisit1554VisitsDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllMenVisit1554Visits();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
}
