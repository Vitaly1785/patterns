package Commands.CellingFan;

import Commands.Command;

public class CellingFanSlowCommand implements Command {
    CellingFan cellingFan;
    int prevSpeed;

    public CellingFanSlowCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.slow();
    }

    @Override
    public void undo() {
        CellingFanUndo cellingFanUndo = new CellingFanUndo();
        cellingFanUndo.undo(cellingFan, prevSpeed);
    }
}
