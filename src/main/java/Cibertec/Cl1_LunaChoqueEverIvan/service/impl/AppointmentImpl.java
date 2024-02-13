package Cibertec.Cl1_LunaChoqueEverIvan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Appointment;
import Cibertec.Cl1_LunaChoqueEverIvan.repo.AppointmentRepo;
import Cibertec.Cl1_LunaChoqueEverIvan.service.AppointmentService;

@Service
public class AppointmentImpl implements AppointmentService{
	
	@Autowired
	AppointmentRepo appointmentRepo;

	@Override
	public List<Appointment> list() {
		return appointmentRepo.findAll();
	}

	@Override
	public Appointment add(Appointment a) {
		return appointmentRepo.save(a);
	}

	@Override
	public Appointment update(Appointment a) {
		return appointmentRepo.save(a);
	}

	@Override
	public void delete(int id) {
		appointmentRepo.deleteById(id);
	}

}
