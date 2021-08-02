package Factory.VehicleStore;

import Factory.Vehicle.Chevrolet;
import Factory.Vehicle.Ford;
import Factory.Vehicle.Freightleener;
import Factory.Vehicle.Vehicle;

public class USAVehicleFactory extends VehicleStore{
    @Override
    public Vehicle madeVehicle(String title) {
        Vehicle vehicle;
        switch (title){
            case("Ford"):
                vehicle = new Ford();
                break;
            case("Fred"):
                vehicle = new Freightleener();
                break;
            case("Chevrolet"):
                vehicle = new Chevrolet();
                break;
            default:
                vehicle = null;
                break;
        }
        return vehicle;
    }
}
