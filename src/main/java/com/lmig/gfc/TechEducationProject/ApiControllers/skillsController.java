package com.lmig.gfc.TechEducationProject.ApiControllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.TechEducationProject.models.Skills;
import com.lmig.gfc.TechEducationProject.repositories.skillsRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/skills")
public class skillsController {

	private skillsRepository skillR;

	public skillsController(skillsRepository skillR) {
		this.skillR = skillR;

	}

	@GetMapping("")
	public List<Skills> getSkills() {

		List<Skills> skills = skillR.findAll();

		return skills;

	}

	@PostMapping("/remove")
	public void removeSkill(Long id) {

		skillR.delete(id);

	}

	@PostMapping("/add")
	public void addSkill(@RequestBody Skills skill) {

		skillR.save(skill);

	}

}