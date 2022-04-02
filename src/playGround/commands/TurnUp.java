package playGround.commands;

import playGround.receiver.ElectronicDevice;

public class TurnUp implements Command {

  ElectronicDevice theDevice;

  public TurnUp(ElectronicDevice newDevice) {
    theDevice = newDevice;
  }

  @Override
  public String getName() {
    return "TurnUp";
  }

  @Override
  public void execute() {
    theDevice.volumeUp();
  }

  @Override
  public void undo() {
    theDevice.volumeDown();
  }
}
