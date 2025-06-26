package library.model;

import java.util.ArrayList;
import java.util.List;

public class User {
        private String id;
        private String name;
        private List<Book> borrowedBooks;  // user can issue multiple books at a time that's why we use List Collection Framework here

        public User(String id, String name){
            this.id=id;
            this.name=name;
            this.borrowedBooks=new ArrayList<>();
            }

            // Getter methods to get the value of id, name and BorrowedBooks
            public String getId(){
            return id;
            }

            public String getName(){
            return name;
            }

            public List<Book> getBorrowedBooks(){
            return borrowedBooks;
            }

            // and want to add,remove borrowedBooks
        public void addBorrowedBook(Book book){
            borrowedBooks.add(book);
        }
        public void removeBorrowedBook(Book book){
            borrowedBooks.remove(book);
        }

        }
