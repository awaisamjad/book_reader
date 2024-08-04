package com.mycompany.app;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.FlatDarculaLaf;

// mvn exec:java -Dexec.mainClass="com.mycompany.app.App"

public class App {
    private static JFrame f;
    public static JTextField book_name_input_field;
    private static JLabel book_name_label;

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        f = new JFrame();// creating instance of JFrame

        f.setSize(800, 600);
        f.setLayout(null);// using no layout managers
        f.setVisible(true);// making the frame visible

        SearchBar(null, "Search collection");

        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("Way of Kings", "Brandon Sanderson", 2011, 0, 0, null);
        Book book2 = new Book("1Q84", "Haruki Murakami", 2011, 0, 0, null);
        Book book3 = new Book("East of Eden", "John Steinbeck", 2011, 0, 0, null);
        Book book4 = new Book("The picture of Dorian Gray", "Oscar Wilde", 2011, 0, 0, null);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        // InputBar("Enter book name");
        Widgets.InputBar(f, "Enter Book Name", book_name_input_field, 20, 300);
       

        // JButton add_book_button = new JButton("Add a book");// creating instance of JButton
        // add_book_button.setBounds(130, 100, 100, 40);// x axis, y axis, width, height

        JButton add_book_button = Widgets.Button(f, "Add a book", 20, 200);

        book_name_label = new JLabel("Book Name:");
        book_name_label.setBounds(20, 250, 400, 20);
        f.add(book_name_label);

        BookDisplay book_display = new BookDisplay();
        book_display.setBounds(300,30, 100, 180);
        f.add(book_display);

        add_book_button.addActionListener(e -> {
            // String book_name = book_name_input_field.getText();
            
            // if (book_name != "") {
            //     System.out.println("Book Name: " + book_name);
            // }
            // book_name_label.setText("Book Name: " + book_name);
            // books.add(book1);
            Widgets.DisplayBooks(f, books, 10, 300);
        });

        f.setVisible(true);
    }

    public static void SearchBar(String placeholder, String labelText) {
        JTextField searchBar = new JTextField(placeholder);
        JLabel label = new JLabel(labelText);

        int searchbar_x = 20;
        int searchbar_y = 50;

        searchBar.setBounds(searchbar_x, searchbar_y, 400, 30);
        searchBar.setLayout(null);
        searchBar.setVisible(true);

        label.setBounds(searchbar_x, searchbar_y - 25, 120, 20);
        label.setLayout(null);
        label.setVisible(true);

        f.add(searchBar);
        f.add(label);
    }

}
