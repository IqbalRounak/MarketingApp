package com.marketingapp.service;

import java.util.List;

import com.marketingapp.entity.Lead;

public interface LeadService {

	void saveReg(Lead lead);

	List<Lead> getAllLeads();

	void deleteLead(long id);

	Lead getOneLead(long id);

}
