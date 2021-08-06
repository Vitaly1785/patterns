package Command;

public class StereoOnWithDvdCommand implements Command{
    Stereo stereo;

    public StereoOnWithDvdCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setDvd();
        stereo.setVolume(9);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
