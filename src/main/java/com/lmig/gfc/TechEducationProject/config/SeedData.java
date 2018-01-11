package com.lmig.gfc.TechEducationProject.config;

import org.springframework.context.annotation.Configuration;

import com.lmig.gfc.TechEducationProject.models.MentorProfile;
import com.lmig.gfc.TechEducationProject.models.Skills;
import com.lmig.gfc.TechEducationProject.repositories.ProfileRepository;
import com.lmig.gfc.TechEducationProject.repositories.UserRepository;
import com.lmig.gfc.TechEducationProject.repositories.skillsRepository;

@Configuration
public class SeedData {

	public SeedData(skillsRepository skills, UserRepository user, ProfileRepository mentRepo) {

		skills.save(new Skills("Java"));
		skills.save(new Skills("PHP"));
		skills.save(new Skills("JavaScript"));
		skills.save(new Skills("HTML"));
		MentorProfile ment = new MentorProfile("N0026982", "monday", "Java-Intermediate", "Within One Week", "Email",
				"x@X.com", 6.0);
		//
		// ment.setUser(user2);
		//
		mentRepo.save(ment);
	}
}