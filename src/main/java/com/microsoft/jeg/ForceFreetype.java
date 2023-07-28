package com.microsoft.jeg.tests;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ForceFreetype {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                Font font = Font.createFont(Font.TRUETYPE_FONT, new File("/home/rt/force-freetype/Borel-Regular.ttf"));



                // You can't directly use the returned Font because it will have a size of 1, so derive a new Font from it.
                Font sizedFont = font.deriveFont(24f); // You can change the size here.



/*              JLabel label = new JLabel("Hello FreeType!");
                label.setFont(sizedFont);



                JFrame frame = new JFrame("SwingFontExample");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(label, BorderLayout.CENTER);
                frame.pack();
                frame.setVisible(true); */
            } catch (FontFormatException | IOException e) {
                e.printStackTrace();
            }
        });
    }
}

