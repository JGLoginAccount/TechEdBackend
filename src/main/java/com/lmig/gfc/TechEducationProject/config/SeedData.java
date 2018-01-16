package com.lmig.gfc.TechEducationProject.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import com.lmig.gfc.TechEducationProject.models.ContactMethod;
import com.lmig.gfc.TechEducationProject.models.MentorProfile;
import com.lmig.gfc.TechEducationProject.models.RequestStatus;
import com.lmig.gfc.TechEducationProject.models.Skills;
import com.lmig.gfc.TechEducationProject.models.TimeFrame;
import com.lmig.gfc.TechEducationProject.models.User;
import com.lmig.gfc.TechEducationProject.repositories.ContactMethodRepository;
import com.lmig.gfc.TechEducationProject.repositories.ProfileRepository;
import com.lmig.gfc.TechEducationProject.repositories.RequestStatusRepository;
import com.lmig.gfc.TechEducationProject.repositories.TimeFrameRepository;
import com.lmig.gfc.TechEducationProject.repositories.UserRepository;
import com.lmig.gfc.TechEducationProject.repositories.skillsRepository;

@Configuration
public class SeedData {

	public SeedData(RequestStatusRepository requestRepo, TimeFrameRepository timeRepo,
			ContactMethodRepository contactRepo, skillsRepository skills, 
			UserRepository user, ProfileRepository mentRepo) {
		
		skills.save(new Skills("Angular"));
		skills.save(new Skills("C++"));
		skills.save(new Skills("CSS"));
		skills.save(new Skills("HTML"));
		skills.save(new Skills("Java"));
		skills.save(new Skills("JavaScript"));
		skills.save(new Skills("PHP"));
		skills.save(new Skills("Python"));
		skills.save(new Skills("Ruby"));
		skills.save(new Skills("TypeScript"));
		
		Skills skills2 = new Skills("Java");
		
		
		MentorProfile ment = new MentorProfile("N0026982", "yes", "Within One Week", "Email",
				"x@X.com", 6.0);
		
		User dataUser = new User("N0026982", "Clark", "Griswold", "Chicago",
				"Personal", "PM");
		
		User dataUser2 = new User("N0211099", "Ellen", "Griswold", "Chicago",
				"Personal", "PM");
		
		User dataUser3 = new User("N0333333", "Rusty", "Griswold", "Chicago",
				"Personal", "PM");
		
		User dataUser4 = new User("N0444444", "Audrey", "Griswold", "Chicago",
				"Personal", "PM");
		
		User dataUser5 = new User("N0555555", "Eddie", "Johnson", "Coolidge",
				"Personal", "PM");
		
		dataUser.setProfile(ment);
		
		user.save(dataUser2);
		
		user.save(dataUser);
		
		skills.save(skills2);
		
		List<Skills> skillsSir = new ArrayList<Skills>();
		
		skillsSir.add(skills2);
		
		ment.setMentorSkills(skillsSir);
		mentRepo.save(ment);
		
		contactRepo.save(new ContactMethod("Email"));
		contactRepo.save(new ContactMethod("Phone"));
		contactRepo.save(new ContactMethod("Skype"));
		
		timeRepo.save(new TimeFrame("Next Week"));
		timeRepo.save(new TimeFrame("Next Two Weeks"));
		timeRepo.save(new TimeFrame("Next Three Weeks"));
		timeRepo.save(new TimeFrame("One Month Or More"));
		
		requestRepo.save(new RequestStatus("Open"));
		requestRepo.save(new RequestStatus("In Progress"));
		requestRepo.save(new RequestStatus("Closed"));
	}
}