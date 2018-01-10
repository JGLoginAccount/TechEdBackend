package com.lmig.gfc.TechEducationProject.config;

import org.springframework.context.annotation.Configuration;

import com.lmig.gfc.TechEducationProject.models.MentorProfile;
import com.lmig.gfc.TechEducationProject.models.Skills;
import com.lmig.gfc.TechEducationProject.models.User;
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

		user.save(new User("N0211099", "Griswold", "Jenny", "Boston", "Claims", "Personal"));

		user.save(new User("N0026982", "Smith", "James", "Indianapolis", "Claims", "Personal"));

		user.save(new User("N2266445", "Jackson", "Michael", "Seattle", "Sales", "Commercial"));

		user.save(new User("N0012654", "Jamison", "Kevin", "Dover", "Claims", "Commercial"));

		user.save(new User("N0003999", "Keach", "Stacey", "San Diego", "Sales", "Commercial"));

		user.save(new User("N3692089", "Shepherd", "Krista", "Mishawaka", "Sales", "Personal"));

		user.save(new User("N2266445", "Harrison", "Lori", "Mishawaka", "Claims", "Commercial"));

		User user2 = new User("N0026982", "Smith", "James", "Indianapolis", "Claims", "Personal");

		user.save(user2);

		MentorProfile ment = new MentorProfile("N0026982", "monday", "Java-Intermediate", "Within One Week", "Email",
				"x@X.com", 6.0);

		ment.setUser(user2);

		mentRepo.save(ment);
	}
}