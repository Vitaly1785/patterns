package Commands.Stereo;

public class Stereo {
    private String title;

    public Stereo(String title) {
        this.title = title;
    }

    public void on(){
        System.out.println("Stereo is on");
    }
    public void off(){
        System.out.println("Stereo is off");
    }
    public void setCd(){
        System.out.println("Playing cd - ");
    }
    public void setDvd(){
        System.out.println("Playing dvd - ");
    }
    public void setRadio(){
        System.out.println("Playing radio - ");
    }
    public void setVolume(int volume){
        System.out.println("Volume  - " + volume);
    }
}
