package com.lmig.gfc.TechEducationProject.ApiControllers;




import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.TechEducationProject.models.RequestForm;
import com.lmig.gfc.TechEducationProject.models.Skills;
import com.lmig.gfc.TechEducationProject.repositories.RequestRepository;
import com.lmig.gfc.TechEducationProject.repositories.skillsRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/submit-request")
public class RequestController {
	
	
	private RequestRepository requestRepo;

	public RequestController(RequestRepository request) {
		this.requestRepo = request;

	}

	
	@PostMapping("")
	@ResponseStatus(code=HttpStatus.CREATED)
	public RequestForm createActor(@RequestBody RequestForm request) {
		
		return requestRepo.save(request);

	}

}
