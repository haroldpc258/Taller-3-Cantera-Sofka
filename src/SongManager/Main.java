package SongManager;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager songmanager = new Manager();
        songmanager.addSong(new Song("Bohemian Rhapsody", "1", LocalDate.of(2023, 03, 28), 354, "Rock", "bohemian-rhapsody.jpg", "A classic rock anthem"));
        songmanager.addSong(new Song("Despacito", "2", LocalDate.of(2010, 11, 01), 228, "Pop", "despacito.jpg", "A Latin hit"));
        songmanager.addSong(new Song("Stairway to Heaven", "3", LocalDate.of(1999, 12, 05), 482, "Rock", "stairway-to-heaven.jpg", "A guitar-driven masterpiece"));
        songmanager.addSong(new Song("Uptown Funk", "4", LocalDate.of(2010, 01, 24), 270, "Funk", "uptown-funk.jpg", "A danceable groove"));

        List<Song> rockSongs = songmanager.filterByGenre("Rock");
        System.out.println(songmanager.showSongs(rockSongs));
        System.out.println();

        List<Song> songsByYearDesc = songmanager.orderByDate(false);
        System.out.println(songmanager.showSongs(songsByYearDesc));
        System.out.println();


    }
}