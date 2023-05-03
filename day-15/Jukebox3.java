import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Jukebox3 {
    public static void main(String[] args) {
        new Jukebox3().go();
    }

    public void go(){
        List<SongV2> songList = MockSongs.getSongsV2();
        System.out.println(songList);

        Collections.sort(songList);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        songList.sort(artistCompare);
        System.out.println(songList);

        TitleCompare titleCompare = new TitleCompare();
        songList.sort(titleCompare);
        System.out.println(songList);
    }
}

class TitleCompare implements Comparator<SongV2>{
    public int compare (SongV2 one, SongV2 two) {
        return one.getTitle().compareTo(two.getTitle());
    }
}
class ArtistCompare implements Comparator<SongV2>{
    public int compare (SongV2 one, SongV2 two) {
        return one.getArtist().compareTo(two.getArtist());
    }
}