package com.shiva.Rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.bindings.ContactForm;
import com.shiva.services.ContactService;



@RestController
public class ContactRestController {
	
	@Autowired
	private ContactService service;
	
	@PostMapping("/save")
	public String savecontact(@RequestBody ContactForm form) {
	String status  = service.saveContact(form);
	System.out.println("Done saving");
		return status;
	}
	
	@GetMapping("/viewcontacts")
	public List<ContactForm> viewAllcontacts(){
		
		return service.viewContact();	
	}
	
	@GetMapping("/edit/{contactid}")
	public ContactForm editContact(@PathVariable Integer contactid){
		return service.editContact(contactid);
		
	}
	
	@GetMapping("/delete/{contactid}")
	public List<ContactForm> deleteContact(@PathVariable Integer contactid){
		return service.deleteContact(contactid);
	}

}
