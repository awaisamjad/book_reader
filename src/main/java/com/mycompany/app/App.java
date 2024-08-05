package com.mycompany.app;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

// import java.util.ArrayList;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextField;
// import javax.swing.UIManager;
// import javax.swing.UnsupportedLookAndFeelException;

// import com.formdev.flatlaf.FlatDarculaLaf;
// import com.formdev.flatlaf.themes.FlatMacDarkLaf;

// // mvn exec:java -Dexec.mainClass="com.mycompany.app.App"

// public class App {
//     private static JFrame f;
//     public static JTextField book_name_input_field;
//     private static JLabel book_name_label;

//     public static void main(String[] args) {

//         try {
//             UIManager.setLookAndFeel(new FlatMacDarkLaf());
//         } catch (UnsupportedLookAndFeelException ex) {
//             ex.printStackTrace();
//         }

//         f = new JFrame();// creating instance of JFrame

//         f.setSize(800, 600);
//         f.setLayout(null);// using no layout managers
//         f.setVisible(true);// making the frame visible

//         SearchBar(null, "Search collection");

//         ArrayList<Book> books_total = new ArrayList<>();
//         Book book1 = new Book("Way of Kings", "Brandon Sanderson", 2011, 0, 0, null);
//         Book book2 = new Book("1Q84", "Haruki Murakami", 2011, 0, 0, null);
//         Book book3 = new Book("East of Eden", "John Steinbeck", 2011, 0, 0, null);
//         Book book4 = new Book("The picture of Dorian Gray", "Oscar Wilde", 2011, 0, 0, null);
//         books_total.add(book1);
//         books_total.add(book2);
//         books_total.add(book3);
//         books_total.add(book4);

//         // InputBar("Enter book name");
//         Widgets.InputBar(f, "Enter Book Name", book_name_input_field, 20, 300);

//         // JButton add_book_button = new JButton("Add a book");// creating instance of
//         // JButton
//         // add_book_button.setBounds(130, 100, 100, 40);// x axis, y axis, width, height

//         JButton add_book_button = Widgets.Button(f, "Add a book", 20, 200);

//         book_name_label = new JLabel("Book Name:");
//         book_name_label.setBounds(20, 250, 400, 20);
//         f.add(book_name_label);

//         BookDisplay book_display = new BookDisplay();
//         book_display.setBounds(300, 30, 100, 180);
//         f.add(book_display);

//         add_book_button.addActionListener(e -> {
//             String book_name = book_name_input_field.getText();

//             if (book_name != null) {
//                 Widgets.Printbooks_total(books_total);
//             }
//             // book_name_label.setText("Book Name: " + book_name);
//             // books_total.add(book1);
//             // Widgets.Displaybooks_total(f, books_total, 10, 300);
//             // Widgets.Printbooks_total(books_total);
//         });

//         f.setVisible(true);
//     }

//     public static void SearchBar(String placeholder, String labelText) {
//         JTextField searchBar = new JTextField(placeholder);
//         JLabel label = new JLabel(labelText);

//         int searchbar_x = 20;
//         int searchbar_y = 50;

//         searchBar.setBounds(searchbar_x, searchbar_y, 400, 30);
//         searchBar.setLayout(null);
//         searchBar.setVisible(true);

//         label.setBounds(searchbar_x, searchbar_y - 25, 120, 20);
//         label.setLayout(null);
//         label.setVisible(true);

//         f.add(searchBar);
//         f.add(label);
//     }

// }

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

// mvn exec:java -Dexec.mainClass="com.mycompany.app.App"

public class App {
    private static JTextField book_name_input_field;

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }

        JFrame f = new JFrame("Book Manager");
        f.setSize(800, 600);
        f.setLayout(null);

        // ~ Search Bar
        JTextField search_bar = new JTextField();
        search_bar.setBounds(20, 50, 300, 30);
        JLabel search_bar_label = new JLabel("Search Collection");
        search_bar_label.setBounds(20, 10, search_bar_label.getPreferredSize().width,
                search_bar_label.getPreferredSize().height);
        JButton search_button = new JButton("Search");
        search_button.setBounds(340, 50, 90, 30);
        f.add(search_bar);
        f.add(search_bar_label);
        f.add(search_button);

        // Initialize the button
        JButton upload_button = new JButton("Upload");
        upload_button.setBounds(20, 200, 150, 30);
        f.add(upload_button);

        JPanel rect = Widgets.Rect(10, 10, 200, 200, Color.BLACK, 2);
        // f.add(rect);

        // Initialize the book display (assuming BookDisplay is a custom component)
        // BookDisplay book_display = new BookDisplay();
        // book_display.setBounds(300, 30, 100, 180);
        // f.add(book_display);

        ArrayList<Book> books_total = new ArrayList<>();
        Book book1 = new Book("Way of Kings", "Brandon Sanderson", 2011, 0, 0, null);
        Book book2 = new Book("1Q84", "Haruki Murakami", 2011, 0, 0, null);
        Book book3 = new Book("East of Eden", "John Steinbeck", 2011, 0, 0, null);
        Book book4 = new Book("The picture of Dorian Gray", "Oscar Wilde", 2011, 0, 0, null);
        books_total.add(book1);
        books_total.add(book2);
        books_total.add(book3);
        books_total.add(book4);

        upload_button.addActionListener(e -> {

            JFileChooser fileChooser = new JFileChooser();
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    java.awt.Desktop.getDesktop().open(selectedFile);
                } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }// <-- here
            }

        });

        search_button.addActionListener(e -> {
            String book_name = search_bar.getText();
            Book book = new Book(book_name, "Haruki Murakami", 2011, 0, 0, null);
            if (!book_name.isEmpty() && BookUtils.DoesBookAlreadyExist(book, books_total)) {
                System.out.println("Found Book" + book.toString());
            }
        });

        BookUtils.DisplayBookCover(f, "src/main/resources/images/way_of_kings.jpg", 100, 100, 120, 180);

        // ! Keep this at the end
        f.setVisible(true);
    }
}
