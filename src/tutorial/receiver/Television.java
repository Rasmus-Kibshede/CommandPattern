package tutorial.receiver;

public class Television implements ElectronicDevice {

  //Receiver

  private int volume = 0;

  public void on() {
    System.out.println("TV is on");
  }

  public void off() {
    System.out.println("TV is off");
  }

  public void volumeUp() {
    volume++;

    System.out.println("TV Volume is at: " + volume);
  }

  @Override
  public void volumeDown() {
    volume--;

    System.out.println("TV Volume is at: " + volume);
  }
}

