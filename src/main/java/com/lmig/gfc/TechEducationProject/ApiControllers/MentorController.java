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
import com.lmig.gfc.TechEducationProject.models.Skills;
import com.lmig.gfc.TechEducationProject.repositories.MentorSkillsRepository;
import com.lmig.gfc.TechEducationProject.repositories.ProfileRepository;
import com.lmig.gfc.TechEducationProject.repositories.skillsRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/mentor")
public class MentorController {

	@Autowired
	private ProfileRepository profileRepo;
	@Autowired
	private MentorSkillsRepository mentorSkillsRepo;
	@Autowired
	private skillsRepository skillRepo;

	public MentorController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("{id}")
	@CrossOrigin(origins = "*")
	public List<MentorProfile> getAll(@PathVariable long id) {

		ArrayList<MentorProfile> mentorProfile = new ArrayList<MentorProfile>();

		mentorProfile.add(profileRepo.findOne(id));

		return mentorProfile;
	}

	@GetMapping("")
	public List<MentorProfile> getAll() {
		return profileRepo.findAll();
	}

	@PutMapping("{id}")
	@CrossOrigin(origins = "*")
	public MentorProfile updateProfile(@RequestBody MentorProfile profile, @PathVariable long id) {

		profile.setId(id);

		return profileRepo.save(profile);

	}

	@PutMapping("skills/{id}")
	@CrossOrigin(origins = "*")
	public MentorProfile UpdateSkills(@RequestBody String[] skills, @PathVariable long id) {

		MentorProfile profile = profileRepo.findOne(id);

		List<Skills> skillList = new ArrayList<Skills>();

		for (int i = 0; i < skills.length; i = i + 1) {

			Skills skill = new Skills();

			skill.setId(skillRepo.findOneByString(skills[i]));

			skill.setSkills(skills[i]);

			skillList.add(skill);
		}

		profile.setMentorSkills(skillList);
		return profileRepo.save(profile);

	}

}
