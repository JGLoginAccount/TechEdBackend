package com.lmig.gfc.TechEducationProject.ApiControllers;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lmig.gfc.TechEducationProject.models.ContactMethod;
import com.lmig.gfc.TechEducationProject.repositories.ContactMethodRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/contactMethod")
public class ContactMethodController {

	private ContactMethodRepository contactRepo;

	public ContactMethodController(ContactMethodRepository contactRepo) {
		this.contactRepo = contactRepo;
	}

	@GetMapping("")
	public List<ContactMethod> getContactMethod() {

		List<ContactMethod> contactMethod = contactRepo.findAll();

		return contactMethod;
	}
 

}