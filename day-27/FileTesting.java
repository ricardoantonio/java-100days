import java.io.File;

public class FileTesting {
  public static void main(String[] args) {
    File f = new File("MyCode.txt");
    File dir = new File("Chapter16");
    dir.mkdir();
    if (dir.isDirectory()) {
      String[] dirContents = dir.list();
      for (String dirContent : dirContents) {
        System.out.println(dirContent);
      }
    }
  }
}
