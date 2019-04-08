package com.nptel.java;

import java.applet.Applet;
import java.awt.*;

public class HelloApplet extends Applet {

    public void paint(Graphics g) {
        g.drawString("Hello", 150, 150);
    }
}
