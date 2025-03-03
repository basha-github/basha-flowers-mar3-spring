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
	
	//http://localhost:8080/flowers/app/add/new
	//Post
	/*
	 * 
	 * {

    "name":"Rose",
    "category":"fragarance",
    "price":500,
    "imgUrl":"http://ruyrur"
}
	 * 
	 */
	
	@PostMapping("/flowers/app/add/new")
	public String addNewFlower(@RequestBody Flower flower) {
		return flSer.saveNewFlower(flower);
	}
	
// http://localhost:8080/flowers/app/add/all
	/*
	 * [
    {
        "name": "ABC",
        "category": "fragarance",
        "price": 600,
        "imgUrl": "http://ruyrur"
    },
    {
        "name": "BCD",
        "category": "fragarance",
        "price": 800,
        "imgUrl": "http://ruyrur"
    },
    {
        "name": "XYZ",
        "category": "fragarance",
        "price": 600,
        "imgUrl": "http://ruyrur"
    }
]
	 */
	@PostMapping("/flowers/app/add/all")
	public String addAllFlowers(@RequestBody List<Flower> flowerList) {
		return flSer.saveAllFlowers(flowerList);
	}
	
	//http://localhost:8080/flowers/app/get/all
	
	@GetMapping("/flowers/app/get/all")
	public List<Flower> getAllFlowers() {
		return flSer.getAllFlowers();
	}
	
	@GetMapping("/flowers/app/get/byCategory")
	public List<Flower> getAllFlowersByCategory(
			@RequestParam String category) {
		return flSer.getAllFlowersBtCatgory(category);
	}
	
	
	//http://localhost:8080/flowers/app/get/one?flowerName=XYZ
	@GetMapping("/flowers/app/get/one")
	public Flower getOneFlower(@RequestParam String flowerName) {
		return flSer.getFlower(flowerName);
	}
	
	//http://localhost:8080/flowers/app/update/one
	//method--->PUT
	/*
	 * {
    "name": "XYZ",
    "category": "Decorative",
    "imgUrl": "http://jasmine",
    "price": 1200
}
	 * 
	 * 
	 */
	@PutMapping("/flowers/app/update/one")
	public String updateFlower(@RequestBody Flower flower) {
		return flSer.updateFlower(flower);
	}
	
	//http://localhost:8080/flowers/app/delete/one?flowerName=ABC
//method--->DELETE
	
	@DeleteMapping("/flowers/app/delete/one")
	public String deleteOneFlower(@RequestParam String flowerName) {
		return flSer.deleteFlower(flowerName);
	}
	
	
	
	
	
}
