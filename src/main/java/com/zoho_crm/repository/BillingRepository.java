package com.zoho_crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zoho_crm.entities.Billing;

public interface BillingRepository extends JpaRepository<Billing, Long> {

}
