package IteratorMenu;

import java.util.Iterator;

public class Waitress {
    private Menu pancakeHouse;
    private Menu dinnerMenu;
    private Menu cafeMenu;

    public Waitress(PancakeHouse pancakeHouse, DinnerMenu dinnerMenu, CafeMenu cafeMenu) {
        this.pancakeHouse = pancakeHouse;
        this.dinnerMenu = dinnerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        Iterator<MenuItem> pancakeIterator = pancakeHouse.createIterator();
        Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
        Iterator<MenuItem> lunchIterator = cafeMenu.createIterator();
        System.out.println("MENU\\n----\\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("MENU\\n----\\nDINNER");
        printMenu(dinnerIterator);
        System.out.println("MENU\\n----\\nLunch");
        printMenu(lunchIterator);
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
