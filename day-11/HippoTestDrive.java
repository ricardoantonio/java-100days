public class HippoTestDrive {
  public static void main(String[] args) {
    Hippo hippo = new Hippo("Buffy");
    System.out.println(hippo.getName());
  }
}

class Animal {
  // A private instance variable will not be inherited
  private String name = "Generic";

  public Animal() {
    System.out.println("Making an Animal");
  }

  public Animal(String n) {
    System.out.println("Making an Animal");
    name = n;
  }

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }
}

class Hippo extends Animal {
  public Hippo() {
    System.out.println("Making a Hippo");
  }

  // Hippo constructor takes a name
  public Hippo(String name) {
    // Hippo constructor sends the name up in the Stack
    // to the Animal constructor.
    super(name);
  }
}
