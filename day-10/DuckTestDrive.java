public class DuckTestDrive {
  public static void main(String[] args) {
    Duck duck = new Duck();
    System.out.println(duck.getSize());

    Duck duck2 = new Duck(34);
    System.out.println(duck2.getSize());
  }
}

class Duck {
  private int size;

  // Constructor
  public Duck() {
    System.out.println("Quack!");
    size = 27;
  }

  // Overloaded constructor, this time the constructor receive an argument.
  public Duck(int duckSize) {
    System.out.println("Quack!");
    size = duckSize;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int duckSize) {
    size = duckSize;
  }
}