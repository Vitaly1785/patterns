package Command;

public class RemoteControlTestDrive {
    public static void main(String[] args) {
        Light lightKitchen = new Light("Kitchen");
        Light lightLivingRoom = new Light("Living Room");
        Light lightBedRoom = new Light("Bed Room");
        GarageDoor garageDoor = new GarageDoor();
        CellingFan cellingFan = new CellingFan("Kitchen");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand kitchenLightOn = new LightOnCommand(lightKitchen);
        LightOffCommand kitchenLightOff = new LightOffCommand(lightKitchen);
        LightOnCommand livingRoomLightOn = new LightOnCommand(lightLivingRoom);
        LightOffCommand livingRoomLightOff = new LightOffCommand(lightLivingRoom);
        LightOnCommand bedRoomLightOn = new LightOnCommand(lightBedRoom);
        LightOffCommand bedRoomLightOff = new LightOffCommand(lightBedRoom);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garageDoor);

        CellingFanOnCommand cellingFanOn = new CellingFanOnCommand(cellingFan);
        CellingFanOffCommand cellingFanOff = new CellingFanOffCommand(cellingFan);

        StereoOnWithCdCommand stereoOnWithCd = new StereoOnWithCdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(1, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(2, bedRoomLightOn, bedRoomLightOff);
        remoteControl.setCommand(3, garageDoorOpen, garageDoorClose);
        remoteControl.setCommand(4, cellingFanOn, cellingFanOff);
        remoteControl.setCommand(5, stereoOnWithCd, stereoOff);

        System.out.println(remoteControl);

        remoteControl.buttonOnWasPressed(0);
        remoteControl.buttonOffWasPressed(0);
        remoteControl.buttonOnWasPressed(1);
        remoteControl.buttonOffWasPressed(1);
        remoteControl.buttonOnWasPressed(2);
        remoteControl.buttonOffWasPressed(2);
        remoteControl.buttonOnWasPressed(3);
        remoteControl.buttonOffWasPressed(3);
        remoteControl.buttonOnWasPressed(4);
        remoteControl.buttonOffWasPressed(4);
        remoteControl.buttonOnWasPressed(5);
        remoteControl.buttonOffWasPressed(5);

    }
}
