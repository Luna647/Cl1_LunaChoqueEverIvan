package Cibertec.Cl1_LunaChoqueEverIvan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Doctor;
import Cibertec.Cl1_LunaChoqueEverIvan.repo.DoctorRepo;
import Cibertec.Cl1_LunaChoqueEverIvan.service.DoctorService;

@Service
public class DoctorImpl implements DoctorService{

	@Autowired
	DoctorRepo doctorRepo;
	
	@Override
	public List<Doctor> list() {
		return doctorRepo.findAll();
	}

	@Override
	public Doctor add(Doctor d) {
		return doctorRepo.save(d);
	}

	@Override
	public Doctor update(Doctor d) {
		return doctorRepo.save(d);
	}

	@Override
	public void delete(int id) {
		doctorRepo.deleteById(id);
	}

}
