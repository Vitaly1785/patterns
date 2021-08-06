package Command;

import Command.CellingFan.*;
import Command.Garage.GarageDoor;
import Command.Hottub.Hottub;
import Command.Hottub.HottubOffCommand;
import Command.Hottub.HottubOnCommand;
import Command.Light.Light;
import Command.Light.LightOffCommand;
import Command.Light.LightOnCommand;
import Command.Stereo.Stereo;
import Command.Stereo.StereoOffCommand;
import Command.Stereo.StereoOnWithDvdCommand;
import Command.TV.TV;
import Command.TV.TVOffCommand;
import Command.TV.TVOnCommand;

public class RemoteControlTestDrive {
    public static void main(String[] args) {
        Light light = new Light("Hall");
        TV tv = new TV("Hall");
        Stereo stereo = new Stereo("Hall");
        Hottub hottub = new Hottub();

        LightOnCommand lightOnHall = new LightOnCommand(light);
        LightOffCommand lightOffHall = new LightOffCommand(light);

        TVOnCommand tvOnHall = new TVOnCommand(tv);
        TVOffCommand tvOffHall = new TVOffCommand(tv);

        StereoOnWithDvdCommand stereoOnWithDvd = new StereoOnWithDvdCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOnHall, tvOnHall, stereoOnWithDvd, hottubOn};
        Command[] partyOff = {lightOffHall, tvOffHall, stereoOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
        remoteControl.buttonOnWasPressed(0);
        System.out.println("-----------");
        remoteControl.buttonOffWasPressed(0);
        System.out.println("-----------");
        remoteControl.undoCommandWasPushed();
    }
}
