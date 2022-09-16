package com.zoho_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho_crm.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
