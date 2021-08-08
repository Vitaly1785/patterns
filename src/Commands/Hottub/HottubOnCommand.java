package Commands.Hottub;

import Commands.Command;

public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.turnOnWater();
    }

    @Override
    public void undo() {
        hottub.turnOffWater();
    }
}
