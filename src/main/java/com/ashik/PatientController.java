package com.ashik;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ashik.model.Patient;
import com.ashik.repository.PatientRepository;
import com.ashik.service.PatientService;

@RestController
public class PatientController {

//	call service class from controller and service will call repository.
	
	@Autowired
	PatientService patientService;

	
	
	@GetMapping(value="/")
	public String test() {
		return "Welcome to Ashik's Rest API";
		
		
	}
	
	@GetMapping(value="/patients")
	public List<Patient> getAllPatients() {

		
		return patientService.getAllPatient();
		
		
	}
	
	@PostMapping("/patient/add")
	public String addPatient(@RequestBody Patient patient)
	
	{		
		Boolean existance = patientService.existsByPatientEmail(patient.getPatientEmail());
		
		if(existance == true)
		{
			return "User already exist";
			
		}else {
			
			patientService.addPatient(patient);
			return "Success";
		}
			
	}
	

	
	@PutMapping(value="/patient/update")
	public void updatePatient(@RequestBody Patient patient)
	{
		patientService.updatePatient(patient);
		
	}
	
	@DeleteMapping(value="/patient/release/{id}")
	public void deletePatient(@PathVariable int id)
	{
		patientService.deletePatient(id);
		
	}
	
	
	@GetMapping(value="/patient/{id}")
	public Optional<Patient> getPatient(@PathVariable int id)
	{
		return patientService.getPatient(id);
		
	}
	
	@GetMapping(value="/patient_email/{email}")
	public Optional<Patient> getPatientByEmail(@PathVariable String email)
	{
		return patientService.getPatientByEmail(email);
		
	}
}