package com.laboratory.dao;

import java.util.List;

import com.laboratory.domain.Patient;


public interface PatientDao {

	public int savePatient(Patient patient);
	
	public boolean updatePatient(Patient patient);
	
	public Patient findLaboratoryById(int id);
	
	public List<Patient> findAllLaboratory();
	
	public boolean deletePatient(int id);
	
}
