import java.util.List;
import java.util.NoSuchElementException;

public class SongIterator implements IIterator<Song> {
    private List<Song> songs;
    private int position;

    public SongIterator(List<Song> songs) {
        this.songs = songs;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public Song next() {
        if (this.hasNext()) {
            return songs.get(position++);
        } else {
            throw new NoSuchElementException("No more songs in the playlist.");
        }
    }
}
