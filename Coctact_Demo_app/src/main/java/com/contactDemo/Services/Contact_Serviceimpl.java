package com.contactDemo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contactDemo.Bindings.Contact_Form;
import com.contactDemo.Repository.ContactRepository;
@Service
public class Contact_Serviceimpl implements Contact_Service {
    
	@Autowired
	private ContactRepository repo;
	@Override
	public String savecontact(Contact_Form form) {
		      
		return null;
	}

	@Override
	public List<Contact_Form> viewContacts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contact_Form editContac(Integer contactid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contact_Form> deleteContact(Integer contactid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String savecontact() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
