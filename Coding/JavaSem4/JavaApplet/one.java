package JavaApplet;

import java.awt.Graphics;

import javax.swing.JApplet;

class one extends JApplet {
    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);
        g.drawString("I don't know it will execute or not!", 150, 150);
    }
}