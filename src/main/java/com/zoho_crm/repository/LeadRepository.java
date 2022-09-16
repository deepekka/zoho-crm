package com.zoho_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho_crm.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
