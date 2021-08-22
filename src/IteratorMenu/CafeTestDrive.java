package IteratorMenu;

import java.util.ArrayList;
import java.util.Arrays;

public class CafeTestDrive {
    public static void main(String[] args) {
        ArrayList<Menu> menuArrayList = new ArrayList<>(Arrays.asList(new PancakeHouse(), new DinnerMenu(), new CafeMenu()));

        Waitress waitress = new Waitress(menuArrayList);
        waitress.printMenu();
    }
}
