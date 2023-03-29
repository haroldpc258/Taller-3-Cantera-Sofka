package SongManager;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    private List<Song> library;

    public Manager() {
        this.library = new ArrayList<Song>();
    }

    public List<Song> getLibrary() {
        return this.library;
    }

    public void addSong(Song song) {
        this.library.add(song);
    }

    public List<Song> createPlaylist(List<String> songIds) {
        List<Song> playlist = new ArrayList<Song>();
        for (String id : songIds) {
            for (Song song : this.library) {
                if (song.getId().equals(id)) {
                    playlist.add(song);
                }
            }
        }
        return playlist;
    }


}
