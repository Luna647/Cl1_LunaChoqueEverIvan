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

import Cibertec.Cl1_LunaChoqueEverIvan.model.Pharmacy;
import Cibertec.Cl1_LunaChoqueEverIvan.service.PharmacyService;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {
	
	@Autowired
	PharmacyService pharmacyService;
	
	@GetMapping
	public ResponseEntity<List<Pharmacy>> list(){
		
		return new ResponseEntity<>(pharmacyService.list(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Pharmacy> add(@RequestBody Pharmacy ph) {
		return new ResponseEntity<>(pharmacyService.add(ph), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Pharmacy> update(@RequestBody Pharmacy ph) {
		return new ResponseEntity<>(pharmacyService.update(ph), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		pharmacyService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
