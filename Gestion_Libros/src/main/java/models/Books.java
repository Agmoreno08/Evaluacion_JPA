package models;

public class Books {

    private Integer id;
    private String author;
    private String title;
    private Integer publicationYear;
    private Boolean available;

    public Books() {
    }

    public Books(Integer id, String author, String title, Integer publicationYear, Boolean available) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        this.available = available;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", available=" + available +
                '}';
    }
}



