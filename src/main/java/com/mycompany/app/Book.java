package com.mycompany.app;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private int progress;
    private long image;
    private String isbn;

    // Constructor to initialize the fields
    public Book(String title, String author, int publicationYear, int progress, long image, String isbn) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.progress = progress;
        this.image = image;
        this.isbn = isbn;
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

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public long getImage() {
        return image;
    }

    public void setImage(long image) {
        this.image = image;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Optional: Override toString() method for easy printing
    // Doesnt return image
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publicationYear=" + publicationYear +
                ", progress=" + progress +
                ", isbn='" + isbn + '\'' +
                '}';
    }

}