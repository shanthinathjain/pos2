package com.cruds.pos.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class FoodBean {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name= "food_id")
	private String foodId;
	
	@Column(nullable=false, length=255)
	private String name;
	
	@Column(nullable = false)
	private String type;
	
	@Column(nullable = false)
	private String foodSize;
	
	@Column(nullable = false)
	private int quantity;
	
	@Column(nullable = false)
	private double price;

	public FoodBean() {	}

	public FoodBean(String foodId, String name, String type, String foodSize, int quantity, double price) {
		super();
		this.foodId = foodId;
		this.name = name;
		this.type = type;
		this.foodSize = foodSize;
		this.quantity = quantity;
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFoodId() {
		return foodId;
	}

	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFoodSize() {
		return foodSize;
	}

	public void setFoodSize(String foodSize) {
		this.foodSize = foodSize;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodBean [id=" + id + ", foodId=" + foodId + ", name=" + name + ", type=" + type + ", foodSize="
				+ foodSize + ", quantity=" + quantity + ", price=" + price + "]";
	}

	
}
