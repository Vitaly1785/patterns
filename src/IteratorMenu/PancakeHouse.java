package IteratorMenu;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouse implements Menu{
    ArrayList<MenuItem> menuItems;

    public PancakeHouse() {
        menuItems = new ArrayList<>();
        addItem("K&B’s Pancake Breakfast",
                "Pancakes with scrambled eggs, and toast",
                true,
                2.99);
        addItem("Regular Pancake Breakfast",
                "Pancakes with fried eggs, sausage",
                false,
                2.99);
        addItem("Blueberry Pancakes",
                "Pancakes made with fresh blueberries",
                true,
                3.49);
        addItem("Waffles",
                "Waffles, with your choice of blueberries or strawberries",
                true,
                3.59);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator<MenuItem>createIterator(){
        System.out.println("Breakfast menu \\n----\\");
        return menuItems.iterator();
    }
}
