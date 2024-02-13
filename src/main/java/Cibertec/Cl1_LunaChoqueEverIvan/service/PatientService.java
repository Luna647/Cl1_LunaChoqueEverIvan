package Cibertec.Cl1_LunaChoqueEverIvan.service;

import java.util.List;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Patient;

public interface PatientService {
	
	public List<Patient> list(); 
	public Patient add(Patient p);
	public Patient update(Patient p);
	public void delete(int id);

}
