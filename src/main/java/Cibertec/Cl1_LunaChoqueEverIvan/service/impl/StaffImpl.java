package Cibertec.Cl1_LunaChoqueEverIvan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Staff;
import Cibertec.Cl1_LunaChoqueEverIvan.repo.StaffRepo;
import Cibertec.Cl1_LunaChoqueEverIvan.service.StaffService;

@Service
public class StaffImpl implements StaffService{

	@Autowired
	StaffRepo staffRepo;
	
	@Override
	public List<Staff> list() {
		return staffRepo.findAll();
	}

	@Override
	public Staff add(Staff s) {
		return staffRepo.save(s);
	}

	@Override
	public Staff update(Staff s) {
		return staffRepo.save(s);
	}

	@Override
	public void delete(int id) {
		staffRepo.deleteById(id);
	}

}
