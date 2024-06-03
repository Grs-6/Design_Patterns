import java.util.ArrayList;
import java.util.List;

public class Playlist implements Aggregate<Song> {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public Iterator<Song> createIterator() {
        return new SongIterator(songs);
    }
}
