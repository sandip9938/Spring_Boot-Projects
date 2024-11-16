package com.sp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sp.entity.PersonalInfo;

public interface iPersonal_InfoRepostionry extends JpaRepository<PersonalInfo, Integer> {

	@Query(value = "select (sysdate-P_DOB )/365.25 from Personal_Info where  P_ID =?", nativeQuery = true)
	public float ageCalulate(int id);
}
