package day14;

import java.util.*;

class MockSongs {
  public static List<String> getSongsStrings() {
    List<String> songs = new ArrayList<>();

    songs.add("somersault");
    songs.add("cassidy");
    songs.add("$10");
    songs.add("havana");
    songs.add("Cassidy");
    songs.add("50 ways");

    return songs;
  }

  public static List<SongV2> getSongsV2 (){
    List<SongV2> songs = new ArrayList<>();

    songs.add(new SongV2("somersault", "zero 7", 147));
    songs.add(new SongV2("cassidy", "grateful dead", 158));
    songs.add(new SongV2("$10", "hitchhiker", 140));
    songs.add(new SongV2("havana", "cabello", 105));
    songs.add(new SongV2("Cassidy", "grateful dead", 158));
    songs.add(new SongV2("50 ways", "simon", 102));

    return songs;
  }
}