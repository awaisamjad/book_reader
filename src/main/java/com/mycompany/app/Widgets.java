package com.mycompany.app;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
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
}
