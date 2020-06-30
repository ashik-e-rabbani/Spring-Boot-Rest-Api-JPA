package com.ashik.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashik.model.Patient;
import com.ashik.repository.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepository patientRepository;
	
	@Override
	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		
		Boolean existance = patientRepository.existsByPatientEmail(patient.getPatientEmail());
		
		if(existance == true)
		{
			
		}else {
			patientRepository.save(patient);
			
		}
			
		
	}

	@Override
	public void updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		
		patientRepository.save(patient);
		
		
		
	}


	@Override
	public Optional<Patient> getPatient(int id) {
		// TODO Auto-generated method stub
		return patientRepository.findById(id);
	}

	@Override
	public List<Patient> getAllPatient() {
		// TODO Auto-generated method stub
		
		List<Patient> patients = new ArrayList<>();
		// use built in method to get all data from db
//		forEach diye List e convert korlam
		
		patientRepository.findAll().forEach(patients::add);
		
		return patients;
	}

	@Override
	public Optional<Patient> getPatientByEmail(String email) {
		// TODO Auto-generated method stub
		return patientRepository.findByPatientEmail(email);
	}

	@Override
	public Boolean existsByPatientEmail(String patientEmail) {
		// TODO Auto-generated method stub
		return patientRepository.existsByPatientEmail(patientEmail);
	}

	@Override
	public void deletePatient(int id) {
		// TODO Auto-generated method stub
		
		patientRepository.deleteById(id);
		
	}

}
