# **Song Manager**
Song Manager es una aplicación en Java que permite administrar una lista de canciones.
La aplicación cuenta con una biblioteca principal que contiene todas las canciones disponibles, y ofrece funcionalidades para crear playlists con canciones específicas.
Cada canción en la biblioteca está representada por su título, identificador, fecha de lanzamiento, duración, género, carátula y una descripción.

## Funcionalidades
La aplicación Song Manager ofrece las siguientes funcionalidades:

1. Biblioteca de Canciones: La aplicación permite agregar canciones a la biblioteca principal mediante el método `addSong(Song song)`, 
donde se puede especificar el título, identificador, fecha de lanzamiento, duración, género, carátula y descripción de la canción.

2. Creación de Playlists: La aplicación permite crear playlists personalizadas con canciones específicas a partir de la biblioteca principal.
Esto se puede lograr utilizando el método `createPlaylist(List<String> songIds)`, donde se debe proporcionar una lista de identificadores de canciones para 
crear la playlist.

3. Filtrado por Género: La aplicación permite filtrar las canciones de la biblioteca por género utilizando el método `filterByGenre(String genre)`, 
donde se debe especificar el género deseado para obtener las canciones correspondientes.

4. Filtrado por Año: La aplicación permite filtrar las canciones de la biblioteca por año de lanzamiento utilizando el método `filterByYear(int year)`,
donde se debe especificar el año deseado para obtener las canciones correspondientes.

5. Ordenamiento por Fecha: La aplicación permite ordenar las canciones de la biblioteca por fecha de lanzamiento, ya sea en orden ascendente o descendente. 
Esto se puede lograr utilizando el método `orderByDate(boolean ascending)`, donde se debe especificar si se desea ordenar en orden ascendente (true) 
o descendente (false).

6. Ordenamiento por Duración: La aplicación permite ordenar las canciones de la biblioteca por duración, ya sea en orden ascendente o descendente. 
Esto se puede lograr utilizando el método `orderByDuration(boolean ascending)`, 
donde se debe especificar si se desea ordenar en orden ascendente (true) o descendente (false).

## Clases y Métodos Principales
* `Manager`: Clase principal que gestiona la biblioteca de canciones y realiza las operaciones de filtrado, ordenamiento y creación de playlists. 
Los métodos principales son:

  * `addSong(Song song)`: Agrega una canción a la biblioteca de canciones.
  * `createPlaylist(List<String> songIds)`: Crea una playlist con las canciones correspondientes a los identificadores proporcionados.
  * `filterByGenre(String genre)`: Filtra las canciones de la biblioteca por género.
  * `filterByYear(int year)`: Filtra las canciones de la biblioteca por año.
  * `orderByDate(boolean ascending)`: Ordena las canciones de la biblioteca por fecha.
  * `orderByDuration(boolean ascending)`: Ordena las canciones de la biblioteca por duración.
  
* `Song`: Clase que representa una canción en la biblioteca. Tiene los siguientes atributos:

  * `title`: Título de la canción.
  * `id`: Identificador de la canción.
  * `date`: Fecha de la canción.
  * `duration`: Duración de la canción en segundos.
  * `genre`: Género de la canción.
  * `cover`: Carátula de la canción.
  * `description`: Descripción de la canción.

## USO
Para utilizar la aplicación Song Manager, se sigue el siguiente procedimiento:

1. Crear una instancia de la clase `Manager` mediante `Manager songmanager = new Manager()`, la cual representará el administrador de canciones.

2. Agregar canciones a la biblioteca principal utilizando el método `addSong(Song song)` con los datos de la canción, como título, identificador,
fecha de lanzamiento, duración, género, carátula y descripción.

3. Utilizar las funcionalidades de la aplicación, como la creación de playlists, el filtrado por género o año, y el ordenamiento por fecha o duración, 
utilizando los métodos correspondientes.

4. Mostrar los resultados en la consola utilizando el método `showSongs(List<Song> songs, String title)` que recibe la lista de canciones a mostrar y un 
título para identificar el tipo de lista que se está mostrando.

## Requisitos
La aplicación Song Manager requiere tener instalado Java Development Kit (JDK) en el sistema para poder ser compilada y ejecutada. 
Se recomienda tener al menos la versión 8 de JDK o superior.

## Contribuciones
Este programa ha sido creado con fines educativos y de aprendizaje. Se aceptan sugerencias y mejoras para el código.

  
  
