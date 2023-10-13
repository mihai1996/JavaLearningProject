package md.tekwillacademy.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Create books and print
        Book book1 = new Book("Luceafarul", "M. Eminescu");
        Book book2 = new Book("Tom Soyer", "Mark Twain");
        Book book3 = new Book("C++", "B. Stroustrup");
        Book book4 = new Book("Amintiri din copilarie", "I. Creanga");
        book1.printTheBookDetails();
        book2.printTheBookDetails();
        book3.printTheBookDetails();
        System.out.println("\n");

        // create a library and populate it with books
        Library lib = new Library("Librarius");
        System.out.println(lib.getLibraryName());
        lib.addBook(book1);
        lib.addBook(book2);
        lib.addBook(book3);
        // lib.addBook(book4);

        // books number from the library
        System.out.println("Number of books from library is: " + lib.getTheBookListNumber());

        // check if the book exists in the library
        boolean bookStatus;
        bookStatus =  lib.isThereSuchABookInTheList(book4);

        if (bookStatus) {
            System.out.println("The book exists in the list.");
        } else {
            System.out.println("The book does not exists in the list.");
        }

        // delete a book from the list
        lib.deleteABookIfExists(book1);
        // books number from the library
        System.out.println("Number of books from library is: " + lib.getTheBookListNumber());
        System.out.println("\n");

        // print all books from the library
        System.out.println("Print available books form the library.");
        lib.printAllTheBooks();
        System.out.println("\n");

        // create a new library ex: ProNoi
        Library lib2 = new Library("ProNoi");
        System.out.println(lib2.getLibraryName());
        lib2.addBook(book4);
        lib2.addBook(book3);
        lib2.addBook(book1);

        // print list of book from the library
        lib2.printAllTheBooks();

        // create a Map of the libraries
        Map<String, Library> librariesMap = new HashMap<>();
        librariesMap.put("str. Dead Center 2", lib);
        librariesMap.put("str. Carnval 42", lib2);
        librariesMap.get("str. Carnval 42").printAllTheBooks();
        librariesMap.get("str. Dead Center 2").printAllTheBooks();

        // array workflow
        int[] dataTable = {10, 22, 2, 54};
        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.getAvg(dataTable));
    }
}
