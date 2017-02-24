package com.gatto.tdd.course;

import com.gatto.tdd.course.model.Cart;
import com.gatto.tdd.course.model.Product;

public class HighestLowest {
	private Product lowest;
	private Product highest;

	public void find(Cart carrinho) {
		for (Product product : carrinho.getProducts()) {
            if (lowest == null || product.getPrice() < lowest.getPrice()) {
				lowest = product;
			}
			if (highest == null || product.getPrice() > highest.getPrice()) {
				highest = product;
			}
		}
	}

	public Product getLowest() {
		return lowest;
	}

	public Product getHighest() {
		return highest;
	}

}