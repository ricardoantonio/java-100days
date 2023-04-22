public class PoorDogTestDrive {
  public static void main(String[] args) {
    PoorDog one = new PoorDog();
    System.out.println("Dog size is: " + one.getSize());
    System.out.println("Dog name is: " + one.getName());
  }

}

// Instance variables always get a default value.
// If you don't explicitly assign a value to an instance variable
// or you don't call a setter method, the variable still has a value.
class PoorDog {
  private int size;
  private String name;

  public int getSize() {
    return size;
  }

  public String getName() {
    return name;
  }
}