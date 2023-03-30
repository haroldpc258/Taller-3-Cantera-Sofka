package SongManager;

import java.util.ArrayList;
import java.util.Comparator;
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

    public List<Song> filterByGenre(String genreFilter) {
        List<Song> filteredSongs = new ArrayList<Song>();
        for (Song song : this.library) {
            if (song.getGenre().equalsIgnoreCase(genreFilter)) {
                filteredSongs.add(song);
            }
        }
        return filteredSongs;
    }

    public List<Song> filterByYear(int yearFilter) {
        List<Song> filteredSongs = new ArrayList<Song>();
        for (Song song : this.library) {
            int yearSong = song.getReleaseDate().getYear();
            if (yearSong == yearFilter) {
                filteredSongs.add(song);
            }
        }
        return filteredSongs;
    }

    public List<Song> orderByDuration(boolean ascendant) {
        List<Song> orderedSongs = new ArrayList<Song>(this.library);
        orderedSongs.sort(new Comparator<Song>() {
            @Override
            public int compare(Song song1, Song song2) {
                if (ascendant) {
                    return Integer.compare(song1.getDuration(), song2.getDuration());
                } else {
                    return Integer.compare(song2.getDuration(), song1.getDuration());
                }
            }
        });
        return orderedSongs;
    }

    public List<Song> orderByDate(boolean ascendant) {
        List<Song> orderedSongs = new ArrayList<Song>(this.library);
        orderedSongs.sort(new Comparator<Song>() {
            @Override
            public int compare(Song song1, Song song2) {
                if (ascendant) {
                    return song1.getReleaseDate().compareTo(song2.getReleaseDate());
                } else {
                    return song2.getReleaseDate().compareTo(song1.getReleaseDate());
                }
            }
        });
        return orderedSongs;
    }

    public String showSongs(List<Song> songs) {
        StringBuilder sb = new StringBuilder();
        sb.append("SONGS:\n");
        sb.append(String.format("%-5s | %-25s | %-10s | %-8s | %-10s | %-26s | %-30s\n", "ID", "Título", "Fecha", "Duración", "Género", "Carátula", "Descripción"));
        for (Song song : songs) {
            sb.append(String.format("%-5s | %-25s | %-10s | %-7d s| %-10s | %-26s | %-30s\n", song.getId(), song.getTitle(), song.getReleaseDate().toString(), song.getDuration(), song.getGenre(), song.getCover(), song.getDescription()));
        }
        return sb.toString();
    }



}
