package Cibertec.Cl1_LunaChoqueEverIvan.service;

import java.util.List;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Invoice;

public interface InvoiceService {
	
	public List<Invoice> list(); 
	public Invoice add(Invoice i);
	public Invoice update(Invoice i);
	public void delete(int id);

}
