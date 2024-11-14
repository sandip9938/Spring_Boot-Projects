package com.sp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sp.entity.JobSeeker;

public interface iJobSeekertRepostionry extends JpaRepository<JobSeeker, Integer> {

}
