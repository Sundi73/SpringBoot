package com.springcore.beanLifeCycle;

public class Apple {
	
	private String model;
	private int price;
	
	public Apple(String model, int price) {
		super();
		this.model=model;
		this.price=price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		System.out.println("Setting model name.");
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting model price.");
		this.price = price;
	}

	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Apple [model=" + model + ", price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside the init method");
	}
	
	public void destroy() {
		System.out.println("Inside The destroy method");
	}

}
