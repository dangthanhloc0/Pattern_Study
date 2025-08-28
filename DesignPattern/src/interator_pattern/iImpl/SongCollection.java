package interator_pattern.iImpl;

import interator_pattern.interfaceEx.Aggregate;
import interator_pattern.interfaceEx.Iterator;

import java.util.List;

public class SongCollection implements Aggregate<String> {
    private List<String> songs;

    public SongCollection(List<String> songs) {
        this.songs = songs;
    }

    @Override
    public Iterator<String> createIterator() {
        return new SongIterator(songs);
    }
}

