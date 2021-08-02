package Factory.VehicleStore;

import Factory.Vehicle.Gaz;
import Factory.Vehicle.Kamaz;
import Factory.Vehicle.Lada;
import Factory.Vehicle.Vehicle;

public class RussianVehicleFactory extends VehicleStore{
    @Override
    public Vehicle madeVehicle(String title) {
        Vehicle vehicle;
        switch(title){
            case("Lada"):
                vehicle = new Lada();
                break;
            case("Kamaz"):
                vehicle = new Kamaz();
                break;
            case("GAZ"):
                vehicle = new Gaz();
                break;
            default:
                vehicle = null;
                break;
        }
        return vehicle;
    }
}
