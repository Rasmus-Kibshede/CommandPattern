package playGround.commands;

import playGround.receiver.ElectronicDevice;

public class TurnOn implements Command {

  ElectronicDevice theDevice;

  public TurnOn(ElectronicDevice newDevice) {
    theDevice = newDevice;
  }

  @Override
  public String getName() {
    return "TurnOn";
  }

  public void execute() {
    theDevice.on();
  }

  public void undo() {
    theDevice.off();
  }


}
