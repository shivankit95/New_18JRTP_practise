package com.shiva.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shiva.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
