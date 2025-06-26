package library.model;

public class Book {
    private String BookId;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String BookId, String title, String author) {
        this.BookId=BookId;
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }
    // we created Getter method for BookId, BookName and author because of immutability because it should not be same but unique
    public String getBookId() {
        return BookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // and set for isAvailable means it is available or not if it is then set the method as true

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override  // overriding the toString() method from the Object class
    public String toString(){
        return String.format("%s by %s (%s)", title, author,  // %s is a placeholder for a String value
                isAvailable ? "Available" : "Borrowed");
    }

}
