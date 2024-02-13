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

import Cibertec.Cl1_LunaChoqueEverIvan.model.Department;
import Cibertec.Cl1_LunaChoqueEverIvan.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;  
	
	@GetMapping
	public ResponseEntity<List<Department>> list(){
		
		return new ResponseEntity<>(departmentService.list(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Department> add(@RequestBody Department de) {
		return new ResponseEntity<>(departmentService.add(de), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Department> update(@RequestBody Department de) {
		return new ResponseEntity<>(departmentService.update(de), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		departmentService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
