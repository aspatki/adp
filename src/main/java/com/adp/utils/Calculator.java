package com.adp.utils;

import java.util.List;

import com.adp.model.Item;

public class Calculator {

	public void calculateBill(List<Item> items) {

		float totalBillAmount = 0;
		float totalTaxAmount = 0;

		for (Item item : items) {

			totalTaxAmount += calculateSalesTax(item);
			totalBillAmount += calculateTotalValue(item);
		}

		System.out.println("Total Tax : " + totalTaxAmount + " totalBillAmount : " + totalBillAmount);
	}

	public float calculateSalesTax(Item item) {

		return (item.getPrice() * item.getQuantity() * item.getCategory().getSalesTaxRate()) / 100;
	}

	public float calculateTotalValue(Item item) {

		return item.getPrice() * item.getQuantity()
				+ ((item.getPrice() * item.getQuantity() * item.getCategory().getSalesTaxRate()) / 100);
	}
}
