public class GoodDogTestDrive {
  public static void main(String[] args) {
    GoodDog one = new GoodDog();
    one.setSize(70);
    GoodDog two = new GoodDog();
    two.setSize(8);

    System.out.println("Dog one: " + one.getSize());
    System.out.println("Dog two: " + two.getSize());

    one.bark(2);
    two.bark(3);
  }
}

class GoodDog {
  private int size;

  public int getSize() {
    return size;
  }

  public void setSize(int s) {
    size = s;
  }

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