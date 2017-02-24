package com.gatto.tdd.course;

import org.junit.Assert;
import org.junit.Test;

import com.gatto.tdd.course.model.Cart;
import com.gatto.tdd.course.model.Product;

public class HighestLowestTest {

	@Test
	public void testCarInDescOrder() {
		Cart cart = new Cart();
		cart.add(new Product("Refrigerator", 450.0));
		cart.add(new Product("Blender", 250.0));
		cart.add(new Product("Dish Set", 70.0));
		HighestLowest hl = new HighestLowest();
		hl.find(cart);
		Assert.assertEquals("Dish Set", hl.getLowest().getDescription());
		Assert.assertEquals("Refrigerator", hl.getHighest().getDescription());
	}

	@Test
	public void apenasUmProduto() {
		Cart cart = new Cart();
		cart.add(new Product("Refrigerator", 450.0));
		HighestLowest hl = new HighestLowest();
		hl.find(cart);
		Assert.assertEquals("Refrigerator", hl.getLowest().getDescription());
		Assert.assertEquals("Refrigerator", hl.getHighest().getDescription());
	}

}
