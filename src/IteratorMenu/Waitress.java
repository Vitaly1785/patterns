package IteratorMenu;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    private ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu(){
        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iteratorMenu){
        while(iteratorMenu.hasNext()){
            MenuItem menuItem = iteratorMenu.next();
            System.out.print(menuItem.getName() + ",  ");
            System.out.print(menuItem.getPrice() + "--");
            System.out.println(menuItem.getDescription());
        }
    }
}
