package tutorial;

import tutorial.receiver.ElectronicDevice;
import tutorial.receiver.Television;

public class TvRemote {

  public static ElectronicDevice getDevice(){
    return new Television();
  }


}
