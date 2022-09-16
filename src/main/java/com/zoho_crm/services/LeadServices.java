package com.zoho_crm.services;

import java.util.List;

import com.zoho_crm.entities.Lead;

public interface LeadServices {
public void saveOnelea(Lead lead);

public Lead getOneLeadById(long id);

public void deleteOneLead(long id);

public List<Lead> listAllLeads();

}
