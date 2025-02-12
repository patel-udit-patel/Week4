package org.example.dynamic_online_marketplace;
// Main Class
public class Marketplace {
    public static void main(String[] args) {
        Product<String> book1 = new Product<>("The Alchemist", 500, "Fiction");
        Product<String> cloth1 = new Product<>("Men's Jacket", 1500, "Men's Clothing");
        Product<String> gadget1 = new Product<>("Smartphone", 20000, "Mobile Gadget");

        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book1);
        catalog.addProduct(cloth1);
        catalog.addProduct(gadget1);

        System.out.println("Before applying discount:");
        catalog.showCatalog();

        DiscountUtil.applyDiscount(book1, 10);
        DiscountUtil.applyDiscount(cloth1, 20);
        DiscountUtil.applyDiscount(gadget1, 5);

        System.out.println("\nAfter applying discount:");
        catalog.showCatalog();
    }
}
