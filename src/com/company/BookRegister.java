package com.company;

public class BookRegister {
    private Book[] books = new Book[20];
    private int count;

    public void getBooks() {
        for(int i = 0; i < count; i++){
            books[i].jalababado();
        }
    }

    public void getBooksOfGenre(Genre genre){
        for(int i = 0; i < count; i++){
            if(books[i].getGenre() == genre){
                books[i].jalababado();
            }
        }
    }

    public void getBooksLessThanReadingTime(int readingTime){
        for(int i = 0; i < count; i++){
            if(books[i].getReadingTime() <= readingTime){
                books[i].jalababado();
            }
        }
    }

    public void getBooksOfAuthor(String author){
        for(int i = 0; i < count; i++){
            if(books[i].getAuthor().equals(author)){
                books[i].jalababado();
            }
        }
    }

    public void addBook(Book book){
        if(count < 20){
            books[count] = book;
            count++;
        }
    }

    public BookRegister(){
        count = 0;
    }

}
