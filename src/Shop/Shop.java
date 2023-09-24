package Shop;

import java.util.*;

public class Shop {

    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }


    // Геттеры, сеттеры:
    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }



}
