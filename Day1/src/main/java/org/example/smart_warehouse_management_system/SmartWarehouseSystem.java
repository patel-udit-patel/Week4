package org.example.smart_warehouse_management_system;

// Main class to demonstrate functionality
public class SmartWarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 1200.99));
        electronicsStorage.addItem(new Electronics("Smartphone", 899.49));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple", 1.99));
        groceriesStorage.addItem(new Groceries("Milk", 2.49));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 59.99));
        furnitureStorage.addItem(new Furniture("Table", 149.99));

        // Display all items using wildcard method
        System.out.println("Electronics in Warehouse:");
        WarehouseUtils.displayItems(electronicsStorage.getAllItems());

        System.out.println("\nGroceries in Warehouse:");
        WarehouseUtils.displayItems(groceriesStorage.getAllItems());

        System.out.println("\nFurniture in Warehouse:");
        WarehouseUtils.displayItems(furnitureStorage.getAllItems());
    }
}

