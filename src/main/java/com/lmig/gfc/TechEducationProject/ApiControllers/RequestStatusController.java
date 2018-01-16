package com.lmig.gfc.TechEducationProject.ApiControllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lmig.gfc.TechEducationProject.models.RequestStatus;
import com.lmig.gfc.TechEducationProject.repositories.RequestStatusRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/requestStatus")
public class RequestStatusController {

	private RequestStatusRepository requestRepo;
	
	public RequestStatusController(RequestStatusRepository requestRepo) {
		this.requestRepo = requestRepo;
	}
	@GetMapping("")
	public List<RequestStatus> getRequestStatus() {

		List<RequestStatus> requestStatus = requestRepo.findAll();

		return requestStatus;
	}
}
