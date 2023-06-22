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
import com.nciipc.household.service.HouseholdCalculatedServiceInterface;
import com.nciipc.household.service.HouseholdServiceInterface;

@Controller
//@CrossOrigin(origins = "http://10.210.12.236:4200")
//@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@CrossOrigin(origins = "http://10.210.12.236")
//@CrossOrigin(origins = "*")
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
		log.info("Data {} :: ", data.toString());
		
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
	
//	@GetMapping("/getAllEligibleMenPerHh")
//	@ResponseBody
//	public List<EligibleMenPerHhDTO> getAllEligibleMenPerHh(Model model) {
//		log.info("Inside getAllEligibleMenPerHh() Controller");
//		List<EligibleMenPerHhDTO> data = null;
//		try {
//			data = householdCalculatedServiceInterface.getAllEligibleMenPerHh();
//		} catch (Exception e) {
//			log.error("Exception in getData() :: {} ", e);
//		}
//		log.info("Data {} :: ", data);
//		return data;
//	}
	
	@GetMapping("/getAllSexRatioOfChildren")
	@ResponseBody
	public List<SexRatioOfChildrenDTO> getAllSexRatioOfChildren(Model model) {
		log.info("Inside getAllSexRatioOfChildren() Controller");
		List<SexRatioOfChildrenDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllSexRatioOfChildren();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllWomensHeight")
	@ResponseBody
	public List<WomensHeightDTO> getAllWomensHeight(Model model) {
		log.info("Inside getAllWomensHeight() Controller");
		List<WomensHeightDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllWomensHeight();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllWomensWeight")
	@ResponseBody
	public List<WomensWeightDTO> getAllWomensWeight(Model model) {
		log.info("Inside getAllWomensHeight() Controller");
		List<WomensWeightDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllWomensWeight();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	
	@GetMapping("/getAllInterviewStartTime")
	@ResponseBody
	public List<InterviewStartTimeDTO> getAllInterviewStartTime(Model model) {
		log.info("Inside getAllInterviewStartTime() Controller");
		List<InterviewStartTimeDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllInterviewStartTime();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	

	@GetMapping("/getAllBirthWeightHealthCard")
	@ResponseBody
	public List<BirthWeightHealthCardDTO> getAllBirthWeightHealthCard(Model model) {
		log.info("Inside getAllBirthWeightHealthCard() Controller");
		List<BirthWeightHealthCardDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllBirthWeightHealthCard();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	
	@GetMapping("/getAllMensHeight")
	@ResponseBody
	public List<MensHeightDTO> getAllMensHeight(Model model) {
		log.info("Inside getAllMensHeight() Controller");
		List<MensHeightDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllMensHeight();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	
	
	
	@GetMapping("/getAllNoFoodConsumptionOfChildFrom6To23Months")
	@ResponseBody
	public List<NoFoodConsumptionOfChildFrom6To23MonthsDTO> getAllNoFoodConsumptionOfChildFrom6To23Months(Model model) {
		log.info("Inside getAllNoFoodConsumptionOfChildFrom6To23Months() Controller");
		List<NoFoodConsumptionOfChildFrom6To23MonthsDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllNoFoodConsumptionOfChildFrom6To23Months();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllChildrensHeight")
	@ResponseBody
	public List<ChildrensHeightDTO> getAllChildrensHeight(Model model) 
	{
		log.info("Inside getAllChildrensHeight() Controller");
		List<ChildrensHeightDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllChildrensHeight();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllChildrensWeight")
	@ResponseBody
	public List<ChildrensWeightDTO> getAllChildrensWeight(Model model) 
	{
		log.info("Inside getAllChildrensHeight() Controller");
		List<ChildrensWeightDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllChildrensWeight();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	
	@GetMapping("/getAllChildrensWeightHeapingFirstDecimal")
	@ResponseBody
	public List<ChildrensWeightHeapingFirstDecimalDTO> getAllChildrensWeightHeapingFirstDecimal(Model model) 
	{
		log.info("Inside getAllChildrensHeight() Controller");
		List<ChildrensWeightHeapingFirstDecimalDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllChildrensWeightHeapingFirstDecimal();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllChildrensWeightHeapingSecondDecimal")
	@ResponseBody
	public List<ChildrensWeightHeapingSecondDecimalDTO> getAllChildrensWeightHeapingSecondDecimal(Model model) 
	{
		log.info("Inside getAllChildrensHeight() Controller");
		List<ChildrensWeightHeapingSecondDecimalDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllChildrensWeightHeapingSecondDecimal();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllMensWeightHeapingFirstDecimal")
	@ResponseBody
	public List<MensWeightHeapingFirstDecimalDTO> getAllMensWeightHeapingFirstDecimal(Model model) 
	{
		log.info("Inside getAllMensWeightHeapingFirstDecimal() Controller");
		List<MensWeightHeapingFirstDecimalDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllMensWeightHeapingFirstDecimal();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllMensWeightHeapingSecondDecimal")
	@ResponseBody
	public List<MensWeightHeapingSecondDecimalDTO> getAllMensWeightHeapingSecondDecimal(Model model) 
	{
		log.info("Inside getAllMensWeightHeapingSecondDecimal() Controller");
		List<MensWeightHeapingSecondDecimalDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllMensWeightHeapingSecondDecimal();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	
	@GetMapping("/getAllMensWeight")
	@ResponseBody
	public List<MensWeightDTO> getAllMensWeight(Model model) 
	{
		log.info("Inside getAllMensWeight() Controller");
		List<MensWeightDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllMensWeight();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
	
	@GetMapping("/getAllMensHeightHeapingFirstDecimal")
	@ResponseBody
	public List<MensHeightHeapingFirstDecimalDTO> getAllMensHeightHeapingFirstDecimal(Model model) 
	{
		log.info("Inside getAllMensHeightHeapingFirstDecimal() Controller");
		List<MensHeightHeapingFirstDecimalDTO> data = null;
		try {
			data = householdCalculatedServiceInterface.getAllMensHeightHeapingFirstDecimal();
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		log.info("Data {} :: ", data);
		return data;
	}
}
