/**
 * La clase Song representa una composición musical, incluyendo su título, identificador, fecha de lanzamiento, duración, género, portada y descripción.
 * Esta clase proporciona métodos para recuperar cada uno de estos atributos.
 */
package SongManager;
import java.time.LocalDate;

public class Song {
    private String title;        //el título de la canción
    private String id;           //el identificador único de la canción
    private LocalDate releaseDate; //la fecha de lanzamiento de la canción
    private int duration;        //la duración de la canción en segundos
    private String genre;        //el género musical de la canción
    private String cover;        //el nombre del archivo de imagen de portada de la canción
    private String description;  //la descripción de la canción

    /**
     * Crea una nueva canción con los parámetros especificados.
     *
     * @param title       el título de la canción
     * @param id          el identificador único de la canción
     * @param releaseDate la fecha de lanzamiento de la canción
     * @param duration    la duración de la canción en segundos
     * @param genre       el género musical de la canción
     * @param cover       el nombre del archivo de imagen de portada de la canción
     * @param description la descripción de la canción
     */
    public Song(String title, String id, LocalDate releaseDate, int duration, String genre, String cover, String description) {
        this.title = title;
        this.id = id;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;
    }

    /**
     * Obtiene el título de la canción.
     *
     * @return el título de la canción
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Obtiene el identificador único de la canción.
     *
     * @return el identificador único de la canción
     */
    public String getId() {
        return this.id;
    }

    /**
     * Obtiene la fecha de lanzamiento de la canción.
     *
     * @return la fecha de lanzamiento de la canción
     */
    public LocalDate getReleaseDate() {
        return this.releaseDate;
    }

    /**
     * Obtiene la duración de la canción en segundos.
     *
     * @return la duración de la canción en segundos
     */
    public int getDuration() {
        return this.duration;
    }

    /**
     * Obtiene el género musical de la canción.
     *
     * @return el género musical de la canción
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * Obtiene el nombre del archivo de imagen de portada de la canción.
     *
     * @return el nombre del archivo de imagen de portada de la canción
     */
    public String getCover() {
        return this.cover;
    }

    /**
     * Obtiene la descripción de la canción.
     *
     * @return la descripción de la canción
     */
    public String getDescription() {
        return this.description;
    }
}
