import java.util.ArrayList;
import java.util.List;

public class Playlist implements IAggregate<Song> {
    private List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    @Override
    public IIterator<Song> createIterator() {
        return new SongIterator(songs);
    }
}
