package com.lmig.gfc.TechEducationProject.ApiControllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.TechEducationProject.models.MentorProfile;
import com.lmig.gfc.TechEducationProject.models.MentorSkills;
import com.lmig.gfc.TechEducationProject.repositories.MentorSkillsRepository;
import com.lmig.gfc.TechEducationProject.repositories.ProfileRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/mentor")
public class MentorController {

	@Autowired
	private ProfileRepository profileRepo;
	@Autowired
	private MentorSkillsRepository mentorSkillsRepo;

	public MentorController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("{id}")
	@CrossOrigin(origins = "*")
	public List<MentorProfile> getAll(@PathVariable long id) {
		
		ArrayList <MentorProfile> mentorProfile = new ArrayList <MentorProfile> ();

		mentorProfile.add(profileRepo.findOne(id));
		
		return mentorProfile;

	}

	@PutMapping("{id}")
	@CrossOrigin(origins = "*")
	public MentorProfile updateProfile(@RequestBody MentorProfile profile, @PathVariable long id) {

		profile.setId(id);

		return profileRepo.save(profile);

	}

	public ProfileRepository getProfileRepo() {
		return profileRepo;
	}

	public void setProfileRepo(ProfileRepository profileRepo) {
		this.profileRepo = profileRepo;
	}

	public MentorSkillsRepository getMentorSkillsRepo() {
		return mentorSkillsRepo;
	}

	public void setMentorSkillsRepo(MentorSkillsRepository mentorSkillsRepo) {
		this.mentorSkillsRepo = mentorSkillsRepo;
	}
}
