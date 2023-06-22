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
import com.nciipc.household.service.HouseholdCalculatedTeamwiseServiceInterface;

@Controller
//@CrossOrigin(origins = "http://10.210.12.236:4200")
//@CrossOrigin("*")
@CrossOrigin(origins = "http://10.210.12.236")
//@CrossOrigin(origins = "*")
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
	
	@GetMapping("/getAllSexRatioOfChildrenTeamwise/{stateId}")
	@ResponseBody
	public List<SexRatioOfChildrenTeamwiseDTO> getAllSexRatioOfChildrenTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllSexRatioOfChildrenTeamwise() Controller. stateId :"+stateId);
		List<SexRatioOfChildrenTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllSexRatioOfChildrenTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllWomensHeightTeamwise/{stateId}")
	@ResponseBody
	public List<WomensHeightTeamwiseDTO> getAllWomensHeightTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllWomensHeightTeamwise() Controller. stateId :"+stateId);
		List<WomensHeightTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllWomensHeightTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllWomensWeightTeamwise/{stateId}")
	@ResponseBody
	public List<WomensWeightTeamwiseDTO> getAllWomensWeightTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllWomensWeightTeamwise() Controller. stateId :"+stateId);
		List<WomensWeightTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllWomensWeightTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllBirthWeightHealthcardTeamwise/{stateId}")
	@ResponseBody
	public List<BirthWeightHealthcardTeamwiseDTO> getAllBirthWeightHealthcardTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllBirthWeightHealthcardTeamwise() Controller. stateId :"+stateId);
		List<BirthWeightHealthcardTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllBirthWeightHealthcardTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	
	@GetMapping("/getAllInterviewStartTimeTeamwise/{stateId}")
	@ResponseBody
	public List<InterviewStartTimeTeamwiseDTO> getAllInterviewStartTimeTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllInterviewStartTimeTeamwise() Controller. stateId :"+stateId);
		List<InterviewStartTimeTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllInterviewStartTimeTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllMensHeightTeamwise/{stateId}")
	@ResponseBody
	public List<MensHeightTeamwiseDTO> getAllMensHeightTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllMensHeightTeamwise() Controller. stateId :"+stateId);
		List<MensHeightTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllMensHeightTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	
	@GetMapping("/getAllNoFoodConsumptionOfChildFrom6To23MonthsTeamwise/{stateId}")
	@ResponseBody
	public List<NoFoodConsumptionOfChildFrom6To23MonthsTeamwiseDTO> getAllNoFoodConsumptionOfChildFrom6To23MonthsTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllNoFoodConsumptionOfChildFrom6To23MonthsTeamwise() Controller. stateId :"+stateId);
		List<NoFoodConsumptionOfChildFrom6To23MonthsTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllNoFoodConsumptionOfChildFrom6To23MonthsTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllChildrensHeightTeamwise/{stateId}")
	@ResponseBody
	public List<ChildrensHeightTeamwiseDTO> getAllChildrensHeightTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllChildrensHeightTeamwise() Controller. stateId :"+stateId);
		List<ChildrensHeightTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllChildrensHeightTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllChildrensWeightTeamwise/{stateId}")
	@ResponseBody
	public List<ChildrensWeightTeamwiseDTO> getAllChildrensWeightTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllChildrensHeightTeamwise() Controller. stateId :"+stateId);
		List<ChildrensWeightTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllChildrensWeightTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllChildrensWeightHeapingFirstDecimalTeamwise/{stateId}")
	@ResponseBody
	public List<ChildrensWeightHeapingFirstDecimalTeamwiseDTO> getAllChildrensWeightHeapingFirstDecimalTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllChildrensHeightTeamwise() Controller. stateId :"+stateId);
		List<ChildrensWeightHeapingFirstDecimalTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllChildrensWeightHeapingFirstDecimalTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllChildrensWeightHeapingSecondDecimalTeamwise/{stateId}")
	@ResponseBody
	public List<ChildrensWeightHeapingSecondDecimalTeamwiseDTO2> getAllChildrensWeightHeapingSecondDecimalTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllChildrensHeightTeamwise() Controller. stateId :"+stateId);
		List<ChildrensWeightHeapingSecondDecimalTeamwiseDTO2> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllChildrensWeightHeapingSecondDecimalTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllMensWeightHeapingFirstDecimalTeamwise/{stateId}")
	@ResponseBody
	public List<MensWeightHeapingFirstDecimalTeamwiseDTO> getAllMensWeightHeapingFirstDecimalTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllMensWeightHeapingFirstDecimalTeamwise() Controller. stateId :"+stateId);
		List<MensWeightHeapingFirstDecimalTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllMensWeightHeapingFirstDecimalTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllMensWeightHeapingSecondDecimalTeamwise/{stateId}")
	@ResponseBody
	public List<MensWeightHeapingSecondDecimalTeamwiseDTO> getAllMensWeightHeapingSecondDecimalTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside MensWeightHeapingSecondDecimalTeamwiseDTO() Controller. stateId :"+stateId);
		List<MensWeightHeapingSecondDecimalTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllMensWeightHeapingSecondDecimalTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllMensWeightTeamwise/{stateId}")
	@ResponseBody
	public List<MensWeightTeamwiseDTO> getAllMensWeightTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside MensWeightTeamwiseDTO() Controller. stateId :"+stateId);
		List<MensWeightTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllMensWeightTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllMensHeightHeapingFirstDecimalTeamwise/{stateId}")
	@ResponseBody
	public List<MensHeightHeapingFirstDecimalTeamwiseDTO> getAllMensHeightHeapingFirstDecimalTeamwise(@PathVariable Integer stateId,Model model) {
		
		log.info("Inside getAllMensHeightHeapingFirstDecimalTeamwise() Controller. stateId :"+stateId);
		List<MensHeightHeapingFirstDecimalTeamwiseDTO> data = null;
				
		try {
			data = householdCalculatedTeamwiseServiceInterface.getAllMensHeightHeapingFirstDecimalTeamwise(stateId);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
}
