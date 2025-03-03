package com.flowers.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flowers.app.entity.Flower;

public interface FlowerRepo extends JpaRepository<Flower, String> {

	public List<Flower> findByCategory(String category);
	
	
	
}
