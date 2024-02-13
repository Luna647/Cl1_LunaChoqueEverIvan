package Cibertec.Cl1_LunaChoqueEverIvan.service;

import java.util.List;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Prescription;
import Cibertec.Cl1_LunaChoqueEverIvan.projections.ReportPatientPrescription;

public interface PrescriptionService {
	
	 List<ReportPatientPrescription> getTotalPrescriptionCosts();
	
	public List<Prescription> list(); 
	public Prescription add(Prescription pr);
	public Prescription update(Prescription pr);
	public void delete(int id);

}
