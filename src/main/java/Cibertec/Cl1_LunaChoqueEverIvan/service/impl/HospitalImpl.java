package Cibertec.Cl1_LunaChoqueEverIvan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Hospital;
import Cibertec.Cl1_LunaChoqueEverIvan.repo.HospitalRepo;
import Cibertec.Cl1_LunaChoqueEverIvan.service.HospitalService;

@Service
public class HospitalImpl implements HospitalService{

	@Autowired
	HospitalRepo hospitalRepo;
	 
	@Override
	public List<Hospital> list() {
		return hospitalRepo.findAll();
	}

	@Override
	public Hospital add(Hospital h) {
		return hospitalRepo.save(h);
	}

	@Override
	public Hospital update(Hospital h) {
		return hospitalRepo.save(h);
	}

	@Override
	public void delete(int id) {
		hospitalRepo.deleteById(id);
	}

}
