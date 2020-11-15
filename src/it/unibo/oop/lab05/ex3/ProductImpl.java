package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product{

	private String name;
	private double quantity;
	
	public ProductImpl(String name, double quantity) {
		this.name = name;	this.quantity = quantity;
	}
	
	public String getName() {
		return this.name;
	}

	public double getQuantity() {
		return this.quantity;
	}
	
	public String toString() {
		return "I'm a " + this.name + " and I'm " + (this.quantity == 0? "not available." : 
			"available in " + this.quantity + " pieces.");
	}
}
