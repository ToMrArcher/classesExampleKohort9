package com.company;

public class Chapter {
    private String title;
    private int pages;
    private int timePerPage;

    public double chapterReadingTime(){
        return (pages * timePerPage) / 60.0;
    }

    //Constructor, getters, and setters
    public Chapter(String title, int pages, int timePerPage){
        this.title = title;
        this.pages = pages;
        this.timePerPage = timePerPage;
    }

    public void jalababadoChapter(){
        System.out.println("Title: " + title + ", Pages: " + pages + ", Time Per Page: " + timePerPage);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getTimePerPage() {
        return timePerPage;
    }

    public void setTimePerPage(int timePerPage) {
        this.timePerPage = timePerPage;
    }
}
