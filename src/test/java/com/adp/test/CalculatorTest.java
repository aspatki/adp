package com.adp.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.adp.model.CategoryA;
import com.adp.model.CategoryB;
import com.adp.model.CategoryC;
import com.adp.model.Item;
import com.adp.utils.Calculator;

@RunWith(MockitoJUnitRunner.class)
public class CalculatorTest {

	
	List<Item> items = new ArrayList<Item>();
	
	@Before
    public void init() {
       
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

		
    }
	
	@Test
	public void testCalculateSalesTax() {

		// CategoryA
		Calculator calc = new Calculator();
		float salesTax = calc.calculateSalesTax(items.get(0));
		assertTrue(salesTax == 100.0);
		
		//CategoryB
		salesTax = calc.calculateSalesTax(items.get(1));
		assertTrue(salesTax == 20.0);
		
		
		// CategoryC
		salesTax = calc.calculateSalesTax(items.get(2));
		assertTrue(salesTax == 0.0);
		
	}
	@Test
	public void testcalculateTotalValue() {

		// CategoryA
		Calculator calc = new Calculator();
		float total = calc.calculateTotalValue(items.get(0));
		assertTrue(total == 1100.0);
		
		
		// CategoryB
		
		total = calc.calculateTotalValue(items.get(1));
		assertTrue(total == 120.0);
		
		// CategoryC
		
		total = calc.calculateTotalValue(items.get(2));
		assertTrue(total == 200.0);
		
		
		
		
		
		
	}
	

}
