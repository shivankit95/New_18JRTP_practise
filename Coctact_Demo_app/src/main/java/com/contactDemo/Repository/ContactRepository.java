package com.contactDemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contactDemo.entity.Contact;

public interface ContactRepository extends  JpaRepository<Contact, Integer> {
	

}
