package Cibertec.Cl1_LunaChoqueEverIvan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Invoice;
import Cibertec.Cl1_LunaChoqueEverIvan.repo.InvoiceRepo;
import Cibertec.Cl1_LunaChoqueEverIvan.service.InvoiceService;

@Service
public class InvoiceImpl implements InvoiceService{

	@Autowired
	InvoiceRepo invoiceRepo;
	
	@Override
	public List<Invoice> list() {
		return invoiceRepo.findAll();
	}

	@Override
	public Invoice add(Invoice i) {
		return invoiceRepo.save(i);
	}

	@Override
	public Invoice update(Invoice i) {
		return invoiceRepo.save(i);
	}

	@Override
	public void delete(int id) {
		invoiceRepo.deleteById(id);
	}

}
