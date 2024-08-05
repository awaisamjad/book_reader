package com.mycompany.app;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BookUtils {
    public static void PrintBook(Book book) {
        System.out.println(book.toString());
    }

    public static void PrintBooks(ArrayList<Book> books) {
        for (Book book : books) {
            PrintBook(book);
        }
    }

    // ? The function scales to waht you want so all covers are same dimension.
    // Maybe change code so that it mathces real life dimension
    public static void DisplayBookCover(JFrame f, String filepath, int x, int y, int desired_width,
            int desired_height) {
        ImageIcon img = new ImageIcon(filepath);
        if (img.getIconWidth() == -1) {
            System.out.println("Image not found: " + filepath);
            return;
        }

        // To get this to work we turn IconImage to Image then scale then back to
        // ImageIcon :-(
        // TODO Find a better way
        Image resized_image = img.getImage().getScaledInstance(desired_width, desired_height, Image.SCALE_SMOOTH);
        ImageIcon resized_image_again = new ImageIcon(resized_image);
        JLabel label = new JLabel(resized_image_again);
        label.setBounds(x, y, resized_image_again.getIconWidth(), resized_image_again.getIconHeight());
        label.setLayout(null);
        f.add(label);
        f.repaint(); // Ensure the frame repaints to show the new component
    }

    public static void DisplayBook(JFrame f, Book book, int x, int y) {
        String book_string = book.toString();
        JLabel book_label = new JLabel(book_string);
        book_label.setBounds(x, y, 100, 400);
        book_label.setLayout(null);
        book_label.setVisible(true);
        f.add(book_label);
    }

    // TODO Needs work
    public static void DisplayBooks(JFrame f, ArrayList<Book> books, int x, int y) {
        for (int i = 0; i < books.size(); i++) {
            DisplayBook(f, books.get(i), x + (i * 20), y + (i * 10));
        }
    }

    // Checks if two books are equal i.e every field of the Book type is equal
    // TODO make it variadic so it can check any number of books
    // * Unused
    public static boolean AreBooksEqual(Book book1, Book book2) {
        // return book1.equals(book2);
        if (book1.getTitle().equals(book2.getTitle()) &&
                book1.getAuthor().equals(book2.getAuthor()) &&
                book1.getPublicationYear() == (book2.getPublicationYear()) &&
                book1.getProgress() == book2.getProgress() &&
                book1.getImage() == book2.getImage() &&
                book1.getIsbn().equals(book2.getIsbn())) {
            return true;
        }
        return false;
    }

    // Checks if the book exists within the ArrayList
    //? When used for search it requires there to be exact accurate search. Not UX friendly
    //TODO For search function use better search criteria
    public static boolean DoesBookAlreadyExist(Book book, ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            if (book.equals(books.get(i))) {
                return true;
            }
        }
        return false;
    }
}
