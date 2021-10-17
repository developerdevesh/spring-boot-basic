package com.springsec.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car")
public class Car {

	@Id
	@Column(name="car_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int carId;
	
	@Column(name="car_name")
	private String carName;
	
	@Column(name="price")
	private String price;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="owner")
	private String owner;

	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int carId, String carName, String price, String brand, String owner) {
		super();
		this.carId = carId;
		this.carName = carName;
		this.price = price;
		this.brand = brand;
		this.owner = owner;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carName=" + carName + ", price=" + price + ", brand=" + brand + ", owner="
				+ owner + "]";
	} 

}
