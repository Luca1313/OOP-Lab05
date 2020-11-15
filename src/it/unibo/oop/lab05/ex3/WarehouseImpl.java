package it.unibo.oop.lab05.ex3;

import java.util.LinkedHashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse{

	Set<Product> products;
	
	public WarehouseImpl() {
		this.products = new LinkedHashSet<>();
	}
	
	public void addProduct(Product p) {
		this.products.add(p);
	}

	public Set<String> allNames() {
		Set<String> names = new LinkedHashSet<>();
		for(Product prod: this.products) {
			names.add(prod.getName());
		}
		return names;
	}

	public Set<Product> allProducts() {
		Set<Product> actualProduct = new LinkedHashSet<>();
		for(Product prod: this.products) {
			actualProduct.add(prod);
		}
		return actualProduct;
	}

	public boolean containsProduct(Product p) {
		return this.products.contains(p);
	}

	public double getQuantity(String name) {
		for(Product prod: this.products) {
			if(prod.getName() == name) {
				return prod.getQuantity();
			}
		}
		return 0;
	}

}
