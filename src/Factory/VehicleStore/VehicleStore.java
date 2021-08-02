package Factory.VehicleStore;

import Factory.Vehicle.Vehicle;

public abstract class VehicleStore {
    public Vehicle orderVehicle(String title){
        Vehicle vehicle;
        vehicle = madeVehicle(title);
        vehicle.prepare();
        vehicle.coloredVehicle();
        vehicle.goToGarage();

        return vehicle;
    }

    public abstract Vehicle madeVehicle(String title);



}
