package com.flowers.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flowers.app.entity.Flower;
import com.flowers.app.service.FlowerService;

@RestController
@CrossOrigin("*")
public class FlowerController {

	@Autowired
	FlowerService flSer;
	
	
	@PostMapping("/flowers/app/add/new")
	public String addNewFlower(@RequestBody Flower flower) {
		return flSer.saveNewFlower(flower);
	}
	

	@PostMapping("/flowers/app/add/all")
	public String addAllFlowers(@RequestBody List<Flower> flowerList) {
		return flSer.saveAllFlowers(flowerList);
	}
	
	@GetMapping("/flowers/app/get/all")
	public List<Flower> getAllFlowers() {
		return flSer.getAllFlowers();
	}
	
	@GetMapping("/flowers/app/get/one")
	public Flower getOneFlower(@RequestParam String flowerName) {
		return flSer.getFlower(flowerName);
	}
	
	@PutMapping("/flowers/app/update/one")
	public String updateFlower(@RequestBody Flower flower) {
		return flSer.updateFlower(flower);
	}
	
	@DeleteMapping("/flowers/app/delete/one")
	public String deleteOneFlower(@RequestParam String flowerName) {
		return flSer.deleteFlower(flowerName);
	}
	
	
	
	
	
}
