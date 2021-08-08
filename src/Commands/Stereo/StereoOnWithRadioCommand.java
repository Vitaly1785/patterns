package Commands.Stereo;

import Commands.Command;

public class StereoOnWithRadioCommand implements Command {
    Stereo stereo;

    public StereoOnWithRadioCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setRadio();
        stereo.setVolume(6);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
