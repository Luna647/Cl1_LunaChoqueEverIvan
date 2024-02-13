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

import Cibertec.Cl1_LunaChoqueEverIvan.model.Invoice;
import Cibertec.Cl1_LunaChoqueEverIvan.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
	
	@Autowired
	InvoiceService invoiceService;
	
	@GetMapping
	public ResponseEntity<List<Invoice>> list(){
		
		return new ResponseEntity<>(invoiceService.list(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Invoice> add(@RequestBody Invoice i) {
		return new ResponseEntity<>(invoiceService.add(i), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Invoice> update(@RequestBody Invoice i) {
		return new ResponseEntity<>(invoiceService.update(i), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		invoiceService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
