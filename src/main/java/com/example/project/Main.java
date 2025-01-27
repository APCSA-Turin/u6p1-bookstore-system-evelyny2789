package com.example.project;

public class Main {
    public static void main(String[] args){
        // IdGenerate.reset();

        // System.out.println("Generated ID: " + IdGenerate.generateID());
        // System.out.println("Generated ID: " + IdGenerate.generateID()); 
        // System.out.println("Generated ID: " + IdGenerate.generateID()); 
        // System.out.println("Generated ID: " + IdGenerate.generateID());
        // System.out.println("Current ID: " + IdGenerate.getCurrentId());

        // Book b = new Book("The Great Gatsby","Scott Fitzgerald", 1925, "979-8351145013",3);
        // b.setTitle("Untitled");
        // b.setAuthor("John Doe");
        // b.setIsbn("0000");
        // b.setQuantity(1);
        // b.setYearPublished(1900);
        // System.out.println(b.bookInfo());

        BookStore store = new BookStore(); //create a new bookstore with 6 empty books
        IdGenerate.generateID();
        User u1 = new User("John",IdGenerate.getCurrentId());
        IdGenerate.generateID();
        User u2 = new User("Jane",IdGenerate.getCurrentId());
        IdGenerate.generateID();
        User u3 = new User("Mary",IdGenerate.getCurrentId());
        IdGenerate.generateID();
        User u4 = new User("Alex",IdGenerate.getCurrentId());
    }
}