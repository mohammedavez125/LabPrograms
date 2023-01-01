package Lab__Internals.P9;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="MouseEventDemo" width=400 height=500>
</applet>*/
public class MouseEventDemo extends Applet implements MouseListener, MouseMotionListener {
    int X = 30;
    int Y = 30;
    String str = "Mouse Events";

    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
        setBackground(Color.green);
        setForeground(Color.black);
    }

    public void paint(Graphics g){
        g.drawString(str, X, Y);
    }

    public void mouseEntered(MouseEvent m){
        showStatus("MouseEntered");
        repaint();
    }

    public void mouseExited(MouseEvent m){
        str = "Mouse Exited";
        setBackground(Color.red);
        showStatus("MouseExited");
        repaint();
    }

    public void mousePressed(MouseEvent m){
        str = "Mouse Pressed";
        setBackground(Color.yellow);
        showStatus("MousePressed");
        repaint();
    }

    public void mouseReleased(MouseEvent m){
        str = "Mouse Released";
        setBackground(Color.magenta);
        showStatus("MouseReleased");
        repaint();
    }

    public void mouseClicked(MouseEvent m){
        str = "Mouse Clicked";
        setBackground(Color.orange);
        showStatus("MouseClicked");
        repaint();
    }

    public void mouseDragged(MouseEvent e){
        str = "mouse Dragged";
        setBackground(Color.blue);
        showStatus("dragging mouse at " + e.getX() + "," + e.getY());
        repaint();
    }

    public void mouseMoved(MouseEvent e){
        X = e.getX();
        Y = e.getY();
        str = "Mouse Moved";
        setBackground(Color.pink);
        repaint();
    }
}
