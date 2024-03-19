import popka2.Book;
import popka2.Libraru;
import popka3.popka31.BookService;
import popka3.popka31.Bookserviceimpl;
import popka3.popka31.LibraryService11;
import popka3.popka31.LibraryService3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LibraryService11 libraryService11 = new LibraryService3();
        BookService bookService = new Bookserviceimpl();

        while (true) {
            System.out.println("""
                    1.library
                    2.book
                    3.reader
                    """);
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:
                    while (true) {
                        System.out.println("""
                               
                                1.save Library
                                2.get All Library
                              
                                    """);
                        switch (scanner.nextInt()) {
                            case 1:
                                Libraru libraru = new Libraru();
                                System.out.println("китеп кананын атын жаз: ");
                                String name = scanner.next();
                                libraru.setName(name);
                                System.out.println("Китеп кананын адресин жаз: ");
                                String adres = scanner.next();
                                libraru.setAdres(adres);
                                System.out.println("ID");
                                int jana = scanner.nextInt();
                                libraru.setId(jana);
                                System.out.println("");
                                System.out.println(libraryService11.saveLibrary(libraru));
                                break;
                            case 2:
                                Book book = new Book();
                                System.out.println("ID");
                                int jana1 = scanner.nextInt();
                                book.setId(jana1);
                                System.out.println(bookService.getAllBooks(new Book()));


                        }

                    }
            }
        }


    }
}

    


