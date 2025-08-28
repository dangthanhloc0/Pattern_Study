package interator_pattern.iImpl;

import interator_pattern.interfaceEx.Iterator;

import java.util.List;

public class SongIterator implements Iterator<String> {
    private List<String> songs;
    private int position = 0;

    public SongIterator(List<String> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }

    @Override
    public String next() {
        return songs.get(position++);
    }
}

