package tutorial.receiver;

public class SmartBoard implements ElectronicDevice {

  private int volume = 0;

  public void on() {
    System.out.println("SmartBoard is on");
  }

  public void off() {
    System.out.println("SmartBoard is off");
  }

  public void volumeUp() {
    volume++;

    System.out.println("SmartBoard Volume is at: " + volume);
  }

  @Override
  public void volumeDown() {
    volume--;

    System.out.println("SmartBoard Volume is at: " + volume);
  }
}
