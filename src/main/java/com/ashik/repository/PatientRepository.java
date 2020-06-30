package com.ashik.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ashik.model.Patient;

public interface PatientRepository extends CrudRepository<Patient, Integer>{

	Optional<Patient> findByPatientEmail(String email);

	Boolean existsByPatientEmail(String patientEmail);



}
