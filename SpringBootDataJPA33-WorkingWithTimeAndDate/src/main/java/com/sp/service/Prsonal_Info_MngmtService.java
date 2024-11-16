package com.sp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sp.entity.PersonalInfo;
import com.sp.repository.iPersonal_InfoRepostionry;

@Service("PersonalInfo")
public class Prsonal_Info_MngmtService implements IPresonal_Info_MngmtService {

	@Autowired
	private iPersonal_InfoRepostionry iPersonal_InfoRepostionry;

	@Override
	public String registerPerson(PersonalInfo personalInfo) {
		int idValue = iPersonal_InfoRepostionry.save(personalInfo).getPId();
		return "Person Is Saved with th Id Value is : " + idValue;
	}

	@Override
	public Iterable<PersonalInfo> showAllPersonalInfo() {
		return iPersonal_InfoRepostionry.findAll();
	}

	@Override
	public float getAgeById(int id) {
		return iPersonal_InfoRepostionry.ageCalulate(id);
	}

}
