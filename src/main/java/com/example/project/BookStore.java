package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    Book[] books; 
    Users[] users = new Users[10]; 

    //requires 1 empty constructor
    public BookStore(){

    }

    public User[] getUsers(){
        return users; 
    }

    public User[] setUsers(User user, int ind){
        User[ind] = user; 
    }

    public Book[] getBooks(){
        return books; 
    }

    public void addUser(User user){
        
    } 

    public void removeUser(User user){
        int ind = User.getIndexOf(user); 
        User[ind] = ""; 
    }

    public void consolidateUsers(){
        int ind = Users.indexOf("null"); 
        if (!Users[ind + 1].equals("null")){
            Users[ind] =
        }
    }

    public void addBook(Book book){
        
    }

    public void insertBook(Book book, int index){
        books[index] = book; 
    }

    public void removeBook(Book book){

    }
       
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}