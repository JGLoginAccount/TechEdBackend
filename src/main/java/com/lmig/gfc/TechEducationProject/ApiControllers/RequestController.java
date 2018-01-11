package com.lmig.gfc.TechEducationProject.ApiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.TechEducationProject.models.Request;
import com.lmig.gfc.TechEducationProject.repositories.RequestRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/submit")
public class RequestController {

	@Autowired
	private RequestRepository requestRepo;

	public RequestController() {
	}

	@GetMapping("")
	public List<Request> getAll(@RequestBody Request request) {
		return requestRepo.getResults(request.getMenteeSkillRequested());
	}

	@PostMapping("")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Request createRequest(@RequestBody Request request) {
		return requestRepo.save(request);
	}

}
