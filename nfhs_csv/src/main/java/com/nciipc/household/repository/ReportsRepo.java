package com.nciipc.household.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nciipc.household.model.EligibleMenPerHh;
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

@Repository
public interface ReportsRepo extends JpaRepository<EligibleMenPerHh, Integer> {
	
	@Query(value = "select	\r\n"
			+ "	states_master.state as state,\r\n"
			+ "	eligible_men_per_hh.no_of_completed_hh_urban as noOfCompletedHhUrban ,\r\n"
			+ "    eligible_men_per_hh.no_of_de_facto_eligible_men_in_completed_hh_urban as noOfDeFactoEligibleMenInCompletedHhUrban ,\r\n"
			+ "    eligible_men_per_hh.mean_no_of_de_facto_eligible_men_per_hh_urban as meanNoOfDeFactoEligibleMenPerHhUrban ,\r\n"
			+ "    eligible_men_per_hh.no_of_completed_hh_rural as noOfCompletedHhRural ,\r\n"
			+ "    eligible_men_per_hh.no_of_de_facto_eligible_men_in_completed_hh_rural as noOfDeFactoEligibleMenInCompletedHhRural ,\r\n"
			+ "    eligible_men_per_hh.mean_no_of_de_facto_eligible_men_per_hh_rural as meanNoOfDeFactoEligibleMenPerHhRural from eligible_men_per_hh LEFT JOIN states_master \r\n"
			+ "ON eligible_men_per_hh.state_id = states_master.state_id;",nativeQuery = true)
	public List<EligibleMenPerHhDTO> findAllEligibleMenPerHh();
	
	
	@Query(value = "select	\r\n"
			+ "	states_master.state as state,\r\n"
			+ "	eligible_women_per_hh.no_of_completed_hh_urban as noOfCompletedHhUrban ,\r\n"
			+ "    eligible_women_per_hh.no_of_de_facto_eligible_women_in_completed_hh_urban as noOfDeFactoEligibleWomenInCompletedHhUrban ,\r\n"
			+ "    eligible_women_per_hh.mean_no_of_de_facto_eligible_women_per_hh_urban as meanNoOfDeFactoEligibleWomenPerHhUrban ,\r\n"
			+ "    eligible_women_per_hh.no_of_completed_hh_rural as noOfCompletedHhRural ,\r\n"
			+ "    eligible_women_per_hh.no_of_de_facto_eligible_women_in_completed_hh_rural as noOfDeFactoEligibleWomenInCompletedHhRural ,\r\n"
			+ "    eligible_women_per_hh.mean_no_of_de_facto_eligible_women_per_hh_rural as meanNoOfDeFactoEligibleWomenPerHhRural from eligible_women_per_hh LEFT JOIN states_master \r\n"
			+ "ON eligible_women_per_hh.state_id = states_master.state_id;",nativeQuery = true)
	public List<EligibleWomenPerHhDTO> findAllEligibleWomenPerHh();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	visit_hh.visit_1 as visit_1,	\r\n"
			+ "	visit_hh.visit_2 as visit_2,	\r\n"
			+ "	visit_hh.visit_3 as visit_3,	\r\n"
			+ "	visit_hh.per_Sum as perSum,	\r\n"
			+ "	visit_hh.num as num from visit_hh LEFT JOIN states_master ON visit_hh.state_id = states_master.state_id;",nativeQuery = true)
	public List<VisitHhDTO> findAllVisitHh();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	age_displacement_men_lower_limit.age_12 as age_12,	\r\n"
			+ "	age_displacement_men_lower_limit.age_13 as age_13,	\r\n"
			+ "	age_displacement_men_lower_limit.age_14 as age_14,	\r\n"
			+ "	age_displacement_men_lower_limit.age_15 as age_15,	\r\n"
			+ "	age_displacement_men_lower_limit.age_16 as age_16,	\r\n"
			+ "	age_displacement_men_lower_limit.age_17 as age_17,	\r\n"
			+ "	age_displacement_men_lower_limit.age_18 as age_18,	\r\n"
			+ "	age_displacement_men_lower_limit.number_of_men as numberOfMen,	\r\n"
			+ "	age_displacement_men_lower_limit.age_ratio as ageRatio from age_displacement_men_lower_limit LEFT JOIN states_master ON age_displacement_men_lower_limit.state_id = states_master.state_id;",nativeQuery = true)
	public List<AgeDisplacementMenLowerLimitDTO> findAllAgeDisplacementMenLowerLimit();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	age_displacement_men_upper_limit.age_52 as age_52,	\r\n"
			+ "	age_displacement_men_upper_limit.age_53 as age_53,	\r\n"
			+ "	age_displacement_men_upper_limit.age_54 as age_54,	\r\n"
			+ "	age_displacement_men_upper_limit.age_55 as age_55,	\r\n"
			+ "	age_displacement_men_upper_limit.age_56 as age_56,	\r\n"
			+ "	age_displacement_men_upper_limit.age_57 as age_57,	\r\n"
			+ "	age_displacement_men_upper_limit.age_58 as age_58,	\r\n"
			+ "	age_displacement_men_upper_limit.number_of_men as numberOfMen,	\r\n"
			+ "	age_displacement_men_upper_limit.age_ratio as ageRatio from age_displacement_men_upper_limit LEFT JOIN states_master ON age_displacement_men_upper_limit.state_id = states_master.state_id;",nativeQuery = true)
	public List<AgeDisplacementMenUpperLimitDTO> findAllAgeDisplacementMenUpperLimit();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	age_displacement_women_lower_limit.age_12 as age_12,	\r\n"
			+ "	age_displacement_women_lower_limit.age_13 as age_13,	\r\n"
			+ "	age_displacement_women_lower_limit.age_14 as age_14,	\r\n"
			+ "	age_displacement_women_lower_limit.age_15 as age_15,	\r\n"
			+ "	age_displacement_women_lower_limit.age_16 as age_16,	\r\n"
			+ "	age_displacement_women_lower_limit.age_17 as age_17,	\r\n"
			+ "	age_displacement_women_lower_limit.age_18 as age_18,	\r\n"
			+ "	age_displacement_women_lower_limit.number_of_women as numberOfWomen,	\r\n"
			+ "	age_displacement_women_lower_limit.age_ratio as ageRatio from age_displacement_women_lower_limit LEFT JOIN states_master ON age_displacement_women_lower_limit.state_id = states_master.state_id;",nativeQuery = true)
	public List<AgeDisplacementWomenLowerLimitDTO> findAllAgeDisplacementWomenLowerLimit();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	age_displacement_women_upper_limit.age_52 as age_52,	\r\n"
			+ "	age_displacement_women_upper_limit.age_53 as age_53,	\r\n"
			+ "	age_displacement_women_upper_limit.age_54 as age_54,	\r\n"
			+ "	age_displacement_women_upper_limit.age_55 as age_55,	\r\n"
			+ "	age_displacement_women_upper_limit.age_56 as age_56,	\r\n"
			+ "	age_displacement_women_upper_limit.age_57 as age_57,	\r\n"
			+ "	age_displacement_women_upper_limit.age_58 as age_58,	\r\n"
			+ "	age_displacement_women_upper_limit.number_of_women as numberOfWomen,	\r\n"
			+ "	age_displacement_women_upper_limit.age_ratio as ageRatio from age_displacement_women_upper_limit LEFT JOIN states_master ON age_displacement_women_upper_limit.state_id = states_master.state_id;",nativeQuery = true)
	public List<AgeDisplacementWomenUpperLimitDTO> findAllAgeDisplacementWomenUpperLimit();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	birth_displacement.year_2014 as year_2014,	\r\n"
			+ "	birth_displacement.year_2015 as year_2015,	\r\n"
			+ "	birth_displacement.year_2016 as year_2016,	\r\n"
			+ "	birth_displacement.year_2017 as year_2017,	\r\n"
			+ "	birth_displacement.year_2018 as year_2018,	\r\n"
			+ "	birth_displacement.year_2019 as year_2019,	\r\n"
			+ "	birth_displacement.year_2020 as year_2020,	\r\n"
			+ "	birth_displacement.year_2021 as year_2021,	\r\n"
			+ "	birth_displacement.year_2022 as year_2022,	\r\n"
			+ "	birth_displacement.year_2023 as year_2023,	\r\n"
			+ "	birth_displacement.missing as missing,	\r\n"
			+ "	birth_displacement.number_of_births as numberOfBirths,	\r\n"
			+ "	birth_displacement.birth_year_ratio_2018_2017 as birthYearRatio_2018_2017 from birth_displacement LEFT JOIN states_master ON birth_displacement.state_id = states_master.state_id;",nativeQuery = true)
	public List<BirthDisplacementDTO> findAllBirthDisplacement();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	contraceptive_prevalence_rate.any_method as anyMethod,	\r\n"
			+ "	contraceptive_prevalence_rate.number_val as numberVal from contraceptive_prevalence_rate LEFT JOIN states_master ON contraceptive_prevalence_rate.state_id = states_master.state_id;",nativeQuery = true)
	public List<ContraceptivePrevalenceRateDTO> findAllContraceptivePrevalenceRate();
	
	@Query(value = "select	\r\n"
			+ "	states_master.state as state,\r\n"
			+ "	eligible_men_response_rate.completed as completed ,\r\n"
			+ "    eligible_men_response_rate.not_at_home as notAtHome ,\r\n"
			+ "    eligible_men_response_rate.postponed as postponed ,\r\n"
			+ "    eligible_men_response_rate.refused as refused ,\r\n"
			+ "    eligible_men_response_rate.partly_completed as partlyCompleted ,\r\n"
			+ "    eligible_men_response_rate.other as other ,\r\n"
			+ "    eligible_men_response_rate.percent_val as percentVal ,\r\n"
			+ "    eligible_men_response_rate.number_val as numberVal ,\r\n"
			+ "    eligible_men_response_rate.date_attribute as dateAttribute ,\r\n"
			+ "    eligible_men_response_rate.incapacited as incapacited from eligible_men_response_rate LEFT JOIN states_master \r\n"
			+ "ON eligible_men_response_rate.state_id = states_master.state_id;",nativeQuery = true)
	public List<EligibleMenResponseRateDTO> findAllEligibleMenResponseRate();
	
	@Query(value = "select	\r\n"
			+ "	states_master.state as state,\r\n"
			+ "	eligible_women_response_rate.completed as completed ,\r\n"
			+ "    eligible_women_response_rate.not_at_home as notAtHome ,\r\n"
			+ "    eligible_women_response_rate.postponed as postponed ,\r\n"
			+ "    eligible_women_response_rate.refused as refused ,\r\n"
			+ "    eligible_women_response_rate.partly_completed as partlyCompleted ,\r\n"
			+ "    eligible_women_response_rate.other as other ,\r\n"
			+ "    eligible_women_response_rate.percent_val as percentVal ,\r\n"
			+ "    eligible_women_response_rate.number_val as numberVal ,\r\n"
			+ "    eligible_women_response_rate.date_attribute as dateAttribute ,\r\n"
			+ "    eligible_women_response_rate.incapacited as incapacited from eligible_women_response_rate LEFT JOIN states_master \r\n"
			+ "ON eligible_women_response_rate.state_id = states_master.state_id;",nativeQuery = true)
	public List<EligibleWomenResponseRateDTO> findAllEligibleWomenResponseRate();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	hh_completion_rate.completed as completed,	\r\n"
			+ "	hh_completion_rate.no_hh_member_at_home_or_no_respondent_at_home as noHhMemberAtHomeOrNoRespondentAtHome,	\r\n"
			+ "	hh_completion_rate.entire_hh_absent_at_time_of_visit as entireHhAbsentAtTimeOfVisit,	\r\n"
			+ "	hh_completion_rate.postponed as postponed,	\r\n"
			+ "	hh_completion_rate.refused as refused,	\r\n"
			+ "	hh_completion_rate.dwelling_vacant_or_address_not_a_dwelling as dwellingVacantOrAddressNotADwelling,	\r\n"
			+ "	hh_completion_rate.dwelling_destroyed as dwellingDestroyed,	\r\n"
			+ "	hh_completion_rate.dwelling_not_found as dwellingNotFound,	\r\n"
			+ "	hh_completion_rate.other as other,	\r\n"
			+ "	hh_completion_rate.percent_val as percentVal,	\r\n"
			+ "	hh_completion_rate.number_val as numberVal from hh_completion_rate LEFT JOIN states_master ON hh_completion_rate.state_id = states_master.state_id;",nativeQuery = true)
	public List<HhCompletionRateDTO> getAllHhCompletionRate();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	household_relations_modules.tt_no_of_women_eligible_for_domestic_violence as ttNoOfWomenEligibleForDomesticViolence,	\r\n"
			+ "	household_relations_modules.eligible_women_not_interviewed_because_of_privacy_not_obtained as eligibleWomenNotInterviewedBecauseOfPrivacyNotObtained from household_relations_modules LEFT JOIN states_master ON household_relations_modules.state_id = states_master.state_id;",nativeQuery = true)
	public List<HouseholdRelationsModulesDTO> findAllHouseholdRelationsModules();
	
	@Query(value = "select	\r\n"
			+ "	states_master.state as state,\r\n"
			+ "	men_15_54_visits.visit_1 as visit_1 ,\r\n"
			+ " men_15_54_visits.visit_2 as visit_2 ,\r\n"
			+ " men_15_54_visits.visit_3 as visit_3 ,\r\n"
			+ " men_15_54_visits.per_sum as perSum ,\r\n"
			+ " men_15_54_visits.num as num \r\n"
			+ " from men_15_54_visits LEFT JOIN states_master \r\n"
			+ " ON men_15_54_visits.state_id = states_master.state_id;",nativeQuery = true)
	public List<MenVisit1554VisitsDTO> findAllMenVisit1554Visits();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	vaccination_health_cards.per_of_children_reported_to_have_vaccination_card as perOfChildrenReportedToHaveVaccinationCard,	\r\n"
			+ "	vaccination_health_cards.per_of_children_whose_vaccine_card_was_seen as perOfChildrenWhoseVaccineCardWasSeen,	\r\n"
			+ "	vaccination_health_cards.number_of_children as numberOfChildren,	\r\n"
			+ "	vaccination_health_cards.proportion_of_cards_seen as proportionOfCardsSeen	\r\n"
			+ " from vaccination_health_cards LEFT JOIN states_master ON vaccination_health_cards.state_id = states_master.state_id;",nativeQuery = true)
	public List<VaccinationHealthCardsDTO> findVaccinationHealthCards();
	
	@Query(value = "select	\r\n"
			+ "	states_master.state as state,\r\n"
			+ "	women_15_49_visits.visit_1 as visit_1 ,\r\n"
			+ " women_15_49_visits.visit_2 as visit_2 ,\r\n"
			+ " women_15_49_visits.visit_3 as visit_3 ,\r\n"
			+ " women_15_49_visits.per_sum as perSum ,\r\n"
			+ " women_15_49_visits.num as num \r\n"
			+ " from women_15_49_visits LEFT JOIN states_master \r\n"
			+ " ON women_15_49_visits.state_id = states_master.state_id;",nativeQuery = true)
	public List<WomenVisit1549VisitsDTO> findAllWomenVisit1549Visits();
	
}
