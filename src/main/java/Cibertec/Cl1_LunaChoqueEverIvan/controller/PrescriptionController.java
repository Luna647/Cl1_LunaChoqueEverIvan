package Cibertec.Cl1_LunaChoqueEverIvan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Prescription;
import Cibertec.Cl1_LunaChoqueEverIvan.projections.ReportPatientPrescription;
import Cibertec.Cl1_LunaChoqueEverIvan.service.PrescriptionService;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {
	
	@Autowired
	PrescriptionService prescriptionService;
	
	@GetMapping("/total-costs")
    public ResponseEntity<List<ReportPatientPrescription>> getTotalCosts() {
        List<ReportPatientPrescription> costs = prescriptionService.getTotalPrescriptionCosts();
        return ResponseEntity.ok(costs);
    }
	
	
	@GetMapping
	public ResponseEntity<List<Prescription>> list(){
		
		return new ResponseEntity<>(prescriptionService.list(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Prescription> add(@RequestBody Prescription pr) {
		return new ResponseEntity<>(prescriptionService.add(pr), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Prescription> update(@RequestBody Prescription pr) {
		return new ResponseEntity<>(prescriptionService.update(pr), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		prescriptionService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
