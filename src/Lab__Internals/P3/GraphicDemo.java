package Lab__Internals.P3;

import java.awt.*;
import java.applet.*;
//import java.awt.color.ColorSpace;

/*
<applet code="GraphicDemo" width=350 height=700>  </applet>
*/

public class GraphicDemo extends Applet {
    public void init(){
        Color c1 = Color.WHITE;
        setBackground(c1);
        Color c2 = Color.RED;
        setForeground(c2);
    }

    public void paint(Graphics g){
        // Draw lines.
        g.drawLine(0, 0, 100, 90);
        g.drawLine(0, 90, 100, 10);
        g.drawLine(40, 25, 250, 80);
        // Draw rectangles.
        g.drawRect(10, 150, 60, 50);
        g.fillRect(100, 150, 60, 50);
        g.drawRoundRect(190, 150, 60, 50, 15, 15);
        g.fillRoundRect(280, 150, 60, 50, 30, 40);
        // Draw Ellipses and Circles
        g.drawOval(10, 250, 50, 50);
        g.fillOval(90, 250, 75, 50);
        g.drawOval(190, 260, 100, 40);
        // Draw Arcs
        g.drawArc(10, 350, 70, 70, 0, -180);
        g.fillArc(60, 350, 70, 70, 0, -90);
        // Draw a polygon
        int[] xpoints = {10, 200, 10, 200, 10};
        int[] ypoints = {450, 450, 650, 650, 450};
        int num = 5;
        g.drawPolygon(xpoints, ypoints, num);
        int[] xmpoints = {40, 40, 50, 60, 60};
        int[] ympoints = {60, 40, 50, 40, 60};
        //Another polygon
        g.drawPolygon(xmpoints, ympoints, num);
    }
}
