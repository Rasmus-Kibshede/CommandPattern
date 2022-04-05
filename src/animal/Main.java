package animal;

import animal.command.Command;
import animal.command.MakeSound;
import animal.command.MakeRun;
import animal.invoker.Owner;
import animal.receiver.Animal;
import animal.receiver.Cat;
import animal.receiver.Dog;

import java.util.Scanner;

public class Main {
  private static Scanner scan = new Scanner(System.in);

  public static int userInput() {
    int input = scan.nextInt();
    scan.nextLine();
    return input;
  }

  public static void main(String[] args) {

    //Receiver
    Animal[] animals = {
        new Dog("Hans", 3, "Dog"),
        new Cat("Dan", 6, "Cat")
    };

    //---------------------------------- User answer select an animal --------------------
    for (int i = 0; i < animals.length; i++) {
      System.out.println(i + ") " + animals[i]);
    }

    Animal animal = animals[userInput()];
    //---------------------------------- ends here --------------------

    //Command
    Command[] commands = {
        new MakeSound(animal),
        new MakeRun(animal)
    };

    //---------------------------------- User answer select a command --------------------
    for (int i = 0; i < commands.length; i++) {
      System.out.println(i + ") " + commands[i].getName());
    }
    //---------------------------------- ends here --------------------

    //Invoker
    Owner owner = new Owner(commands[userInput()]);
    owner.action();
  }
}
