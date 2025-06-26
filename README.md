# Library Management System

A simple Java-based command-line mini system to manage books and users. This project simulates the core functionalities of a library, such as issuing and returning books, using object-oriented principles.

---

##  Objective

To build a mini Library Management System that:
- Manages a collection of books.
- Keeps track of users.
- Supports issuing and returning books.

---

## Project Structure

```
Library-Management-System/
├── src/
│   ├── model/
│   │   ├── Book.java
│   │   └── User.java
│   ├── service/
│   │   └── Library.java
│   └── main/
│       └── Main.java
```
## Components
1. model/
Contains data classes representing the core entities:

-> Book.java
Represents a book with fields like id, title, author, and isIssued.

-> User.java
Represents a user with fields such as userId, name, and list of borrowed books.

2. service/
Contains the business logic of the library system:

Library.java
Handles the core functionality:

Add books

Add users

Issue books to users

Return books from users

Display all books and users

3. main/
Main.java
Contains the main method.
Provides a CLI (Command Line Interface) for users to interact with the system using a simple menu.




## Getting Started

Prerequisites:
Java 8 or above
Any Java IDE or terminal with javac

Running the Program
Clone the repository:
git clone https://github.com/an5-huu/Library-Management-System.git

Navigate to the project directory:
cd Library-Management-System

Compile and run the program:
javac src/main/Main.java
java main.Main
