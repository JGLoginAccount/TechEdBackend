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

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SeedData {

	public SeedData(RequestStatusRepository requestRepo, TimeFrameRepository timeRepo,
			ContactMethodRepository contactRepo, skillsRepository skills, UserRepository user,
			ProfileRepository mentRepo, PasswordEncoder encoder) {
		

		User admin = user.save(new User("admin", "user", "admin@admin.com", encoder.encode("password")));
		

		skills.save(new Skills("Angular"));
		skills.save(new Skills("C++"));
		skills.save(new Skills("CSS"));
		skills.save(new Skills("HTML"));
		skills.save(new Skills("PHP"));
		skills.save(new Skills("Ruby"));
		Skills skills2 = new Skills("Java");
		Skills skills3 = new Skills("JavaScript");
		Skills skills4 = new Skills("Python");
		Skills skills5 = new Skills("TypeScript");

		MentorProfile ment = new MentorProfile("N0026982", "yes", "Next Week", "Email", "5@5.com", 5.0);
		// User dataUser = new User("N0026982", "Clark", "Griswold", "Chicago",
		// "Personal", "PM");

		MentorProfile ment2 = new MentorProfile("N0211099", "yes", "Next Three Weeks", "Skype", "skype call", 6.0);
		// User dataUser2 = new User("N0211099", "Ellen", "Griswold", "Chicago",
		// "Personal", "PM");

		MentorProfile ment3 = new MentorProfile("N0333333", "no", "Next Two Weeks", "Phone", "777-777-7777", 7.0);
		// User dataUser3 = new User("N0333333", "Rusty", "Griswold", "Chicago",
		// "Personal", "PM");

		MentorProfile ment4 = new MentorProfile("N0444444", "yes", "Next Week", "Phone", "888-888-8888", 8.0);
		// contactRepoUser dataUser4 = new User("N0444444", "Audrey", "Griswold",
		// "Chicago", "Personal", "PM");

		MentorProfile ment5 = new MentorProfile("N0555555", "yes", "One Month Or More", "Email", "9@9.com", 9.0);
		// User dataUser5 = new User("N0555555", "Eddie", "Johnson", "Coolidge",
		// "Personal", "PM");

		// dataUser.setProfile(ment);
		// dataUser2.setProfile(ment2);
		// dataUser3.setProfile(ment3);
		// dataUser4.setProfile(ment4);
		// dataUser5.setProfile(ment5);

		skills.save(skills2);
		skills.save(skills3);
		skills.save(skills4);
		skills.save(skills5);

		List<Skills> skillsSir = new ArrayList<Skills>();
		List<Skills> skillTwo = new ArrayList<Skills>();
		List<Skills> skillThree = new ArrayList<Skills>();
		List<Skills> skillFour = new ArrayList<Skills>();
		List<Skills> skillFive = new ArrayList<Skills>();

		skillsSir.add(skills2);
		skillTwo.add(skills3);
		skillTwo.add(skills4);
		skillThree.add(skills3);
		skillThree.add(skills5);
		skillFour.add(skills3);
		skillFour.add(skills4);
		skillFive.add(skills2);
		skillFive.add(skills5);

		ment.setMentorSkills(skillsSir);
		ment2.setMentorSkills(skillTwo);
		ment3.setMentorSkills(skillThree);
		ment4.setMentorSkills(skillFour);
		ment5.setMentorSkills(skillFive);

		mentRepo.save(ment);
		mentRepo.save(ment2);
		mentRepo.save(ment3);
		mentRepo.save(ment4);
		mentRepo.save(ment5);

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