package com.zoho_crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho_crm.entities.Contact;
import com.zoho_crm.services.ContactService;

@Controller
public class ContactController {


	@Autowired
	private ContactService contactService;
	
	@RequestMapping("listAllContacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactService.listAllContacts();
		model.addAttribute("contacts", contacts);
		return"view_Contacts";
	}
	
	@RequestMapping("contactInfo")
	public String contactInfo(@RequestParam("id")long id,ModelMap model) {
		Contact contactInfo = contactService.contactInfo(id);
		model.addAttribute("contactInfo", contactInfo);
		return"Contact_Info";
	}
}
