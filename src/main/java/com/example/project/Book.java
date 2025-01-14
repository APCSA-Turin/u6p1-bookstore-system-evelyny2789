package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title; 
    private String author; 
    private int yearPublished; 
    private String isbn; 
    private int quantity; 

    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    public Book (String title, String author, int yearPublished, String isbn, int quantity){
        this.title = title;
        this.author = author; 
        this.yearPublished = yearPublished; 
        this.isbn = isbn; 
        this.quantity = quantity; 
    }

    public String getTitle(){
        return title; 
    }

    public void String setTitle(String newTitle) {
        title = newTitle; 
    }

    public String getAuthor(){
        return author; 
    }

    public String void setAuthor(String newAuthor){
        author = newAuthor; 
    }

    public int getYearPublished(){
        return yearPublished; 
    }

    public int setYearPublished(int year){
        yearPublished = year; 
    }

    public String getIsbn(){
        return isbn; 
    }

    public void setIsbn(String newIsbn){
        isbn = newIsbn; 
    }

    public int getQuantity(){
        return quantity; 
    }

    public int setQuantity(int quant){
        quantity = quant; 
    }

    public String bookInfo(){  //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity; 
    } 
       
}