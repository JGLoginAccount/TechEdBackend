package com.lmig.gfc.TechEducationProject.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

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
			ContactMethodRepository contactRepo, skillsRepository skills, UserRepository user,
			ProfileRepository mentRepo, PasswordEncoder encoder) {

		User admin = user.save(new User("admin", "user", "admin", encoder.encode("password")));

		MentorProfile adminMent = new MentorProfile("admin", "Admin", "User", "Dover", "yes", "Next Week", 5.0, "Email",
				"1@1.com");

		mentRepo.save(adminMent);

		// skills.save(new Skills("Angular"));
		// skills.save(new Skills("C++"));
		// skills.save(new Skills("CSS"));
		// skills.save(new Skills("HTML"));
		// skills.save(new Skills("PHP"));
		// skills.save(new Skills("Ruby"));
		//

		Skills skills1 = new Skills("Angular");
		Skills skills2 = new Skills("C++");
		Skills skills3 = new Skills("CSS");
		Skills skills4 = new Skills("HTML");
		Skills skills5 = new Skills("Java");
		Skills skills6 = new Skills("JavaScript");
		Skills skills7 = new Skills("PHP");
		Skills skills8 = new Skills("Python");
		Skills skills9 = new Skills("Ruby");
		Skills skills10 = new Skills("TypeScript");

		MentorProfile ment = new MentorProfile("N0026982", "Mentor", "One", "Dover", "yes", "Next Week", 5.0, "Email",
				"1@1.com");

		MentorProfile ment2 = new MentorProfile("N2222222", "Mentor", "Two", "Portsmouth", "yes", "Next Two Weeks",
				10.0, "Phone", "222-222-2222");

		MentorProfile ment3 = new MentorProfile("N3333333", "Mentor", "Three", "Indianpolis", "no", "", 0.0, "Phone",
				"333-333-3333");

		MentorProfile ment4 = new MentorProfile("N4444444", "Mentor", "Four", "Seattle", "yes", "One Month or More",
				10.0, "Email", "4@4.com");

		MentorProfile ment5 = new MentorProfile("N5555555", "Mentor", "Five", "Fairfield", "yes", "Next Three Weeks",
				15.0, "Skype", "use lync");

		skills.save(skills1);
		skills.save(skills2);
		skills.save(skills3);
		skills.save(skills4);
		skills.save(skills5);
		skills.save(skills6);
		skills.save(skills7);
		skills.save(skills8);
		skills.save(skills9);
		skills.save(skills10);

		List<Skills> skillsSir = new ArrayList<Skills>();
		List<Skills> skillTwo = new ArrayList<Skills>();
		List<Skills> skillThree = new ArrayList<Skills>();
		List<Skills> skillFour = new ArrayList<Skills>();
		List<Skills> skillFive = new ArrayList<Skills>();

		skillsSir.add(skills2);
		skillTwo.add(skills1);
		skillTwo.add(skills2);
		skillTwo.add(skills3);
		skillTwo.add(skills5);
		skillThree.add(skills3);
		skillThree.add(skills4);
		skillThree.add(skills5);
		skillThree.add(skills6);
		skillFour.add(skills5);
		skillFour.add(skills6);
		skillFour.add(skills7);
		skillFour.add(skills8);
		skillFour.add(skills10);
		skillFive.add(skills3);
		skillFive.add(skills9);
		skillFive.add(skills10);

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