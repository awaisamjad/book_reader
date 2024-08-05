package com.mycompany.app;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

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

    public static JPanel Rect(int x, int y, int width, int height, Color color, int stroke) {
        JPanel rect = new JPanel();
        rect.setPreferredSize(new Dimension(width, height));
        rect.setBounds(x, y, width, height);
        rect.setBorder(new LineBorder(color, stroke));
        rect.setLayout(null);
        return rect;
    }
}
