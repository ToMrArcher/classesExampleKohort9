package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BookRegister mineKuleBoker = new BookRegister();
        Book book = new Book("To Kill a Mockingbird", "Harper Lee", 281, Genre.CLASSIC);
        book.addChapter(new Chapter("Another day in paradise", 30, 90));
        book.addChapter(new Chapter("Snow Paradise", 35, 90));
        mineKuleBoker.addBook(book);
        book = new Book("Brussel Sin Fremtid", "Karl Marx", 90, Genre.ACTION);
        book.addChapter(new Chapter("Fordømmelige Drittsekker", 10, 120));
        book.addChapter(new Chapter("Fy faen for en jævel", 19, 140));
        mineKuleBoker.addBook(book);

        mineKuleBoker.getBooksLessThanReadingTime(70);
    }
}
