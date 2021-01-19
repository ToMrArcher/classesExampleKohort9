package com.company;

public class Book {
    private String title;
    private String author;
    private int numberOfPages;
    private Genre genre;
    private Chapter[] chapters = new Chapter [30];
    private int chapterCount;

    public void jalababado(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numberOfPages);
        System.out.println("Genre: " + genre);
        for(int i = 0; i < chapterCount; i++){
            chapters[i].jalababadoChapter();
        }
        System.out.println();
    }

    public void addChapter(Chapter chapter){
        if (chapterCount < 30) {
            chapters[chapterCount] = chapter;
            chapterCount++;
        }
    }

    public double getReadingTime(){
        double sum = 0;
        for(int i = 0; i < chapterCount; i++){
            sum += chapters[i].chapterReadingTime();
        }
        return sum;
    }

    //Constructors, getters, and setters.

    public Book(String title, String author, int numberOfPages, Genre genre) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.genre = genre;
        this.chapterCount = 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}
