package Command;

public class CellingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int SLOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CellingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println(location + " ceiling fan is on high");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(location + " ceiling fan is on medium");
    }

    public void slow(){
        speed = SLOW;
        System.out.println(location + " ceiling fan is on low");
    }

    public void off(){
        speed = OFF;
        System.out.println(location + " ceiling fan is off");
    }

    public int getSpeed() {
        return speed;
    }
}
