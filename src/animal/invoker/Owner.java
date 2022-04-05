package animal.invoker;

import animal.command.Command;

public class Owner {

  private Command command;

  public Owner(Command command) {
    this.command = command;
  }

  public void action() {
    command.execute();
  }
}
