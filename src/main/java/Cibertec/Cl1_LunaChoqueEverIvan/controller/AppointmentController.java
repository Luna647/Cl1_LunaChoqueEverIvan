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

import Cibertec.Cl1_LunaChoqueEverIvan.model.Appointment;
import Cibertec.Cl1_LunaChoqueEverIvan.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentController {
	
	@Autowired
	AppointmentService appointmentService;
	
	@GetMapping
	public ResponseEntity<List<Appointment>> list(){
		
		return new ResponseEntity<>(appointmentService.list(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Appointment> add(@RequestBody Appointment a) {
		return new ResponseEntity<>(appointmentService.add(a), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Appointment> update(@RequestBody Appointment a) {
		return new ResponseEntity<>(appointmentService.update(a), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		appointmentService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
