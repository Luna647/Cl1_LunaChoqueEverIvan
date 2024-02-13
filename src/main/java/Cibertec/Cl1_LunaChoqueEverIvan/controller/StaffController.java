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

import Cibertec.Cl1_LunaChoqueEverIvan.model.Staff;
import Cibertec.Cl1_LunaChoqueEverIvan.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffController {
	
	@Autowired
	StaffService staffService;
	
	@GetMapping
	public ResponseEntity<List<Staff>> list(){
		
		return new ResponseEntity<>(staffService.list(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Staff> add(@RequestBody Staff s) {
		return new ResponseEntity<>(staffService.add(s), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Staff> update(@RequestBody Staff s) {
		return new ResponseEntity<>(staffService.update(s), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		staffService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
