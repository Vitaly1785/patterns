package Command;

public class CellingFan {
    private String title;

    public CellingFan(String title) {
        this.title = title;
    }

    public void on(){
        System.out.println("Celling fan on - " + title);
    }

    public void off(){
        System.out.println("Celling fan off - " + title);
    }
}
