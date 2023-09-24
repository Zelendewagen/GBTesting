package Shop;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class ShopTest {


    public static void main(String[] args) {
    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
        List<Product> products = Arrays.asList(
                new Product(100, "apple"),
                new Product(500, "banana"),
                new Product(50, "water")
        );
        Shop shop = new Shop(products);

        Product most_expensive_product = products.get(1);
        List<Product> sorted_products_by_price = Arrays.asList(
                new Product(50, "water"),
                new Product(100, "apple"),
                new Product(500, "banana")
        );

        assertThat(shop.getProducts().size()).isEqualTo(sorted_products_by_price.size());

        assertThat(shop.getMostExpensiveProduct()).isEqualTo(most_expensive_product);

        System.out.println(shop.sortProductsByPrice());
        System.out.println(sorted_products_by_price);
        assertThat(shop.sortProductsByPrice()).isEqualTo(sorted_products_by_price);

    }

}