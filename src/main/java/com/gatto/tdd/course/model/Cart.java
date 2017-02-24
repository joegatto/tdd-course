package com.gatto.tdd.course.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {

    private List<Product> products;

    public Cart() {
        products = new ArrayList<Product>();
    }

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return Collections.unmodifiableList(products);
    }

    public double highPrice() {
        if (this.getProducts().size() == 0)
            return 0;
        double higher = this.getProducts().get(0).getTotal();
        for (Product product : this.getProducts()) {
            if (higher < product.getTotal()) {
                higher = product.getTotal();
            }
        }
        return higher;
    }

}
