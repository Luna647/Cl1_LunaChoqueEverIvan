package Cibertec.Cl1_LunaChoqueEverIvan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Pharmacy;
import Cibertec.Cl1_LunaChoqueEverIvan.repo.PharmacyRepo;
import Cibertec.Cl1_LunaChoqueEverIvan.service.PharmacyService;

@Service
public class PharmacyImpl implements PharmacyService{

	@Autowired
	PharmacyRepo pharmacyRepo;
	
	@Override
	public List<Pharmacy> list() {
		return pharmacyRepo.findAll();
	}

	@Override
	public Pharmacy add(Pharmacy ph) {
		return pharmacyRepo.save(ph);
	}

	@Override
	public Pharmacy update(Pharmacy ph) {
		return pharmacyRepo.save(ph);
	}

	@Override
	public void delete(int id) {
		pharmacyRepo.deleteById(id);
	}

}
