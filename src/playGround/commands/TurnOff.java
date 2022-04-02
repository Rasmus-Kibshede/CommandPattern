package playGround.commands;

import playGround.receiver.ElectronicDevice;

public class TurnOff implements Command {
  ElectronicDevice theDevice;

  public TurnOff(ElectronicDevice newDevice) {
    theDevice = newDevice;
  }

  @Override
  public String getName() {
    return "TurnOff";
  }

  public void execute() {
    theDevice.off();
  }

  public void undo() {
    theDevice.on();
  }
}
