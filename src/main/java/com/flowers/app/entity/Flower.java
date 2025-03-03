package com.flowers.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Flower {
	
	@Id
	String name;
	String category;
	String imgUrl;
	int price;
	public Flower() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Flower(String name, String category, String imgUrl, int price) {
		super();
		this.name = name;
		this.category = category;
		this.imgUrl = imgUrl;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Flower [name=" + name + ", category=" + category + ", imgUrl=" + imgUrl + ", price=" + price + "]";
	}
	
}
