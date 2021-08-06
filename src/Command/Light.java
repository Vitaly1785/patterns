package Command;

public class Light {
    String title;
    public Light(String title) {
        this.title = title;
    }

    public void on(){
        System.out.println("Light is on " + title);
    }

    public void off(){
        System.out.println("Light is off " + title);
    }
}
