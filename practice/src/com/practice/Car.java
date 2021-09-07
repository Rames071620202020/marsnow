package com.practice;

public class Car {
	public String model;
	public String vin;
	public String brand;
	public String color;
	public String price;

	public Car() {
	}

	public Car(String model, String vin, String brand, String color, String price) {
		this.model = model;
		this.vin = vin;
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void display() {
		System.out.println("Model" + model);
		System.out.println("\nVin number of this car is " + vin+".");
		System.out.println("\nBrand" + brand);
		System.out.println("\nColor of this car is " + color+".");
		System.out.println("\nPrice of this car is $ " + price);
	}

}