package com.zoho_crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho_crm.entities.Contact;
import com.zoho_crm.entities.Lead;
import com.zoho_crm.services.ContactService;
import com.zoho_crm.services.LeadServices;

@Controller
public class LeadController {

	@Autowired
	private LeadServices leadservice;
	
	@Autowired
	private ContactService contactservice;
	
	@RequestMapping("/")
	public String viewCreateLeadPage() {
		return"Create_Lead_Page";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead")Lead lead,ModelMap model) {
		
		leadservice.saveOnelea(lead);
		model.addAttribute("lead", lead);
		
		return "Lead_Info";
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id")long id,ModelMap model) {
		
		Lead lead = leadservice.getOneLeadById(id);
		
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		
		contactservice.saveOneContact(contact);
		leadservice.deleteOneLead(id);
		
		List<Contact> contacts = contactservice.listAllContacts();
		model.addAttribute("contacts", contacts);
		return"view_Contacts";
	}
	
	
	@RequestMapping("/listAll")
	public String listAllLeads(ModelMap model) {
		
		List<Lead> lead=leadservice.listAllLeads();
		model.addAttribute("leads", lead);
		
		return "view_Leads";
	}
	
	@RequestMapping("/leadInfo")
	public String leadInfo(@RequestParam("id")long id,ModelMap model) {
		
		Lead lead = leadservice.getOneLeadById(id);
		model.addAttribute("lead", lead);
		
		return "Lead_Info";
	}
}
