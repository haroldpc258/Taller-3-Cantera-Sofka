/**
 * La clase Main es la clase principal que inicia la aplicación.
 * Esta clase crea una instancia de la clase Manager, la cual se encarga de gestionar las canciones.
 * También agrega diez canciones utilizando el método addSong de la clase Manager.
 * Luego, usa diversos métodos de la clase Manager para mostrar la información sobre las canciones, ordenarlas y filtrarlas según ciertos criterios.
 * @author Harold Peña
 * @version 1.0
 * @since 28 de marzo de 2023
 */
package SongManager;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * Método principal que crea la biblioteca de canciones, crea una lista de reproducción,
     * filtra las canciones por género, año y ordena las canciones por fecha y duración
     *
     * @param args argumentos de línea de comandos (no utilizado)
     */
    public static void main(String[] args) {

        Manager songmanager = new Manager(); //crea un objeto de la clase Manager para administrar las canciones

        // Agrega canciones a la biblioteca de canciones
        songmanager.addSong(new Song("Bohemian Rhapsody", "1", LocalDate.of(1975, 10, 31), 354, "Rock", "bohemian-rhapsody.jpg", "Un himno clásico del rock"));
        songmanager.addSong(new Song("Despacito", "2", LocalDate.of(2017, 1, 12), 228, "Pop", "despacito.jpg", "Un éxito latino"));
        songmanager.addSong(new Song("Stairway to Heaven", "3", LocalDate.of(1971, 11, 8), 482, "Rock", "stairway-to-heaven.jpg", "Una obra maestra impulsada por la guitarra"));
        songmanager.addSong(new Song("Uptown Funk", "4", LocalDate.of(2014, 11, 10), 270, "Funk", "uptown-funk.jpg", "Un ritmo bailable"));
        songmanager.addSong(new Song("Thriller", "5", LocalDate.of(1982, 11, 30), 357, "Pop", "thriller.jpg", "El mayor éxito del Rey del Pop"));
        songmanager.addSong(new Song("Back in Black", "6", LocalDate.of(1980, 7, 25), 255, "Rock", "back-in-black.jpg", "Uno de los álbumes de rock más icónicos de todos los tiempos"));
        songmanager.addSong(new Song("Like a Rolling Stone", "7", LocalDate.of(1965, 7, 20), 361, "Rock", "like-a-rolling-stone.jpg", "El mayor éxito de Bob Dylan"));
        songmanager.addSong(new Song("Boogie Wonderland", "8", LocalDate.of(1979, 3, 20), 296, "Disco", "boogie-wonderland.jpg", "Un clásico disco de Earth, Wind & Fire"));
        songmanager.addSong(new Song("Poker Face", "9", LocalDate.of(2008, 9, 26), 235, "Pop", "poker-face.jpg", "Una pegadiza pista de baile"));
        songmanager.addSong(new Song("Viva la Vida", "10", LocalDate.of(2008, 6, 13), 242, "Rock", "viva-la-vida.jpg", "Un himno ascendente"));

        // Obtener la biblioteca de canciones y mostrarla en la consola.
        List<Song> library = songmanager.getLibrary();
        System.out.println(songmanager.showSongs(library, "BIBLIOTECA"));
        System.out.println();

        // Crear una lista de Ids de canciones y crear una nueva playlist utilizando estos Ids.
        List<String> songIds = new ArrayList<String>();
        songIds.add("1");
        songIds.add("3");
        songIds.add("10");
        List<Song> playlist = songmanager.createPlaylist(songIds);
        System.out.println(songmanager.showSongs(playlist, "PLAYLIST"));
        System.out.println();

        // Filtrar las canciones de la biblioteca por género y mostrarlas en la consola.
        List<Song> songsByGenre = songmanager.filterByGenre("Rock");
        System.out.println(songmanager.showSongs(songsByGenre, "CANCIONES FILTRADAS"));
        System.out.println();

        // Filtrar las canciones de la biblioteca por año y mostrarlas en la consola.
        List<Song> songsByYear = songmanager.filterByYear(2008);
        System.out.println(songmanager.showSongs(songsByYear, "CANCIONES FILTRADAS"));
        System.out.println();

        // Ordenar las canciones de la biblioteca por fecha y mostrarlas en la consola.
        List<Song> songsByDate = songmanager.orderByDate(true);
        System.out.println(songmanager.showSongs(songsByDate, "CANCIONES ORDENADAS"));
        System.out.println();

        // Ordenar las canciones de la biblioteca por duración y mostrarlas en la consola.
        List<Song> songsByDuration = songmanager.orderByDuration(true);
        System.out.println(songmanager.showSongs(songsByDuration, "CANCIONES ORDENADAS"));

    }
}