package com.mycompany.app;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Widgets {
    public static void InputBar(JFrame f, String labelText, JTextField inputField, int x, int y) {
        inputField = new JTextField();
        JLabel label = new JLabel(labelText);

        inputField.setBounds(x, y, 400, 30);
        inputField.setLayout(null);
        inputField.setVisible(true);

        label.setBounds(x, y - 25, 120, 20);
        label.setLayout(null);
        label.setVisible(true);

        f.add(inputField);
        f.add(label);
    }

    public static JButton Button(JFrame f, String text, int x, int y) {
        JButton button = new JButton(text);
        button.setBounds(x, y, 100, 40);
        button.setLayout(null);
        button.setVisible(true);

        f.add(button);
        return button;
    }

    public static JLabel Label(JFrame f, String text, int x, int y) {
        JLabel label = new JLabel(text);
        label.setBounds(x, y, 100, 40);
        label.setLayout(null);
        label.setVisible(true);

        f.add(label);
        return label;
    }

    public static void PrintBook(Book book) {
        System.out.println(book.toString());
    }

    public static void PrintBooks(ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            PrintBook(books.get(i));
        }
    }

    public static void DisplayBook(JFrame f, Book book, int x, int y) {
        // String title = book.getTitle();
        // String author = book.getAuthor();
        // int publication_year = book.getPublicationYear();
        // int progress = book.getProgress();
        // long image = book.getImage();
        // String isbn = book.getIsbn();
        String book_string = book.toString();
        JLabel book_label = new JLabel(book_string);
        book_label.setBounds(x, y, 100, 400);
        book_label.setLayout(null);
        book_label.setVisible(true);
        f.add(book_label);
    }

    public static void DisplayBooks(JFrame f, ArrayList<Book> books, int x, int y) {
        for (int i = 0; i < books.size(); i++) {
            DisplayBook(f, books.get(i), x + (i * 20), y + (i * 10));
        }
    }

    // Checks if two books are equal i.e every field of the Book type is equal
    // TODO make it variadic so it can check any number of books

    public static boolean AreBooksEqual(Book book1, Book book2) {
        return book1.equals(book2);
    }

    // Checks if the book exists within the ArrayList
    public static boolean DoesBookAlreadyExist(Book book, ArrayList<Book> books) {
        for (int i = 0; i < books.size(); i++) {
            if (AreBooksEqual(book, books.get(i))) {
                return true;
            }
        }
        return false;
    }
}
