package IteratorMenu;

public class CafeTestDrive {
    public static void main(String[] args) {
        PancakeHouse pancakeHouse = new PancakeHouse();
        DinnerMenu dinnerMenu = new DinnerMenu();

        Waitress waitress = new Waitress(pancakeHouse, dinnerMenu);
        waitress.printMenu();
    }
}
