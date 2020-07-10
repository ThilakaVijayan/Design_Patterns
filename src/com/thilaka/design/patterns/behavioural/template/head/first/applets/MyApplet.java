package com.thilaka.design.patterns.behavioural.template.head.first.applets;

import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet {
    private String message;

    @Override
    public void init() {
        message = "Hello World, I'm alive!";
        repaint();
    }

    @Override
    public void start() {
        message = "Now I'm starting up...";
        repaint();
    }

    @Override
    public void stop() {
        message = "Oh, now I'm being stopped...";
        repaint();
    }

    @Override
    public void destroy() {
        //applet is going away...
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message,5,15);
    }

    public static void main(String[] args) {

    }
}
