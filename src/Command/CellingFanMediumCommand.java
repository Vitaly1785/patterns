package Command;

public class CellingFanMediumCommand implements Command{
    CellingFan cellingFan;
    int prevSpeed;


    public CellingFanMediumCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        prevSpeed = cellingFan.getSpeed();
        cellingFan.medium();
    }

    @Override
    public void undo() {
        CellingFanUndo cellingFanUndo = new CellingFanUndo();
       cellingFanUndo.undo(cellingFan, prevSpeed);
    }
}
