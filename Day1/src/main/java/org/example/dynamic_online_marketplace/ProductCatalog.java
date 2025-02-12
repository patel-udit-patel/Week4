package org.example.dynamic_online_marketplace;
import java.util.ArrayList;
import java.util.List;

// Product Catalog
class ProductCatalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<?> product : products) {
            System.out.println(product);
        }
    }
}
