package com.zoho_crm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho_crm.entities.Contact;
import com.zoho_crm.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactrepo;
	
	@Override
	public void saveOneContact(Contact contact) {
		contactrepo.save(contact);
		
	}

	@Override
	public List<Contact> listAllContacts() {

		List<Contact> list = contactrepo.findAll();
		return list;
	}

	@Override
	public Contact contactInfo(long id) {

		Optional<Contact> findById = contactrepo.findById(id);
		Contact contact = findById.get();
		return contact;
	}

}
