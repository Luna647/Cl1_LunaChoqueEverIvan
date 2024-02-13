package Cibertec.Cl1_LunaChoqueEverIvan.service;

import java.util.List;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Department;

public interface DepartmentService {
	
	public List<Department> list(); 
	public Department add(Department de);
	public Department update(Department de);
	public void delete(int id);

}
