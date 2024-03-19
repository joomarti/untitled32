package popka3.popka31;

import popka2.Book;

import java.util.*;

import static popka2.Database.books;


public class Bookserviceimpl implements BookService {
//    LibraryService3  libraryService3 = new LibraryService3();

//    Scanner scanner = new Scanner(System.in);
//    List <Book> books = new ArrayList<>();
//    List<Book> BOOK = new ArrayList();

    @Override
    public Book saveBook(Long libraryId, Book book) {
        for (Book lidrary : books) {
            if (lidrary.getId()==libraryId){
                System.out.println(lidrary.getId());;
                return book;
            }else
                System.out.println("Мындай библеотека жок !");

        }

        return null;
    }

    @Override
    public List<Book> getAllBooks(Book libraryId) {
        books.add(new Book());



        return null;
    }

    @Override
    public Book getBookById(Long libraryId, Long bookId)



    {
        return null;
    }

    @Override
    public String deleteBook(Long libraryId, Long bookId) {
        return null;
    }

    @Override
    public void clearBooksByLibraryId(Long libraryId) {

        }

    }
//    @Override
//    public Iterator iterator() {
//        books.add(new Book());
//        String nomer;
//        do {
//            System.out.print("ID");
//            nomer = scanner.nextLine();
//            if (!nomer.contains(books.toString())) {
//                System.out.println(books.iterator());
//                System.out.println("kataldynyz");
//
//            }}
//            while (nomer.contains((books.toString()))) ;
//            System.out.println((spliterator()));
//        System.out.println(books);
//
//        return books.iterator();
//    }
//
//    @Override
//    public Spliterator spliterator() {
//        String nomer1;
//        do {
//            System.out.print("grgr");
//            nomer1 = scanner.nextLine();
//            if (!nomer1.contains(BOOK.toString())) {
//                System.out.println("kataldynyz");
//                System.out.println();
//
//
//            }}
//        while (nomer1.contains((BOOK.toString()))) ;
//        System.out.println(books.iterator());
//
//        System.out.println(spliterator());
//
//        return spliterator();
//    }
//
//
//    public boolean isParallel() {
//        return false;
//    }
//
//    @Override
//    public BaseStream sequential() {
//        List <String> list1 = new ArrayList<>();
//        String nomer2;
//        do {
//            System.out.print("auder");
//            nomer2 = scanner.nextLine();
//            if (!nomer2.contains(list1.toString())) {
//                System.out.println("kataldynyz");
//                System.out.println(iterator());
//                System.out.println(spliterator());
//
//
//            }}
//        while (!nomer2.contains((list1.toString()))) ;
//
//        return null;
//    }
//
//    @Override
//    public BaseStream parallel() {
//        return null;
//    }
//
//    @Override
//    public BaseStream unordered() {
//        return null;
//    }
//
//    @Override
//    public BaseStream onClose(Runnable closeHandler) {
//        return null;
//    }
//
//    @Override
//    public void close() {
//
//    }


