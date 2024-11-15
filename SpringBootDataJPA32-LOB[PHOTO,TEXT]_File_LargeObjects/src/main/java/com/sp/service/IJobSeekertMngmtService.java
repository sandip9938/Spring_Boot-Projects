package com.sp.service;

import java.util.Optional;

import com.sp.entity.JobSeeker;

public interface IJobSeekertMngmtService {

	public String jobSeekerRegister(JobSeeker jobSeeker);

	public Optional<JobSeeker> showByJobHolderDetailsById(int id);

}
