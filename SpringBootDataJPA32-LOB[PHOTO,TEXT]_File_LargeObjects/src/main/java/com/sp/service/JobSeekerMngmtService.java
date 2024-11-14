package com.sp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sp.entity.JobSeeker;
import com.sp.repository.iJobSeekertRepostionry;

@Service("JobSeekerService")
public class JobSeekerMngmtService implements IJobSeekertMngmtService {

	@Autowired
	private iJobSeekertRepostionry iJobSeekertRepostionry;

	@Override
	public String jobSeekerRegister(JobSeeker jobSeeker) {
		int jobid = iJobSeekertRepostionry.save(jobSeeker).getJobId();
		return "JobSeeker is registered with Id Value: " + jobid;
	}

}
