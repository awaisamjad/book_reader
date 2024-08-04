package com.mycompany.app;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.plaf.DimensionUIResource;

public class BookDisplay extends JPanel {
    public BookDisplay() {
        setPreferredSize(new DimensionUIResource(50, 90));
        setBorder(new LineBorder(Color.BLACK, 2));
    }
}
