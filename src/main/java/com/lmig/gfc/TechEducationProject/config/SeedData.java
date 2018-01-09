package com.lmig.gfc.TechEducationProject.config;

import org.springframework.context.annotation.Configuration;

import com.lmig.gfc.TechEducationProject.models.Skills;
import com.lmig.gfc.TechEducationProject.repositories.skillsRepository;

@Configuration
public class SeedData {
	

	public SeedData(skillsRepository skills) {
		
		skills.save(new Skills("Java"));
		skills.save(new Skills("PHP"));
		skills.save(new Skills("JavaScript"));
		skills.save(new Skills("HTML"));
		 
		 
		

}
}
