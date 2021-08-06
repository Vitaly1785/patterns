package Command;

public class CellingFanUndo {

    public void undo(CellingFan cellingFan, int prevSpeed) {
        if (prevSpeed == CellingFan.HIGH){
            cellingFan.high();
        } else if (prevSpeed == CellingFan.MEDIUM){
            cellingFan.medium();
        } else if (prevSpeed == CellingFan.SLOW){
            cellingFan.slow();
        } else if (prevSpeed == CellingFan.OFF){
            cellingFan.off();
        }
    }
}
