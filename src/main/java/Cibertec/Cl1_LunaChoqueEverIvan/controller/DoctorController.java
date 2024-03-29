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

import Cibertec.Cl1_LunaChoqueEverIvan.model.Doctor;
import Cibertec.Cl1_LunaChoqueEverIvan.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	@Autowired
	DoctorService doctorService;
	
	@GetMapping
	public ResponseEntity<List<Doctor>> list(){
		
		return new ResponseEntity<>(doctorService.list(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Doctor> add(@RequestBody Doctor d) {
		return new ResponseEntity<>(doctorService.add(d), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Doctor> update(@RequestBody Doctor d) {
		return new ResponseEntity<>(doctorService.update(d), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		doctorService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
