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

import com.nciipc.household.model.MemberwiseDTO.EligibleMenPerHhMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.EligibleWomenPerHhMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HhCompletionRateMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HhVisitMemberwiseDTO;
import com.nciipc.household.service.HouseholdCalculatedMemberwiseServiceInterface;

@Controller
@CrossOrigin(origins = "*")
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
	
}
