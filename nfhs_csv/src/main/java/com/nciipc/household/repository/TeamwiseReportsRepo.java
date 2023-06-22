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

@Repository
public interface TeamwiseReportsRepo extends JpaRepository<EligibleMenPerHh, Integer> {
	
	@Query(value = "select \r\n"
			+ "team_master.team as team,\r\n"
			+ "eligible_men_per_hh_teamwise.no_of_completed_hh_urban as noOfCompletedHhUrban,\r\n"
			+ "eligible_men_per_hh_teamwise.no_of_de_facto_eligible_men_in_completed_hh_urban as noOfDeFactoEligibleMenInCompletedHhUrban,\r\n"
			+ "eligible_men_per_hh_teamwise.mean_no_of_de_facto_eligible_men_per_hh_urban as meanNoOfDeFactoEligibleMenPerHhUrban,\r\n"
			+ "eligible_men_per_hh_teamwise.no_of_completed_hh_rural as noOfCompletedHhRural,\r\n"
			+ "eligible_men_per_hh_teamwise.no_of_de_facto_eligible_men_in_completed_hh_rural as noOfDeFactoEligibleMenInCompletedHhRural,\r\n"
			+ "eligible_men_per_hh_teamwise.mean_no_of_de_facto_eligible_men_per_hh_rural as meanNoOfDeFactoEligibleMenPerHhRural\r\n"
			+ "from eligible_men_per_hh_teamwise  \r\n"
			+ "LEFT JOIN team_master\r\n"
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
			+ "eligible_women_per_hh_teamwise.mean_no_of_de_facto_eligible_women_per_hh_rural as meanNoOfDeFactoEligibleWomenPerHhRural\r\n"
			+ "from eligible_women_per_hh_teamwise  \r\n"
			+ "LEFT JOIN team_master\r\n"
			+ "ON eligible_women_per_hh_teamwise.team_no = team_master.team_id where eligible_women_per_hh_teamwise.state_id=:stateId \r\n"
			+ "order by team_master.team_id",nativeQuery = true)
	public List<EligibleWomenPerHhTeamwiseDTO> findAllEligibleWomenPerHhTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team as team,\r\n"
			+ " hh_visit_teamwise.visit_1 as visit_1,\r\n"
			+ " hh_visit_teamwise.visit_2 as visit_2,\r\n"
			+ " hh_visit_teamwise.visit_3 as visit_3,\r\n"
			+ " hh_visit_teamwise.per_Sum as perSum,\r\n"
			+ " hh_visit_teamwise.num as num from hh_visit_teamwise\r\n"
			+ " LEFT JOIN team_master\r\n"
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
			+ " hh_completion_rate_teamwise.number_val as numberVal from hh_completion_rate_teamwise \r\n"
			+ " LEFT JOIN team_master ON hh_completion_rate_teamwise.team_no = team_master.team_id where hh_completion_rate_teamwise.state_id=:stateId \r\n"
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<HhCompletionRateTeamwiseDTO> findAllHhCompletionRateTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team_id as team,\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_12 as age_12,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_13 as age_13,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_14 as age_14,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_15 as age_15,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_16 as age_16,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_17 as age_17,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_18 as age_18,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.number_of_men as numberOfMen,	\r\n"
			+ "	age_displacement_men_lower_limit_teamwise.age_ratio as ageRatio from age_displacement_men_lower_limit_teamwise"
			+ " LEFT JOIN team_master ON ON hh_visit_teamwise.team_no = team_master.team_id where age_displacement_men_lower_limit_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<AgeDisplacementMenLowerLimitTeamwiseDTO> findAllAgeDisplacementMenLowerLimitTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team_id as team,\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_52 as age_52,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_53 as age_53,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_54 as age_54,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_55 as age_55,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_56 as age_56,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_57 as age_57,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_58 as age_58,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.number_of_men as numberOfMen,	\r\n"
			+ "	age_displacement_men_upper_limit_teamwise.age_ratio as ageRatio from age_displacement_men_upper_limit_teamwise"
			+ " LEFT JOIN team_master ON ON hh_visit_teamwise.team_no = team_master.team_id where age_displacement_men_upper_limit_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<AgeDisplacementMenUpperLimitTeamwiseDTO> findAllAgeDisplacementMenUpperLimitTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team_id as team,\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_12 as age_12,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_13 as age_13,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_14 as age_14,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_15 as age_15,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_16 as age_16,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_17 as age_17,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_18 as age_18,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.number_of_women as numberOfWomen,	\r\n"
			+ "	age_displacement_women_lower_limit_teamwise.age_ratio as ageRatio from age_displacement_women_lower_limit_teamwise "
			+ " LEFT JOIN team_master ON ON hh_visit_teamwise.team_no = team_master.team_id where age_displacement_women_lower_limit_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<AgeDisplacementWomenLowerLimitTeamwiseDTO> findAllAgeDisplacementWomenLowerLimitTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team_id as team,\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_52 as age_52,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_53 as age_53,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_54 as age_54,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_55 as age_55,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_56 as age_56,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_57 as age_57,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_58 as age_58,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.number_of_women as numberOfWomen,	\r\n"
			+ "	age_displacement_women_upper_limit_teamwise.age_ratio as ageRatio from age_displacement_women_upper_limit_teamwise "
			+ " LEFT JOIN team_master ON ON hh_visit_teamwise.team_no = team_master.team_id where age_displacement_women_upper_limit_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<AgeDisplacementWomenUpperLimitTeamwiseDTO> findAllAgeDisplacementWomenUpperLimitTeamwise(Integer stateId);
	
	@Query(value = "select	\r\n"
			+ " team_master.team_id as team,\r\n"
			+ "	eligible_women_response_rate_teamwise.completed as completed ,\r\n"
			+ " eligible_women_response_rate_teamwise.not_at_home as notAtHome ,\r\n"
			+ " eligible_women_response_rate_teamwise.postponed as postponed ,\r\n"
			+ " eligible_women_response_rate_teamwise.refused as refused ,\r\n"
			+ " eligible_women_response_rate_teamwise.partly_completed as partlyCompleted ,\r\n"
			+ " eligible_women_response_rate_teamwise.other as other ,\r\n"
			+ " eligible_women_response_rate_teamwise.percent_val as percentVal ,\r\n"
			+ " eligible_women_response_rate_teamwise.number_val as numberVal ,\r\n"
			+ " eligible_women_response_rate_teamwise.date_attribute as dateAttribute ,\r\n"
			+ " eligible_women_response_rate_teamwise.incapacited as incapacited from eligible_women_response_rate_teamwise"
			+ " LEFT JOIN team_master ON ON hh_visit_teamwise.team_no = team_master.team_id where eligible_women_response_rate_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<EligibleWomenResponseRateTeamwiseDTO> findAllEligibleWomenResponseRateTeamwise(Integer stateId);
	
	@Query(value = "select	\r\n"
			+ " team_master.team_id as team,\r\n"
			+ "	eligible_men_response_rate_teamwise.completed as completed ,\r\n"
			+ " eligible_men_response_rate_teamwise.not_at_home as notAtHome ,\r\n"
			+ " eligible_men_response_rate_teamwise.postponed as postponed ,\r\n"
			+ " eligible_men_response_rate_teamwise.refused as refused ,\r\n"
			+ " eligible_men_response_rate_teamwise.partly_completed as partlyCompleted ,\r\n"
			+ " eligible_men_response_rate_teamwise.other as other ,\r\n"
			+ " eligible_men_response_rate_teamwise.percent_val as percentVal ,\r\n"
			+ " eligible_men_response_rate_teamwise.number_val as numberVal ,\r\n"
			+ " eligible_men_response_rate_teamwise.date_attribute as dateAttribute ,\r\n"
			+ " eligible_men_response_rate_teamwise.incapacited as incapacited from eligible_men_response_rate_teamwise "
			+ " LEFT JOIN team_master ON ON hh_visit_teamwise.team_no = team_master.team_id where eligible_men_response_rate_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<EligibleMenResponseRateTeamwiseDTO> findAllEligibleMenResponseRateTeamwise(Integer stateId);
	
	@Query(value = "select	\r\n"
			+ " team_master.team_id as team,\r\n"
			+ "	women_15_49_visits_teamwise.visit_1 as visit_1 ,\r\n"
			+ " women_15_49_visits_teamwise.visit_2 as visit_2 ,\r\n"
			+ " women_15_49_visits_teamwise.visit_3 as visit_3 ,\r\n"
			+ " women_15_49_visits_teamwise.per_sum as perSum ,\r\n"
			+ " women_15_49_visits_teamwise.num as num \r\n"
			+ " from women_15_49_visits_teamwise"
			+ " LEFT JOIN team_master ON ON hh_visit_teamwise.team_no = team_master.team_id where women_15_49_visits_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<WomenVisit1549VisitsTeamwiseDTO> findAllWomenVisit1549VisitsTeamwise(Integer stateId);
	
	@Query(value = "select	\r\n"
			+ " team_master.team_id as team,\r\n"
			+ "	men_15_54_visits_teamwise.visit_1 as visit_1 ,\r\n"
			+ " men_15_54_visits_teamwise.visit_2 as visit_2 ,\r\n"
			+ " men_15_54_visits_teamwise.visit_3 as visit_3 ,\r\n"
			+ " men_15_54_visits_teamwise.per_sum as perSum ,\r\n"
			+ " men_15_54_visits_teamwise.num as num \r\n"
			+ " from men_15_54_visits_teamwise "
			+ " LEFT JOIN team_master ON ON hh_visit_teamwise.team_no = team_master.team_id where men_15_54_visits_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<MenVisit1554VisitsTeamwiseDTO> findAllMenVisit1554VisitsTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team_id as team,\r\n"
			+ "	household_relations_modules_teamwise.tt_no_of_women_eligible_for_domestic_violence as ttNoOfWomenEligibleForDomesticViolence,	\r\n"
			+ "	household_relations_modules_teamwise.eligible_women_not_interviewed_because_of_privacy_not_obtained as eligibleWomenNotInterviewedBecauseOfPrivacyNotObtained "
			+ " from household_relations_modules_teamwise "
			+ " LEFT JOIN team_master ON ON hh_visit_teamwise.team_no = team_master.team_id where household_relations_modules_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<HouseholdRelationsModulesTeamwiseDTO> findAllHouseholdRelationsModulesTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team_id as team,\r\n"
			+ "	contraceptive_prevalence_rate_teamwise.any_method as anyMethod,	\r\n"
			+ "	contraceptive_prevalence_rate_teamwise.number_val as numberVal "
			+ " from contraceptive_prevalence_rate_teamwise "
			+ " LEFT JOIN team_master ON ON hh_visit_teamwise.team_no = team_master.team_id where contraceptive_prevalence_rate_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<ContraceptivePrevalenceRateTeamwiseDTO> findAllContraceptivePrevalenceRateTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team_id as team,\r\n"
			+ "	vaccination_health_cards_teamwise.per_of_children_reported_to_have_vaccination_card as perOfChildrenReportedToHaveVaccinationCard,	\r\n"
			+ "	vaccination_health_cards_teamwise.per_of_children_whose_vaccine_card_was_seen as perOfChildrenWhoseVaccineCardWasSeen,	\r\n"
			+ "	vaccination_health_cards_teamwise.number_of_children as numberOfChildren,	\r\n"
			+ "	vaccination_health_cards_teamwise.proportion_of_cards_seen as proportionOfCardsSeen	\r\n"
			+ " from vaccination_health_cards_teamwise "
			+ " LEFT JOIN team_master ON ON hh_visit_teamwise.team_no = team_master.team_id where vaccination_health_cards_teamwise.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<VaccinationHealthCardsTeamwiseDTO> findVaccinationHealthCardsTeamwise(Integer stateId);
	
	@Query(value = "Select \r\n"
			+ " team_master.team_id as team,\r\n"
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
			+ "	birth_displacement_teamwise.birth_year_ratio_2018_2017 as birthYearRatio_2018_2017 "
			+ " from birth_displacement_teamwise "
			+ " LEFT JOIN team_master ON ON hh_visit_teamwise.team_no = team_master.team_id where birth_displacement.state_id=:stateId "
			+ " order by team_master.team_id;",nativeQuery = true)
	public List<BirthDisplacementTeamwiseDTO> findAllBirthDisplacementTeamwise(Integer stateId);
	
}
