package tutorial.commands;

import tutorial.receiver.ElectronicDevice;

public class TurnTvOff  implements Command {
  ElectronicDevice theDevice;

  public TurnTvOff(ElectronicDevice newDevice) {
    theDevice = newDevice;
  }

  public void execute() {
    theDevice.off();
  }

  public void undo() {
    theDevice.on();
  }
}
