package com.lmig.gfc.TechEducationProject.ApiControllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.TechEducationProject.models.MentorProfile;
import com.lmig.gfc.TechEducationProject.models.Request;
import com.lmig.gfc.TechEducationProject.models.Skills;
import com.lmig.gfc.TechEducationProject.repositories.ProfileRepository;
import com.lmig.gfc.TechEducationProject.repositories.RequestRepository;
import com.lmig.gfc.TechEducationProject.repositories.skillsRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/submit")
public class RequestController {

	@Autowired
	private RequestRepository requestRepo;

	@Autowired
	private skillsRepository skillRepo;

	@Autowired
	private ProfileRepository profileRepo;


	public RequestController() {
	}
	
	

	@GetMapping("{id}")
	@CrossOrigin(origins = "*")
	public List<Request> getAll(@PathVariable long id) {

		MentorProfile profile = profileRepo.findOne(id);
		
		
		ArrayList<Request> requests = new ArrayList<Request>();

	
		for (int i=0;i<requestRepo.sumofRequests(profile.getMentorNnumber());i++) {
			
			requests.add(requestRepo.findOne(requestRepo.findAllByString(profile.getMentorNnumber()).get(i)));
			
		}

		return requests;
	} 

	

	@PutMapping("request/prefill/{id}")
	@CrossOrigin(origins = "*")
	public List<MentorProfile> getAllRequests(@RequestBody Request request, @PathVariable long id) {
		
		request.setId(id);
		
		requestRepo.save(request);
		
		return profileRepo
				.findAllByMentorSkills(skillRepo.findOne(skillRepo.findOneByString(request.getMenteeSkillRequested())));
	}

	@GetMapping("request/{id}")
	@CrossOrigin(origins = "*")
	public Request UpdateRecord(@PathVariable long id) { 
		return requestRepo.findOne(id);
	}
	
	@GetMapping("requestId/{id}")
	@CrossOrigin(origins = "*")
	public int findRecord(@PathVariable long id) {
		
		
	return requestRepo.maxRequest(profileRepo.findOne(id).getMentorNnumber());
	}


	

	@GetMapping("")
	public List<Request> getAll() {
		return requestRepo.findAll();
	}

	@PostMapping("")
	@ResponseStatus(code = HttpStatus.CREATED)
	public List<MentorProfile> createRequest(@RequestBody Request request) {
		requestRepo.save(request);

		
		return profileRepo
				.findAllByMentorSkills(skillRepo.findOne(skillRepo.findOneByString(request.getMenteeSkillRequested())));

	}
		

	public RequestRepository getRequestRepo() {
		return requestRepo;
	}

	public void setRequestRepo(RequestRepository requestRepo) {
		this.requestRepo = requestRepo;
	}

}
