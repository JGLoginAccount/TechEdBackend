package com.lmig.gfc.TechEducationProject.ApiControllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.TechEducationProject.models.ContactMethod;
import com.lmig.gfc.TechEducationProject.models.TimeFrame;
import com.lmig.gfc.TechEducationProject.repositories.TimeFrameRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/timeFrame")

public class TimeFrameController {

	private TimeFrameRepository timeRepo;
	
	public TimeFrameController(TimeFrameRepository timeRepo) {
		this.timeRepo = timeRepo;
	}

	@GetMapping("")
	public List<TimeFrame> timeFrame() {

		List<TimeFrame> timeFrame = timeRepo.findAll();

		return timeFrame;
	}
 
}
