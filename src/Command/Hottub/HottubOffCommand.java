package Command.Hottub;

import Command.Command;

public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.turnOffWater();
    }

    @Override
    public void undo() {
        hottub.turnOnWater();
    }
}
