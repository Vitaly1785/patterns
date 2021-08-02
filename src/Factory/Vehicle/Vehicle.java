package Factory.Vehicle;

import java.util.ArrayList;

public abstract class Vehicle {
    String title;
    String category;
    ArrayList<String> colors = new ArrayList<>();
    Double price;


    public void prepare(){
        System.out.println("Start to made " + title);
        System.out.println("Category - " + category);
        System.out.println("Price - " + price);
    }

    public void coloredVehicle(){
        for (String color : colors) {
            System.out.println("Color - " + color);
        }
    }

    public void goToGarage(){
        System.out.println("Vehicle goi it to transporting");
    }

    public String getTitle() {
        return title;
    }
}
