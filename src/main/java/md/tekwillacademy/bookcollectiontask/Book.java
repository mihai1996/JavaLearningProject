package md.tekwillacademy.bookcollectiontask;

public class Book {

    private String title;
    private String author;

    public Book(String title, String author) {

        this.title = title;
        this.author = author;
        // System.out.println("The book title is " + title + " and the author is " + author);
    }

    public String getTitle() {
        return title;
    }

    public  String getAuthor() {
        return author;
    }

    public void printTheBookDetails() {

        System.out.println(getTitle() + "\t" + getAuthor());
    }
}
