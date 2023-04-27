import java.util.ArrayList;

public class AnimalsDriveTest {
  public static void main(String[] args) {

    Hippo hippo = new Hippo();
    Lion lion = new Lion();
    Tiger tiger = new Tiger();
    Cat cat = new Cat();
    Wolf wolf = new Wolf();
    Dog dog = new Dog();

    ArrayList<Animal> animals = new ArrayList<Animal>();
    animals.add(hippo);
    animals.add(lion);
    animals.add(tiger);
    animals.add(cat);
    animals.add(wolf);
    animals.add(dog);

    sendToSleep(animals);
    feedAllAnimals(animals);

    ArrayList<Pet> pets = new ArrayList<Pet>();
    pets.add(cat);
    cat.play();
    feedAPet(cat);

  }

  static void sendToSleep(ArrayList<Animal> animals) {
    for (Animal animal : animals) {
      animal.sleep();
    }
  }

  static void feedAllAnimals(ArrayList<Animal> animals) {
    for (Animal animal : animals) {
      animal.eat();
    }
  }

  static void feedAPet(Pet pet) {
    Animal animal = (Animal) pet;
    animal.eat();
    pet.beFriendly();
  }
}

// Abstract class, can't be instanced.
abstract class Animal {
  // Instance variables
  String picture;
  String food;
  int hunger;
  String boundaries;
  String location;

  // Class Methods

  // Abstract methods, must be implementen in the last concrete class
  // with the same arguments and return type.
  public abstract void makeNoise();

  public abstract void eat();

  public void sleep() {
    System.out.println("Sleep from Animal");
  }

  public void roam() {
    System.out.println("Roam from Animal");
  }
}

// Interface
interface Pet {
  public abstract void beFriendly();

  public abstract void play();
}

// Feline IS-A Animal
// Abstract class, can't be instanced
abstract class Feline extends Animal {
  // Override methods
  public void roam() {
    System.out.println("Roam from Feline");
  }
}

// Canine IS-A Animal
// Abstract class, can't be instanced
abstract class Canine extends Animal {
  // Override methods
  public void roam() {
    System.out.println("Roam from Feline");
  }
}

// Dog IS-A Canine
class Dog extends Canine {
  // Abstract methods must be implement
  public void makeNoise() {
    System.out.println("Make Noise from Dog");
  }

  public void eat() {
    System.out.println("Eat from Dog");
  }
}

// Wolf IS-A Canine
class Wolf extends Canine {
  // Abstract methods must be implement
  public void makeNoise() {
    System.out.println("Make Noise from Wolf");
  }

  public void eat() {
    System.out.println("Eat from Wolf");
  }
}

// Hipo IS-A Animal
class Hippo extends Animal {
  // Abstract methods must be implement
  public void makeNoise() {
    System.out.println("Make Noise from Hippo");
  }

  public void eat() {
    System.out.println("Eat from Hippo");
  }
}

// Lion IS-A Feline
class Lion extends Feline {
  // Abstract methods must be implement
  public void makeNoise() {
    System.out.println("Make Noise from Lion");
  }

  public void eat() {
    System.out.println("Eat from Lion");
  }
}

// Tiger IS-A Feline
class Tiger extends Feline {
  // Abstract methods must be implement
  public void makeNoise() {
    System.out.println("Make Noise from Tiger");
  }

  public void eat() {
    System.out.println("Eat from Tiger");
  }
}

// Cat IS-A Feline
class Cat extends Feline implements Pet {
  // Abstract methods must be implement
  public void makeNoise() {
    System.out.println("Make Noise from Cat");
  }

  public void eat() {
    System.out.println("Eat from Cat");
  }

  public void beFriendly() {
    System.out.println("Be Friendly from Cat");
  }

  public void play() {
    System.out.println("Play from Cat");
  }
}