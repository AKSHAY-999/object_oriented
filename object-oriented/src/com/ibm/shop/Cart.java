package com.ibm.shop;

import java.util.ArrayList;

public class Cart {
	private double total;
	private ArrayList<Product> products;
//	private int idx;
	public Cart() {
		// TODO Auto-generated constructor stub
		products=new ArrayList<Product>();
	}
	
	public void addToCart(Product p) {
//		products[idx]=p;
//		idx++;
		products.add(p);
		total+=p.getPrice();
		System.out.println("Product added to cart");
		
	}
	public void checkout() {
		System.out.println("Your shopping Cart  ");
		for (Product p :products) {
//			products[i].description();
			p.description();
		}
		System.out.println("cart total: "+total);
	}

}
