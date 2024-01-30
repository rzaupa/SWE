package mvc;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final String id;
    private final List<Product> products = new ArrayList<>();

    public ShoppingCart(String id) {
        this.id = id;
    }

    public void addProduct(Product product) {
        products.add(product);
    }
}
