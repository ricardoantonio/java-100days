public class TestBox {
  private Integer i;
  private int j;

  public static void main(String[] args) {
    TestBox t = new TestBox();
    t.go();
  }

  public void go() {
    // This will not compile, i is Null as a Object initialized with null
    // as default value.
    // j is ant int primitive, can't be assigned with a null.
    j = i;
    System.out.println(j);
    System.out.println(i);
  }
}