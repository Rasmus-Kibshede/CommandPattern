package animal.command;

import animal.receiver.Animal;

public class MakeRun implements Command {
  private Animal animal;

  public MakeRun(Animal animal) {
    this.animal = animal;
  }


  @Override
  public void execute() {
    animal.run();
  }

  @Override
  public String getName() {
    return "Make Run";
  }
}
