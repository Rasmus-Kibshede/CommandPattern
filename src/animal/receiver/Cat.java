package animal.receiver;

public class Cat extends Animal {

  public Cat(String name, int age, String race) {
    super(name, age, race);
  }

  @Override
  public void makeSound() {
    System.out.println(animal + " says Miaw Miaw");
  }

  @Override
  public void run() {
    System.out.println(name + " the " + animal + " does not wanna run!");
  }
}
