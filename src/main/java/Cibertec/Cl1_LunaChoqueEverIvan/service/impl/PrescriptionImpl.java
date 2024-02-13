package Cibertec.Cl1_LunaChoqueEverIvan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Prescription;
import Cibertec.Cl1_LunaChoqueEverIvan.projections.ReportPatientPrescription;
import Cibertec.Cl1_LunaChoqueEverIvan.repo.PrescriptionRepo;
import Cibertec.Cl1_LunaChoqueEverIvan.service.PrescriptionService;

@Service
public class PrescriptionImpl implements PrescriptionService{

	@Autowired
	PrescriptionRepo prescriptionRepo;
	
	@Override
	public List<Prescription> list() {
		return prescriptionRepo.findAll();
	}

	@Override
	public Prescription add(Prescription pr) {
		return prescriptionRepo.save(pr);
	}

	@Override
	public Prescription update(Prescription pr) {
		return prescriptionRepo.save(pr);
	}

	@Override
	public void delete(int id) {
		prescriptionRepo.deleteById(id);
	}

	@Override
	public List<ReportPatientPrescription> getTotalPrescriptionCosts() {
		return prescriptionRepo.findTotalPrescriptionCosts();
	}

	

}
