package CarTesting.Cars;

import CarTesting.CargoMovers.CargoMover;
import CarTesting.SpeedRun.SpeedRunner;

public abstract class Car {

    CargoMover cargoMover;
    SpeedRunner speedRunner;

    public abstract void display();

    public void performCargo(){
        cargoMover.cargoMove();
    }

    public void performSpeed(){
        speedRunner.speedRun();
    }

    public void setCargoMover(CargoMover cm){
        cargoMover = cm;
    }

    public void setSpeedRunner(SpeedRunner sr){
        speedRunner = sr;
    }
}
