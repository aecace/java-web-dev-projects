package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {
    public static void main(String[] args) {
        // Create menu items
        MenuItem item1 = new MenuItem("Apple Pie", 10.99, "Delicious pie with apples", "Dessert", true, new Date(2024-1900, 2, 1));
        MenuItem item2 = new MenuItem("Shoofly Pie", 12.99, "Decadent chocolate pie", "Dessert", true, new Date(2024-1900, 3, 24));
        MenuItem item3 = new MenuItem("Pumpkin Pie", 9.99, "Classic pumpkin pie", "Dessert", true, new Date(2024-1900, 4, 1));

        // Create a menu
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(item1);
        menuItems.add(item2);
        menuItems.add(item3);
        Menu menu = new Menu(menuItems, new Date());

        // Update new item status
        for (MenuItem item : menu.getMenuItems()) {
            item.updateNewItemStatus();
        }

        // Print the entire menu
        System.out.println("Initial Menu:");
        menu.printMenu();

        // Testing remove functionality
//        // Print an individual menu item
//        System.out.println("Printing a single menu item:");
//        item1.printMenuItem();
//
//        // Remove an item from the menu
//        System.out.println("Removing an item from the menu...");
//        menu.removeMenuItem(item2);
//
//        // Reprint the menu
//        System.out.println("Updated Menu:");
//        menu.printMenu();
    }
}