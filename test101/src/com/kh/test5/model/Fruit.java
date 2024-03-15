package com.kh.test5.model;

public class Fruit {
	private String name;
	private String color;
	
	public Fruit() {}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + "]";
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Fruit(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	
	
}
