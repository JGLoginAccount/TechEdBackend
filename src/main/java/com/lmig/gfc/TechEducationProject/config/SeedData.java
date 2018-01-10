package com.lmig.gfc.TechEducationProject.config;

import org.springframework.context.annotation.Configuration;

import com.lmig.gfc.TechEducationProject.models.Skills;
import com.lmig.gfc.TechEducationProject.models.UserRequestForm;
import com.lmig.gfc.TechEducationProject.repositories.RequestRepository;
import com.lmig.gfc.TechEducationProject.repositories.skillsRepository;

@Configuration
public class SeedData {

	public SeedData(skillsRepository skills, RequestRepository requests) {

		skills.save(new Skills("Java"));
		skills.save(new Skills("PHP"));
		skills.save(new Skills("JavaScript"));
		skills.save(new Skills("HTML"));

		requests.save(
				new UserRequestForm("N912121", "Griswold", "Jenny", "Boston", "Claims", "Personal", "Call", "8675309"));

		requests.save(new UserRequestForm("N0211099", "Brian", "Griffin", "Indy", "Claims", "Personal", "Email",
				"test@test.com"));

	}
}
