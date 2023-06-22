package com.nciipc.household.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nciipc.household.model.QHSECOVER;

@Repository
public interface QHSECOVERRepository extends JpaRepository<QHSECOVER, Long> {
	
//	//truncate table
//	@Transactional
//	@Modifying
//	@Query(value = "TRUNCATE TABLE household_qhsecover", nativeQuery = true)
//	public void truncateTable();
	

}
