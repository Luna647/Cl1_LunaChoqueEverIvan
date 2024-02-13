package Cibertec.Cl1_LunaChoqueEverIvan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Cibertec.Cl1_LunaChoqueEverIvan.model.Room;
import Cibertec.Cl1_LunaChoqueEverIvan.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {
	
	@Autowired
	RoomService roomService;
	
	@GetMapping
	public ResponseEntity<List<Room>> list(){
		
		return new ResponseEntity<>(roomService.list(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Room> add(@RequestBody Room r) {
		return new ResponseEntity<>(roomService.add(r), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Room> update(@RequestBody Room r) {
		return new ResponseEntity<>(roomService.update(r), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		roomService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
