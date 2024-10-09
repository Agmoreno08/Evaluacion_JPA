package models;

public class Books {

    // Atributos de la clase
    private Integer id;
    private String autor;
    private String titulo;
    private Integer anioPublicacion;
    private Boolean disponible;

    // Constructor vacío
    public Books() {
    }

    // Constructor con parámetros
    public Books(String autor, String titulo, Integer anioPublicacion, Boolean disponible) {
        this.autor = autor;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    // Método toString para mostrar la información del libro
    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anioPublicacion=" + anioPublicacion +
                ", disponible=" + disponible +
                '}';
    }
}




