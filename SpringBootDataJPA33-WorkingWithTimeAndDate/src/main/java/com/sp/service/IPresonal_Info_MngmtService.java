package com.sp.service;

import com.sp.entity.PersonalInfo;

public interface IPresonal_Info_MngmtService {

	public String registerPerson(PersonalInfo personalInfo);

	public Iterable<PersonalInfo> showAllPersonalInfo();

	public float getAgeById(int id);

}
