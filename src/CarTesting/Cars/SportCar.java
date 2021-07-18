package CarTesting.Cars;

import CarTesting.CargoMovers.SmallCargo;
import CarTesting.SpeedRun.FastRunner;

public class SportCar extends Car{

    public SportCar() {
        cargoMover = new SmallCargo();
        speedRunner = new FastRunner();
    }

    @Override
    public void display() {
        System.out.println("I'm Ferrari, baby ;)");
    }
}
