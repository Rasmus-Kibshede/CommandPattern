package animal.receiver;

public class Dog extends Animal {


  public Dog(String name, int age, String animal) {
    super(name, age, animal);
  }

  @Override
  public void makeSound() {
    System.out.println(animal + " says vuf vuf");
  }

  @Override
  public void run() {
    System.out.println(name + " the " + animal + " runs faster then you");
  }
}
