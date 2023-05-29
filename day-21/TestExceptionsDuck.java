public class TestExceptionsDuck {

  // Finally main has to handle the exception. In this case, it dusk the extends
  // to.
  // The JVM stops when the exception is throw.
  public static void main(String[] args) throws Exception {

    System.out.println("start of main");
    String test = "yes";
    foo(test);
    System.out.println("end of main.");

  }

  // This simply declares the exception to dusk it so, it don't have to use
  // a try/catch block but the caller method need to handle it anyway.
  static void foo(String test) throws ScaryException {
    System.out.println("start of foo");
    doRisky(test);
    System.out.println("end of foo");
  }

  static void doRisky(String test) throws ScaryException {
    System.out.println("start of doRisky");
    if ("yes".equals(test)) {
      throw new ScaryException();
    }
    System.out.println("end of doRisky");
  }
}

class ScaryException extends Exception {
}
