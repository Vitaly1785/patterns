package Commands.CellingFan;

import Commands.Command;

public class CellingFanOffCommand implements Command {
    CellingFan cellingFan;
    int prevSpeed;

    public CellingFanOffCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.off();
    }

    @Override
    public void undo() {
        CellingFanUndo cellingFanUndo = new CellingFanUndo();
        cellingFanUndo.undo(cellingFan, prevSpeed);
    }
}
