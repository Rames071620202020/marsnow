package com.dog;

public class Dog {
	public String color;
	public String name;
	public String brid;
	public int price;

	public Dog() {

	}

	public Dog(String color, String name, String brid, int price) {
		this.color = color;
		this.name = name;
		this.brid = brid;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrid() {
		return brid;
	}

	public void setBrid(String brid) {
		this.brid = brid;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void view() {
		System.out.println("Color" + color);
		System.out.println("Name" + name);
		System.out.println("Brid" + brid);
		System.out.println("Price" + price);
	}

}