package com.mycompany.app;

import java.util.Objects;

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

    // public boolean equals(Book book) {
    //     if (this.title == book.getTitle() &&
    //             this.author.equals(book.getAuthor()) &&
    //             this.publicationYear == book.getPublicationYear() &&
    //             this.progress == book.getProgress() &&
    //             this.image == book.getImage() &&
    //             this.isbn.equals(book.getIsbn())) {
    //         return true;
    //     }
    //     return false;
    // }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
               progress == book.progress &&
               image == book.image &&
               Objects.equals(title, book.title) &&
               Objects.equals(author, book.author) &&
               Objects.equals(isbn, book.isbn);
    }

    // Override hashCode method
    //? Recommended when overriding the 'equals'  method is used
    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear, progress, image, isbn);
    }

}