# Spring Boot Rest Api JPA
 Straight Forward implementation of Rest Api using Spring boot JPA
 
 This Api is designed based on a Patient Database scenario.
 
 # Setup
 1. install STS(Spring Tool Suite)
 2. install xampp/any other to run mysql
 3. create db named "restdb" and password should be null and user mus "root"
 
  # Access api
 
 Get All Data
 http://localhost:8080/patients
 
 Get specific patient by id
 http://localhost:8080/patient/1
 
 Get specific patient by email
 http://localhost:8080/patient_email/nomail@gmail.com
 
 Add Patient information ( send body data)
 http://localhost:8080/patient/add
 
 Update Patient information ( send body data with id)
 http://localhost:8080/patient/update
 
