package library.service;

import library.model.Book;
import library.model.User;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books;
    private Map<String, User> users;

    public Library(){
        this.books=new HashMap<>();
        this.users=new HashMap<>();
    }

    // for adding a new book to the library
    public void addBook(Book book){
        books.put(book.getBookId(), book);
    }
    // Register a new user
    public void registerUser(User user){
        users.put(user.getId(), user);
    }

    // issue a book to the user
    public boolean issueBook(String userId, String bookId) {
        User user = users.get(userId);
        Book book = books.get(bookId);


        if (user != null && book != null && book.isAvailable()) {
            book.setAvailable(false);
            user.addBorrowedBook(book);
            return true;
        }
        return false;
    }

    // return the book
    public boolean returnBook(String userId, String bookId) {
        User user=users.get(userId);
        Book book=books.get(bookId);

        if(user!= null && book!= null && user.getBorrowedBooks().contains(book)) {
            book.setAvailable(true);
            user.removeBorrowedBook(book);
            return true;
        }
        return false;
    }
}
