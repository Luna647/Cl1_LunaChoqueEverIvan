package Cibertec.Cl1_LunaChoqueEverIvan.service;

import java.util.List;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Hospital;

public interface HospitalService {
	
	public List<Hospital> list(); 
	public Hospital add(Hospital h);
	public Hospital update(Hospital h);
	public void delete(int id);

}
