class DogTestDrive {
  public static void main(String[] args) {

    Dog one = new Dog();
    one.size = 70;
    Dog two = new Dog();
    two.size = 8;
    Dog three = new Dog();
    three.size = 35;

    one.bark(2);
    two.bark(3);
    three.bark(1);
  }
}

class Dog {
  int size;
  String name;

  void bark(int numOfBarks) {
    String barkSound;
    if (size > 60) {
      barkSound = "Woof! Woof!";
    } else if (size > 14) {
      barkSound = "Ruff! Ruff!";
    } else {
      barkSound = "Yip! Yip!";
    }

    while (numOfBarks > 0) {
      System.out.println(barkSound);
      numOfBarks = numOfBarks - 1;
    }
  }
}