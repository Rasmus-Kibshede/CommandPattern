package animal.receiver;

public abstract class Animal {

  protected String name;
  protected int age;
  protected String animal;

  public Animal(String name, int age, String race) {
    this.name = name;
    this.age = age;
    this.animal = race;
  }

  public abstract void makeSound();


  @Override
  public String toString() {
    return "Animal type: " + animal + " | Age: " + age + " | Name: " + name;
  }

  public abstract void run();
}
