package popka3.popka31.popka31;

import java.io.Reader;
import java.util.List;

public interface ReaderService1 {
    void saveReader(Reader reader);

    List<Reader> getAllReaders();

    Reader getReaderById(Long id);

    Reader updateReader(Long id, Reader reader);

    void assignReaderToLibrary(Long readerId,Long libraryId);
}
