package restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date dateAdded;

    public MenuItem(String name, double price, String description, String category, boolean isNew, Date dateAdded) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.dateAdded = dateAdded;
    }

    public MenuItem(String name, double price, String description, String category, Date dateAdded) {
        this(name, price, description, category, false, dateAdded); // Assuming isNew defaults to false
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    // Method to check if the menu item is new
    public boolean isNewItem() {
        return isNew;
    }

    // Getters and setters for the new field
    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    public void updateNewItemStatus() {
        // Calculate the current date
        Date currentDate = new Date();

        // Calculate the difference in milliseconds between the current date and the date the item was added
        long differenceInMillis = currentDate.getTime() - dateAdded.getTime();

        // Calculate the difference in days
        long differenceInDays = differenceInMillis / (1000 * 60 * 60 * 24);

        // If the difference in days is greater than 30, set isNew to false
        if (differenceInDays > 30) {
            isNew = false;
        }
    }

    // Method to print out a single menu item
    public void printMenuItem() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
        System.out.println("Is New: " + isNew);
    }

    // Method to compare two menu items for equality
    public boolean equals(MenuItem other) {
        return name.equals(other.getName()) &&
                price == other.getPrice() &&
                description.equals(other.getDescription()) &&
                category.equals(other.getCategory()) &&
                isNew == other.isNew();
    }
}