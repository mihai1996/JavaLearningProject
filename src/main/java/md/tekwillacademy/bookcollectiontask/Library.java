package md.tekwillacademy.bookcollectiontask;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList;
    private String libraryName;

    public Library(String name) {

        this.libraryName = name;
        bookList = new ArrayList<>();
    }

    public String getLibraryName(){
        return libraryName;
    }

    public void addBook(Book bookElement) {
        boolean bookStatus = bookList.add(bookElement);
        if (bookStatus) {
            System.out.println("The book " + bookElement.getTitle() + " has been added in the library " +
                               getLibraryName());
        } else {
            System.out.println("The book " + bookElement.getTitle() + " has not been added in the library " +
                               getLibraryName());
        }
    }

    public int getTheBookListNumber() {
        return bookList.size();
    }

    public boolean isThereSuchABookInTheList(Book book) {
        return bookList.contains(book);
    }

    public void deleteABookIfExists(Book book) {

        boolean bookStatus = bookList.remove(book);
        if (bookStatus) {
            System.out.println("The book " + book.getTitle() + " has been deleted.");
        } else {
            System.out.println("The book " + book.getTitle() + " has not been deleted.");
        }
    }

    public void printAllTheBooks() {

        for (int bookIndex = 0; bookIndex < bookList.size(); bookIndex++) {
            bookList.get(bookIndex).printTheBookDetails();
        }
    }
}
