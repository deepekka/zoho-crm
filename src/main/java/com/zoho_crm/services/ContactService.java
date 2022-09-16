package com.zoho_crm.services;

import java.util.List;

import com.zoho_crm.entities.Contact;

public interface ContactService {
	
	public void saveOneContact(Contact contact);

	public List<Contact> listAllContacts();

	public Contact contactInfo(long id);


}
