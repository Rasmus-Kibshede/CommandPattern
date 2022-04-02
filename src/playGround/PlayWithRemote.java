package playGround;

import playGround.commands.Command;
import playGround.commands.TurnOff;
import playGround.commands.TurnOn;
import playGround.invoker.DeviceButton;
import playGround.receiver.Television;

import java.util.Scanner;

class PlayWithRemote {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    //Receiver
    Television tv = new Television();

    //Command
    Command[] commands = {
        new TurnOn(tv),
        new TurnOff(tv)
    };

    for (int i = 0; i < commands.length; i++) {
      System.out.println(i + "). " + commands[i].getName());
    }

    while (true) {

      int menuNumber = scan.nextInt();

      //Invoker
      DeviceButton button = new DeviceButton(commands[menuNumber]);
      button.press();
    }
  }
}