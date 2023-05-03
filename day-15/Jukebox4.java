import java.util.List;

public class Jukebox4 {
    public static void main(String[] args) {
        new Jukebox4().go();
    }

    public void go(){
        List<SongV2> songList = MockSongs.getSongsV2();
        // Implements Comparators using lambdas;
        songList.sort((one, two)-> one.getTitle().compareTo(two.getTitle()));
        System.out.println(songList);

        songList.sort((one, two)-> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);

        songList.sort((one, two) -> one.getBpm() - two.getBpm());
        System.out.println(songList);

        // order in descending
        songList.sort((one, two)-> two.getTitle().compareTo(one.getTitle()));
        System.out.println(songList);
    }
}
