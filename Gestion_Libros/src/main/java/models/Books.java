package models;

public class Books {

    private Integer Id;
    private String Autor;
    private String Titulo;
    private Integer AnioPublicacion;
    private Boolean disponible;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public Integer getAnioPublicacion() {
        return AnioPublicacion;
    }
    public void setAnioPublicacion(Integer anioPublicacion) {
        AnioPublicacion = anioPublicacion;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}



