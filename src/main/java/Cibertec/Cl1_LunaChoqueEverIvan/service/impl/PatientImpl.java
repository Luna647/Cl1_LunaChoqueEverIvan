package Cibertec.Cl1_LunaChoqueEverIvan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Patient;
import Cibertec.Cl1_LunaChoqueEverIvan.repo.PatientRepo;
import Cibertec.Cl1_LunaChoqueEverIvan.service.PatientService;

@Service
public class PatientImpl implements PatientService{

	@Autowired
	PatientRepo patientRepo;
	
	@Override
	public List<Patient> list() {
		return patientRepo.findAll();
	}

	@Override
	public Patient add(Patient p) {
		return patientRepo.save(p);
	}

	@Override
	public Patient update(Patient p) {
		return patientRepo.save(p);
	}

	@Override
	public void delete(int id) {
		patientRepo.deleteById(id);
	}

}
