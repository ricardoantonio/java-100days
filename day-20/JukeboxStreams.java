import java.util.List;
import java.util.stream.Collectors;

public class JukeboxStreams {
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();
        System.out.println(songs);

        List<Song> rockSongs = songs.stream()
                .filter(song -> song.getGenre().contains("rock"))
                .collect(Collectors.toList());
        System.out.println(rockSongs);


        List<Song> beatlesSongs = songs.stream()
                .filter(song -> song.getArtist().contains("Beatles"))
                .collect(Collectors.toList());
        System.out.println(beatlesSongs);

        List<Song> after95Songs = songs.stream()
                .filter(song -> song.getYear() > 1995)
                .collect(Collectors.toList());
        System.out.println(after95Songs);

        List<Song> hSongs = songs.stream()
                .filter(song -> song.getTitle().startsWith("H"))
                .collect(Collectors.toList());
        System.out.println(hSongs);

        // Using Method Reference
        List<String> genres = songs.stream()
                .map(Song::getGenre)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(genres);


        List<String> top5Songs = songs.stream()
                .sorted((one, two) -> two.getTimesPlayed() - one.getTimesPlayed())
                .map(Song::getTitle)
                .limit(5)
                .toList();
        System.out.println(top5Songs);
    }
}
