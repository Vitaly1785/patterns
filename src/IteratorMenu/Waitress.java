package IteratorMenu;

import java.util.Iterator;

public class Waitress {
    private Menu pancakeHouse;
    private Menu dinnerMenu;

    public Waitress(PancakeHouse pancakeHouse, DinnerMenu dinnerMenu) {
        this.pancakeHouse = pancakeHouse;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu(){
        Iterator<MenuItem> pancakeIterator = pancakeHouse.createIterator();
        Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
        System.out.println("MENU\\n----\\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("MENU\\n----\\nDINNER");
        printMenu(dinnerIterator);
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
