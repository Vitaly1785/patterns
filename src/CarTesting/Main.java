package CarTesting;

import CarTesting.Cars.Car;
import CarTesting.Cars.LengthCar;
import CarTesting.Cars.SportCar;
import CarTesting.Cars.TruckCar;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[3];
        cars[0] = new SportCar();
        cars[1] = new LengthCar();
        cars[2] = new TruckCar();

        for (Car car : cars) {
            car.display();
            car.performCargo();
            car.performSpeed();
        }
    }
}
