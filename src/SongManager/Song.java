package SongManager;

import java.time.LocalDate;

public class Song {
    private String title;
    private String id;
    private LocalDate releaseDate;
    private int duration;
    private String genre;
    private String cover;
    private String description;

    public Song(String title, String id, LocalDate releaseDate, int duration, String genre, String cover, String description) {
        this.title = title;
        this.id = id;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this. description = description;
    }

    public String getTitle() {
        return this.title;
    }

    public String getId() {
        return this.id;
    }

    public LocalDate getReleaseDate() {
        return this.releaseDate;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getCover() {
        return this.cover;
    }

    public String getDescription() {
        return this.description;
    }
}
