package Composite;

import java.util.Iterator;

public class Waitress {
    private MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu(){
        allMenus.print();
    }

    public void printVegetarianMenu(){
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\n Vegetarian Menu \n--------");
        while (iterator.hasNext()){
            MenuComponent component = iterator.next();
            try {
                if (component.isVegetarian()){
                    component.print();
                }
            } catch (UnsupportedOperationException ignored){}
        }
    }
}
