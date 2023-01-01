package Lab__Internals.P9;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

//  Write a Java applet program for handling mouse & key events.

/*<applet code="KeyEventDemo" width=400 height=500>
</applet>*/
public class KeyEventDemo extends Applet implements KeyListener {
    int X = 30;
    int Y = 30;
    String str = "Key Events";

    public void init(){
        addKeyListener(this);
        setBackground(Color.green);
        setForeground(Color.black);
    }

    public void paint(Graphics g){
        g.drawString(str, X, Y);
    }

    public void keyPressed(KeyEvent k){
        str = "key Pressed";
        setBackground(Color.pink);
        showStatus("keyPressed");
        repaint();
    }

    public void keyReleased(KeyEvent k){
        str = "key Released";
        setBackground(Color.orange);
        showStatus("keyReleased");
        repaint();
    }

    public void keyTyped(KeyEvent k){
        str = "key Typed";
        str += k.getKeyChar();
        setBackground(Color.yellow);
        showStatus("keyTyped");
        repaint();
    }
}
