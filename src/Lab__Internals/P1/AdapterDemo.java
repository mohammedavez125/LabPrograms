package Lab__Internals.P1;

//B) Write a Java applet program to implements Adapter classes

//import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="AdapterDemo" width=300 height=400>
</applet>
*/
public class AdapterDemo extends Applet {
    public void init(){
        addMouseListener(new MyMouseAdapter(this));
        addMouseMotionListener(new MyMouseMotionAdapter(this));
    }
}

class MyMouseAdapter extends MouseAdapter {
    AdapterDemo ad;

    public MyMouseAdapter(AdapterDemo ad){
        this.ad = ad;
    }

    // Handle mouse clicked.
    public void mouseClicked(MouseEvent me){
        ad.showStatus("Mouse clicked");
    }
}

class MyMouseMotionAdapter extends MouseMotionAdapter {
    AdapterDemo ad;

    public MyMouseMotionAdapter(AdapterDemo ad){
        this.ad = ad;
    }

    public void mouseDragged(MouseEvent e){
        ad.showStatus("Mouse Dragged");
    }
}