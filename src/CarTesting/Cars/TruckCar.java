package CarTesting.Cars;

import CarTesting.CargoMovers.BigCargo;
import CarTesting.SpeedRun.SlowRunner;

public class TruckCar extends Car{

    public TruckCar() {
        cargoMover = new BigCargo();
        speedRunner = new SlowRunner();
    }

    @Override
    public void display() {
        System.out.println("I'm Freightliner");
    }
}
