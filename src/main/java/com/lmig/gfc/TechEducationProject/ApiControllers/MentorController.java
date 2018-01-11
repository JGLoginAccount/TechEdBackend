package com.lmig.gfc.TechEducationProject.ApiControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.TechEducationProject.models.MentorProfile;
import com.lmig.gfc.TechEducationProject.repositories.ProfileRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/mentor")
public class MentorController {

	@Autowired
	private ProfileRepository profileRepo;

	public MentorController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("{id}")
	@CrossOrigin(origins = "*")
	public MentorProfile getAll(@PathVariable long id) {

		return profileRepo.findOne(id);

	}

	@PutMapping("{id}")
	@CrossOrigin(origins = "*")
	public MentorProfile updateProfile(@RequestBody MentorProfile profile, @PathVariable long id) {

		profile.setId(id);

		return profileRepo.save(profile);

	}
}
