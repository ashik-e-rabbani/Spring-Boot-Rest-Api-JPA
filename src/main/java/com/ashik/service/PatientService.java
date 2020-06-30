package com.ashik.service;
import java.util.List;
import java.util.Optional;

import com.ashik.model.Patient;

public interface PatientService {
	
	void addPatient(Patient patient);
	void updatePatient(Patient patient);
	void deletePatient(int id);
	Optional<Patient> getPatient(int id);
	Optional<Patient> getPatientByEmail(String email);
	List<Patient> getAllPatient();
	Boolean existsByPatientEmail(String patientEmail);

	
	

}
