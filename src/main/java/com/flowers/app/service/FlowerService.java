package com.flowers.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flowers.app.entity.Flower;
import com.flowers.app.repo.FlowerRepo;

@Service
public class FlowerService {
	
	@Autowired
	FlowerRepo flRepo;
	

	public String saveNewFlower(Flower flower) {
		String res = "";
		try {
			flRepo.save(flower);
			res = "successfully added new flower";
		}catch(Exception e) {
			res = "not able to  add new flower";
			
		}
		
		return res;
		
	}


	public String saveAllFlowers(List<Flower> flowerList) {
		

		String res = "";
		try {
			flRepo.saveAll(flowerList);
			res = "successfully added All flowers";
		}catch(Exception e) {
			res = "not able to  add All flowers";
			
		}
		
		return res;
		
	
	}


	public List<Flower> getAllFlowers() {
		return flRepo.findAll();
	}


	public Flower getFlower(String flowerName) {
		return flRepo.findById(flowerName).get();
	}


	public String updateFlower(Flower flower) {
		String res = "";
		try {
			flRepo.save(flower);
			res = "successfully updated  flower";
		}catch(Exception e) {
			res = "not able to  update  flower";
			
		}
		
		return res;
		
	}


	public String deleteFlower(String flowerName) {
		String res = "";
		try {
			flRepo.deleteById(flowerName);
			res = "successfully deleted  flower";
		}catch(Exception e) {
			res = "not able to  deleted  flower";
			
		}
		
		return res;
		
	}


	public List<Flower> getAllFlowersBtCatgory(String category) {
		
		
		return flRepo.findByCategory(category);
	}

}
