package com.contactDemo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.contactDemo.Bindings.Contact_Form;

@Service
public interface Contact_Service {
	
	public String savecontact(Contact_Form form);
	public List<Contact_Form> viewContacts();
	public Contact_Form editContac(Integer contactid);
	public List<Contact_Form> deleteContact(Integer contactid);
	String savecontact();

}
