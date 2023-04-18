// The File must be named the Same as the Class.
public class Hello {

  // A method can be defined before of after de class. No matter the order.
  public static void SayGoodBye() {
    System.out.println("Goodbye!");
  }

  // The main method is where Java starts to run the code.
  public static void main(String[] args) {
    sayHello();
    // variable declaration
    int x = 1;

    System.out.println("Before the loop...");

    // While loop
    while (x < 4) {
      System.out.println("In the loop:");
      System.out.println("The value of x is: " + x);
      x = x + 1;
    }
    System.out.println("This is after the loop.");

    SayGoodBye();
  }

  // A method can be defined before of after de class. No matter the order.
  public static void sayHello() {
    System.out.println("Hello!");
  }
}
