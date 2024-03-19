package popka2;

public class Book {
    private  int id;
    private  String name;
    private  String  author;
    private String  Genre_genre;

    public Book() {
    }

    public Book(int id, String name, String author, String genre_genre) {
        this.id = id;
        this.name = name;
        this.author = author;
        Genre_genre = genre_genre;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre_genre() {
        return Genre_genre;
    }

    public void setGenre_genre(String genre_genre) {
        Genre_genre = genre_genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", Genre_genre='" + Genre_genre + '\'' +
                '}';
    }


}
