package com.lmig.gfc.TechEducationProject.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.lmig.gfc.TechEducationProject.models.MentorProfile;
import com.lmig.gfc.TechEducationProject.models.Skills;
import com.lmig.gfc.TechEducationProject.repositories.ProfileRepository;
import com.lmig.gfc.TechEducationProject.repositories.UserRepository;
import com.lmig.gfc.TechEducationProject.repositories.skillsRepository;

@Configuration
public class SeedData {

	public SeedData(skillsRepository skills, UserRepository user, ProfileRepository mentRepo) {

		skills.save(new Skills("PHP"));
		skills.save(new Skills("JavaScript"));
		skills.save(new Skills("HTML"));
		
		Skills skills2 = new Skills("Java");
		
		
		MentorProfile ment = new MentorProfile("N0026982", "yes", "Within One Week", "Email",
				"x@X.com", 6.0);
	
		skills.save(skills2);
		
		List<Skills> skillsSir = new ArrayList<Skills>();
		
		skillsSir.add(skills2);
		
		ment.setMentorSkills(skillsSir);
		mentRepo.save(ment);
	}
}