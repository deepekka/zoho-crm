package com.zoho_crm.services;

import java.util.List;

import com.zoho_crm.entities.Billing;

public interface BillingService {

	public void saveBill(Billing bill);

	public List<Billing> listBills();

}
