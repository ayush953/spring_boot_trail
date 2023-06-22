package com.nciipc.household.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nciipc.household.model.EligibleMenPerHh;
import com.nciipc.household.model.MemberwiseDTO.EligibleMenPerHhMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.EligibleWomenPerHhMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HhCompletionRateMemberwiseDTO;
import com.nciipc.household.model.MemberwiseDTO.HhVisitMemberwiseDTO;

@Repository
public interface MemberwiseReportsRepo extends JpaRepository<EligibleMenPerHh, Integer> {

	@Query(value = "select \r\n"
			+ " member_master.member as member,\r\n"
			+ " eligible_men_per_hh_memberwise.no_of_completed_hh_urban as noOfCompletedHhUrban,\r\n"
			+ " eligible_men_per_hh_memberwise.no_of_de_facto_eligible_men_in_completed_hh_urban as noOfDeFactoEligibleMenInCompletedHhUrban,\r\n"
			+ " eligible_men_per_hh_memberwise.mean_no_of_de_facto_eligible_men_per_hh_urban as meanNoOfDeFactoEligibleMenPerHhUrban,\r\n"
			+ " eligible_men_per_hh_memberwise.no_of_completed_hh_rural as noOfCompletedHhRural,\r\n"
			+ " eligible_men_per_hh_memberwise.no_of_de_facto_eligible_men_in_completed_hh_rural as noOfDeFactoEligibleMenInCompletedHhRural,\r\n"
			+ " eligible_men_per_hh_memberwise.mean_no_of_de_facto_eligible_men_per_hh_rural as meanNoOfDeFactoEligibleMenPerHhRural\r\n"
			+ " from eligible_men_per_hh_memberwise \r\n"
			+ " LEFT JOIN member_master\r\n"
			+ " ON eligible_men_per_hh_memberwise.member_no = member_master.member_id \r\n"
			+ " where eligible_men_per_hh_memberwise.state_id=:stateId and \r\n"
			+ " eligible_men_per_hh_memberwise.team_no=:teamNo \r\n"
			+ " order by eligible_men_per_hh_memberwise.member_no",nativeQuery = true)	
	public List<EligibleMenPerHhMemberwiseDTO> findAllEligibleMenPerHhMemberwise(Integer stateId,Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member,\r\n"
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
			+ " hh_completion_rate_memberwise.number_val as numberVal \r\n"
			+ " from hh_completion_rate_memberwise\r\n"
			+ " LEFT JOIN member_master\r\n"
			+ " ON hh_completion_rate_memberwise.member_no = member_master.member_id \r\n"
			+ " where hh_completion_rate_memberwise.state_id=:stateId and \r\n"
			+ " hh_completion_rate_memberwise.team_no=:teamNo \r\n"
			+ " order by hh_completion_rate_memberwise.member_no",nativeQuery = true)
	public List<HhCompletionRateMemberwiseDTO> findAllHhCompletionRateMemberwise(Integer stateId,Integer teamNo);
	
	@Query(value = "Select \r\n"
			+ " member_master.member as member,\r\n"
			+ " hh_visit_memberwise.visit_1 as visit_1,\r\n"
			+ " hh_visit_memberwise.visit_2 as visit_2,\r\n"
			+ " hh_visit_memberwise.visit_3 as visit_3,\r\n"
			+ " hh_visit_memberwise.per_Sum as perSum,\r\n"
			+ " hh_visit_memberwise.num as num from hh_visit_memberwise\r\n"
			+ " LEFT JOIN member_master on\r\n"
			+ " hh_visit_memberwise.member_no = member_master.member_id \r\n"
			+ " where hh_visit_memberwise.state_id=:stateId and \r\n"
			+ " hh_visit_memberwise.team_no=:teamNo \r\n"
			+ " order by hh_visit_memberwise.member_no",nativeQuery = true)
	public List<HhVisitMemberwiseDTO> findAllVisitHhMemberwise(Integer stateId,Integer teamNo);
	
	@Query(value = "select \r\n"
			+ " member_master.member as member,\r\n"
			+ " eligible_women_per_hh_memberwise.no_of_completed_hh_urban as noOfCompletedHhUrban,\r\n"
			+ " eligible_women_per_hh_memberwise.no_of_de_facto_eligible_women_in_completed_hh_urban as noOfDeFactoEligibleWomenInCompletedHhUrban,\r\n"
			+ " eligible_women_per_hh_memberwise.mean_no_of_de_facto_eligible_women_per_hh_urban as meanNoOfDeFactoEligibleWomenPerHhUrban,\r\n"
			+ " eligible_women_per_hh_memberwise.no_of_completed_hh_rural as noOfCompletedHhRural,\r\n"
			+ " eligible_women_per_hh_memberwise.no_of_de_facto_eligible_women_in_completed_hh_rural as noOfDeFactoEligibleWomenInCompletedHhRural,\r\n"
			+ " eligible_women_per_hh_memberwise.mean_no_of_de_facto_eligible_women_per_hh_rural as meanNoOfDeFactoEligibleWomenPerHhRural\r\n"
			+ " from eligible_women_per_hh_memberwise  \r\n"
			+ " LEFT JOIN member_master\r\n"
			+ " ON eligible_women_per_hh_memberwise.member_no = member_master.member_id \r\n"
			+ " where eligible_women_per_hh_memberwise.state_id=:stateId and \r\n"
			+ " eligible_women_per_hh_memberwise.team_no=:teamNo \r\n"
			+ " order by eligible_women_per_hh_memberwise.member_no",nativeQuery = true)
	public List<EligibleWomenPerHhMemberwiseDTO> findAllEligibleWomenPerHhMemberwise(Integer stateId,Integer teamNo);
	
}
