/**
 * La clase Manager es la encargada de gestionar la biblioteca de canciones y ofrece métodos para realizar
 * diferentes acciones sobre la biblioteca como agregar una canción, crear una lista de reproducción,
 * filtrar canciones por género o año, ordenar canciones por duración o fecha, y mostrar una lista de canciones.
 */
package song.manager;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    /**
     * La lista de canciones que conforman la biblioteca.
     */
    private final List<Song> library;

    /**
     * El constructor de la clase Manager que inicializa la biblioteca como una lista vacía de canciones.
     */
    public Manager() {
        this.library = new ArrayList<>();
    }

    /**
     * Retorna la lista de canciones que conforman la biblioteca.
     *
     * @return la lista de canciones que conforman la biblioteca.
     */
    public List<Song> getLibrary() {
        return this.library;
    }

    /**
     * Agrega una canción a la biblioteca.
     *
     * @param song la canción que se desea agregar.
     */
    public void addSong(final Song song) {
        this.library.add(song);
    }

    /**
     * Crea una lista de reproducción a partir de una lista de ids de canciones.
     *
     * @param songIds la lista de ids de las canciones que se desean agregar a la lista de reproducción.
     * @return la lista de canciones que conforman la lista de reproducción.
     */
    public List<Song> createPlaylist(final List<String> songIds) {
        final List<Song> playlist = new ArrayList<>();
        for (final String id : songIds) {
            for (final Song song : this.library) {
                if (song.getId().equals(id)) {
                    playlist.add(song);
                }
            }
        }
        return playlist;
    }

    /**
     * Filtra las canciones de la biblioteca por género.
     *
     * @param genreFilter el género por el cual se desea filtrar las canciones.
     * @return la lista de canciones que cumplen con el filtro de género.
     */
    public List<Song> filterByGenre(final String genreFilter) {
        final List<Song> filteredSongs = new ArrayList<>();
        for (final Song song : this.library) {
            if (song.getGenre().equalsIgnoreCase(genreFilter)) {
                filteredSongs.add(song);
            }
        }
        return filteredSongs;
    }

    /**
     * Filtra las canciones de la biblioteca por año de lanzamiento.
     *
     * @param yearFilter el año por el cual se desea filtrar las canciones.
     * @return la lista de canciones que cumplen con el filtro de año.
     */
    public List<Song> filterByYear(final int yearFilter) {
        final List<Song> filteredSongs = new ArrayList<>();
        for (final Song song : this.library) {
            final Integer yearSong = song.getReleaseDate().getYear();
            if (yearSong.equals(yearFilter)) {
                filteredSongs.add(song);
            }
        }
        return filteredSongs;
    }

/**
 * Ordena las canciones de la biblioteca por duración.
 *
 * @param ascendant si es verdadero, la lista de canciones se ordena de manera ascendente por duración, de lo contrario, se ordena de manera descendente.
 * @return la lista de canciones ordenada por duración.
 */
    public List<Song> orderByDuration(final boolean ascendant) {
        final List<Song> orderedSongs = new ArrayList<>(this.library);
        /**
         * Compara la duración de dos canciones y devuelve un entero
         * que indica el orden relativo de las canciones en función
         * de su duración.
         * @param song1 la primera canción a comparar
         * @param song2 la segunda canción a comparar
         * @return -1 si la primera canción es más corta que la segunda,
         *          0 si tienen la misma duración
         *          1 si la primera canción es más larga que la segunda
         */
        orderedSongs.sort((song1, song2) -> {
            if (ascendant) {
                return Integer.compare(song1.getDuration(), song2.getDuration());
            } else {
                return Integer.compare(song2.getDuration(), song1.getDuration());
            }
        });
        return orderedSongs;
    }

    /**
     * Devuelve una lista ordenada de canciones por fecha de lanzamiento
     * en orden ascendente o descendente según el valor del parámetro
     * 'ascendant'.
     * @param ascendant true si se desea un orden ascendente, false si se
     *                  desea un orden descendente
     * @return una lista ordenada de canciones por fecha de lanzamiento
     */
    public List<Song> orderByDate(final boolean ascendant) {
        final List<Song> orderedSongs = new ArrayList<>(this.library);
        /**
         * Compara la fecha de lanzamiento de dos canciones y devuelve un entero
         * que indica el orden relativo de las canciones en función de su fecha
         * de lanzamiento.
         * @param song1 la primera canción a comparar
         * @param song2 la segunda canción a comparar
         * @return -1 si la primera canción se lanzó antes que la segunda,
         *          0 si se lanzaron en la misma fecha
         *          1 si la primera canción se lanzó después que la segunda
         */
        orderedSongs.sort((song1, song2) -> {
            if (ascendant) {
                return song1.getReleaseDate().compareTo(song2.getReleaseDate());
            } else {
                return song2.getReleaseDate().compareTo(song1.getReleaseDate());
            }
        });
        return orderedSongs;
    }


    /**
     * Genera una lista de canciones formateada para mostrar en consola.
     * @param songsToShow la lista de canciones a mostrar
     * @param songList el título de la lista de canciones
     * @return una cadena de caracteres formateada para mostrar en consola
     */
    public String showSongs(final List<Song> songsToShow, final String songList) {
        final StringBuilder sb = new StringBuilder();
        sb.append(songList).append('\n').append(String.format("%-5s | %-25s | %-10s | %-8s | %-10s | %-26s | %-30s\n", "ID", "Título", "Fecha", "Duración", "Género", "Carátula", "Descripción"));
        for (final Song song : songsToShow) {
            sb.append(String.format("%-5s | %-25s | %-10s | %-7d s| %-10s | %-26s | %-30s\n", song.getId(), song.getTitle(), song.getReleaseDate().toString(), song.getDuration(), song.getGenre(), song.getCover(), song.getDescription()));
        }
        return sb.toString();
    }
}
