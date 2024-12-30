package com.marketingapp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.entity.Lead;
import com.marketingapp.repository.LeadRepository;
import com.marketingapp.service.LeadService;


@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepository;
	
	
	@Override
	public void saveReg(Lead lead) {
		leadRepository.save(lead);
		
	}


	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepository.findAll();
		return leads;
	}


	@Override
	public void deleteLead(long id) {
		Lead lead = leadRepository.findById(id).get();
		
		leadRepository.delete(lead);
	}


	@Override
	public Lead getOneLead(long id) {
		Lead lead = leadRepository.findById(id).get();
		return lead;
	}

}
