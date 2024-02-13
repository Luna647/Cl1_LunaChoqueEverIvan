package Cibertec.Cl1_LunaChoqueEverIvan.service;

import java.util.List;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Staff;

public interface StaffService {
	
	public List<Staff> list(); 
	public Staff add(Staff s);
	public Staff update(Staff s);
	public void delete(int id);

}
