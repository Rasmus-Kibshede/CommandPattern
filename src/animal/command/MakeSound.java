package animal.command;

import animal.receiver.Animal;

public class MakeSound implements Command {

  private Animal animal;

  public MakeSound(Animal animal) {
    this.animal = animal;
  }


  @Override
  public void execute() {
    animal.makeSound();
  }

  @Override
  public String getName() {
    return "Make Sound";
  }
}
