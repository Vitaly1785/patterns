package IteratorMenu;

import Composite.MenuComponent;

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()){
            System.out.print("(V)");
        }
        System.out.print(",  " + getPrice());
        System.out.println("   --" + getDescription());
    }
}
