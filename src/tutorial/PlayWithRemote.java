package tutorial;

import tutorial.commands.TurnItAllOff;
import tutorial.commands.TurnTvOff;
import tutorial.commands.TurnTvOn;
import tutorial.commands.TurnTvUp;
import tutorial.invoker.DeviceButton;
import tutorial.receiver.ElectronicDevice;
import tutorial.receiver.Radio;
import tutorial.receiver.SmartBoard;
import tutorial.receiver.Television;

import java.util.ArrayList;
import java.util.List;

class PlayWithRemote {

  //https://www.newthinktank.com/2012/09/command-design-pattern-tutorial/

  public static void main(String[] args) {

    //Receiver
    Television newDevice = new Television();

    //Command
    TurnTvOn onCommand = new TurnTvOn(newDevice);

    //Invoker
    DeviceButton onPressed = new DeviceButton(onCommand);

    onPressed.press();

    //----------------------------------------------------------

    TurnTvOff offCommand = new TurnTvOff(newDevice);

    onPressed = new DeviceButton(offCommand);

    onPressed.press();

    //----------------------------------------------------------

    TurnTvUp upCommand = new TurnTvUp(newDevice);

    onPressed = new DeviceButton(upCommand);

    onPressed.press();
    onPressed.press();
    onPressed.press();

    //----------------------------------------------------------


    //Receiver
    Television tv = new Television();
    Radio radio = new Radio();


    List<ElectronicDevice> allDevices = new ArrayList<>();
    allDevices.add(tv);
    allDevices.add(radio);


    //Command
    TurnItAllOff turnItAllOff = new TurnItAllOff(allDevices);

    //Invoker
    DeviceButton turnThemOff = new DeviceButton(turnItAllOff);

    turnThemOff.press();
    turnThemOff.pressUndo();


    //My testing
    System.out.println();
    System.out.println();


    SmartBoard smartBoard = new SmartBoard();

    TurnTvOn turnTvOn = new TurnTvOn(smartBoard);

    DeviceButton deviceButton = new DeviceButton(turnTvOn);

    deviceButton.press();


  }
}