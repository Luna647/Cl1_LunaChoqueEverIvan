package Cibertec.Cl1_LunaChoqueEverIvan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Department;
import Cibertec.Cl1_LunaChoqueEverIvan.repo.DepartmentRepo;
import Cibertec.Cl1_LunaChoqueEverIvan.service.DepartmentService;

@Service
public class DepartmentImpl implements DepartmentService{

	@Autowired
	DepartmentRepo departmentRepo;
	
	@Override
	public List<Department> list() {
		return departmentRepo.findAll();
	}

	@Override
	public Department add(Department de) {
		return departmentRepo.save(de);
	}

	@Override
	public Department update(Department de) {
		return departmentRepo.save(de);
	}

	@Override
	public void delete(int id) {
		departmentRepo.deleteById(id);
	}

}
