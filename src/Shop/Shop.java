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

    // Метод должен вернуть отсортированный по возрастанию по цене список продуктов
    public List<Product> sortProductsByPrice() {
        // Допишите реализацию метода самостоятельно
        List<Product> sortedProducts = products;

        Comparator<Product> cost = Comparator.comparing(Product::getCost);
        sortedProducts.sort(cost);

        return sortedProducts;
    }

    // Метод должен вернуть самый дорогой продукт
    public Product getMostExpensiveProduct() {
        // Допишите реализацию метода самостоятельно
        return products.stream().max(Comparator.comparing(Product::getCost)).orElseThrow(NoSuchElementException::new);
    }

}
