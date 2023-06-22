package com.nciipc.household.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nciipc.household.model.EligibleMenPerHh;

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

@Repository
public interface TeamwiseReportsRepo extends JpaRepository<EligibleMenPerHh, Integer> {
	
@Query(value = "select \r\n"
			+ "team_master.team as team,\r\n"
			+ "eligible_men_per_hh_teamwise.no_of_completed_hh_urban as noOfCompletedHhUrban,\r\n"
			+ "eligible_men_per_hh_teamwise.no_of_de_facto_eligible_men_in_completed_hh_urban as noOfDeFactoEligibleMenInCompletedHhUrban,\r\n"
			+ "eligible_men_per_hh_teamwise.mean_no_of_de_facto_eligible_men_per_hh_urban as meanNoOfDeFactoEligibleMenPerHhUrban,\r\n"
			+ "eligible_men_per_hh_teamwise.no_of_completed_hh_rural as noOfCompletedHhRural,\r\n"
			+ "eligible_men_per_hh_teamwise.no_of_de_facto_eligible_men_in_completed_hh_rural as noOfDeFactoEligibleMenInCompletedHhRural,\r\n"
			+ "eligible_men_per_hh_teamwise.mean_no_of_de_facto_eligible_men_per_hh_rural as meanNoOfDeFactoEligibleMenPerHhRural,\r\n"
			+ " eligible_men_per_hh_teamwise.date_attribute as date \r\n"
			+ "from public.eligible_men_per_hh_teamwise  \r\n"
			+ "LEFT JOIN public.team_master\r\n"
			+ "ON eligible_men_per_hh_teamwise.team_no = team_master.team_id where eligible_men_per_hh_teamwise.state_id=:stateId \r\n"
			+ "order by team_master.team_id\r\n", nativeQuery = true)	
	public List<EligibleMenPerHhTeamwiseDTO> findAllEligibleMenPerHhTeamwise(Integer stateId);

	@Query(value = "select \r\n"
			+ "team_master.team as team,\r\n"
			+ "eligible_women_per_hh_teamwise.no_of_completed_hh_urban as noOfCompletedHhUrban,\r\n"
			+ "eligible_women_per_hh_teamwise.no_of_de_facto_eligible_women_in_completed_hh_urban as noOfDeFactoEligibleWomenInCompletedHhUrban,\r\n"
			+ "eligible_women_per_hh_teamwise.mean_no_of_de_facto_eligible_women_per_hh_urban as meanNoOfDeFactoEligibleWomenPerHhUrban,\r\n"
			+ "eligible_women_per_hh_teamwise.no_of_completed_hh_rural as noOfCompletedHhRural,\r\n"
			+ "eligible_women_per_hh_teamwise.no_of_de_facto_eligible_women_in_completed_hh_rural as noOfDeFactoEligibleWomenInCompletedHhRural,\r\n"
			+ "eligible_women_per_hh_teamwise.mean_no_of_de_facto_eligible_women_per_hh_rural as meanNoOfDeFactoEligibleWomenPerHhRural,\r\n"
			+ " eligible_women_per_hh_teamwise.date_attribute as date \r\n"
			+ "from public.eligible_women_per_hh_teamwise  \r\n"
			+ "LEFT JOIN public.team_master\r\n"
			+ "ON eligible_women_per_hh_teamwise.team_no = team_master.team_id where eligible_women_per_hh_teamwise.state_id=:stateId \r\n"
			+ "order by team_master.team_id",nativeQuery = true)
	public List<EligibleWomenPerHhTeamwiseDTO> findAllEligibleWomenPerHhTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team as team,\r\n"
			+ " hh_visit_teamwise.visit_1 as visit_1,\r\n"
			+ " hh_visit_teamwise.visit_2 as visit_2,\r\n"
			+ " hh_visit_teamwise.visit_3 as visit_3,\r\n"
			+ " hh_visit_teamwise.per_Sum as perSum,\r\n"
			+ " hh_visit_teamwise.num as num, "
			+ " hh_visit_teamwise.date_attribute as date \r\n"
			+ "from public.hh_visit_teamwise\r\n"
			+ " LEFT JOIN public.team_master\r\n"
			+ " ON hh_visit_teamwise.team_no = team_master.team_id where hh_visit_teamwise.state_id=:stateId \r\n"
			+ " order by team_master.team_id",nativeQuery = true)
	public List<HhVisitTeamwiseDTO> findAllVisitHhTeamwise(Integer stateId);
	
		@Query(value = "Select \r\n"
			+ " team_master.team as team, \r\n"
			+ " hh_completion_rate_teamwise.completed as completed,	\r\n"
			+ " hh_completion_rate_teamwise.no_hh_member_at_home_or_no_respondent_at_home as noHhMemberAtHomeOrNoRespondentAtHome,	\r\n"
			+ " hh_completion_rate_teamwise.entire_hh_absent_at_time_of_visit as entireHhAbsentAtTimeOfVisit,	\r\n"
			+ " hh_completion_rate_teamwise.postponed as postponed,	\r\n"
			+ " hh_completion_rate_teamwise.refused as refused,	\r\n"
			+ " hh_completion_rate_teamwise.dwelling_vacant_or_address_not_a_dwelling as dwellingVacantOrAddressNotADwelling,	\r\n"
			+ " hh_completion_rate_teamwise.dwelling_destroyed as dwellingDestroyed,	\r\n"
			+ " hh_completion_rate_teamwise.dwelling_not_found as dwellingNotFound,	\r\n"
			+ " hh_completion_rate_teamwise.other as other,	\r\n"
			+ " hh_completion_rate_teamwise.percent_val as percentVal,	\r\n"
			+ " hh_completion_rate_teamwise.number_val as numberVal, "
			+ " hh_completion_rate_teamwise.date_attribute as date \r\n"
			+ "from public.hh_completion_rate_teamwise \r\n"
			+ " LEFT JOIN public.team_master ON hh_completion_rate_teamwise.team_no = team_master.team_id where hh_completion_rate_teamwise.state_id=:stateId \r\n"
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<HhCompletionRateTeamwiseDTO> findAllHhCompletionRateTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team as team,\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_12 as age_12,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_13 as age_13,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_14 as age_14,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_15 as age_15,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_16 as age_16,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_17 as age_17,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_18 as age_18,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.number_of_men as numberOfMen,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_ratio as ageRatio, "
			+ " age_displacement_men_lower_limit_teamwise.date_attribute as date \r\n"
			+ "from public.age_displacement_men_lower_limit_teamwise"
			+ " LEFT JOIN public.team_master ON age_displacement_men_lower_limit_teamwise.team_no = team_master.team_id where age_displacement_men_lower_limit_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<AgeDisplacementMenLowerLimitTeamwiseDTO> findAllAgeDisplacementMenLowerLimitTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team as team,\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_52 as age_52,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_53 as age_53,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_54 as age_54,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_55 as age_55,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_56 as age_56,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_57 as age_57,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_58 as age_58,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.number_of_men as numberOfMen,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_ratio as ageRatio, "
			+ " age_displacement_men_upper_limit_teamwise.date_attribute as date \r\n"
			+ "from public.age_displacement_men_upper_limit_teamwise"
			+ " LEFT JOIN public.team_master ON age_displacement_men_upper_limit_teamwise.team_no = team_master.team_id where age_displacement_men_upper_limit_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<AgeDisplacementMenUpperLimitTeamwiseDTO> findAllAgeDisplacementMenUpperLimitTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team as team,\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_12 as age_12,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_13 as age_13,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_14 as age_14,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_15 as age_15,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_16 as age_16,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_17 as age_17,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_18 as age_18,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.number_of_women as numberOfWomen,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_ratio as ageRatio, "
			+ " age_displacement_women_lower_limit_teamwise.date_attribute as date \r\n"
			+ "from public.age_displacement_women_lower_limit_teamwise "
			+ " LEFT JOIN public.team_master ON age_displacement_women_lower_limit_teamwise.team_no = team_master.team_id where age_displacement_women_lower_limit_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<AgeDisplacementWomenLowerLimitTeamwiseDTO> findAllAgeDisplacementWomenLowerLimitTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team as team,\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_47 as age_47,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_48 as age_48,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_49 as age_49,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_50 as age_50,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_51 as age_51,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_52 as age_52,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_53 as age_53,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.number_of_women as numberOfWomen,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_ratio as ageRatio, "
			+ " age_displacement_women_upper_limit_teamwise.date_attribute as date \r\n"
			+ "from public.age_displacement_women_upper_limit_teamwise "
			+ " LEFT JOIN public.team_master ON age_displacement_women_upper_limit_teamwise.team_no = team_master.team_id where age_displacement_women_upper_limit_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<AgeDisplacementWomenUpperLimitTeamwiseDTO> findAllAgeDisplacementWomenUpperLimitTeamwise(Integer stateId);
	
	@Query(value = "select	\r\n"
			+ " team_master.team as team,\r\n"
			+ "	eligible_women_response_rate_teamwise.completed as completed ,\r\n"
			+ " eligible_women_response_rate_teamwise.not_at_home as notAtHome ,\r\n"
			+ " eligible_women_response_rate_teamwise.postponed as postponed ,\r\n"
			+ " eligible_women_response_rate_teamwise.refused as refused ,\r\n"
			+ " eligible_women_response_rate_teamwise.partly_completed as partlyCompleted ,\r\n"
			+ " eligible_women_response_rate_teamwise.other as other ,\r\n"
			+ " eligible_women_response_rate_teamwise.percent_val as percentVal ,\r\n"
			+ " eligible_women_response_rate_teamwise.number_val as numberVal ,\r\n"
//			+ " eligible_women_response_rate_teamwise.date_attribute as dateAttribute ,\r\n"
			+ " eligible_women_response_rate_teamwise.incapacited as incapacited, "
			+ " eligible_women_response_rate_teamwise.date_attribute as date \r\n"
			+ "from public.eligible_women_response_rate_teamwise"
			+ " LEFT JOIN public.team_master ON eligible_women_response_rate_teamwise.team_no = team_master.team_id where eligible_women_response_rate_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<EligibleWomenResponseRateTeamwiseDTO> findAllEligibleWomenResponseRateTeamwise(Integer stateId);
	
	@Query(value = "select	\r\n"
			+ " team_master.team as team,\r\n"
			+ "	eligible_men_response_rate_teamwise.completed as completed ,\r\n"
			+ " eligible_men_response_rate_teamwise.not_at_home as notAtHome ,\r\n"
			+ " eligible_men_response_rate_teamwise.postponed as postponed ,\r\n"
			+ " eligible_men_response_rate_teamwise.refused as refused ,\r\n"
			+ " eligible_men_response_rate_teamwise.partly_completed as partlyCompleted ,\r\n"
			+ " eligible_men_response_rate_teamwise.other as other ,\r\n"
			+ " eligible_men_response_rate_teamwise.percent_val as percentVal ,\r\n"
			+ " eligible_men_response_rate_teamwise.number_val as numberVal ,\r\n"
//			+ " eligible_men_response_rate_teamwise.date_attribute as dateAttribute ,\r\n"
			+ " eligible_men_response_rate_teamwise.incapacited as incapacited, "
			+ " eligible_men_response_rate_teamwise.date_attribute as date \r\n"
			+ "from public.eligible_men_response_rate_teamwise "
			+ " LEFT JOIN public.team_master ON eligible_men_response_rate_teamwise.team_no = team_master.team_id where eligible_men_response_rate_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<EligibleMenResponseRateTeamwiseDTO> findAllEligibleMenResponseRateTeamwise(Integer stateId);
	
	@Query(value = "select	\r\n"
			+ " team_master.team as team,\r\n"
			+ "	women_15_49_visits_teamwise.visit_1 as visit_1 ,\r\n"
			+ " women_15_49_visits_teamwise.visit_2 as visit_2 ,\r\n"
			+ " women_15_49_visits_teamwise.visit_3 as visit_3 ,\r\n"
			+ " women_15_49_visits_teamwise.per_sum as perSum ,\r\n"
			+ " women_15_49_visits_teamwise.num as num, \r\n"
			+ " women_15_49_visits_teamwise.date_attribute as date \r\n"
			+ " from public.women_15_49_visits_teamwise"
			+ " LEFT JOIN public.team_master ON women_15_49_visits_teamwise.team_no = team_master.team_id where women_15_49_visits_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<WomenVisit1549VisitsTeamwiseDTO> findAllWomenVisit1549VisitsTeamwise(Integer stateId);
	
	@Query(value = "select	\r\n"
			+ " team_master.team as team,\r\n"
			+ "	men_15_54_visits_teamwise.visit_1 as visit_1 ,\r\n"
			+ " men_15_54_visits_teamwise.visit_2 as visit_2 ,\r\n"
			+ " men_15_54_visits_teamwise.visit_3 as visit_3 ,\r\n"
			+ " men_15_54_visits_teamwise.per_sum as perSum ,\r\n"
			+ " men_15_54_visits_teamwise.num as num, \r\n"
			+ " men_15_54_visits_teamwise.date_attribute as date \r\n"
			+ " from public.men_15_54_visits_teamwise "
			+ " LEFT JOIN public.team_master ON men_15_54_visits_teamwise.team_no = team_master.team_id where men_15_54_visits_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<MenVisit1554VisitsTeamwiseDTO> findAllMenVisit1554VisitsTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team as team,\r\n"
			+ "	household_relations_modules_teamwise.tt_no_of_women_eligible_for_domestic_violence as ttNoOfWomenEligibleForDomesticViolence,	\r\n"
			+ "	household_relations_modules_teamwise.eligible_women_not_interviewed_because_of_privacy_not_obtained as eligibleWomenNotInterviewedBecauseOfPrivacyNotObtained, "
			+ " household_relations_modules_teamwise.date_attribute as date \r\n"
			+ " from public.household_relations_modules_teamwise "
			+ " LEFT JOIN public.team_master ON household_relations_modules_teamwise.team_no = team_master.team_id where household_relations_modules_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<HouseholdRelationsModulesTeamwiseDTO> findAllHouseholdRelationsModulesTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team as team,\r\n"
			+ "	contraceptive_prevalence_rate_teamwise.any_method as anyMethod,	\r\n"
			+ "	contraceptive_prevalence_rate_teamwise.number_val as numberVal, "
			+ " contraceptive_prevalence_rate_teamwise.date_attribute as date \r\n"
			+ " from public.contraceptive_prevalence_rate_teamwise "
			+ " LEFT JOIN public.team_master ON contraceptive_prevalence_rate_teamwise.team_no = team_master.team_id where contraceptive_prevalence_rate_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<ContraceptivePrevalenceRateTeamwiseDTO> findAllContraceptivePrevalenceRateTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team as team,\r\n"
			+ "	vaccination_health_cards_teamwise.per_of_children_reported_to_have_vaccination_card as perOfChildrenReportedToHaveVaccinationCard,	\r\n"
			+ "	vaccination_health_cards_teamwise.per_of_children_whose_vaccine_card_was_seen as perOfChildrenWhoseVaccineCardWasSeen,	\r\n"
			+ "	vaccination_health_cards_teamwise.number_of_children as numberOfChildren,	\r\n"
			+ "	vaccination_health_cards_teamwise.proportion_of_cards_seen as proportionOfCardsSeen,	\r\n"
			+ " vaccination_health_cards_teamwise.date_attribute as date \r\n"
			+ " from public.vaccination_health_cards_teamwise "
			+ " LEFT JOIN public.team_master ON vaccination_health_cards_teamwise.team_no = team_master.team_id where vaccination_health_cards_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<VaccinationHealthCardsTeamwiseDTO> findVaccinationHealthCardsTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team as team,\r\n"
			+ "	birth_displacement_teamwise.year_2014 as year_2014,	\r\n"
			+ "	birth_displacement_teamwise.year_2015 as year_2015,	\r\n"
			+ "	birth_displacement_teamwise.year_2016 as year_2016,	\r\n"
			+ "	birth_displacement_teamwise.year_2017 as year_2017,	\r\n"
			+ "	birth_displacement_teamwise.year_2018 as year_2018,	\r\n"
			+ "	birth_displacement_teamwise.year_2019 as year_2019,	\r\n"
			+ "	birth_displacement_teamwise.year_2020 as year_2020,	\r\n"
			+ "	birth_displacement_teamwise.year_2021 as year_2021,	\r\n"
			+ "	birth_displacement_teamwise.year_2022 as year_2022,	\r\n"
			+ "	birth_displacement_teamwise.year_2023 as year_2023,	\r\n"
			+ "	birth_displacement_teamwise.missing as missing,	\r\n"
			+ "	birth_displacement_teamwise.number_of_births as numberOfBirths,	\r\n"
			+ "	birth_displacement_teamwise.birth_year_ratio_2018_2017 as birthYearRatio_2018_2017, "
			+ " birth_displacement_teamwise.date_attribute as date \r\n"
			+ " from public.birth_displacement_teamwise "
			+ " LEFT JOIN public.team_master ON birth_displacement_teamwise.team_no = team_master.team_id where birth_displacement_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<BirthDisplacementTeamwiseDTO> findAllBirthDisplacementTeamwise(Integer stateId);
	
	
	@Query(value = "Select \r\n"
			+ " team_master.team as team,\r\n"
			+ "	sex_ratio_of_children_teamwise.num_of_girls as numOfGirls,	\r\n"
			+ "	sex_ratio_of_children_teamwise.num_of_boys as numOfBoys,	\r\n"
			+ "	sex_ratio_of_children_teamwise.sex_ratio as sexRatio,	\r\n"
			+ " sex_ratio_of_children_teamwise.date_attribute as date \r\n"
			+ " from public.sex_ratio_of_children_teamwise "
			+ " LEFT JOIN public.team_master ON sex_ratio_of_children_teamwise.team_no = team_master.team_id where sex_ratio_of_children_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<SexRatioOfChildrenTeamwiseDTO> findAllSexRatioOfChildrenTeamwise(Integer stateId);
	
//	@Query(value = "select	\r\n"
//			+ " team_master.team as team,\r\n"
//			+ " womens_height_teamwise.mesured as mesured ,\r\n"
//			+ " womens_height_teamwise.women_not_present as womenNotPresent ,\r\n"
//			+ " womens_height_teamwise.women_refused as womenRefused ,\r\n"
//			+ " womens_height_teamwise.other as other ,\r\n"
//			+ " womens_height_teamwise.missing as missing,\r\n"
//			+ " womens_height_teamwise.total as total, \r\n"
//			+ " womens_height_teamwise.number_of_women as numberOfWomen,\r\n"
//			+ " womens_height_teamwise.women_ht_out_of_range as womenHtOutOfRange,\r\n"
//			+ " womens_height_teamwise.women_with_valid_ht_data as womenWithValidHtData \r\n"
//			+ " from public.womens_height_teamwise LEFT JOIN public.team_master \r\n"
//			+ " ON womens_height_teamwise.team_no = team_master.team_id where womens_height_teamwise.state_id=:stateId order by team_master.team_id;",nativeQuery = true)

	
	
	
	
	@Query(value = "Select \r\n"
			+ " team_master.team as team,\r\n"
			+ " womens_height_teamwise.mesured as mesured ,\r\n"
			+ " womens_height_teamwise.women_not_present as womenNotPresent ,\r\n"
			+ " womens_height_teamwise.women_refused as womenRefused ,\r\n"
			+ " womens_height_teamwise.other as other ,\r\n"
			+ " womens_height_teamwise.missing as missing,\r\n"
			+ " womens_height_teamwise.total as total, \r\n"
			+ " womens_height_teamwise.number_of_women as numberOfWomen,\r\n"
			+ " womens_height_teamwise.women_ht_out_of_range as womenHtOutOfRange,\r\n"
			+ " womens_height_teamwise.women_with_valid_ht_data as womenWithValidHtData, \r\n"
			+ " womens_height_teamwise.date_attribute as date \r\n"
			+ " from public.womens_height_teamwise "
			+ " LEFT JOIN public.team_master ON womens_height_teamwise.team_no = team_master.team_id where womens_height_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<WomensHeightTeamwiseDTO> findAllWomensHeightTeamwise(Integer stateId);
			
			
			
			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " womens_weight_teamwise.mesured as mesured ,\r\n"
					+ " womens_weight_teamwise.women_not_present as womenNotPresent ,\r\n"
					+ " womens_weight_teamwise.women_refused as womenRefused ,\r\n"
					+ " womens_weight_teamwise.other as other ,\r\n"
					+ " womens_weight_teamwise.missing as missing,\r\n"
					+ " womens_weight_teamwise.total as total, \r\n"
					+ " womens_weight_teamwise.number_of_women as numberOfWomen,\r\n"
					+ " womens_weight_teamwise.women_wt_out_of_range as womenWtOutOfRange,\r\n"
					+ " womens_weight_teamwise.women_with_valid_wt_data as womenWithValidWtData, \r\n"
					+ " womens_weight_teamwise.date_attribute as date \r\n"
					+ " from public.womens_weight_teamwise "
					+ " LEFT JOIN public.team_master ON womens_weight_teamwise.team_no = team_master.team_id where womens_weight_teamwise.state_id=:stateId "
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<WomensWeightTeamwiseDTO> findAllWomensWeightTeamwise(Integer stateId);
			
			
			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " birth_weight_healthcard_teamwise.card as card ,\r\n"
					+ " birth_weight_healthcard_teamwise.recall as recall ,\r\n"
					+ " birth_weight_healthcard_teamwise.count as count, \r\n"
					+ " birth_weight_healthcard_teamwise.date_attribute as date \r\n"
					+ " from public.birth_weight_healthcard_teamwise "
					+ " LEFT JOIN public.team_master ON birth_weight_healthcard_teamwise.team_no = team_master.team_id where birth_weight_healthcard_teamwise.state_id=:stateId "
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<BirthWeightHealthcardTeamwiseDTO> findAllBirthWeightHealthcardTeamwise(Integer stateId);
			
			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " interview_start_time_teamwise.slot_6am_7_59am as slot_6am_7_59am ,\r\n"
					+ " interview_start_time_teamwise.slot_8am_8pm as slot_8am_8pm ,\r\n"
					+ " interview_start_time_teamwise.slot_8_01pm_5_59am as slot_8_01pm_5_59am ,\r\n"
					+ " interview_start_time_teamwise.all_elibible_women as allEligibleWomen, \r\n"
					+ " interview_start_time_teamwise.date_attribute as date \r\n"
					+ " from public.interview_start_time_teamwise "
					+ " LEFT JOIN public.team_master ON interview_start_time_teamwise.team_no = team_master.team_id where interview_start_time_teamwise.state_id=:stateId "
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<InterviewStartTimeTeamwiseDTO> findAllInterviewStartTimeTeamwise(Integer stateId);
			
			
			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " mens_height_teamwise.measured as measured ,\r\n"
					+ " mens_height_teamwise.man_not_present as menNotPresent ,\r\n"
					+ " mens_height_teamwise.man_refused as menRefused ,\r\n"
					+ " mens_height_teamwise.other as other ,\r\n"
					+ " mens_height_teamwise.missing as missing,\r\n"
					+ " mens_height_teamwise.total_in_percentage as total, \r\n"
					+ " mens_height_teamwise.number_of_men as numberOfMen,\r\n"
					+ " mens_height_teamwise.among_men_measured_height_out_of_range as menHtOutOfRange,\r\n"
					+ " mens_height_teamwise.men_with_valid_height_data as menWithValidHtData, \r\n"
					+ " mens_height_teamwise.date_attribute as date \r\n"
					+ " from public.mens_height_teamwise "
					+ " LEFT JOIN public.team_master ON mens_height_teamwise.team_no = team_master.team_id where mens_height_teamwise.state_id=:stateId "
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<MensHeightTeamwiseDTO> findAllMensHeightTeamwise(Integer stateId);
			
			
			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " no_food_consumption_of_child_from public._6_23_months_teamwise.not_eaten_percentage as notEatenPercentage ,\r\n"
					+ " no_food_consumption_of_child_from public._6_23_months_teamwise.number_of_children as numberOfChildren, \r\n"
					+ " no_food_consumption_of_child_from public._6_23_months_teamwise.date_attribute as date \r\n"
					+ " from public.no_food_consumption_of_child_from public._6_23_months_teamwise "
					+ " LEFT JOIN public.team_master ON no_food_consumption_of_child_from public._6_23_months_teamwise.team_no = team_master.team_id where no_food_consumption_of_child_from public._6_23_months_teamwise.state_id=:stateId "
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<NoFoodConsumptionOfChildFrom6To23MonthsTeamwiseDTO> findAllNoFoodConsumptionOfChildFrom6To23MonthsTeamwise(Integer stateId);
			
//sampada's repo
			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " childrens_height_teamwise.mesured as mesured ,\r\n"
					+ " childrens_height_teamwise.child_not_present as childNotPresent ,\r\n"
					+ " childrens_height_teamwise.refused as refused ,\r\n"
					+ " childrens_height_teamwise.other as other ,\r\n"
					+ " childrens_height_teamwise.missing as missing,\r\n"
					+ " childrens_height_teamwise.total as total, \r\n"
					+ " childrens_height_teamwise.number_of_children as numberOfChildren,\r\n"
					+ " childrens_height_teamwise.height_out_of_range as heightOutOfRange,\r\n"
					+ " childrens_height_teamwise.date_of_birth_incomplete as dateOfBirthIncomplete, \r\n"
					+ " childrens_height_teamwise.children_with_valid_data as childrenWithValidData, \r\n"
					+ " childrens_height_teamwise.height_for_age_z_score_out_of_range as heightForAgeZScoreOutOfRange, \r\n"
					+ " childrens_height_teamwise.date_attribute as date \r\n"
					+ " from public.childrens_height_teamwise "
					+ " LEFT JOIN public.team_master ON childrens_height_teamwise.team_no = team_master.team_id where childrens_height_teamwise.state_id=:stateId "
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<ChildrensHeightTeamwiseDTO> findAllChildrensHeightTeamwise(Integer stateId);
			
			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " childrens_weight_teamwise.mesured as mesured ,\r\n"
					+ " childrens_weight_teamwise.child_not_present as childNotPresent ,\r\n"
					+ " childrens_weight_teamwise.refused as refused ,\r\n"
					+ " childrens_weight_teamwise.other as other ,\r\n"
					+ " childrens_weight_teamwise.missing as missing,\r\n"
					+ " childrens_weight_teamwise.total as total, \r\n"
					+ " childrens_weight_teamwise.number_of_children as numberOfChildren,\r\n"
					+ " childrens_weight_teamwise.weight_out_of_range as weightOutOfRange,\r\n"
					+ " childrens_weight_teamwise.date_of_birth_incomplete as dateOfBirthIncomplete, \r\n"
					+ " childrens_weight_teamwise.children_with_valid_data as childrenWithValidData, \r\n"
					+ " childrens_weight_teamwise.weight_for_height_z_score_out_of_range as weightForHeightZScoreOutOfRange, \r\n"
					+ " childrens_weight_teamwise.date_attribute as date \r\n"
					+ " from public.childrens_weight_teamwise "
					+ " LEFT JOIN public.team_master ON childrens_weight_teamwise.team_no = team_master.team_id where childrens_weight_teamwise.state_id=:stateId "
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<ChildrensWeightTeamwiseDTO> findAllChildrensWeightTeamwise(Integer stateId);
			
			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.c_0 as c_0 ,\r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.c_1 as c_1 ,\r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.c_2 as c_2 ,\r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.c_3 as c_3 ,\r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.c_4 as c_4,\r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.c_5 as c_5, \r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.c_6 as c_6,\r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.c_7 as c_7,\r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.c_8 as c_8, \r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.c_9 as c_9, \r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.total_percent as totalPercent, \r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.percent_with_first_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.number_of_children_with_valid_weight_data as numberOfChildrenWithValidWeightData, \r\n"
					+ " childrens_weight_heaping_first_decimal_teamwise.date_attribute as date \r\n"
					+ " from public.childrens_weight_heaping_first_decimal_teamwise \r\n"
					+ " LEFT JOIN public.team_master ON childrens_weight_heaping_first_decimal_teamwise.team_no = team_master.team_id where childrens_weight_heaping_first_decimal_teamwise.state_id=:stateId \r\n"
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<ChildrensWeightHeapingFirstDecimalTeamwiseDTO> findAllChildrensWeightHeapingFirstDecimalTeamwise(Integer stateId);

			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.c_0 as c_0 ,\r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.c_1 as c_1 ,\r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.c_2 as c_2 ,\r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.c_3 as c_3 ,\r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.c_4 as c_4,\r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.c_5 as c_5, \r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.c_6 as c_6,\r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.c_7 as c_7,\r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.c_8 as c_8, \r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.c_9 as c_9, \r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.total_percent as totalPercent, \r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.percent_with_second_decimal_0_or_5 as percentWithsecondDecimal_0_or_5, \r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.number_of_children_with_valid_weight_data as numberOfChildrenWithValidWeightData, \r\n"
					+ " childrens_weight_heaping_second_decimal_teamwise.date_attribute as date \r\n"
					+ " from public.childrens_weight_heaping_second_decimal_teamwise \r\n"
					+ " LEFT JOIN public.team_master ON childrens_weight_heaping_second_decimal_teamwise.team_no = team_master.team_id where childrens_weight_heaping_second_decimal_teamwise.state_id=:stateId \r\n"
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<ChildrensWeightHeapingSecondDecimalTeamwiseDTO2> findAllChildrensWeightHeapingSecondDecimalTeamwise(Integer stateId);

			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " mens_weight_heaping_first_digit_teamwise.\"0\" as c_0 ,\r\n"
					+ " mens_weight_heaping_first_digit_teamwise.\"1\" as c_1 ,\r\n"
					+ " mens_weight_heaping_first_digit_teamwise.\"2\" as c_2 ,\r\n"
					+ " mens_weight_heaping_first_digit_teamwise.\"3\" as c_3 ,\r\n"
					+ " mens_weight_heaping_first_digit_teamwise.\"4\" as c_4,\r\n"
					+ " mens_weight_heaping_first_digit_teamwise.\"5\" as c_5, \r\n"
					+ " mens_weight_heaping_first_digit_teamwise.\"6\" as c_6,\r\n"
					+ " mens_weight_heaping_first_digit_teamwise.\"7\" as c_7,\r\n"
					+ " mens_weight_heaping_first_digit_teamwise.\"8\" as c_8, \r\n"
					+ " mens_weight_heaping_first_digit_teamwise.\"9\" as c_9, \r\n"
					+ " mens_weight_heaping_first_digit_teamwise.total_in_percentage as totalInPercent, \r\n"
					+ " mens_weight_heaping_first_digit_teamwise.percentage_with_1st_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
					+ " mens_weight_heaping_first_digit_teamwise.number_of_men as numberOfMen, \r\n"
					+ " mens_weight_heaping_first_digit_teamwise.date_attribute as date \r\n"
					+ " from public.mens_weight_heaping_first_digit_teamwise \r\n"
					+ " LEFT JOIN public.team_master ON mens_weight_heaping_first_digit_teamwise.team_no = team_master.team_id where mens_weight_heaping_first_digit_teamwise.state_id=:stateId \r\n"
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<MensWeightHeapingFirstDecimalTeamwiseDTO> findAllMensWeightHeapingFirstDecimalTeamwise(Integer stateId);

			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " mens_weight_heaping_second_digit_teamwise.\"0\" as c_0 ,\r\n"
					+ " mens_weight_heaping_second_digit_teamwise.\"1\" as c_1 ,\r\n"
					+ " mens_weight_heaping_second_digit_teamwise.\"2\" as c_2 ,\r\n"
					+ " mens_weight_heaping_second_digit_teamwise.\"3\" as c_3 ,\r\n"
					+ " mens_weight_heaping_second_digit_teamwise.\"4\" as c_4,\r\n"
					+ " mens_weight_heaping_second_digit_teamwise.\"5\" as c_5, \r\n"
					+ " mens_weight_heaping_second_digit_teamwise.\"6\" as c_6,\r\n"
					+ " mens_weight_heaping_second_digit_teamwise.\"7\" as c_7,\r\n"
					+ " mens_weight_heaping_second_digit_teamwise.\"8\" as c_8, \r\n"
					+ " mens_weight_heaping_second_digit_teamwise.\"9\" as c_9, \r\n"
					+ " mens_weight_heaping_second_digit_teamwise.total_in_percentage as totalInPercent, \r\n"
					+ " mens_weight_heaping_second_digit_teamwise.percentage_with_1st_decimal_0_or_5 as percentWithSecondDecimal_0_or_5, \r\n"
					+ " mens_weight_heaping_second_digit_teamwise.number_of_men as numberOfMen, \r\n"
					+ " mens_weight_heaping_second_digit_teamwise.date_attribute as date \r\n"
					+ " from public.mens_weight_heaping_second_digit_teamwise \r\n"
					+ " LEFT JOIN public.team_master ON mens_weight_heaping_second_digit_teamwise.team_no = team_master.team_id where mens_weight_heaping_second_digit_teamwise.state_id=:stateId \r\n"
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<MensWeightHeapingSecondDecimalTeamwiseDTO> findAllMensWeightHeapingSecondDecimalTeamwise(Integer stateId);

			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " mens_weight_teamwise.measured as mesured ,\r\n"
					+ " mens_weight_teamwise.man_not_present as manNotPresent ,\r\n"
					+ " mens_weight_teamwise.man_refused as manrefused ,\r\n"
					+ " mens_weight_teamwise.other as other ,\r\n"
					+ " mens_weight_teamwise.missing as missing,\r\n"
					+ " mens_weight_teamwise.total_in_percentage as total, \r\n"
					+ " mens_weight_teamwise.number_of_men as numberOfMen,\r\n"
					+ " mens_weight_teamwise.among_men_measured_weight_out_of_range as amongMenMeasuredWeightOutOfRange,\r\n"
					+ " mens_weight_teamwise.men_with_valid_weight_data as menWithValidWeightData, \r\n"
					+ " mens_weight_teamwise.date_attribute as date \r\n"
					+ " from public.mens_weight_teamwise "
					+ " LEFT JOIN public.team_master ON mens_weight_teamwise.team_no = team_master.team_id where mens_weight_teamwise.state_id=:stateId "
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<MensWeightTeamwiseDTO> findAllMensWeightTeamwise(Integer stateId);
			
			@Query(value = "Select \r\n"
					+ " team_master.team as team,\r\n"
					+ " mens_height_heaping_first_digit_teamwise.\"0\" as c_0 ,\r\n"
					+ " mens_height_heaping_first_digit_teamwise.\"1\" as c_1 ,\r\n"
					+ " mens_height_heaping_first_digit_teamwise.\"2\" as c_2 ,\r\n"
					+ " mens_height_heaping_first_digit_teamwise.\"3\" as c_3 ,\r\n"
					+ " mens_height_heaping_first_digit_teamwise.\"4\" as c_4,\r\n"
					+ " mens_height_heaping_first_digit_teamwise.\"5\" as c_5, \r\n"
					+ " mens_height_heaping_first_digit_teamwise.\"6\" as c_6,\r\n"
					+ " mens_height_heaping_first_digit_teamwise.\"7\" as c_7,\r\n"
					+ " mens_height_heaping_first_digit_teamwise.\"8\" as c_8, \r\n"
					+ " mens_height_heaping_first_digit_teamwise.\"9\" as c_9, \r\n"
					+ " mens_height_heaping_first_digit_teamwise.total_in_percentage as totalInPercent, \r\n"
					+ " mens_height_heaping_first_digit_teamwise.percentage_with_1st_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
					+ " mens_height_heaping_first_digit_teamwise.number_of_men as numberOfMen, \r\n"
					+ " mens_height_heaping_first_digit_teamwise.date_attribute as date \r\n"
					+ " from public.mens_height_heaping_first_digit_teamwise \r\n"
					+ " LEFT JOIN public.team_master ON mens_height_heaping_first_digit_teamwise.team_no = team_master.team_id where mens_height_heaping_first_digit_teamwise.state_id=:stateId \r\n"
					+ " order by team_master.team_id;",nativeQuery = true)
			public List<MensHeightHeapingFirstDecimalTeamwiseDTO> 
			findAllMensHeightHeapingFirstDecimalTeamwise(Integer stateId);
			
			// @Query(value = "Select \r\n"
			// 	+ " team_master.team as team,\r\n"
			// 	+ " womens_weight_heaping_first_digit_teamwise.c_0 as c_0 ,\r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.c_1 as c_1 ,\r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.c_2 as c_2 ,\r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.c_3 as c_3 ,\r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.c_4 as c_4,\r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.c_5 as c_5, \r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.c_6 as c_6,\r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.c_7 as c_7,\r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.c_8 as c_8, \r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.c_9 as c_9, \r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.total_in_percentage as totalInPercent, \r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.percentage_with_1st_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.number_of_women as numberOfWomen, \r\n"
            //     + " womens_weight_heaping_first_digit_teamwise.date_attribute as date \r\n"
			// 	+ " from public.womens_weight_heaping_first_digit_teamwise \r\n"
			// 	+ " LEFT JOIN public.team_master ON womens_weight_heaping_first_digit_teamwise.team_no = team_master.team_id where womens_weight_heaping_first_digit_teamwise.state_id=:stateId \r\n"
			// 	+ " order by team_master.team_id;",nativeQuery = true)
			// public List<WomensWeightHeapingFirstDecimalTeamwiseDTO> findAllWomensWeightHeapingFirstDecimalTeamwise(Integer stateId);

			
			// @Query(value = "Select \r\n"
			// 		+ " team_master.team as team,\r\n"
			// 		+ " womens_weight_heaping_second_digit_teamwise.c_0 as c_0 ,\r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.c_1 as c_1 ,\r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.c_2 as c_2 ,\r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.c_3 as c_3 ,\r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.c_4 as c_4,\r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.c_5 as c_5, \r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.c_6 as c_6,\r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.c_7 as c_7,\r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.c_8 as c_8, \r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.c_9 as c_9, \r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.total_in_percentage as totalInPercent, \r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.percentage_with_2nd_decimal_0_or_5 as percentWithSecondDecimal_0_or_5, \r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.number_of_women as numberOfWomen, \r\n"
	        //         + " womens_weight_heaping_second_digit_teamwise.date_attribute as date \r\n"
			// 		+ " from public.womens_weight_heaping_second_digit_teamwise \r\n"
			// 		+ " LEFT JOIN public.team_master ON womens_weight_heaping_second_digit_teamwise.team_no = team_master.team_id where womens_weight_heaping_second_digit_teamwise.state_id=:stateId \r\n"
			// 		+ " order by team_master.team_id;",nativeQuery = true)
			// 	public List<WomensWeightHeapingSecondDecimalTeamwiseDTO> findAllWomensWeightHeapingSecondDecimalTeamwise(Integer stateId);

			// @Query(value = "Select \r\n"
			// 		+ " team_master.team as team,\r\n"
			// 		+ " womens_height_heaping_first_digit_teamwise.c_0 as c_0 ,\r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.c_1 as c_1 ,\r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.c_2 as c_2 ,\r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.c_3 as c_3 ,\r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.c_4 as c_4,\r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.c_5 as c_5, \r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.c_6 as c_6,\r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.c_7 as c_7,\r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.c_8 as c_8, \r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.c_9 as c_9, \r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.total_in_percentage as totalInPercent, \r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.percentage_with_1st_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.number_of_women as numberOfWomen, \r\n"
	        //         + " womens_height_heaping_first_digit_teamwise.date_attribute as date \r\n"
			// 		+ " from public.womens_height_heaping_first_digit_teamwise \r\n"
			// 		+ " LEFT JOIN public.team_master ON womens_height_heaping_first_digit_teamwise.team_no = team_master.team_id where womens_height_heaping_first_digit_teamwise.state_id=:stateId \r\n"
			// 		+ " order by team_master.team_id;",nativeQuery = true)
			// 	public List<WomensHeightHeapingFirstDecimalTeamwiseDTO> findAllWomensHeightHeapingFirstDecimalTeamwise(Integer stateId);

			
			// @Query(value = "Select \r\n"
			// 		+ " team_master.team as team,\r\n"
			// + " age_at_death_heaping_teamwise.eight_m as eightM ,\r\n"
			// + " age_at_death_heaping_teamwise.nine_m as nineM ,\r\n"
			// + " age_at_death_heaping_teamwise.ten_m as tenM ,\r\n"
			// + " age_at_death_heaping_teamwise.eleven_m as elevenM ,\r\n"
			// + " age_at_death_heaping_teamwise.twelve_m as twelveM,\r\n"
			// + " age_at_death_heaping_teamwise.reported_as_1_year as reportedAs1Year, \r\n"
			// + " age_at_death_heaping_teamwise.thirteen_m as thirteenM,\r\n"
			// + " age_at_death_heaping_teamwise.fourteen_m as fourteenM,\r\n"
			// + " age_at_death_heaping_teamwise.fifteen_m as fifteenM, \r\n"
			// + " age_at_death_heaping_teamwise.sixteen_m as sixteenM, \r\n"
            // + " age_at_death_heaping_teamwise.total_8_16_m as total8_16M, \r\n"
			// + " age_at_death_heaping_teamwise.twelve_months_ratio as twelveMonthsRatio, \r\n"
			// + " age_at_death_heaping_teamwise.date_attribute as date \r\n"
            // + " from public.age_at_death_heaping_teamwise \r\n"
            // + " LEFT JOIN public.team_master ON age_at_death_heaping_teamwise.team_no = team_master.team_id where age_at_death_heaping_teamwise.state_id=:stateId \r\n"
            // + " order by team_master.team_id;",nativeQuery = true)
            // public List<AgeAtDeathHeapingTeamwiseDTO> findAllAgeAtDeathHeapingTeamwise(Integer stateId);

}
