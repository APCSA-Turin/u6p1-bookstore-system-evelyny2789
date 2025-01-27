package com.example.project;

import java.util.Scanner;

public class Interface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookStore store = new BookStore(); //create a new bookstore 

        while (true) {
            System.out.println("\n****** Welcome to the library ******");   //prints all the options
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Add User");
            System.out.println("4. Remove User");
            System.out.println("5. View All Books");
            System.out.println("6. View All Users");
            System.out.println("7. Exit");
            System.out.print("Please select from the options: ");

            int choice = scanner.nextInt();
            scanner.nextLine();   //scans the option  

            if (choice == 1) {  //add book 
                while (true) {
                    System.out.println("\n=== Add Book ===");
                    System.out.print("Enter book title (or type 'exit' to return to main menu): ");
                    String title = scanner.nextLine(); //scans the title of book 
                    if (title.equalsIgnoreCase("exit")) break;

                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine(); //scans the author of the book 
                    System.out.print("Enter year published: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); //scans the year the book was written
                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine(); //scans the book's isbn 
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt(); //scans the number of copies of the book 
                    scanner.nextLine();

                    store.addBook(new Book(title, author, year, isbn, quantity));  //stores the book along with all its info 
                    System.out.println("Book added successfully!");
                }
            }

            if (choice == 2) { //remove book 
                while (true) {
                    System.out.println("\n=== Remove Book ===");
                    System.out.print("Enter ISBN of the book to remove (or type 'exit' to return to main menu): ");
                    String isbn = scanner.nextLine();  //scans the isbn of the book to be removed 
                    if (isbn.equalsIgnoreCase("exit")) break;

                    Book[] books = store.getBooks();
                    boolean removed = false; //removed is set to false because nothing was removed yet 
                    for (Book book : books) { 
                        if (book != null && book.getIsbn().equals(isbn)) { //find the book's isnb by comparing it to the list of books
                            store.removeBook(book); //if found, the book will be removed 
                            removed = true; //removed will be changed from false to true because it was removed
                            System.out.println("Book removed successfully!");
                            break; 
                        }
                    }
                    if (!removed) System.out.println("Book not found!"); //if nothing was removed, it is because the book was not found 
                }
            }

            if (choice == 3) { //add user 
                while (true) {
                    System.out.println("\n=== Add User ===");
                    System.out.print("Enter user name (or type 'exit' to return to main menu): ");
                    String name = scanner.nextLine(); //scans name of user 
                    if (name.equalsIgnoreCase("exit")) break;

                    System.out.print("Enter user ID: "); 
                    String id = scanner.nextLine(); //scans the id of the user 

                    store.addUser(new User(name, id)); //stores the new user 
                    System.out.println("User added successfully!");
                }
            }

            if (choice == 4) { //remove user 
                while (true) {
                    System.out.println("\n=== Remove User ===");
                    System.out.print("Enter user ID to remove (or type 'exit' to return to main menu): ");
                    String id = scanner.nextLine(); //scans the id of the user to be removed 
                    if (id.equalsIgnoreCase("exit")) break;

                    User[] users = store.getUsers(); 
                    boolean removed = false;
                    for (User user : users) { //goes through the users 
                        if (user != null && user.getId().equals(id)) {  //compares all the users id 
                            store.removeUser(user); // if found, it will be removed 
                            removed = true;
                            System.out.println("User removed successfully!");
                            break; //breaks loop if found 
                        }
                    }
                    if (!removed) System.out.println("User not found!"); //not found, it will be unsuccessful 
                }
            }

            if (choice == 5) { //prints book list 
                while (true) {
                    System.out.println("\n=== Book List ===");
                    Book[] books = store.getBooks();
                    boolean isEmpty = true; 

                    for (Book book : books) { //goes through the list 
                        if (book != null) {
                            System.out.println(book.bookInfo()); //if it is not empty, the book's information will be printed 
                            isEmpty = false;
                        }
                    }

                    if (isEmpty) System.out.println("No books available.");
                    System.out.println("Type 'exit' to return to main menu.");
                    String input = scanner.nextLine(); //scans the option to return to main menu/to continue 
                    if (input.equalsIgnoreCase("exit")) break;
                }
            }

            if (choice == 6) { //prints list of users 
                while (true) {
                    System.out.println("\n=== User List ===");
                    User[] users = store.getUsers();
                    boolean isEmpty = true;

                    for (User user : users) { //goes through user list 
                        if (user != null) {
                            System.out.println(user.userInfo()); //if not empty, prints out the user's info
                            isEmpty = false;
                        }
                    }

                    if (isEmpty) System.out.println("No users available.");
                    System.out.println("Type 'exit' to return to main menu.");
                    String input = scanner.nextLine(); //scans the option to exit the option/continue 
                    if (input.equalsIgnoreCase("exit")) break;
                }
            }

            if (choice == 7) { //exit 
                System.out.println("Exiting program...");
                scanner.close(); //no more actions are being done 
                break;
            }
        }
    }
}
