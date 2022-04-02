package tutorial.receiver;

public class Radio implements ElectronicDevice {
  //Receiver

  private int volume = 0;

  public void on() {
    System.out.println("Radio is on");
  }

  public void off() {
    System.out.println("Radio is off");
  }

  public void volumeUp() {
    volume++;

    System.out.println("Radio Volume is at: " + volume);
  }

  @Override
  public void volumeDown() {
    volume--;

    System.out.println("Radio Volume is at: " + volume);
  }
}
