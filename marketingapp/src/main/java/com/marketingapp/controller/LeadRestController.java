package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketingapp.entity.Lead;
import com.marketingapp.service.LeadService;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {
	
	
	@Autowired
	private LeadService leadService;
	
	
	@GetMapping
	public ResponseEntity<List<Lead>> getAllLeads() {
		List<Lead> leads = leadService.getAllLeads();
		return new ResponseEntity<>(leads, HttpStatus.OK);
	}
	
	@GetMapping("/{leadId}")
	public ResponseEntity<Lead> getOneLead(@PathVariable("leadId") long leadId) {
		Lead lead = leadService.getOneLead(leadId);
		return new ResponseEntity<>(lead, HttpStatus.OK);
	}

}
