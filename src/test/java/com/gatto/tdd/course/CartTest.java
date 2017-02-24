package com.gatto.tdd.course;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.gatto.tdd.course.model.Cart;
import com.gatto.tdd.course.model.Product;

public class CartTest {

    private Cart cart;

    @Before
    public void setUp() {
        this.cart = new Cart();
    }

    @Test
    public void testValueForAnEmptyCart() {
        assertEquals(0.0, cart.highPrice(), 0.0001);
    }

    @Test
    public void testValueForAnCartWithOneProduct() {
        cart.add(new Product("Refrigerator", 1, 900.0));
        assertEquals(900.0, cart.highPrice(), 0.0001);
    }

    @Test
    public void testValueForAnCartWithManyProducts() {
        cart.add(new Product("Refrigerator", 1, 900.0));
        cart.add(new Product("Oven", 1, 1500.0));
        cart.add(new Product("Wash Machine", 1, 750.0));
        assertEquals(1500.0, cart.highPrice(), 0.0001);
    }

}
