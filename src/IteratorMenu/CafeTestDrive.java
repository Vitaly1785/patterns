package IteratorMenu;

public class CafeTestDrive {
    public static void main(String[] args) {
        PancakeHouse pancakeHouse = new PancakeHouse();
        DinnerMenu dinnerMenu = new DinnerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        Waitress waitress = new Waitress(pancakeHouse, dinnerMenu, cafeMenu);
        waitress.printMenu();
    }
}
