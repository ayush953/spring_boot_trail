package com.nciipc.household.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nciipc.household.model.Test;

public interface TestRepo extends JpaRepository<Test, Integer> {

}
