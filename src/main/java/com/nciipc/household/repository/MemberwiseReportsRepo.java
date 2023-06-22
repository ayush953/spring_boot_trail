package com.nciipc.household.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nciipc.household.model.EligibleMenPerHh;

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
//import com.nciipc.household.model.MemberwiseDTO.NoFoodConsumptionOfChildfrom6To23MonthsMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.SexRatioOfChildrenMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.VaccinationHealthCardsMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.WomenVisit1549VisitsMemberwiseDTO;

import com.nciipc.household.model.MemberwiseDTO.WomensHeightMemberwiseDTO;

import com.nciipc.household.model.MemberwiseDTO.WomensWeightMemberwiseDTO;

@Repository
public interface MemberwiseReportsRepo extends JpaRepository<EligibleMenPerHh, Integer> {

	@Query(value = "select \r\n" + " member_master.member as member,\r\n"
			+ " eligible_men_per_hh_memberwise.no_of_completed_hh_urban as noOfCompletedHhUrban,\r\n"
			+ " eligible_men_per_hh_memberwise.no_of_de_facto_eligible_men_in_completed_hh_urban as noOfDeFactoEligibleMenInCompletedHhUrban,\r\n"
			+ " eligible_men_per_hh_memberwise.mean_no_of_de_facto_eligible_men_per_hh_urban as meanNoOfDeFactoEligibleMenPerHhUrban,\r\n"
			+ " eligible_men_per_hh_memberwise.no_of_completed_hh_rural as noOfCompletedHhRural,\r\n"
			+ " eligible_men_per_hh_memberwise.no_of_de_facto_eligible_men_in_completed_hh_rural as noOfDeFactoEligibleMenInCompletedHhRural,\r\n"
			+ " eligible_men_per_hh_memberwise.mean_no_of_de_facto_eligible_men_per_hh_rural as meanNoOfDeFactoEligibleMenPerHhRural,\r\n"
			+ " eligible_men_per_hh_memberwise.date_attribute as date \r\n"
			+ " from public.eligible_men_per_hh_memberwise \r\n" + " LEFT JOIN public.member_master\r\n"
			+ " ON eligible_men_per_hh_memberwise.member_no = member_master.member_id \r\n"
			+ " where eligible_men_per_hh_memberwise.state_id=:stateId and \r\n"
			+ " eligible_men_per_hh_memberwise.team_no=:teamNo \r\n"
			+ " order by eligible_men_per_hh_memberwise.member_no", nativeQuery = true)
	public List<EligibleMenPerHhMemberwiseDTO> findAllEligibleMenPerHhMemberwise(Integer stateId, Integer teamNo);

		@Query(value = "Select \r\n" + " member_master.member as member,\r\n"
			+ " hh_completion_rate_memberwise.completed as completed,	\r\n"
			+ " hh_completion_rate_memberwise.no_hh_member_at_home_or_no_respondent_at_home as noHhMemberAtHomeOrNoRespondentAtHome,	\r\n"
			+ " hh_completion_rate_memberwise.entire_hh_absent_at_time_of_visit as entireHhAbsentAtTimeOfVisit,	\r\n"
			+ " hh_completion_rate_memberwise.postponed as postponed,	\r\n"
			+ " hh_completion_rate_memberwise.refused as refused,	\r\n"
			+ " hh_completion_rate_memberwise.dwelling_vacant_or_address_not_a_dwelling as dwellingVacantOrAddressNotADwelling,	\r\n"
			+ " hh_completion_rate_memberwise.dwelling_destroyed as dwellingDestroyed,	\r\n"
			+ " hh_completion_rate_memberwise.dwelling_not_found as dwellingNotFound,	\r\n"
			+ " hh_completion_rate_memberwise.other as other,	\r\n"
			+ " hh_completion_rate_memberwise.percent_val as percentVal,	\r\n"
			+ " hh_completion_rate_memberwise.number_val as numberVal, \r\n" 
			+ " hh_completion_rate_memberwise.date_attribute as date \r\n"
			+ " from public.hh_completion_rate_memberwise\r\n"
			+ " LEFT JOIN public.member_master\r\n"
			+ " ON hh_completion_rate_memberwise.member_no = member_master.member_id \r\n"
			+ " where hh_completion_rate_memberwise.state_id=:stateId and \r\n"
			+ " hh_completion_rate_memberwise.team_no=:teamNo \r\n"
			+ " order by hh_completion_rate_memberwise.member_no", nativeQuery = true)
	public List<HhCompletionRateMemberwiseDTO> findAllHhCompletionRateMemberwise(Integer stateId, Integer teamNo);

	@Query(value = "Select \r\n" + " member_master.member as member,\r\n"
			+ " hh_visit_memberwise.visit_1 as visit_1,\r\n" + " hh_visit_memberwise.visit_2 as visit_2,\r\n"
			+ " hh_visit_memberwise.visit_3 as visit_3,\r\n" + " hh_visit_memberwise.per_Sum as perSum,\r\n"
			+ " hh_visit_memberwise.num as num, "
			+ " hh_visit_memberwise.date_attribute as date \r\n"
			+ "from public.hh_visit_memberwise\r\n" + " LEFT JOIN public.member_master on\r\n"
			+ " hh_visit_memberwise.member_no = member_master.member_id \r\n"
			+ " where hh_visit_memberwise.state_id=:stateId and \r\n" + " hh_visit_memberwise.team_no=:teamNo \r\n"
			+ " order by hh_visit_memberwise.member_no", nativeQuery = true)
	public List<HhVisitMemberwiseDTO> findAllVisitHhMemberwise(Integer stateId, Integer teamNo);

	@Query(value = "select \r\n" + " member_master.member as member,\r\n"
			+ " eligible_women_per_hh_memberwise.no_of_completed_hh_urban as noOfCompletedHhUrban,\r\n"
			+ " eligible_women_per_hh_memberwise.no_of_de_facto_eligible_women_in_completed_hh_urban as noOfDeFactoEligibleWomenInCompletedHhUrban,\r\n"
			+ " eligible_women_per_hh_memberwise.mean_no_of_de_facto_eligible_women_per_hh_urban as meanNoOfDeFactoEligibleWomenPerHhUrban,\r\n"
			+ " eligible_women_per_hh_memberwise.no_of_completed_hh_rural as noOfCompletedHhRural,\r\n"
			+ " eligible_women_per_hh_memberwise.no_of_de_facto_eligible_women_in_completed_hh_rural as noOfDeFactoEligibleWomenInCompletedHhRural,\r\n"
			+ " eligible_women_per_hh_memberwise.mean_no_of_de_facto_eligible_women_per_hh_rural as meanNoOfDeFactoEligibleWomenPerHhRural, \r\n"
			+ " eligible_women_per_hh_memberwise.date_attribute as date \r\n"
			+ " from public.eligible_women_per_hh_memberwise  \r\n" + " LEFT JOIN public.member_master\r\n"
			+ " ON eligible_women_per_hh_memberwise.member_no = member_master.member_id \r\n"
			+ " where eligible_women_per_hh_memberwise.state_id=:stateId and \r\n"
			+ " eligible_women_per_hh_memberwise.team_no=:teamNo \r\n"
			+ " order by eligible_women_per_hh_memberwise.member_no", nativeQuery = true)
	public List<EligibleWomenPerHhMemberwiseDTO> findAllEligibleWomenPerHhMemberwise(Integer stateId, Integer teamNo);

	@Query(value = "select	\r\n" + " member_master.member as member,\r\n"
			+ " eligible_women_response_rate_memberwise.completed as completed ,\r\n"
			+ " eligible_women_response_rate_memberwise.not_at_home as notAtHome ,\r\n"
			+ " eligible_women_response_rate_memberwise.postponed as postponed ,\r\n"
			+ " eligible_women_response_rate_memberwise.refused as refused ,\r\n"
			+ " eligible_women_response_rate_memberwise.partly_completed as partlyCompleted ,\r\n"
			+ " eligible_women_response_rate_memberwise.other as other ,\r\n"
			+ " eligible_women_response_rate_memberwise.percent_val as percentVal ,\r\n"
			+ " eligible_women_response_rate_memberwise.number_val as numberVal ,\r\n"
//			+ " eligible_women_response_rate_memberwise.date_attribute as dateAttribute ,\r\n"
			+ " eligible_women_response_rate_memberwise.incapacited as incapacited, "
			+ " eligible_women_response_rate_memberwise.date_attribute as date \r\n"
			+ "from public.eligible_women_response_rate_memberwise\r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " eligible_women_response_rate_memberwise.member_no = member_master.member_id \r\n"
			+ " where eligible_women_response_rate_memberwise.state_id=:stateId and \r\n"
			+ " eligible_women_response_rate_memberwise.team_no=:teamNo \r\n"
			+ " order by eligible_women_response_rate_memberwise.member_no", nativeQuery = true)
	public List<EligibleWomenResponseRateMemberwiseDTO> findAllEligibleWomenResponseRateMemberwise(Integer stateId,
			Integer teamNo);

	@Query(value = "select	\r\n" + " member_master.member as member, \r\n"
			+ " women_15_49_visits_memberwise.visit_1 as visit_1 ,\r\n"
			+ " women_15_49_visits_memberwise.visit_2 as visit_2 ,\r\n"
			+ " women_15_49_visits_memberwise.visit_3 as visit_3 ,\r\n"
			+ " women_15_49_visits_memberwise.per_sum as perSum ,\r\n"
			+ " women_15_49_visits_memberwise.num as num, \r\n" 
			+ " women_15_49_visits_memberwise.date_attribute as date \r\n"
			+ " from public.women_15_49_visits_memberwise\r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " women_15_49_visits_memberwise.member_no = member_master.member_id \r\n"
			+ " where women_15_49_visits_memberwise.state_id=:stateId and \r\n"
			+ " women_15_49_visits_memberwise.team_no=:teamNo \r\n"
			+ " order by women_15_49_visits_memberwise.member_no", nativeQuery = true)
	public List<WomenVisit1549VisitsMemberwiseDTO> findAllWomenVisit1549VisitsMemberwise(Integer stateId,
			Integer teamNo);

	@Query(value = "select	\r\n" + " member_master.member as member, \r\n"
			+ " eligible_men_response_rate_memberwise.completed as completed ,\r\n"
			+ " eligible_men_response_rate_memberwise.not_at_home as notAtHome ,\r\n"
			+ " eligible_men_response_rate_memberwise.postponed as postponed ,\r\n"
			+ " eligible_men_response_rate_memberwise.refused as refused ,\r\n"
			+ " eligible_men_response_rate_memberwise.partly_completed as partlyCompleted ,\r\n"
			+ " eligible_men_response_rate_memberwise.other as other ,\r\n"
			+ " eligible_men_response_rate_memberwise.percent_val as percentVal ,\r\n"
			+ " eligible_men_response_rate_memberwise.number_val as numberVal ,\r\n"
//			+ " eligible_men_response_rate_memberwise.date_attribute as dateAttribute ,\r\n"
			+ " eligible_men_response_rate_memberwise.incapacited as incapacited, "
			+ " eligible_men_response_rate_memberwise.date_attribute as date \r\n"
			+ "from public.eligible_men_response_rate_memberwise\r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " eligible_men_response_rate_memberwise.member_no = member_master.member_id \r\n"
			+ " where eligible_men_response_rate_memberwise.state_id=:stateId and \r\n"
			+ " eligible_men_response_rate_memberwise.team_no=:teamNo \r\n"
			+ " order by eligible_men_response_rate_memberwise.member_no", nativeQuery = true)
	public List<EligibleMenResponseRateMemberwiseDTO> findAllEligibleMenResponseRateMemberwise(Integer stateId, Integer teamNo);
	
	@Query(value = "select	\r\n"
			+ " member_master.member as member, \r\n"
			+ " men_15_54_visits_memberwise.visit_1 as visit_1 ,\r\n"
			+ " men_15_54_visits_memberwise.visit_2 as visit_2 ,\r\n"
			+ " men_15_54_visits_memberwise.visit_3 as visit_3 ,\r\n"
			+ " men_15_54_visits_memberwise.per_sum as perSum ,\r\n"
			+ " men_15_54_visits_memberwise.num as num, \r\n"
			+ " men_15_54_visits_memberwise.date_attribute as date \r\n"
			+ " from public.men_15_54_visits_memberwise\r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ "  men_15_54_visits_memberwise.member_no = member_master.member_id \r\n"
			+ " where men_15_54_visits_memberwise.state_id=:stateId and \r\n"
			+ " men_15_54_visits_memberwise.team_no=:teamNo \r\n"
			+ " order by men_15_54_visits_memberwise.member_no",nativeQuery = true)
	public List<MenVisit1554VisitsMemberwiseDTO> findAllMenVisit1554VisitsMemberwise(Integer stateId, Integer teamNo);

	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " age_displacement_women_lower_limit_memberwise.age_12 as age_12, \r\n"
			+ " age_displacement_women_lower_limit_memberwise.age_13 as age_13, \r\n"
			+ " age_displacement_women_lower_limit_memberwise.age_14 as age_14, \r\n"
			+ " age_displacement_women_lower_limit_memberwise.age_15 as age_15, \r\n"
			+ " age_displacement_women_lower_limit_memberwise.age_16 as age_16, \r\n"
			+ " age_displacement_women_lower_limit_memberwise.age_17 as age_17, \r\n"
			+ " age_displacement_women_lower_limit_memberwise.age_18 as age_18, \r\n"
			+ " age_displacement_women_lower_limit_memberwise.number_of_women as numberOfWomen, \r\n"
			+ " age_displacement_women_lower_limit_memberwise.age_ratio as ageRatio, "
			+ " age_displacement_women_lower_limit_memberwise.date_attribute as date \r\n"
			+ "from public.age_displacement_women_lower_limit_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " age_displacement_women_lower_limit_memberwise.member_no = member_master.member_id \r\n"
			+ " where age_displacement_women_lower_limit_memberwise.state_id=:stateId and \r\n"
			+ " age_displacement_women_lower_limit_memberwise.team_no=:teamNo \r\n"
			+ " order by age_displacement_women_lower_limit_memberwise.member_no",nativeQuery = true)
	public List<AgeDisplacementWomenLowerLimitMemberwiseDTO> findAllAgeDisplacementWomenLowerLimitMemberwise(Integer stateId, Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " age_displacement_women_upper_limit_memberwise.age_47 as age_47, \r\n"
			+ " age_displacement_women_upper_limit_memberwise.age_48 as age_48, \r\n"
			+ " age_displacement_women_upper_limit_memberwise.age_49 as age_49, \r\n"
			+ " age_displacement_women_upper_limit_memberwise.age_50 as age_50, \r\n"
			+ " age_displacement_women_upper_limit_memberwise.age_51 as age_51, \r\n"
			+ " age_displacement_women_upper_limit_memberwise.age_52 as age_52, \r\n"
			+ " age_displacement_women_upper_limit_memberwise.age_53 as age_53, \r\n"
			+ " age_displacement_women_upper_limit_memberwise.number_of_women as numberOfWomen, \r\n"
			+ " age_displacement_women_upper_limit_memberwise.age_ratio as ageRatio, "
			+ " age_displacement_women_upper_limit_memberwise.date_attribute as date \r\n"
			+ "from public.age_displacement_women_upper_limit_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " age_displacement_women_upper_limit_memberwise.member_no = member_master.member_id \r\n"
			+ " where age_displacement_women_upper_limit_memberwise.state_id=:stateId and \r\n"
			+ " age_displacement_women_upper_limit_memberwise.team_no=:teamNo \r\n"
			+ " order by age_displacement_women_upper_limit_memberwise.member_no",nativeQuery = true)
	public List<AgeDisplacementWomenUpperLimitMemberwiseDTO> findAllAgeDisplacementWomenUpperLimitMemberwise(Integer stateId, Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " age_displacement_men_lower_limit_memberwise.age_12 as age_12, \r\n"
			+ " age_displacement_men_lower_limit_memberwise.age_13 as age_13, \r\n"
			+ " age_displacement_men_lower_limit_memberwise.age_14 as age_14, \r\n"
			+ " age_displacement_men_lower_limit_memberwise.age_15 as age_15, \r\n"
			+ " age_displacement_men_lower_limit_memberwise.age_16 as age_16, \r\n"
			+ " age_displacement_men_lower_limit_memberwise.age_17 as age_17, \r\n"
			+ " age_displacement_men_lower_limit_memberwise.age_18 as age_18, \r\n"
			+ " age_displacement_men_lower_limit_memberwise.number_of_men as numberOfMen, \r\n"
			+ " age_displacement_men_lower_limit_memberwise.age_ratio as ageRatio, "
			+ " age_displacement_men_lower_limit_memberwise.date_attribute as date \r\n"
			+ "from public.age_displacement_men_lower_limit_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " age_displacement_men_lower_limit_memberwise.member_no = member_master.member_id \r\n"
			+ " where age_displacement_men_lower_limit_memberwise.state_id=:stateId and \r\n"
			+ " age_displacement_men_lower_limit_memberwise.team_no=:teamNo \r\n"
			+ " order by age_displacement_men_lower_limit_memberwise.member_no",nativeQuery = true)
	public List<AgeDisplacementMenLowerLimitMemberwiseDTO> findAllAgeDisplacementMenLowerLimitMemberwise(Integer stateId, Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " age_displacement_men_upper_limit_memberwise.age_52 as age_52, \r\n"
			+ " age_displacement_men_upper_limit_memberwise.age_53 as age_53, \r\n"
			+ " age_displacement_men_upper_limit_memberwise.age_54 as age_54, \r\n"
			+ " age_displacement_men_upper_limit_memberwise.age_55 as age_55, \r\n"
			+ " age_displacement_men_upper_limit_memberwise.age_56 as age_56, \r\n"
			+ " age_displacement_men_upper_limit_memberwise.age_57 as age_57, \r\n"
			+ " age_displacement_men_upper_limit_memberwise.age_58 as age_58, \r\n"
			+ " age_displacement_men_upper_limit_memberwise.number_of_men as numberOfMen, \r\n"
			+ " age_displacement_men_upper_limit_memberwise.age_ratio as ageRatio, "
			+ " age_displacement_men_upper_limit_memberwise.date_attribute as date \r\n"
			+ "from public.age_displacement_men_upper_limit_memberwise\r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " age_displacement_men_upper_limit_memberwise.member_no = member_master.member_id \r\n"
			+ " where age_displacement_men_upper_limit_memberwise.state_id=:stateId and \r\n"
			+ " age_displacement_men_upper_limit_memberwise.team_no=:teamNo \r\n"
			+ " order by age_displacement_men_upper_limit_memberwise.member_no",nativeQuery = true)
	public List<AgeDisplacementMenUpperLimitMemberwiseDTO> findAllAgeDisplacementMenUpperLimitMemberwise(Integer stateId, Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " birth_displacement_memberwise.year_2014 as year_2014, \r\n"
			+ " birth_displacement_memberwise.year_2015 as year_2015, \r\n"
			+ " birth_displacement_memberwise.year_2016 as year_2016, \r\n"
			+ " birth_displacement_memberwise.year_2017 as year_2017, \r\n"
			+ " birth_displacement_memberwise.year_2018 as year_2018, \r\n"
			+ " birth_displacement_memberwise.year_2019 as year_2019, \r\n"
			+ " birth_displacement_memberwise.year_2020 as year_2020, \r\n"
			+ " birth_displacement_memberwise.year_2021 as year_2021, \r\n"
			+ " birth_displacement_memberwise.year_2022 as year_2022, \r\n"
			+ " birth_displacement_memberwise.year_2023 as year_2023, \r\n"
			+ " birth_displacement_memberwise.missing as missing, \r\n"
			+ " birth_displacement_memberwise.number_of_births as numberOfBirths, \r\n"
			+ " birth_displacement_memberwise.birth_year_ratio_2018_2017 as birthYearRatio_2018_2017, \r\n"
			+ " birth_displacement_memberwise.date_attribute as date \r\n"
			+ " from public.birth_displacement_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " birth_displacement_memberwise.member_no = member_master.member_id \r\n"
			+ " where birth_displacement_memberwise.state_id=:stateId and \r\n"
			+ " birth_displacement_memberwise.team_no=:teamNo \r\n"
			+ " order by birth_displacement_memberwise.member_no",nativeQuery = true)
	public List<BirthDisplacementMemberwiseDTO> findAllBirthDisplacementMemberwise(Integer stateId, Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " vaccination_health_cards_memberwise.per_of_children_reported_to_have_vaccination_card as perOfChildrenReportedToHaveVaccinationCard, \r\n"
			+ " vaccination_health_cards_memberwise.per_of_children_whose_vaccine_card_was_seen as perOfChildrenWhoseVaccineCardWasSeen, \r\n"
			+ " vaccination_health_cards_memberwise.number_of_children as numberOfChildren, \r\n"
			+ " vaccination_health_cards_memberwise.proportion_of_cards_seen as proportionOfCardsSeen, \r\n"
			+ " vaccination_health_cards_memberwise.date_attribute as date \r\n"
			+ " from public.vaccination_health_cards_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " vaccination_health_cards_memberwise.member_no = member_master.member_id \r\n"
			+ " where vaccination_health_cards_memberwise.state_id=:stateId and \r\n"
			+ " vaccination_health_cards_memberwise.team_no=:teamNo \r\n"
			+ " order by vaccination_health_cards_memberwise.member_no",nativeQuery = true)
	public List<VaccinationHealthCardsMemberwiseDTO> findAllVaccinationHealthCardsMemberwise(Integer stateId, Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " household_relations_modules_memberwise.tt_no_of_women_eligible_for_domestic_violence as ttNoOfWomenEligibleForDomesticViolence, \r\n"
			+ " household_relations_modules_memberwise.eligible_women_not_interviewed_because_of_privacy_not_obtained as eligibleWomenNotInterviewedBecauseOfPrivacyNotObtained, \r\n"
			+ " household_relations_modules_memberwise.date_attribute as date \r\n"
			+ " from public.household_relations_modules_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " household_relations_modules_memberwise.member_no = member_master.member_id \r\n"
			+ " where household_relations_modules_memberwise.state_id=:stateId and \r\n"
			+ " household_relations_modules_memberwise.team_no=:teamNo \r\n"
			+ " order by household_relations_modules_memberwise.member_no",nativeQuery = true)
	public List<HouseholdRelationsModulesMemberwiseDTO> findAllHouseholdRelationsModulesMemberwise(Integer stateId, Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " contraceptive_prevalence_rate_memberwise.any_method as anyMethod, \r\n"
			+ " contraceptive_prevalence_rate_memberwise.number_val as numberVal, \r\n"
			+ " contraceptive_prevalence_rate_memberwise.date_attribute as date \r\n"
			+ " from public.contraceptive_prevalence_rate_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " contraceptive_prevalence_rate_memberwise.member_no = member_master.member_id \r\n"
			+ " where contraceptive_prevalence_rate_memberwise.state_id=:stateId and \r\n"
			+ " contraceptive_prevalence_rate_memberwise.team_no=:teamNo \r\n"
			+ " order by contraceptive_prevalence_rate_memberwise.member_no",nativeQuery = true)
	public List<ContraceptivePrevalenceRateMemberwiseDTO> findAllContraceptivePrevalenceRateMemberwise(Integer stateId, Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " sex_ratio_of_children_memberwise.sex_ratio as sexRatio, \r\n"
			+ " sex_ratio_of_children_memberwise.num_of_boys as numOfBoys, \r\n"
			+ " sex_ratio_of_children_memberwise.num_of_girls as numOfGirls, \r\n"
			+ " sex_ratio_of_children_memberwise.date_attribute as date \r\n"
			+ " from public.sex_ratio_of_children_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " sex_ratio_of_children_memberwise.member_no = member_master.member_id \r\n"
			+ " where sex_ratio_of_children_memberwise.state_id=:stateId and \r\n"
			+ " sex_ratio_of_children_memberwise.team_no=:teamNo \r\n"
			+ " order by sex_ratio_of_children_memberwise.member_no",nativeQuery = true)
	public List<SexRatioOfChildrenMemberwiseDTO> findAllSexRatioOfChildrenMemberwise(Integer stateId, Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " womens_height_memberwise.mesured as mesured ,\r\n"
			+ " womens_height_memberwise.women_not_present as womenNotPresent ,\r\n"
			+ " womens_height_memberwise.women_refused as womenRefused ,\r\n"
			+ " womens_height_memberwise.other as other ,\r\n"
			+ " womens_height_memberwise.missing as missing,\r\n"
			+ " womens_height_memberwise.total as total, \r\n"
			+ " womens_height_memberwise.number_of_women as numberOfWomen,\r\n"
			+ " womens_height_memberwise.women_ht_out_of_range as womenHtOutOfRange,\r\n"
			+ " womens_height_memberwise.women_with_valid_ht_data as womenWithValidHtData, \r\n"
			+ " womens_height_memberwise.date_attribute as date \r\n"
			+ " from public.womens_height_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " womens_height_memberwise.member_no = member_master.member_id \r\n"
			+ " where womens_height_memberwise.state_id=:stateId and \r\n"
			+ " womens_height_memberwise.team_no=:teamNo \r\n"
			+ " order by womens_height_memberwise.member_no",nativeQuery = true)
	public List<WomensHeightMemberwiseDTO> findAllWomensHeightMemberwise(Integer stateId, Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " womens_weight_memberwise.mesured as mesured ,\r\n"
			+ " womens_weight_memberwise.women_not_present as womenNotPresent ,\r\n"
			+ " womens_weight_memberwise.women_refused as womenRefused ,\r\n"
			+ " womens_weight_memberwise.other as other ,\r\n"
			+ " womens_weight_memberwise.missing as missing,\r\n"
			+ " womens_weight_memberwise.total as total, \r\n"
			+ " womens_weight_memberwise.number_of_women as numberOfWomen,\r\n"
			+ " womens_weight_memberwise.women_wt_out_of_range as womenWtOutOfRange,\r\n"
			+ " womens_weight_memberwise.women_with_valid_wt_data as womenWithValidWtData, \r\n"
			+ " womens_weight_memberwise.date_attribute as date \r\n"
			+ " from public.womens_weight_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " womens_weight_memberwise.member_no = member_master.member_id \r\n"
			+ " where womens_weight_memberwise.state_id=:stateId and \r\n"
			+ " womens_weight_memberwise.team_no=:teamNo \r\n"
			+ " order by womens_weight_memberwise.member_no",nativeQuery = true)
	public List<WomensWeightMemberwiseDTO> findAllWomensWeightMemberwise(Integer stateId, Integer teamNo);

	
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " birth_weight_healthcard_memberwise.card as card ,\r\n"
			+ " birth_weight_healthcard_memberwise.recall as recall ,\r\n"
			+ " birth_weight_healthcard_memberwise.count as count, \r\n"
			+ " birth_weight_healthcard_memberwise.date_attribute as date \r\n"
			+ " from public.birth_weight_healthcard_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " birth_weight_healthcard_memberwise.member_no = member_master.member_id \r\n"
			+ " where birth_weight_healthcard_memberwise.state_id=:stateId and \r\n"
			+ " birth_weight_healthcard_memberwise.team_no=:teamNo \r\n"
			+ " order by birth_weight_healthcard_memberwise.member_no",nativeQuery = true)
	public List<BirthWeightHealthcardMemberwiseDTO> findAllBirthWeightHealthcardMemberwise(Integer stateId, Integer teamNo);
	
	
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " interview_start_time_memberwise.slot_6am_7_59am as slot_6am_7_59am ,\r\n"
			+ " interview_start_time_memberwise.slot_8am_8pm as slot_8am_8pm ,\r\n"
			+ " interview_start_time_memberwise.slot_8_01pm_5_59am as slot_8_01pm_5_59am ,\r\n"
			+ " interview_start_time_memberwise.all_elibible_women as allEligibleWomen, \r\n"
			+ " interview_start_time_memberwise.date_attribute as date \r\n"
			+ " from public.interview_start_time_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " interview_start_time_memberwise.member_no = member_master.member_id \r\n"
			+ " where interview_start_time_memberwise.state_id=:stateId and \r\n"
			+ " interview_start_time_memberwise.team_no=:teamNo \r\n"
			+ " order by interview_start_time_memberwise.member_no",nativeQuery = true)
	public List<InterviewStartTimeMemberwiseDTO> findAllInterviewStartTimeMemberwise(Integer stateId, Integer teamNo);
	
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
		+ " mens_height_memberwise.measured as measured ,\r\n"
			+ " mens_height_memberwise.man_not_present as menNotPresent ,\r\n"
			+ " mens_height_memberwise.man_refused as menRefused ,\r\n"
			+ " mens_height_memberwise.other as other ,\r\n"
			+ " mens_height_memberwise.missing as missing,\r\n"
			+ " mens_height_memberwise.total_in_percentage as total, \r\n"
			+ " mens_height_memberwise.number_of_men as numberOfMen,\r\n"
			+ " mens_height_memberwise.among_men_measured_height_out_of_range as menHtOutOfRange,\r\n"
			+ " mens_height_memberwise.men_with_valid_height_data as menWithValidHtData, \r\n"
			+ " mens_height_memberwise.date_attribute as date \r\n"
			+ " from public.mens_height_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " mens_height_memberwise.member_no = member_master.member_id \r\n"
			+ " where mens_height_memberwise.state_id=:stateId and \r\n"
			+ " mens_height_memberwise.team_no=:teamNo \r\n"
			+ " order by mens_height_memberwise.member_no",nativeQuery = true)
	public List<MensHeightMemberwiseDTO> findAllMensHeightMemberwise(Integer stateId, Integer teamNo);
	
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " no_food_consumption_of_child_from public._6_23_months_memberwise.not_eaten_percentage as notEatenPercentage ,\r\n"
			+ " no_food_consumption_of_child_from public._6_23_months_memberwise.number_of_children as numberOfChildren, \r\n"
			+ " no_food_consumption_of_child_from public._6_23_months_memberwise.date_attribute as date \r\n"
			+ " from public.no_food_consumption_of_child_from public._6_23_months_memberwise \r\n"
			+ " LEFT JOIN public.member_master on\r\n"
			+ " no_food_consumption_of_child_from public._6_23_months_memberwise.member_no = member_master.member_id \r\n"
			+ " where no_food_consumption_of_child_from public._6_23_months_memberwise.state_id=:stateId and \r\n"
			+ " no_food_consumption_of_child_from public._6_23_months_memberwise.team_no=:teamNo \r\n"
			+ " order by no_food_consumption_of_child_from public._6_23_months_memberwise.member_no",nativeQuery = true)
	public List<NoFoodConsumptionOfChildFrom6To23MonthsMemberwiseDTO> findAllNoFoodConsumptionOfChildFrom6To23MonthsMemberwise(Integer stateId, Integer teamNo);
	
	//sampada's repo
	@Query(value="Select\r\n"
			+ "			 member_master.member as member, \r\n"
			+ "			 childrens_height_memberwise.mesured as mesured ,\r\n"
			+ "			 childrens_height_memberwise.child_not_present as childNotPresent ,\r\n"
			+ "			 childrens_height_memberwise.refused as refused ,\r\n"
			+ "			 childrens_height_memberwise.other as other ,\r\n"
			+ "			 childrens_height_memberwise.missing as missing,\r\n"
			+ "			 childrens_height_memberwise.total as total, \r\n"
			+ "			 childrens_height_memberwise.number_of_children as numberOfChildren,\r\n"
			+ "			 childrens_height_memberwise.height_out_of_range as heightOutOfRange,\r\n"
			+ "			 childrens_height_memberwise.date_of_birth_incomplete as dateOfBirthIncomplete,\r\n"
			+ "			 childrens_height_memberwise.children_with_valid_data as childrenWithValidData,\r\n"
			+ "			 childrens_height_memberwise.height_for_age_z_score_out_of_range as heightForAgeZScoreOutOfRange, \r\n"
			+ " childrens_height_memberwise.date_attribute as date \r\n"
			+ "			 from public.childrens_height_memberwise \r\n"
			+ "			 LEFT JOIN public.member_master on\r\n"
			+ "			 childrens_height_memberwise.member_no = member_master.member_id \r\n"
			+ "			 where childrens_height_memberwise.state_id=:stateId and \r\n"
			+ "			 childrens_height_memberwise.team_no=:teamNo \r\n"
			+ "			 order by childrens_height_memberwise.member_no",nativeQuery = true)
	public List<ChildrensHeightMemberwiseDTO> findAllChindrensHeightMemberwise(Integer stateId, Integer teamNo);

	@Query(value="Select\r\n"
			+ "			 member_master.member as member, \r\n"
			+ "			 childrens_weight_memberwise.mesured as mesured ,\r\n"
			+ "			 childrens_weight_memberwise.child_not_present as childNotPresent ,\r\n"
			+ "			 childrens_weight_memberwise.refused as refused ,\r\n"
			+ "			 childrens_weight_memberwise.other as other ,\r\n"
			+ "			 childrens_weight_memberwise.missing as missing,\r\n"
			+ "			 childrens_weight_memberwise.total as total, \r\n"
			+ "			 childrens_weight_memberwise.number_of_children as numberOfChildren,\r\n"
			+ "			 childrens_weight_memberwise.weight_out_of_range as weightOutOfRange,\r\n"
			+ "			 childrens_weight_memberwise.date_of_birth_incomplete as dateOfBirthIncomplete,\r\n"
			+ "			 childrens_weight_memberwise.children_with_valid_data as childrenWithValidData,\r\n"
			+ "			 childrens_weight_memberwise.weight_for_height_z_score_out_of_range as weightForHeightZScoreOutOfRange, \r\n"
			+ " childrens_weight_memberwise.date_attribute as date \r\n"
			+ "			 from public.childrens_weight_memberwise \r\n"
			+ "			 LEFT JOIN public.member_master on\r\n"
			+ "			 childrens_weight_memberwise.member_no = member_master.member_id \r\n"
			+ "			 where childrens_weight_memberwise.state_id=:stateId and \r\n"
			+ "			 childrens_weight_memberwise.team_no=:teamNo \r\n"
			+ "			 order by childrens_weight_memberwise.member_no",nativeQuery = true)
	public List<ChildrensWeightMemberwiseDTO> findAllChildrensWeightMemberwise(Integer stateId, Integer teamNo);

	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.c_0 as c_0 ,\r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.c_1 as c_1 ,\r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.c_2 as c_2 ,\r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.c_3 as c_3 ,\r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.c_4 as c_4,\r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.c_5 as c_5, \r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.c_6 as c_6,\r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.c_7 as c_7,\r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.c_8 as c_8, \r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.c_9 as c_9, \r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.total_percent as totalPercent, \r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.percent_with_first_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.number_of_children_with_valid_weight_data as numberOfChildrenWithValidWeightData, \r\n"
			+ " childrens_weight_heaping_first_decimal_memberwise.date_attribute as date \r\n"
			+ "	from public.childrens_weight_heaping_first_decimal_memberwise \r\n"
			+ "	LEFT JOIN public.member_master on\r\n"
			+ "	childrens_weight_heaping_first_decimal_memberwise.member_no = member_master.member_id \r\n"
			+ "	where childrens_weight_heaping_first_decimal_memberwise.state_id=:stateId and \r\n"
			+ "	childrens_weight_heaping_first_decimal_memberwise.team_no=:teamNo \r\n"
			+ "	order by childrens_weight_heaping_first_decimal_memberwise.member_no",nativeQuery = true)
	public List<ChildrensWeightHeapingFirstDecimalMemberwiseDTO> findAllChildrensWeightHeapingFirstDecimalMemberwise(Integer stateId, Integer teamNo);

	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.c_0 as c_0 ,\r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.c_1 as c_1 ,\r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.c_2 as c_2 ,\r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.c_3 as c_3 ,\r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.c_4 as c_4,\r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.c_5 as c_5, \r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.c_6 as c_6,\r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.c_7 as c_7,\r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.c_8 as c_8, \r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.c_9 as c_9, \r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.total_percent as totalPercent, \r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.percent_with_second_decimal_0_or_5 as percentWithsecondDecimal_0_or_5, \r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.number_of_children_with_valid_weight_data as numberOfChildrenWithValidWeightData, \r\n"
			+ " childrens_weight_heaping_second_decimal_memberwise.date_attribute as date \r\n"
			+ "	from public.childrens_weight_heaping_second_decimal_memberwise \r\n"
			+ "	LEFT JOIN public.member_master on\r\n"
			+ "	childrens_weight_heaping_second_decimal_memberwise.member_no = member_master.member_id \r\n"
			+ "	where childrens_weight_heaping_second_decimal_memberwise.state_id=:stateId and \r\n"
			+ "	childrens_weight_heaping_second_decimal_memberwise.team_no=:teamNo \r\n"
			+ "	order by childrens_weight_heaping_second_decimal_memberwise.member_no",nativeQuery = true)
	public List<ChildrensWeightHeapingSecondDecimalMemberwiseDTO2> findAllChildrensWeightHeapingSecondDecimalMemberwise(Integer stateId, Integer teamNo);

	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " mens_weight_heaping_first_digit_memberwise.\"0\" as c_0 ,\r\n"
			+ " mens_weight_heaping_first_digit_memberwise.\"1\" as c_1 ,\r\n"
			+ " mens_weight_heaping_first_digit_memberwise.\"2\" as c_2 ,\r\n"
			+ " mens_weight_heaping_first_digit_memberwise.\"3\" as c_3 ,\r\n"
			+ " mens_weight_heaping_first_digit_memberwise.\"4\" as c_4,\r\n"
			+ " mens_weight_heaping_first_digit_memberwise.\"5\" as c_5, \r\n"
			+ " mens_weight_heaping_first_digit_memberwise.\"6\" as c_6,\r\n"
			+ " mens_weight_heaping_first_digit_memberwise.\"7\" as c_7,\r\n"
			+ " mens_weight_heaping_first_digit_memberwise.\"8\" as c_8, \r\n"
			+ " mens_weight_heaping_first_digit_memberwise.\"9\" as c_9, \r\n"
			+ " mens_weight_heaping_first_digit_memberwise.total_in_percentage as totalInPercent, \r\n"
			+ " mens_weight_heaping_first_digit_memberwise.percentage_with_1st_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
			+ " mens_weight_heaping_first_digit_memberwise.number_of_men as numberOfMen, \r\n"
			+ " mens_weight_heaping_first_digit_memberwise.date_attribute as date \r\n"
			+ "	from public.mens_weight_heaping_first_digit_memberwise \r\n"
			+ "	LEFT JOIN public.member_master on\r\n"
			+ "	mens_weight_heaping_first_digit_memberwise.member_no = member_master.member_id \r\n"
			+ "	where mens_weight_heaping_first_digit_memberwise.state_id=:stateId and \r\n"
			+ "	mens_weight_heaping_first_digit_memberwise.team_no=:teamNo \r\n"
			+ "	order by mens_weight_heaping_first_digit_memberwise.member_no",nativeQuery = true)
	public List<MensWeightHeapingFirstDecimalMemberwiseDTO> findAllMensWeightHeapingFirstDecimalMemberwise(Integer stateId, Integer teamNo);

	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " mens_weight_heaping_second_digit_memberwise.\"0\" as c_0 ,\r\n"
			+ " mens_weight_heaping_second_digit_memberwise.\"1\" as c_1 ,\r\n"
			+ " mens_weight_heaping_second_digit_memberwise.\"2\" as c_2 ,\r\n"
			+ " mens_weight_heaping_second_digit_memberwise.\"3\" as c_3 ,\r\n"
			+ " mens_weight_heaping_second_digit_memberwise.\"4\" as c_4,\r\n"
			+ " mens_weight_heaping_second_digit_memberwise.\"5\" as c_5, \r\n"
			+ " mens_weight_heaping_second_digit_memberwise.\"6\" as c_6,\r\n"
			+ " mens_weight_heaping_second_digit_memberwise.\"7\" as c_7,\r\n"
			+ " mens_weight_heaping_second_digit_memberwise.\"8\" as c_8, \r\n"
			+ " mens_weight_heaping_second_digit_memberwise.\"9\" as c_9, \r\n"
			+ " mens_weight_heaping_second_digit_memberwise.total_in_percentage as totalInPercent, \r\n"
			+ " mens_weight_heaping_second_digit_memberwise.percentage_with_1st_decimal_0_or_5 as percentWithSecondDecimal_0_or_5, \r\n"
			+ " mens_weight_heaping_second_digit_memberwise.number_of_men as numberOfMen, \r\n"
			+ " mens_weight_heaping_second_digit_memberwise.date_attribute as date \r\n"
			+ "	from public.mens_weight_heaping_second_digit_memberwise \r\n"
			+ "	LEFT JOIN public.member_master on\r\n"
			+ "	mens_weight_heaping_second_digit_memberwise.member_no = member_master.member_id \r\n"
			+ "	where mens_weight_heaping_second_digit_memberwise.state_id=:stateId and \r\n"
			+ "	mens_weight_heaping_second_digit_memberwise.team_no=:teamNo \r\n"
			+ "	order by mens_weight_heaping_second_digit_memberwise.member_no",nativeQuery = true)
	public List<MensWeightHeapingSecondDecimalMemberwiseDTO> findAllMensWeightHeapingSecondDecimalMemberwise(Integer stateId, Integer teamNo);

	@Query(value="Select\r\n"
			+ "	member_master.member as member, \r\n"
			+ " mens_weight_memberwise.measured as mesured,\r\n"
			+ " mens_weight_memberwise.man_not_present as manNotPresent,\r\n"
			+ " mens_weight_memberwise.man_refused as manrefused,\r\n"
			+ " mens_weight_memberwise.other as other,\r\n"
			+ " mens_weight_memberwise.missing as missing,\r\n"
			+ " mens_weight_memberwise.total_in_percentage as total, \r\n"
			+ " mens_weight_memberwise.number_of_men as numberOfMen,\r\n"
			+ " mens_weight_memberwise.among_men_measured_weight_out_of_range as amongMenMeasuredWeightOutOfRange,\r\n"
			+ " mens_weight_memberwise.men_with_valid_weight_data as menWithValidWeightData, \r\n"
			+ " mens_weight_memberwise.date_attribute as date \r\n"
			+ "	from public.mens_weight_memberwise \r\n"
			+ "	LEFT JOIN public.member_master on\r\n"
			+ "	mens_weight_memberwise.member_no = member_master.member_id \r\n"
			+ "	where mens_weight_memberwise.state_id=:stateId and \r\n"
			+ "	mens_weight_memberwise.team_no=:teamNo \r\n"
			+ "	order by mens_weight_memberwise.member_no",nativeQuery = true)
	public List<MensWeightMemberwiseDTO> findAllMensWeightMemberwise(Integer stateId, Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member, \r\n"
			+ " mens_height_heaping_first_digit_memberwise.\"0\" as c_0 ,\r\n"
			+ " mens_height_heaping_first_digit_memberwise.\"1\" as c_1 ,\r\n"
			+ " mens_height_heaping_first_digit_memberwise.\"2\" as c_2 ,\r\n"
			+ " mens_height_heaping_first_digit_memberwise.\"3\" as c_3 ,\r\n"
			+ " mens_height_heaping_first_digit_memberwise.\"4\" as c_4,\r\n"
			+ " mens_height_heaping_first_digit_memberwise.\"5\" as c_5, \r\n"
			+ " mens_height_heaping_first_digit_memberwise.\"6\" as c_6,\r\n"
			+ " mens_height_heaping_first_digit_memberwise.\"7\" as c_7,\r\n"
			+ " mens_height_heaping_first_digit_memberwise.\"8\" as c_8, \r\n"
			+ " mens_height_heaping_first_digit_memberwise.\"9\" as c_9, \r\n"
			+ " mens_height_heaping_first_digit_memberwise.total_in_percentage as totalInPercent, \r\n"
			+ " mens_height_heaping_first_digit_memberwise.percentage_with_1st_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
			+ " mens_height_heaping_first_digit_memberwise.number_of_men as numberOfMen, \r\n"
			+ " mens_height_heaping_first_digit_memberwise.date_attribute as date \r\n"
			+ "	from public.mens_height_heaping_first_digit_memberwise \r\n"
			+ "	LEFT JOIN public.member_master on\r\n"
			+ "	mens_height_heaping_first_digit_memberwise.member_no = member_master.member_id \r\n"
			+ "	where mens_height_heaping_first_digit_memberwise.state_id=:stateId and \r\n"
			+ "	mens_height_heaping_first_digit_memberwise.team_no=:teamNo \r\n"
			+ "	order by mens_height_heaping_first_digit_memberwise.member_no",nativeQuery = true)
	public List<MensHeightHeapingFirstDecimalMemberwiseDTO> 
	findAllMensHeightHeapingFirstDecimalMemberwise(Integer stateId, Integer teamNo);

// 	@Query(value = "Select \r\n"
// 			+ " member_master.member as member, \r\n"
// 			+ " womens_weight_heaping_first_digit_memberwise.c_0 as c_0 ,\r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.c_1 as c_1 ,\r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.c_2 as c_2 ,\r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.c_3 as c_3 ,\r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.c_4 as c_4,\r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.c_5 as c_5, \r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.c_6 as c_6,\r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.c_7 as c_7,\r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.c_8 as c_8, \r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.c_9 as c_9, \r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.total_in_percentage as totalInPercent, \r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.percentage_with_1st_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.number_of_women as numberOfWomen, \r\n"
//                 + " womens_weight_heaping_first_digit_memberwise.date_attribute as date \r\n"
//         		+ "	from public.womens_weight_heaping_first_digit_memberwise \r\n"
//                 + "	LEFT JOIN public.member_master on\r\n"
// 			+ "	womens_weight_heaping_first_digit_memberwise.member_no = member_master.member_id \r\n"
// 			+ "	where womens_weight_heaping_first_digit_memberwise.state_id=:stateId and \r\n"
// 			+ "	womens_weight_heaping_first_digit_memberwise.team_no=:teamNo \r\n"
// 			+ "	order by womens_weight_heaping_first_digit_memberwise.member_no",nativeQuery = true)
// 	public List<WomensWeightHeapingFirstDecimalMemberwiseDTO> findAllWomensWeightHeapingFirstDecimalMemberwise(Integer stateId, Integer teamNo);

// 	@Query(value = "Select \r\n"
// 			+ " member_master.member as member, \r\n"
// 			+ " womens_weight_heaping_second_digit_memberwise.c_0 as c_0 ,\r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.c_1 as c_1 ,\r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.c_2 as c_2 ,\r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.c_3 as c_3 ,\r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.c_4 as c_4,\r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.c_5 as c_5, \r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.c_6 as c_6,\r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.c_7 as c_7,\r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.c_8 as c_8, \r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.c_9 as c_9, \r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.total_in_percentage as totalInPercent, \r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.percentage_with_2nd_decimal_0_or_5 as percentWithSecondDecimal_0_or_5, \r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.number_of_women as numberOfWomen, \r\n"
//                 + " womens_weight_heaping_second_digit_memberwise.date_attribute as date \r\n"
//         		+ "	from public.womens_weight_heaping_second_digit_memberwise \r\n"
//                 + "	LEFT JOIN public.member_master on\r\n"
// 			+ "	womens_weight_heaping_second_digit_memberwise.member_no = member_master.member_id \r\n"
// 			+ "	where womens_weight_heaping_second_digit_memberwise.state_id=:stateId and \r\n"
// 			+ "	womens_weight_heaping_second_digit_memberwise.team_no=:teamNo \r\n"
// 			+ "	order by womens_weight_heaping_second_digit_memberwise.member_no",nativeQuery = true)
// 	public List<WomensWeightHeapingSecondDecimalMemberwiseDTO> findAllWomensWeightHeapingSecondDecimalMemberwise(Integer stateId, Integer teamNo);


// 	@Query(value = "Select \r\n"
// 		+ " member_master.member as member, \r\n"
// 		+ " womens_height_heaping_first_digit_memberwise.c_0 as c_0 ,\r\n"
//             + " womens_height_heaping_first_digit_memberwise.c_1 as c_1 ,\r\n"
//             + " womens_height_heaping_first_digit_memberwise.c_2 as c_2 ,\r\n"
//             + " womens_height_heaping_first_digit_memberwise.c_3 as c_3 ,\r\n"
//             + " womens_height_heaping_first_digit_memberwise.c_4 as c_4,\r\n"
//             + " womens_height_heaping_first_digit_memberwise.c_5 as c_5, \r\n"
//             + " womens_height_heaping_first_digit_memberwise.c_6 as c_6,\r\n"
//             + " womens_height_heaping_first_digit_memberwise.c_7 as c_7,\r\n"
//             + " womens_height_heaping_first_digit_memberwise.c_8 as c_8, \r\n"
//             + " womens_height_heaping_first_digit_memberwise.c_9 as c_9, \r\n"
//             + " womens_height_heaping_first_digit_memberwise.total_in_percentage as totalInPercent, \r\n"
//             + " womens_height_heaping_first_digit_memberwise.percentage_with_1st_decimal_0_or_5 as percentWithFirstDecimal_0_or_5, \r\n"
//             + " womens_height_heaping_first_digit_memberwise.number_of_women as numberOfWomen, \r\n"
//             + " womens_height_heaping_first_digit_memberwise.date_attribute as date \r\n"
//     		+ "	from public.womens_height_heaping_first_digit_memberwise \r\n"
//             + "	LEFT JOIN public.member_master on\r\n"
// 		+ "	womens_height_heaping_first_digit_memberwise.member_no = member_master.member_id \r\n"
// 		+ "	where womens_height_heaping_first_digit_memberwise.state_id=:stateId and \r\n"
// 		+ "	womens_height_heaping_first_digit_memberwise.team_no=:teamNo \r\n"
// 		+ "	order by womens_height_heaping_first_digit_memberwise.member_no",nativeQuery = true)
// public List<WomensHeightHeapingFirstDecimalMemberwiseDTO> findAllWomensHeightHeapingFirstDecimalMemberwise(Integer stateId, Integer teamNo);

	
// 	@Query(value = "Select \r\n"
//             + " member_master.member as member, \r\n"
//             + " age_at_death_heaping_memberwise.eight_m as eightM ,\r\n"
// 			+ " age_at_death_heaping_memberwise.nine_m as nineM ,\r\n"
// 			+ " age_at_death_heaping_memberwise.ten_m as tenM ,\r\n"
// 			+ " age_at_death_heaping_memberwise.eleven_m as elevenM ,\r\n"
// 			+ " age_at_death_heaping_memberwise.twelve_m as twelveM,\r\n"
// 			+ " age_at_death_heaping_memberwise.reported_as_1_year as reportedAs1Year, \r\n"
// 			+ " age_at_death_heaping_memberwise.thirteen_m as thirteenM,\r\n"
// 			+ " age_at_death_heaping_memberwise.fourteen_m as fourteenM,\r\n"
// 			+ " age_at_death_heaping_memberwise.fifteen_m as fifteenM, \r\n"
// 			+ " age_at_death_heaping_memberwise.sixteen_m as sixteenM, \r\n"
//             + " age_at_death_heaping_memberwise.total_8_16_m as total8_16M, \r\n"
// 			+ " age_at_death_heaping_memberwise.twelve_months_ratio as twelveMonthsRatio, \r\n"
// 			+ " age_at_death_heaping_memberwise.date_attribute as date \r\n"
//     		+ "	from public.age_at_death_heaping_memberwise \r\n"
//             + "	LEFT JOIN public.member_master on\r\n"
// 		+ "	age_at_death_heaping_memberwise.member_no = member_master.member_id \r\n"
// 		+ "	where age_at_death_heaping_memberwise.state_id=:stateId and \r\n"
// 		+ "	age_at_death_heaping_memberwise.team_no=:teamNo \r\n"
// 		+ "	order by age_at_death_heaping_memberwise.member_no",nativeQuery = true)
// public List<AgeAtDeathHeapingMemberwiseDTO> findAllAgeAtDeathHeapingMemberwise(Integer stateId, Integer teamNo);

}
