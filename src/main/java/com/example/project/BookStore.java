package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books = new Book[5]; //stores up to 5 books 
    private User[] users = new User[10]; //stores up to 10 users 
    private static int num = 0;   //tracks the number of users added 

    //requires 1 empty constructor
    public BookStore(){   //initializes the book store 
    }

    public User[] getUsers(){ //returns the users array 
        return users; 
    }

    public void setUsers(User[] users){ //sets the user list  
        this.users = users;  
    }

    public Book[] getBooks(){ //returns books array
        return books; 
    }

    public void addUser(User user){  //adds new user to the store 
        users[num] = user;
        num++;                       //increments the number of users
    } 

    public void removeUser(User user){
        String name = user.getName(); 
        for (int i = 0; i < users.length; i++){  //compares each user name in the list 
            if (users[i] != null && users[i].getName().equals(name)){
                users[i] = null;         //if the name matches, it will remove it 
            }
        }

        User[] temp = new User[users.length]; //creating a new array 
        int ind = 0; 
        for (int i = 0; i < users.length; i++){
            if (users[i] != null){  
                temp[ind] = users[i]; //if the item/name is not null, it will be added to temp 
                ind++; //increments the index of temp 
            }
        }
        users = temp; //sets the user list to the new one without null 
    }

    public void consolidateUsers(){   //gets rid of nulls by moving them to the end 
        User[] temp = new User[users.length];
        int ind = 0; 
        for (int i = 0; i < users.length; i++){
            if (users[i] != null){
                temp[ind] = users[i];  //if it is not null, it gets added to temp 
                ind++; 
            }
        }
        users = temp; //sets the user list to the list with nulls at the end 
    }

    public void addBook(Book book){
        for (int i = 0; i < books.length; i++){
            if (books[i] == null){  //checks if the spot is open
                books[i] = book;   //if the spot is empty, the book will get added there
                break; 
            }
        }
    }

    public void insertBook(Book book, int index){ //inserts the book at the specific index 
        if (books[index] == null){   //checks if the spot is already taken 
            books[index] = book;   //if empty, the book will be inserted at the index 
        } else {  //if the index is not empty
            Book ind = books[index]; 
            books[index] = book; //inserts book at index
            books[index + 1] = ind; //moves the previous one back 
        }
    }

    public void removeBook(Book book){
        String name = book.getTitle(); //gets the name of the book being removed 
        for (int i = 0; i < books.length; i++){  //compares with each book in the list 
            if (books[i] != null && books[i].getTitle().equals(name)){
                if (books[i].getQuantity() > 1){  //if found, the quantity gets increased by 1 
                    books[i].setQuantity(books[i].getQuantity() - 1);
                } else {
                    books[i] = null; //if there is only one copy, it will be empty 
                }
                break; //exits loop when book is found
            }
        }
        for (int i = 0; i < books.length - 1; i++){ //shifts remaining books to fill in the empty spaces 
            if (books[i] == null && books[i + 1] != null){
                books[i] = books[i + 1];  //moves the book one space foward 
                books[i + 1] = null;  //deletes the book to prevent duplicates 
            }
        }
        int ind = 0; 
        for (int i = 0; i < books.length; i++){
            if (books[i] != null){
                ind++;   //finds the length of the list without null 
            }
        }
        Book[] newList = new Book[ind]; //create new list without null 
        for (int i = 0; i < ind; i++){
            newList[i] = books[i]; 
        }
        books = newList;  //sets books to the new list without null 
    }
       
    public String bookStoreBookInfo(){
        return "Books: " + books + " Users: " + users; 
    }                                                 //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}