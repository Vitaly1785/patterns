package Command.TV;

public class TV {
    String location;

    public TV(String location) {
        this.location = location;
    }

    public void on(){
        System.out.println("TV is on in the " + location);
    }

    public void off(){
        System.out.println("TV is off in the " + location);
    }
}
