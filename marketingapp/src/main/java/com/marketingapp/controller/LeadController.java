package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.entity.Lead;
import com.marketingapp.service.LeadService;
import com.marketingapp.util.EmailService;



@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private EmailService emailService;

	
	@RequestMapping("/newReg")
	public String newReg() {
		return "newReg";
	}
	
	@RequestMapping("/saveReg")
	public String saveReg(Lead lead,Model model) {
		leadService.saveReg(lead);
		emailService.sendMessage(lead.getEmail(), "account creation", "your account has been created");
		model.addAttribute("msg","record saved");
		return "newReg";
	}
	
	
	@RequestMapping("/listall")
	public String getAllLeads(Model model) {
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads",leads);
		return "listall";
	}
	
	@RequestMapping("/delete")
	public String deleteLead(@RequestParam("id") long id, Model model) {
		leadService.deleteLead(id);
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads",leads);
		return "listall";
	}
	
	@RequestMapping("/update")
	public String updateLead(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.getOneLead(id);
		model.addAttribute("lead",lead);
		return "update";
	}
	
	@RequestMapping("/saveUpdatedLead")
	public String saveUpdatedLead(Lead lead, Model model) {
		leadService.saveReg(lead);
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads",leads);
		return "listall";
	}
	
}


