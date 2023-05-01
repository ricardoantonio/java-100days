public class TestFormats {
  public static void main(String[] args) {
    long myBillion = 1000000000;
    double doubleNumber = 10000.1234;
    // Located underscores will make the number readable
    long easerToRead = 1_000_000_000;

    String s = String.format("%,d", myBillion);
    System.out.println(s);
    String s2 = String.format("%,.2f", doubleNumber);
    System.out.println(s2);

    String s3 = String.format("Number 1: %d Number 2: %,.2f", myBillion, doubleNumber);
    System.out.println(s3);
  }
}
