package com.nciipc.household.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nciipc.household.model.EligibleMenPerHh;

//import com.nciipc.household.model.InterviewStartTime;
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


@Repository
public interface ReportsRepo extends JpaRepository<EligibleMenPerHh, Integer> {
	
	@Query(value = "select	\r\n"
			+ "	states_master.state as state,\r\n"
			+ "	eligible_men_per_hh.no_of_completed_hh_urban as noOfCompletedHhUrban ,\r\n"
			+ "    eligible_men_per_hh.no_of_de_facto_eligible_men_in_completed_hh_urban as noOfDeFactoEligibleMenInCompletedHhUrban ,\r\n"
			+ "    eligible_men_per_hh.mean_no_of_de_facto_eligible_men_per_hh_urban as meanNoOfDeFactoEligibleMenPerHhUrban ,\r\n"
			+ "    eligible_men_per_hh.no_of_completed_hh_rural as noOfCompletedHhRural ,\r\n"
			+ "    eligible_men_per_hh.no_of_de_facto_eligible_men_in_completed_hh_rural as noOfDeFactoEligibleMenInCompletedHhRural ,\r\n"
			+ "    eligible_men_per_hh.mean_no_of_de_facto_eligible_men_per_hh_rural as meanNoOfDeFactoEligibleMenPerHhRural, \r\n"
			+ " eligible_men_per_hh.date_attribute as date \r\n"
			+ "from public.eligible_men_per_hh LEFT JOIN public.states_master \r\n"
			+ "ON eligible_men_per_hh.state_id = states_master.state_id;",nativeQuery = true)
	public List<EligibleMenPerHhDTO> findAllEligibleMenPerHh();
	
	
	@Query(value = "select	\r\n"
			+ "	states_master.state as state,\r\n"
			+ "	eligible_women_per_hh.no_of_completed_hh_urban as noOfCompletedHhUrban ,\r\n"
			+ "    eligible_women_per_hh.no_of_de_facto_eligible_women_in_completed_hh_urban as noOfDeFactoEligibleWomenInCompletedHhUrban ,\r\n"
			+ "    eligible_women_per_hh.mean_no_of_de_facto_eligible_women_per_hh_urban as meanNoOfDeFactoEligibleWomenPerHhUrban ,\r\n"
			+ "    eligible_women_per_hh.no_of_completed_hh_rural as noOfCompletedHhRural ,\r\n"
			+ "    eligible_women_per_hh.no_of_de_facto_eligible_women_in_completed_hh_rural as noOfDeFactoEligibleWomenInCompletedHhRural ,\r\n"
			+ "    eligible_women_per_hh.mean_no_of_de_facto_eligible_women_per_hh_rural as meanNoOfDeFactoEligibleWomenPerHhRural,\r\n "
			+ " eligible_women_per_hh.date_attribute as date \r\n"
			+ "from public.eligible_women_per_hh LEFT JOIN public.states_master \r\n"
			+ "ON eligible_women_per_hh.state_id = states_master.state_id;",nativeQuery = true)
	public List<EligibleWomenPerHhDTO> findAllEligibleWomenPerHh();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	hh_visit.visit_1 as visit_1,	\r\n"
			+ "	hh_visit.visit_2 as visit_2,	\r\n"
			+ "	hh_visit.visit_3 as visit_3,	\r\n"
			+ "	hh_visit.per_Sum as perSum,	\r\n"
			+ "	hh_visit.num as num, \r\n"
			+ " hh_visit.date_attribute as date \r\n"
			+ "from public.hh_visit LEFT JOIN public.states_master ON hh_visit.state_id = states_master.state_id;",nativeQuery = true)
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
			+ "	age_displacement_men_lower_limit.age_ratio as ageRatio, \r\n"
			+ " age_displacement_men_lower_limit.date_attribute as date \r\n"
			+ "from public.age_displacement_men_lower_limit LEFT JOIN public.states_master ON age_displacement_men_lower_limit.state_id = states_master.state_id;",nativeQuery = true)
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
			+ "	age_displacement_men_upper_limit.age_ratio as ageRatio, "
			+ " age_displacement_men_upper_limit.date_attribute as date \r\n"
			+ "from public.age_displacement_men_upper_limit LEFT JOIN public.states_master ON age_displacement_men_upper_limit.state_id = states_master.state_id;",nativeQuery = true)
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
			+ "	age_displacement_women_lower_limit.age_ratio as ageRatio, "
			+ " age_displacement_women_lower_limit.date_attribute as date \r\n"
			+ "from public.age_displacement_women_lower_limit LEFT JOIN public.states_master ON age_displacement_women_lower_limit.state_id = states_master.state_id;",nativeQuery = true)
	public List<AgeDisplacementWomenLowerLimitDTO> findAllAgeDisplacementWomenLowerLimit();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	age_displacement_women_upper_limit.age_47 as age_47,	\r\n"
			+ "	age_displacement_women_upper_limit.age_48 as age_48,	\r\n"
			+ "	age_displacement_women_upper_limit.age_49 as age_49,	\r\n"
			+ "	age_displacement_women_upper_limit.age_50 as age_50,	\r\n"
			+ "	age_displacement_women_upper_limit.age_51 as age_51,	\r\n"
			+ "	age_displacement_women_upper_limit.age_52 as age_52,	\r\n"
			+ "	age_displacement_women_upper_limit.age_53 as age_53,	\r\n"
			+ "	age_displacement_women_upper_limit.number_of_women as numberOfWomen,	\r\n"
			+ "	age_displacement_women_upper_limit.age_ratio as ageRatio, "
			+ " age_displacement_women_upper_limit.date_attribute as date \r\n"
			+ "from public.age_displacement_women_upper_limit LEFT JOIN public.states_master ON age_displacement_women_upper_limit.state_id = states_master.state_id;",nativeQuery = true)
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
			+ "	birth_displacement.birth_year_ratio_2018_2017 as birthYearRatio_2018_2017, "
			+ " birth_displacement.date_attribute as date \r\n"
			+ "from public.birth_displacement LEFT JOIN public.states_master ON birth_displacement.state_id = states_master.state_id;",nativeQuery = true)
	public List<BirthDisplacementDTO> findAllBirthDisplacement();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	contraceptive_prevalence_rate.any_method as anyMethod,	\r\n"
			+ "	contraceptive_prevalence_rate.number_val as numberVal, \r\n"
			+ " contraceptive_prevalence_rate.date_attribute as date \r\n"
			+ "from public.contraceptive_prevalence_rate LEFT JOIN public.states_master ON contraceptive_prevalence_rate.state_id = states_master.state_id;",nativeQuery = true)
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
//			+ "    eligible_men_response_rate.date_attribute as dateAttribute ,\r\n"
			+ "    eligible_men_response_rate.incapacited as incapacited, "
			+ " eligible_men_response_rate.date_attribute as date \r\n"
			+ "from public.eligible_men_response_rate LEFT JOIN public.states_master \r\n"
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
//			+ "    eligible_women_response_rate.date_attribute as dateAttribute ,\r\n"
			+ "    eligible_women_response_rate.incapacited as incapacited, "
			+ " eligible_women_response_rate.date_attribute as date \r\n"
			+ "from public.eligible_women_response_rate LEFT JOIN public.states_master \r\n"
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
			+ "	hh_completion_rate.number_val as numberVal, "
			+ " hh_completion_rate.date_attribute as date \r\n"
			+ "from public.hh_completion_rate LEFT JOIN public.states_master ON hh_completion_rate.state_id = states_master.state_id;",nativeQuery = true)
	public List<HhCompletionRateDTO> getAllHhCompletionRate();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	household_relations_modules.tt_no_of_women_eligible_for_domestic_violence as ttNoOfWomenEligibleForDomesticViolence,	\r\n"
			+ "	household_relations_modules.eligible_women_not_interviewed_because_of_privacy_not_obtained as eligibleWomenNotInterviewedBecauseOfPrivacyNotObtained, \r\n"
			+ " household_relations_modules.date_attribute as date \r\n"
			+ "from public.household_relations_modules LEFT JOIN public.states_master ON household_relations_modules.state_id = states_master.state_id;",nativeQuery = true)
	public List<HouseholdRelationsModulesDTO> findAllHouseholdRelationsModules();
	
	@Query(value = "select	\r\n"
			+ "	states_master.state as state,\r\n"
			+ "	men_15_54_visits.visit_1 as visit_1 ,\r\n"
			+ " men_15_54_visits.visit_2 as visit_2 ,\r\n"
			+ " men_15_54_visits.visit_3 as visit_3 ,\r\n"
			+ " men_15_54_visits.per_sum as perSum ,\r\n"
			+ " men_15_54_visits.num as num, \r\n"
			+ " men_15_54_visits.date_attribute as date \r\n"
			+ " from public.men_15_54_visits LEFT JOIN public.states_master \r\n"
			+ " ON men_15_54_visits.state_id = states_master.state_id;",nativeQuery = true)
	public List<MenVisit1554VisitsDTO> findAllMenVisit1554Visits();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	vaccination_health_cards.per_of_children_reported_to_have_vaccination_card as perOfChildrenReportedToHaveVaccinationCard,	\r\n"
			+ "	vaccination_health_cards.per_of_children_whose_vaccine_card_was_seen as perOfChildrenWhoseVaccineCardWasSeen,	\r\n"
			+ "	vaccination_health_cards.number_of_children as numberOfChildren,	\r\n"
			+ "	vaccination_health_cards.proportion_of_cards_seen as proportionOfCardsSeen,	\r\n"
			+ " vaccination_health_cards.date_attribute as date \r\n"
			+ " from public.vaccination_health_cards LEFT JOIN public.states_master ON vaccination_health_cards.state_id = states_master.state_id;",nativeQuery = true)
	public List<VaccinationHealthCardsDTO> findVaccinationHealthCards();
	
	@Query(value = "select	\r\n"
			+ "	states_master.state as state,\r\n"
			+ "	women_15_49_visits.visit_1 as visit_1 ,\r\n"
			+ " women_15_49_visits.visit_2 as visit_2 ,\r\n"
			+ " women_15_49_visits.visit_3 as visit_3 ,\r\n"
			+ " women_15_49_visits.per_sum as perSum ,\r\n"
			+ " women_15_49_visits.num as num, \r\n"
			+ " women_15_49_visits.date_attribute as date \r\n"
			+ " from public.women_15_49_visits LEFT JOIN public.states_master \r\n"
			+ " ON women_15_49_visits.state_id = states_master.state_id;",nativeQuery = true)
	public List<WomenVisit1549VisitsDTO> findAllWomenVisit1549Visits();
	
//	@Query(value = "select	\r\n"
//			+ " states_master.state as state,\r\n"
//			+ " womens_height.mesured as mesured ,\r\n"
//			+ " womens_height.women_not_present as womenNotPresent ,\r\n"
//			+ " womens_height.women_refused as womenRefused ,\r\n"
//			+ " womens_height.other as other ,\r\n"
//			+ " womens_height.missing as missing,\r\n"
//			+ " womens_height.total as total, \r\n"
//			+ " womens_height.number_of_women as numberOfWomen,\r\n"
//			+ " womens_height.women_ht_out_of_range as womenHtOutOfRange,\r\n"
//			+ " womens_height.women_with_valid_ht_data as womenWithValidHtData, \r\n"
//			+ " womens_height.date_attribute as date1 \r\n"
//			+ " from public.womens_height LEFT JOIN public.states_master \r\n"
//			+ " ON womens_height.state_id = states_master.state_id;",nativeQuery = true)
//	public List<WomensHeightDTO> findAlWomensHeight();
	
//	@Query(value = "select	\r\n"
//			+ "	states_master.state as state,\r\n"
//			+ "	interview_start_time.slot_6am_7_59am as slot_6am_7_59am ,\r\n"
//			+ "    interview_start_time.slot_8am_8pm as slot_8am_8pm ,\r\n"
//			+ "    interview_start_time.slot_8_01pm_5_59am as slot_8_01pm_5_59am ,\r\n"
//			+ "    interview_start_time.all_elibible_women as all_elibible_women ,\r\n"
//			+ " from public.interview_start_time LEFT JOIN public.states_master \r\n"
//			+ "ON interview_start_time.state_id = states_master.state_id;",nativeQuery = true)
//	public List<InterviewStartTimeDTO> findAllInterviewStartTime();
	
	@Query(value = "Select \r\n"
			+ "	states_master.state as state,	\r\n"
			+ "	sex_ratio_of_children.num_of_girls as numOfGirls,	\r\n"
			+ "	sex_ratio_of_children.num_of_boys as numOfBoys, sex_ratio_of_children.sex_ratio as sexRatio, "
			+ " sex_ratio_of_children.date_attribute as date \r\n"
			+ "from public.sex_ratio_of_children LEFT JOIN public.states_master ON sex_ratio_of_children.state_id = states_master.state_id;",nativeQuery = true)
	public List<SexRatioOfChildrenDTO> findAllSexRatioOfChildren();
	
	
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " womens_height.mesured as mesured ,\r\n"
			+ " womens_height.women_not_present as womenNotPresent ,\r\n"
			+ " womens_height.women_refused as womenRefused ,\r\n"
			+ " womens_height.other as other ,\r\n"
			+ " womens_height.missing as missing,\r\n"
			+ " womens_height.total as total, \r\n"
			+ " womens_height.number_of_women as numberOfWomen,\r\n"
			+ " womens_height.women_ht_out_of_range as womenHtOutOfRange,\r\n"
			+ " womens_height.women_with_valid_ht_data as womenWithValidHtData, \r\n"
			+ " womens_height.date_attribute as date \r\n"
			+ " from public.womens_height LEFT JOIN public.states_master \r\n"
			+ " ON womens_height.state_id = states_master.state_id;",nativeQuery = true)
	public List<WomensHeightDTO> findAllWomensHeight();
	
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " womens_weight.mesured as mesured ,\r\n"
			+ " womens_weight.women_not_present as womenNotPresent ,\r\n"
			+ " womens_weight.women_refused as womenRefused ,\r\n"
			+ " womens_weight.other as other ,\r\n"
			+ " womens_weight.missing as missing,\r\n"
			+ " womens_weight.total as total, \r\n"
			+ " womens_weight.number_of_women as numberOfWomen,\r\n"
			+ " womens_weight.women_wt_out_of_range as womenWtOutOfRange,\r\n"
			+ " womens_weight.women_with_valid_wt_data as womenWithValidWtData, \r\n"
			+ " womens_weight.date_attribute as date \r\n"
			+ " from public.womens_weight LEFT JOIN public.states_master \r\n"
			+ " ON womens_weight.state_id = states_master.state_id;",nativeQuery = true)
	public List<WomensWeightDTO> findAllWomensWeight();
	
	
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " interview_start_time.slot_6am_7_59am as slot_6am_7_59am ,\r\n"
			+ " interview_start_time.slot_8am_8pm as slot_8am_8pm ,\r\n"
			+ " interview_start_time.slot_8_01pm_5_59am as slot_8_01pm_5_59am ,\r\n"
			+ " interview_start_time.all_elibible_women as allEligibleWomen, \r\n"
			+ " interview_start_time.date_attribute as date \r\n"
			+ " from public.interview_start_time LEFT JOIN public.states_master \r\n"
			+ " ON interview_start_time.state_id = states_master.state_id;",nativeQuery = true)
	public List<InterviewStartTimeDTO> findAllInterviewStartTime();
	
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " birth_weight_healthcard.card as card ,\r\n"
			+ " birth_weight_healthcard.recall as recall ,\r\n"
			+ " birth_weight_healthcard.count as count, \r\n"
			+ " birth_weight_healthcard.date_attribute as date \r\n"
			+ " from public.birth_weight_healthcard LEFT JOIN public.states_master \r\n"
			+ " ON birth_weight_healthcard.state_id = states_master.state_id;",nativeQuery = true)
	public List<BirthWeightHealthCardDTO> findAllBirthWeightHealthCard();
	
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " mens_height.measured as measured ,\r\n"
			+ " mens_height.man_not_present as menNotPresent ,\r\n"
			+ " mens_height.man_refused as menRefused ,\r\n"
			+ " mens_height.other as other ,\r\n"
			+ " mens_height.missing as missing,\r\n"
			+ " mens_height.total_in_percentage as total, \r\n"
			+ " mens_height.number_of_men as numberOfMen,\r\n"
			+ " mens_height.among_men_measured_height_out_of_range as menHtOutOfRange,\r\n"
			+ " mens_height.men_with_valid_height_data as menWithValidHtData, \r\n"
			+ " mens_height.date_attribute as date \r\n"
			+ " from public.mens_height LEFT JOIN public.states_master \r\n"
			+ " ON mens_height.state_id = states_master.state_id;",nativeQuery = true)
	public List<MensHeightDTO> findAllMensHeight();
	
	
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " no_food_consumption_of_child_from public._6_23_months.not_eaten_percentage as notEatenPercentage ,\r\n"
			+ " no_food_consumption_of_child_from public._6_23_months.number_of_children as numberOfChildren, \r\n"
			+ " no_food_consumption_of_child_from public._6_23_months.date_attribute as date \r\n"
			+ " from public.no_food_consumption_of_child_from public._6_23_months LEFT JOIN public.states_master \r\n"
			+ " ON no_food_consumption_of_child_from public._6_23_months.state_id = states_master.state_id;",nativeQuery = true)
	public List<NoFoodConsumptionOfChildFrom6To23MonthsDTO> findAllNoFoodConsumptionOfChildFrom6To23Months();
	
	
	//sampada's repo
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " childrens_height.mesured as mesured ,\r\n"
			+ " childrens_height.child_not_present as childNotPresent ,\r\n"
			+ " childrens_height.refused as refused ,\r\n"
			+ " childrens_height.other as other ,\r\n"
			+ " childrens_height.missing as missing,\r\n"
			+ " childrens_height.total as total, \r\n"
			+ " childrens_height.number_of_children as numberOfChildren,\r\n"
			+ " childrens_height.height_out_of_range as heightOutOfRange,\r\n"
			+ " childrens_height.date_of_birth_incomplete as dateOfBirthIncomplete, \r\n"
			+ " childrens_height.children_with_valid_data as childrenWithValidData, \r\n"
			+ " childrens_height.height_for_age_z_score_out_of_range as heightForAgeZScoreOutOfRange, \r\n"
			+ " childrens_height.date_attribute as date \r\n"
			+ " from public.childrens_height LEFT JOIN public.states_master \r\n"
			+ " ON childrens_height.state_id = states_master.state_id;",nativeQuery = true)
	public List<ChildrensHeightDTO> findAllChildrensHeight();
	
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " childrens_weight.mesured as mesured ,\r\n"
			+ " childrens_weight.child_not_present as childNotPresent ,\r\n"
			+ " childrens_weight.refused as refused ,\r\n"
			+ " childrens_weight.other as other ,\r\n"
			+ " childrens_weight.missing as missing,\r\n"
			+ " childrens_weight.total as total, \r\n"
			+ " childrens_weight.number_of_children as numberOfChildren,\r\n"
			+ " childrens_weight.weight_out_of_range as weightOutOfRange,\r\n"
			+ " childrens_weight.date_of_birth_incomplete as dateOfBirthIncomplete, \r\n"
			+ " childrens_weight.children_with_valid_data as childrenWithValidData, \r\n"
			+ " childrens_weight.weight_for_height_z_score_out_of_range as weightForHeightZScoreOutOfRange, \r\n"
			+ " childrens_weight.date_attribute as date \r\n"
			+ " from public.childrens_weight LEFT JOIN public.states_master \r\n"
			+ " ON childrens_weight.state_id = states_master.state_id;",nativeQuery = true)
	public List<ChildrensWeightDTO> findAllChildrensWeight();
	
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " childrens_weight_heaping_first_decimal.c_0 as c_0 ,\r\n"
			+ " childrens_weight_heaping_first_decimal.c_1 as c_1 ,\r\n"
			+ " childrens_weight_heaping_first_decimal.c_2 as c_2 ,\r\n"
			+ " childrens_weight_heaping_first_decimal.c_3 as c_3 ,\r\n"
			+ " childrens_weight_heaping_first_decimal.c_4 as c_4,\r\n"
			+ " childrens_weight_heaping_first_decimal.c_5 as c_5, \r\n"
			+ " childrens_weight_heaping_first_decimal.c_6 as c_6,\r\n"
			+ " childrens_weight_heaping_first_decimal.c_7 as c_7,\r\n"
			+ " childrens_weight_heaping_first_decimal.c_8 as c_8, \r\n"
			+ " childrens_weight_heaping_first_decimal.c_9 as c_9, \r\n"
			+ " childrens_weight_heaping_first_decimal.total_percent as totalPercent, \r\n"
			+ " childrens_weight_heaping_first_decimal.percent_with_first_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
			+ " childrens_weight_heaping_first_decimal.number_of_children_with_valid_weight_data as numberOfChildrenWithValidWeightData, \r\n"
			+ " childrens_weight_heaping_first_decimal.date_attribute as date \r\n"
			+ " from public.childrens_weight_heaping_first_decimal LEFT JOIN public.states_master \r\n"
			+ " ON childrens_weight_heaping_first_decimal.state_id = states_master.state_id;",nativeQuery = true)
	public List<ChildrensWeightHeapingFirstDecimalDTO> findAllChildrensWeightHeapingFirstDecimal();
	
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " childrens_weight_heaping_second_decimal.c_0 as c_0 ,\r\n"
			+ " childrens_weight_heaping_second_decimal.c_1 as c_1 ,\r\n"
			+ " childrens_weight_heaping_second_decimal.c_2 as c_2 ,\r\n"
			+ " childrens_weight_heaping_second_decimal.c_3 as c_3 ,\r\n"
			+ " childrens_weight_heaping_second_decimal.c_4 as c_4,\r\n"
			+ " childrens_weight_heaping_second_decimal.c_5 as c_5, \r\n"
			+ " childrens_weight_heaping_second_decimal.c_6 as c_6,\r\n"
			+ " childrens_weight_heaping_second_decimal.c_7 as c_7,\r\n"
			+ " childrens_weight_heaping_second_decimal.c_8 as c_8, \r\n"
			+ " childrens_weight_heaping_second_decimal.c_9 as c_9, \r\n"
			+ " childrens_weight_heaping_second_decimal.total_percent as totalPercent, \r\n"
			+ " childrens_weight_heaping_second_decimal.percent_with_second_decimal_0_or_5 as percentWithsecondDecimal_0_or_5, \r\n"
			+ " childrens_weight_heaping_second_decimal.number_of_children_with_valid_weight_data as numberOfChildrenWithValidWeightData, \r\n"
			+ " childrens_weight_heaping_second_decimal.date_attribute as date \r\n"
			+ " from public.childrens_weight_heaping_second_decimal LEFT JOIN public.states_master \r\n"
			+ " ON childrens_weight_heaping_second_decimal.state_id = states_master.state_id;",nativeQuery = true)
	public List<ChildrensWeightHeapingSecondDecimalDTO> findAllChildrensWeightHeapingSecondDecimal();
	

	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " mens_weight_heaping_first_digit.\"0\" as c_0 ,\r\n"
			+ " mens_weight_heaping_first_digit.\"1\" as c_1 ,\r\n"
			+ " mens_weight_heaping_first_digit.\"2\" as c_2 ,\r\n"
			+ " mens_weight_heaping_first_digit.\"3\" as c_3 ,\r\n"
			+ " mens_weight_heaping_first_digit.\"4\" as c_4,\r\n"
			+ " mens_weight_heaping_first_digit.\"5\" as c_5, \r\n"
			+ " mens_weight_heaping_first_digit.\"6\" as c_6,\r\n"
			+ " mens_weight_heaping_first_digit.\"7\" as c_7,\r\n"
			+ " mens_weight_heaping_first_digit.\"8\" as c_8, \r\n"
			+ " mens_weight_heaping_first_digit.\"9\" as c_9, \r\n"
			+ " mens_weight_heaping_first_digit.total_in_percentage as totalInPercent, \r\n"
			+ " mens_weight_heaping_first_digit.percentage_with_1st_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
			+ " mens_weight_heaping_first_digit.number_of_men as numberOfMen, \r\n"
			+ " mens_weight_heaping_first_digit.date_attribute as date \r\n"
			+ " from public.mens_weight_heaping_first_digit LEFT JOIN public.states_master \r\n"
			+ " ON mens_weight_heaping_first_digit.state_id = states_master.state_id;",nativeQuery = true)
	public List<MensWeightHeapingFirstDecimalDTO> findAllMensWeightHeapingFirstDecimal();
	
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " mens_weight_heaping_second_digit.\"0\" as c_0 ,\r\n"
			+ " mens_weight_heaping_second_digit.\"1\" as c_1 ,\r\n"
			+ " mens_weight_heaping_second_digit.\"2\" as c_2 ,\r\n"
			+ " mens_weight_heaping_second_digit.\"3\" as c_3 ,\r\n"
			+ " mens_weight_heaping_second_digit.\"4\" as c_4,\r\n"
			+ " mens_weight_heaping_second_digit.\"5\" as c_5, \r\n"
			+ " mens_weight_heaping_second_digit.\"6\" as c_6,\r\n"
			+ " mens_weight_heaping_second_digit.\"7\" as c_7,\r\n"
			+ " mens_weight_heaping_second_digit.\"8\" as c_8, \r\n"
			+ " mens_weight_heaping_second_digit.\"9\" as c_9, \r\n"
			+ " mens_weight_heaping_second_digit.total_in_percentage as totalInPercent, \r\n"
			+ " mens_weight_heaping_second_digit.percentage_with_1st_decimal_0_or_5 as percentWithSecondDecimal_0_or_5, \r\n"
			+ " mens_weight_heaping_second_digit.number_of_men as numberOfMen, \r\n"
			+ " mens_weight_heaping_second_digit.date_attribute as date \r\n"
			+ " from public.mens_weight_heaping_second_digit LEFT JOIN public.states_master \r\n"
			+ " ON mens_weight_heaping_second_digit.state_id = states_master.state_id;",nativeQuery = true)
	public List<MensWeightHeapingSecondDecimalDTO> findAllMensWeightHeapingSecondDecimal();
	
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " mens_weight.measured as mesured ,\r\n"
			+ " mens_weight.man_not_present as manNotPresent ,\r\n"
			+ " mens_weight.man_refused as manrefused ,\r\n"
			+ " mens_weight.other as other ,\r\n"
			+ " mens_weight.missing as missing,\r\n"
			+ " mens_weight.total_in_percentage as total, \r\n"
			+ " mens_weight.number_of_men as numberOfMen,\r\n"
			+ " mens_weight.among_men_measured_weight_out_of_range as amongMenMeasuredWeightOutOfRange,\r\n"
			+ " mens_weight.men_with_valid_weight_data as menWithValidWeightData, \r\n"
			+ " mens_weight.date_attribute as date \r\n"
			+ " from public.mens_weight LEFT JOIN public.states_master \r\n"
			+ " ON mens_weight.state_id = states_master.state_id;",nativeQuery = true)
	public List<MensWeightDTO> findAllMensWeight();
	
	@Query(value = "select	\r\n"
			+ " states_master.state as state,\r\n"
			+ " mens_height_heaping_first_digit.\"0\" as c_0 ,\r\n"
			+ " mens_height_heaping_first_digit.\"1\" as c_1 ,\r\n"
			+ " mens_height_heaping_first_digit.\"2\" as c_2 ,\r\n"
			+ " mens_height_heaping_first_digit.\"3\" as c_3 ,\r\n"
			+ " mens_height_heaping_first_digit.\"4\" as c_4,\r\n"
			+ " mens_height_heaping_first_digit.\"5\" as c_5, \r\n"
			+ " mens_height_heaping_first_digit.\"6\" as c_6,\r\n"
			+ " mens_height_heaping_first_digit.\"7\" as c_7,\r\n"
			+ " mens_height_heaping_first_digit.\"8\" as c_8, \r\n"
			+ " mens_height_heaping_first_digit.\"9\" as c_9, \r\n"
			+ " mens_height_heaping_first_digit.total_in_percentage as totalInPercent, \r\n"
			+ " mens_height_heaping_first_digit.percentage_with_1st_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
			+ " mens_height_heaping_first_digit.number_of_men as numberOfMen, \r\n"
			+ " mens_height_heaping_first_digit.date_attribute as date \r\n"
			+ " from public.mens_height_heaping_first_digit LEFT JOIN public.states_master \r\n"
			+ " ON mens_height_heaping_first_digit.state_id = states_master.state_id;",nativeQuery = true)
	public List<MensHeightHeapingFirstDecimalDTO> findAllMensHeightHeapingFirstDecimal();
	
	
	// @Query(value = "select	\r\n"
	// 		+ " states_master.state as state,\r\n"
	// 		+ " womens_weight_heaping_first_digit.c_0 as c_0 ,\r\n"
	// 		+ " womens_weight_heaping_first_digit.c_1 as c_1 ,\r\n"
	// 		+ " womens_weight_heaping_first_digit.c_2 as c_2 ,\r\n"
	// 		+ " womens_weight_heaping_first_digit.c_3 as c_3 ,\r\n"
	// 		+ " womens_weight_heaping_first_digit.c_4 as c_4,\r\n"
	// 		+ " womens_weight_heaping_first_digit.c_5 as c_5, \r\n"
	// 		+ " womens_weight_heaping_first_digit.c_6 as c_6,\r\n"
	// 		+ " womens_weight_heaping_first_digit.c_7 as c_7,\r\n"
	// 		+ " womens_weight_heaping_first_digit.c_8 as c_8, \r\n"
	// 		+ " womens_weight_heaping_first_digit.c_9 as c_9, \r\n"
	// 		+ " womens_weight_heaping_first_digit.total_in_percentage as totalInPercent, \r\n"
	// 		+ " womens_weight_heaping_first_digit.percentage_with_1st_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
	// 		+ " womens_weight_heaping_first_digit.number_of_women as numberOfWomen, \r\n"
	// 		+ " womens_weight_heaping_first_digit.date_attribute as date \r\n"
	// 		+ " from public.womens_weight_heaping_first_digit LEFT JOIN public.states_master \r\n"
	// 		+ " ON womens_weight_heaping_first_digit.state_id = states_master.state_id;",nativeQuery = true)
	// public List<WomensWeightHeapingFirstDecimalDTO> findAllWomensWeightHeapingFirstDecimal();
	
	// @Query(value = "select	\r\n"
	// 		+ " states_master.state as state,\r\n"
	// 		+ " womens_weight_heaping_second_digit.c_0 as c_0 ,\r\n"
	// 		+ " womens_weight_heaping_second_digit.c_1 as c_1 ,\r\n"
	// 		+ " womens_weight_heaping_second_digit.c_2 as c_2 ,\r\n"
	// 		+ " womens_weight_heaping_second_digit.c_3 as c_3 ,\r\n"
	// 		+ " womens_weight_heaping_second_digit.c_4 as c_4,\r\n"
	// 		+ " womens_weight_heaping_second_digit.c_5 as c_5, \r\n"
	// 		+ " womens_weight_heaping_second_digit.c_6 as c_6,\r\n"
	// 		+ " womens_weight_heaping_second_digit.c_7 as c_7,\r\n"
	// 		+ " womens_weight_heaping_second_digit.c_8 as c_8, \r\n"
	// 		+ " womens_weight_heaping_second_digit.c_9 as c_9, \r\n"
    //         + " womens_weight_heaping_second_digit.total_in_percentage as totalInPercent, \r\n"
	// 		+ " womens_weight_heaping_second_digit.percentage_with_2nd_decimal_0_or_5 as percentWithSecondDecimal_0_or_5, \r\n"
	// 		+ " womens_weight_heaping_second_digit.number_of_women as numberOfWomen, \r\n"
	// 		+ " womens_weight_heaping_second_digit.date_attribute as date \r\n"
	// 		+ " from public.womens_weight_heaping_second_digit LEFT JOIN public.states_master \r\n"
	// 		+ " ON womens_weight_heaping_second_digit.state_id = states_master.state_id;",nativeQuery = true)
	// public List<WomensWeightHeapingSecondDecimalDTO> findAllWomensWeightHeapingSecondDecimal();
	
	
	// @Query(value = "select	\r\n"
	// 		+ " states_master.state as state,\r\n"
	// 		+ " womens_height_heaping_first_digit.c_0 as c_0 ,\r\n"
	// 		+ " womens_height_heaping_first_digit.c_1 as c_1 ,\r\n"
	// 		+ " womens_height_heaping_first_digit.c_2 as c_2 ,\r\n"
	// 		+ " womens_height_heaping_first_digit.c_3 as c_3 ,\r\n"
	// 		+ " womens_height_heaping_first_digit.c_4 as c_4,\r\n"
	// 		+ " womens_height_heaping_first_digit.c_5 as c_5, \r\n"
	// 		+ " womens_height_heaping_first_digit.c_6 as c_6,\r\n"
	// 		+ " womens_height_heaping_first_digit.c_7 as c_7,\r\n"
	// 		+ " womens_height_heaping_first_digit.c_8 as c_8, \r\n"
	// 		+ " womens_height_heaping_first_digit.c_9 as c_9, \r\n"
    //         + " womens_height_heaping_first_digit.total_in_percentage as totalInPercent, \r\n"
	// 		+ " womens_height_heaping_first_digit.percentage_with_1st_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
	// 		+ " womens_height_heaping_first_digit.number_of_women as numberOfWomen, \r\n"
	// 		+ " womens_height_heaping_first_digit.date_attribute as date \r\n"
	// 		+ " from public.womens_height_heaping_first_digit LEFT JOIN public.states_master \r\n"
	// 		+ " ON womens_height_heaping_first_digit.state_id = states_master.state_id;",nativeQuery = true)
	// public List<WomensHeightHeapingFirstDecimalDTO> findAllWomensHeightHeapingFirstDecimal();


	// @Query(value = "select	\r\n"
	// 		+ " states_master.state as state,\r\n"
	// 		+ " age_at_death_heaping.eight_m as eightM ,\r\n"
	// 		+ " age_at_death_heaping.nine_m as nineM ,\r\n"
	// 		+ " age_at_death_heaping.ten_m as tenM ,\r\n"
	// 		+ " age_at_death_heaping.eleven_m as elevenM ,\r\n"
	// 		+ " age_at_death_heaping.twelve_m as twelveM,\r\n"
	// 		+ " age_at_death_heaping.reported_as_1_year as reportedAs1Year, \r\n"
	// 		+ " age_at_death_heaping.thirteen_m as thirteenM,\r\n"
	// 		+ " age_at_death_heaping.fourteen_m as fourteenM,\r\n"
	// 		+ " age_at_death_heaping.fifteen_m as fifteenM, \r\n"
	// 		+ " age_at_death_heaping.sixteen_m as sixteenM, \r\n"
    //         + " age_at_death_heaping.total_8_16_m as total8_16M, \r\n"
	// 		+ " age_at_death_heaping.twelve_months_ratio as twelveMonthsRatio, \r\n"
	// 		+ " age_at_death_heaping.date_attribute as date \r\n"
	// 		+ " from public.age_at_death_heaping LEFT JOIN public.states_master \r\n"
	// 		+ " ON age_at_death_heaping.state_id = states_master.state_id;",nativeQuery = true)
	// public List<AgeAtDeathHeapingDTO> findAllAgeAtDeathHeaping();

}
