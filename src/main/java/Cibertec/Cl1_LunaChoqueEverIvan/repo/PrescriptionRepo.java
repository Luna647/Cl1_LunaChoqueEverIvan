package Cibertec.Cl1_LunaChoqueEverIvan.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Prescription;
import Cibertec.Cl1_LunaChoqueEverIvan.projections.ReportPatientPrescription;

public interface PrescriptionRepo extends JpaRepository<Prescription, Integer>{
	
	@Query("SELECT p.patient.patientId AS patientId, " +
	           "p.patient.patientFname AS name, " +
	           "p.patient.patientLname AS lastname, " +
	           "SUM(p.prescriptionCost) AS totalPrescriptionCost " +
	           "FROM Prescription p " +
	           "GROUP BY p.patient.patientId, p.patient.patientFname, p.patient.patientLname")
	    List<ReportPatientPrescription> findTotalPrescriptionCosts();

}
