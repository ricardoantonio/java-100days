package day14;

import java.util.*;

public class Jukebox1 {
  public static void main(String[] args) {
    new Jukebox1().go();

  }

  public void go() {
    List<String> songsList = MockSongs.getSongsStrings();
    System.out.println(songsList);

    // Sort in "natural order" means alphabetical
    Collections.sort(songsList);
    System.out.println(songsList);
  }

}
