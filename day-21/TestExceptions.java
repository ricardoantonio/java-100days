public class TestExceptions {

  public static void main(String[] args) {
    String test = "yes";
    try {
      System.out.println("start try");
      doRisky(test);
      System.out.println("end try");
    } catch (ScaryException e) {
      System.out.println("scary exception");
    } finally {
      System.out.println("finally");
    }
    System.out.println("end of main");
  }

  static void doRisky(String test) throws ScaryException {
    System.out.println("start Risky");
    if ("yes".equals(test)) {
      throw new ScaryException();
    }
    System.out.println("end Risky");
  }

}

class ScaryException extends Exception {
}
