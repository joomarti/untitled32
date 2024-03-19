package popka3.popka31;

import popka2.Libraru;

import java.util.List;

public interface LibraryService11 {
    Libraru saveLibrary(Libraru libraries);

    List<Libraru>getAllLibraries();

    Libraru getLibraryById(Long id);

    Libraru updateLibrary(Long id, Libraru library);

    String deleteLibrary(Long id);
}
