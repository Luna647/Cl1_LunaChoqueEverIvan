package Cibertec.Cl1_LunaChoqueEverIvan.service;

import java.util.List;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Room;

public interface RoomService {
	
	public List<Room> list(); 
	public Room add(Room r);
	public Room update(Room r);
	public void delete(int id);

}
