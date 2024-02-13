package Cibertec.Cl1_LunaChoqueEverIvan.service;

import java.util.List;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Appointment;

public interface AppointmentService {
	
	public List<Appointment> list(); 
	public Appointment add(Appointment a);
	public Appointment update(Appointment a);
	public void delete(int id);

}
