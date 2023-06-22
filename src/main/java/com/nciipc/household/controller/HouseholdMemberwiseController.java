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

import com.nciipc.household.model.MemberwiseDTO.AgeDisplacementMenLowerLimitMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.AgeDisplacementMenUpperLimitMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.AgeDisplacementWomenLowerLimitMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.AgeDisplacementWomenUpperLimitMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.BirthDisplacementMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.BirthWeightHealthcardMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.ChildrensHeightMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.ChildrensWeightHeapingFirstDecimalMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.ChildrensWeightHeapingSecondDecimalMemberwiseDTO2;
import com.nciipc.household.model.MemberwiseDTO.ChildrensWeightMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.ContraceptivePrevalenceRateMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.EligibleMenPerHhMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.EligibleMenResponseRateMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.EligibleWomenPerHhMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.EligibleWomenResponseRateMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HhCompletionRateMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HhVisitMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HouseholdRelationsModulesMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.InterviewStartTimeMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.MenVisit1554VisitsMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.MensHeightHeapingFirstDecimalMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.MensHeightMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.MensWeightHeapingFirstDecimalMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.MensWeightHeapingSecondDecimalMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.MensWeightMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.NoFoodConsumptionOfChildFrom6To23MonthsMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.SexRatioOfChildrenMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.VaccinationHealthCardsMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.WomenVisit1549VisitsMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.WomensHeightMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.WomensWeightMemberwiseDTO;
import com.nciipc.household.service.HouseholdCalculatedMemberwiseServiceInterface;

@Controller
//@CrossOrigin(origins = "http://10.210.12.236:4200")
//@CrossOrigin("*")
@CrossOrigin(origins = "http://10.210.12.236")
//@CrossOrigin(origins = "*")
public class HouseholdMemberwiseController {
	
	public static final Logger log = LoggerFactory.getLogger(HouseholdMemberwiseController.class);
	
	@Autowired
	private HouseholdCalculatedMemberwiseServiceInterface householdCalculatedMemberwiseServiceInterface;

	@GetMapping("/getAllEligibleMenPerHhMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<EligibleMenPerHhMemberwiseDTO> getAllEligibleMenPerHhMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<EligibleMenPerHhMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllEligibleMenPerHhMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllHhCompletionRateMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<HhCompletionRateMemberwiseDTO> getAllHhCompletionRateMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<HhCompletionRateMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllHhCompletionRateMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	
	@GetMapping("/getAllVisitHhMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<HhVisitMemberwiseDTO> getAllVisitHhMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<HhVisitMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllVisitHhMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllEligibleWomenPerHhMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<EligibleWomenPerHhMemberwiseDTO> getAllEligibleWomenPerHhMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<EligibleWomenPerHhMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllEligibleWomenPerHhMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllEligibleWomenResponseRateMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<EligibleWomenResponseRateMemberwiseDTO> getAllEligibleWomenResponseRateMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<EligibleWomenResponseRateMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllEligibleWomenResponseRateMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllWomenVisit1549VisitsMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<WomenVisit1549VisitsMemberwiseDTO> getAllWomenVisit1549VisitsMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<WomenVisit1549VisitsMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllWomenVisit1549VisitsMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllEligibleMenResponseRateMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<EligibleMenResponseRateMemberwiseDTO> getAllEligibleMenResponseRateMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<EligibleMenResponseRateMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllEligibleMenResponseRateMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllMenVisit1554VisitsMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<MenVisit1554VisitsMemberwiseDTO> getAllMenVisit1554VisitsMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<MenVisit1554VisitsMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllMenVisit1554VisitsMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllAgeDisplacementWomenLowerLimitMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<AgeDisplacementWomenLowerLimitMemberwiseDTO> getAllAgeDisplacementWomenLowerLimitMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<AgeDisplacementWomenLowerLimitMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllAgeDisplacementWomenLowerLimitMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllAgeDisplacementWomenUpperLimitMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<AgeDisplacementWomenUpperLimitMemberwiseDTO> getAllAgeDisplacementWomenUpperLimitMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<AgeDisplacementWomenUpperLimitMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllAgeDisplacementWomenUpperLimitMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllAgeDisplacementMenLowerLimitMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<AgeDisplacementMenLowerLimitMemberwiseDTO> getAllAgeDisplacementMenLowerLimitMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<AgeDisplacementMenLowerLimitMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllAgeDisplacementMenLowerLimitMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllAgeDisplacementMenUpperLimitMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<AgeDisplacementMenUpperLimitMemberwiseDTO> getAllAgeDisplacementMenUpperLimitMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<AgeDisplacementMenUpperLimitMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllAgeDisplacementMenUpperLimitMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllBirthDisplacementMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<BirthDisplacementMemberwiseDTO> getAllBirthDisplacementMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<BirthDisplacementMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllBirthDisplacementMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllVaccinationHealthCardsMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<VaccinationHealthCardsMemberwiseDTO> getAllVaccinationHealthCardsMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<VaccinationHealthCardsMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllVaccinationHealthCardsMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllHouseholdRelationsModulesMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<HouseholdRelationsModulesMemberwiseDTO> getAllHouseholdRelationsModulesMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<HouseholdRelationsModulesMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllHouseholdRelationsModulesMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllContraceptivePrevalenceRateMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<ContraceptivePrevalenceRateMemberwiseDTO> getAllContraceptivePrevalenceRateMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<ContraceptivePrevalenceRateMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllContraceptivePrevalenceRateMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	@GetMapping("/getAllSexRatioOfChildrenMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<SexRatioOfChildrenMemberwiseDTO> getAllSexRatioOfChildrenMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllSexRatioOfChildrenMemberwise() Controller. stateId :"+stateId);
		List<SexRatioOfChildrenMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllSexRatioOfChildrenMemberwise(stateId, teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}

	@GetMapping("/getAllWomensHeightMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<WomensHeightMemberwiseDTO> getAllWomensHeightMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllWomensHeightMemberwise() Controller. stateId :"+stateId);
		List<WomensHeightMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllWomensHeightMemberwise(stateId, teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllWomensWeightMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<WomensWeightMemberwiseDTO> getAllWomensWeightMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllWomensWeightMemberwise() Controller. stateId :"+stateId);
		List<WomensWeightMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllWomensWeightMemberwise(stateId, teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	
	@GetMapping("/getAllBirthWeightHealthcardMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<BirthWeightHealthcardMemberwiseDTO> getAllBirthWeightHealthcardMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllBirthWeightHealthcardMemberwise() Controller. stateId :"+stateId);
		List<BirthWeightHealthcardMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllBirthWeightHealthcardMemberwise(stateId, teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllInterviewStartTimeMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<InterviewStartTimeMemberwiseDTO> getAllInterviewStartTimeMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllBirthWeightHealthcardMemberwise() Controller. stateId :"+stateId);
		List<InterviewStartTimeMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllInterviewStartTimeMemberwise(stateId, teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	
	@GetMapping("/getAllMensHeightMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<MensHeightMemberwiseDTO> getAllMensHeightMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllBirthWeightHealthcardMemberwise() Controller. stateId :"+stateId);
		List<MensHeightMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllMensHeightMemberwise(stateId, teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	
	@GetMapping("/getAllNoFoodConsumptionOfChildFrom6To23MonthsMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<NoFoodConsumptionOfChildFrom6To23MonthsMemberwiseDTO> getAllNoFoodConsumptionOfChildFrom6To23MonthsMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllNoFoodConsumptionOfChildFrom6To23MonthsMemberwise() Controller. stateId :"+stateId);
		List<NoFoodConsumptionOfChildFrom6To23MonthsMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllNoFoodConsumptionOfChildFrom6To23MonthsMemberwise(stateId, teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllChildrensHeightMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<ChildrensHeightMemberwiseDTO> getAllChildrensHeightMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<ChildrensHeightMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllChildrensHeightMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllChildrensWeightMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<ChildrensWeightMemberwiseDTO> getAllChildrensWeightMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<ChildrensWeightMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllChildrensWeightMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}

	@GetMapping("/getAllChildrensWeightHeapingFirstDecimalMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<ChildrensWeightHeapingFirstDecimalMemberwiseDTO> getAllChildrensWeightHeapingFirstDecimalMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<ChildrensWeightHeapingFirstDecimalMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllChildrensWeightHeapingFirstDecimalMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllChildrensWeightHeapingSecondDecimalMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<ChildrensWeightHeapingSecondDecimalMemberwiseDTO2> getAllChildrensWeightHeapingSecondDecimalMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<ChildrensWeightHeapingSecondDecimalMemberwiseDTO2> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllChildrensWeightHeapingSecondDecimalMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllMensWeightHeapingFirstDecimalMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<MensWeightHeapingFirstDecimalMemberwiseDTO> getAllMensWeightHeapingFirstDecimalMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside MensWeightHeapingFirstDecimalMemberwiseDTO() Controller. stateId :"+stateId);
		List<MensWeightHeapingFirstDecimalMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllMensWeightHeapingFirstDecimalMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllMensWeightHeapingSecondDecimalMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<MensWeightHeapingSecondDecimalMemberwiseDTO> getAllMensWeightHeapingSecondDecimalMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside MensWeightHeapingSecondDecimalMemberwiseDTO() Controller. stateId :"+stateId);
		List<MensWeightHeapingSecondDecimalMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllMensWeightHeapingSecondDecimalMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllMensWeightMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<MensWeightMemberwiseDTO> getAllMensWeightMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside getAllEligibleWomenPerHhTeamwise() Controller. stateId :"+stateId);
		List<MensWeightMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllMensWeightMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
	@GetMapping("/getAllMensHeightHeapingFirstDecimalMemberwise/{stateId}/{teamNo}")
	@ResponseBody
	public List<MensHeightHeapingFirstDecimalMemberwiseDTO> getAllMensHeightHeapingFirstDecimalMemberwise(@PathVariable Integer stateId,@PathVariable Integer teamNo,Model model) {
		
		log.info("Inside MensHeightHeapingFirstDecimalMemberwiseDTO() Controller. stateId :"+stateId);
		List<MensHeightHeapingFirstDecimalMemberwiseDTO> data = null;
				
		try {
			data = householdCalculatedMemberwiseServiceInterface.getAllMensHeightHeapingFirstDecimalMemberwise(stateId,teamNo);
		} catch (Exception e) {
			log.error("Exception in getData() :: {} ", e);
		}
		
		log.info("Data {} :: ", data.toString());
		
		return data;
	}
	
}
