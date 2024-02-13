package Cibertec.Cl1_LunaChoqueEverIvan.service;

import java.util.List;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Doctor;

public interface DoctorService {
	
	public List<Doctor> list(); 
	public Doctor add(Doctor d);
	public Doctor update(Doctor d);
	public void delete(int id);

}
