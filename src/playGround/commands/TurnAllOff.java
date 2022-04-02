package playGround.commands;

import playGround.receiver.ElectronicDevice;

import java.util.List;

public class TurnAllOff implements Command {


  List<ElectronicDevice> devices;

  public TurnAllOff(List<ElectronicDevice> devices) {
    this.devices = devices;
  }

  @Override
  public String getName() {
    return "TurnAllOff";
  }

  @Override
  public void execute() {
    for (ElectronicDevice device : devices) {
      device.off();
    }
  }

  @Override
  public void undo() {
    for (ElectronicDevice device : devices) {
      device.on();
    }
  }
}
