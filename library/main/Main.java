package library.main;

import library.model.Book;
import library.model.User;
import library.service.Library;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book ID:");
        String bookId = scanner.nextLine();

        System.out.println("Enter title of the book:");
        String bookTitle = scanner.nextLine();

        System.out.println("Enter author's name:");
        String bookAuthor = scanner.nextLine();

        // create and add book to the library
        Book book = new Book(bookId, bookTitle, bookAuthor);
        library.addBook(book);

        // Get user details
        System.out.println("Enter user ID:");
        String userId = scanner.nextLine();

        System.out.println("Enter user name:");
        String userName = scanner.nextLine();

        // for registering the user
        User user = new User(userId, userName);
        library.registerUser(user);

        // issue the book
        boolean issued = library.issueBook(userId, bookId);
        System.out.println("Book issued successfully: " + issued);

        // return the book
        boolean returned = library.returnBook(userId, bookId);
        System.out.println("Book returned successfully: " + returned);

    }
}