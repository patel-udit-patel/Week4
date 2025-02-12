package org.example.smart_warehouse_management_system;

import java.util.List;
// Utility class with wildcard method
public class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}