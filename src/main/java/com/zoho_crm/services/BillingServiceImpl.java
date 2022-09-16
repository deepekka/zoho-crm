package com.zoho_crm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho_crm.entities.Billing;
import com.zoho_crm.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {

	
	@Autowired
	private BillingRepository billingRepo;
	
	@Override
	public void saveBill(Billing bill) {
		billingRepo.save(bill);
		
	}

	@Override
	public List<Billing> listBills() {
		List<Billing> list = billingRepo.findAll();
		return list;
	}

	
}
