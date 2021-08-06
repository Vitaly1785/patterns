package Command;

public class RemoteControlTestDrive {
    public static void main(String[] args) {
        Light lightKitchen = new Light("Kitchen");
        Light lightLivingRoom = new Light("Living Room");
        Light lightBedRoom = new Light("Bed Room");
        GarageDoor garageDoor = new GarageDoor();
        CellingFan cellingFan = new CellingFan("kitchen");
        Stereo stereo = new Stereo("Living Room");

       CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
       CellingFanMediumCommand cellingFanMediumCommand = new CellingFanMediumCommand(cellingFan);
       CellingFanSlowCommand cellingFanSlowCommand = new CellingFanSlowCommand(cellingFan);
       CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);

       RemoteControl remoteControl = new RemoteControl();
       remoteControl.setCommand(0, cellingFanHighCommand, cellingFanOffCommand);
       remoteControl.setCommand(1, cellingFanMediumCommand, cellingFanOffCommand);
       remoteControl.setCommand(2, cellingFanSlowCommand, cellingFanOffCommand);

       remoteControl.buttonOnWasPressed(0);

       remoteControl.buttonOnWasPressed(1);

       remoteControl.buttonOnWasPressed(2);

       remoteControl.undoCommandWasPushed();
    }
}
