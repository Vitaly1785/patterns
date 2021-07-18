package CarTesting.Cars;

import CarTesting.CargoMovers.LargeCargo;
import CarTesting.SpeedRun.SlowRunner;

public class LengthCar extends Car{

    public LengthCar() {
        cargoMover = new LargeCargo();
        speedRunner = new SlowRunner();
    }

    @Override
    public void display() {
        System.out.println("My length is so far!");
    }
}
