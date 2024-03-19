package popka3.popka31;

import popka2.Database;
import popka2.Libraru;

import java.util.List;
import java.util.Scanner;

public class LibraryService3 implements  LibraryService11 {
//    Libraru libraru = new Libraru();
//    Scanner scanner = new Scanner(System.in);
//    int aa1 = scanner.nextInt();

    @Override
    public  Libraru saveLibrary(Libraru libraries) {
         Database.lidraries.add(libraries);
         return libraries;
    }

    @Override
    public List<Libraru> getAllLibraries() {
        return Database.lidraries;
    }

    @Override
    public Libraru getLibraryById(Long id) {;
        return null ;
    }

    @Override
    public Libraru updateLibrary(Long id, Libraru library) {
        return null;
    }

    @Override
    public String deleteLibrary(Long id) {
        return null;

    }
}