package CarTesting.CargoMovers;

public class BigCargo implements CargoMover{
    @Override
    public void cargoMove() {
        System.out.println("I can move a big cargo, but i can't move a large cargo ;)");
    }
}
