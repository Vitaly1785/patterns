package Commands.CellingFan;

import Commands.Command;

public class CellingFanHighCommand implements Command {
    CellingFan cellingFan;
    int prevSpeed;


    public CellingFanHighCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.high();
    }

    @Override
    public void undo() {
        CellingFanUndo cellingFanUndo = new CellingFanUndo();
      cellingFanUndo.undo(cellingFan, prevSpeed);
    }
}
