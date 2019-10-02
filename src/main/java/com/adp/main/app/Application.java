package com.adp.main.app;

import java.util.ArrayList;
import java.util.List;

import com.adp.model.CategoryA;
import com.adp.model.CategoryB;
import com.adp.model.CategoryC;
import com.adp.model.Item;
import com.adp.utils.Calculator;

public class Application {

	public static void main(String[] args) throws Exception {
		 
		Calculator calculator = new Calculator();
		calculator.calculateBill(loadItems());
	}
	
	
	
	// This Method will provide input to calculateBill() method
	public static List<Item> loadItems() {
		
		
		List<Item> items = new ArrayList<Item>();
		
		Item i = new Item();
		i.setName("Laptop");
		i.setPrice(1000);
		i.setQuantity(1);
		i.setCategory(new CategoryA());
		
		
		Item i1 = new Item();
		i1.setName("Mouse");
		i1.setPrice(100);
		i1.setQuantity(1);
		i1.setCategory(new CategoryB());
		
		Item i2 = new Item();
		i2.setName("Keyboard");
		i2.setPrice(200);
		i2.setQuantity(1);
		i2.setCategory(new CategoryC());
		
		items.add(i);
		items.add(i1);
		items.add(i2);
		
		return items;
	}
	
	
	

}
