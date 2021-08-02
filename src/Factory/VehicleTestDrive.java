package Factory;

import Factory.Vehicle.Vehicle;
import Factory.VehicleStore.RussianVehicleFactory;
import Factory.VehicleStore.USAVehicleFactory;
import Factory.VehicleStore.VehicleStore;

public class VehicleTestDrive {
    public static void main(String[] args) {
        VehicleStore ruStore = new RussianVehicleFactory();
        VehicleStore usStore = new USAVehicleFactory();
        Vehicle vehicle = ruStore.orderVehicle("Kamaz");
        System.out.println("Made in Russia " + vehicle.getTitle());
        Vehicle vehicle1 = usStore.orderVehicle("Ford");
        System.out.println("Made in USA " + vehicle1.getTitle());
    }
}
