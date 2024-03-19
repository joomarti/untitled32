package popka2;

import java.util.List;

public class Libraru {
    private int id;
    private  String   name;
    private String adres;
    private List<Libraru>libraries;
   private List<Book>books;
   private List<Reader>readers;

    public Libraru() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String  getName() {
        return name;
    }

    public void setName(String  name) {
        this.name = name;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<Libraru> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<Libraru> libraries) {
        this.libraries = libraries;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void setReaders(List<Reader> readers) {
        this.readers = readers;
    }

    @Override
    public String toString() {
        return "Libraru{" +
                "id=" + id +
                ", name=" + name +
                ", adres='" + adres + '\'' +
                ", libraries=" + libraries +
                ", books=" + books +
                ", readers=" + readers +
                '}';
    }

    public Libraru(int id, String  name, String adres, List<Libraru> libraries, List<Book> books, List<Reader> readers) {
        this.id = id;
        this.name = name;
        this.adres = adres;
        this.libraries = libraries;
        this.books = books;
        this.readers = readers;
    }
}
