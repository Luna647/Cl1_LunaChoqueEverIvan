package Cibertec.Cl1_LunaChoqueEverIvan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Room;
import Cibertec.Cl1_LunaChoqueEverIvan.repo.RoomRepo;
import Cibertec.Cl1_LunaChoqueEverIvan.service.RoomService;

@Service
public class RoomImpl implements RoomService{

	@Autowired
	RoomRepo roomRepo;
	
	@Override
	public List<Room> list() {
		return roomRepo.findAll();
	}

	@Override
	public Room add(Room r) {
		return roomRepo.save(r);
	}

	@Override
	public Room update(Room r) {
		return roomRepo.save(r);
	}

	@Override
	public void delete(int id) {
		roomRepo.deleteById(id);
	}

}
