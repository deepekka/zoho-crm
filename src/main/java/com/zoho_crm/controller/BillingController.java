package com.zoho_crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho_crm.entities.Billing;
import com.zoho_crm.entities.Contact;
import com.zoho_crm.services.BillingService;
import com.zoho_crm.services.ContactService;

@Controller
public class BillingController {
	
	@Autowired
	private BillingService billingService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/billing")
	public String billing(@RequestParam("id")long id,ModelMap model) {
		Contact contactInfo = contactService.contactInfo(id);
		model.addAttribute("contactInfo", contactInfo);
		return"Billing_Page";
	}
	
	@RequestMapping("/savebill")
	public String saveBill(@ModelAttribute("bill")Billing bill) {
		billingService.saveBill(bill);
		return"view_Bills";
	}

	@RequestMapping("/listAllBills")
	public String listAllBills(ModelMap model) {
		List<Billing> bills = billingService.listBills();
		model.addAttribute("bills", bills);
		return"view_Bills";
	}
}
