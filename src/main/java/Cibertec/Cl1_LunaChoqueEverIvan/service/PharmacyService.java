package Cibertec.Cl1_LunaChoqueEverIvan.service;

import java.util.List;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Pharmacy;

public interface PharmacyService {
	
	public List<Pharmacy> list(); 
	public Pharmacy add(Pharmacy ph);
	public Pharmacy update(Pharmacy ph);
	public void delete(int id);

}
