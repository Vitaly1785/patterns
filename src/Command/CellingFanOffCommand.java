package Command;

public class CellingFanOffCommand implements Command{
    CellingFan cellingFan;

    public CellingFanOffCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        cellingFan.off();
    }
}
