package com.zoho_crm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho_crm.entities.Lead;
import com.zoho_crm.repository.LeadRepository;

@Service
public class LeadServicesImpl implements LeadServices {

	@Autowired
	private LeadRepository leadrepo;
	
	@Override
	public void saveOnelea(Lead lead) {
		leadrepo.save(lead);
		
	}

	@Override
	public Lead getOneLeadById(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteOneLead(long id) {
		leadrepo.deleteById(id);
		
	}

	@Override
	public List<Lead> listAllLeads() {

		List<Lead> lead = leadrepo.findAll();
		return lead;
	}


}
