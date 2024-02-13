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

import Cibertec.Cl1_LunaChoqueEverIvan.model.Hospital;
import Cibertec.Cl1_LunaChoqueEverIvan.service.HospitalService;

@RestController
@RequestMapping("/hospital")
public class HospitalController {
	
	@Autowired
	HospitalService hospitalService;
	
	@GetMapping
	public ResponseEntity<List<Hospital>> list(){
		
		return new ResponseEntity<>(hospitalService.list(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Hospital> add(@RequestBody Hospital h) {
		return new ResponseEntity<>(hospitalService.add(h), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Hospital> update(@RequestBody Hospital h) {
		return new ResponseEntity<>(hospitalService.update(h), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		hospitalService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
