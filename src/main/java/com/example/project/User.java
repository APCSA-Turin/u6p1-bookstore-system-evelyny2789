package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    private String name; 
    private String Id; 
    Book book = ""; 

    //requires 1 contructor with two parameters that will initialize the name and id
    public User (String name, String Id){
        this.name = name; 
        this.Id = Id; 
    }
 
    public String getName(){
        return name; 
    }

    public void setName(String newName){
        name = newName; 
    }

    public String getId(){
        return Id; 
    }

    public void setId(newId){
        Id = newId; 
    }

    public Book getBooks(){
        return book; 
    }

    public void setBooks(){

    }

    public String bookListInfo(){ //returns a booklist for the user, if empty, output "empty"
        if (book.equals("")){
            return "empty";
        } else {
            return 
        }
    } 

    public String userInfo(){ //returns  "Name: []\nID: []\nBooks:\n[]"
        return "Name: []\nID: []\nBooks:\n[]"; 
    } 
       
}