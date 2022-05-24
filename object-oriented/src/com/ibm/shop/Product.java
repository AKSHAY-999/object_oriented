package com.ibm.shop;

public class Product {
	private String name;
	private double price;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(String name,double price) {
		this.name=name;
		this.price=price;
	}
	
	public double getPrice() {
		return price;
	}
	public void description() {
		System.out.println("Product: "+ name+"\tPrice: "+price);
	}

}