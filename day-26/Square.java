import java.io.*;

public class Square implements Serializable {

  private int width;
  private int heigth;

  public Square(int width, int heigth) {
    this.width = width;
    this.heigth = heigth;
  }

  public static void main(String[] args) {
    Square mySquare = new Square(50, 20);

    try {
      FileOutputStream fileStream = new FileOutputStream("foo.ser");
      ObjectOutputStream os = new ObjectOutputStream(fileStream);
      os.writeObject(mySquare);
      os.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
