package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> menuItems, Date lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }

    public Menu() {
        this.menuItems = new ArrayList<>();
        this.lastUpdated = new Date(); // Assuming current date as default
    }

    // Getters and setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    // Method to add a new MenuItem to the menu
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    // Method to remove a MenuItem from the menu
    public void removeMenuItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }

    // Method to print out entire menu
    public void printMenu() {
        System.out.println("Menu (Last Updated: " + lastUpdated + ")");
        for (MenuItem item : menuItems) {
            item.printMenuItem();
            System.out.println("-----------------------");
        }
    }

    // Method to determine whether two menus are equal
    public boolean equals(Menu other) {
        if (menuItems.size() != other.getMenuItems().size()) {
            return false;
        }
        for (int i = 0; i < menuItems.size(); i++) {
            if (!menuItems.get(i).equals(other.getMenuItems().get(i))) {
                return false;
            }
        }
        return true;
    }
}
