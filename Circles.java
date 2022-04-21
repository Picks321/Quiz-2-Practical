import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.color.*;

public class Circles extends JPanel {

    public void point(Graphics g) {

        setSize(500, 500);
        g.drawOval(100, 100, 50, 50);
        g.setColor(Color.red);
        g.fillOval(100, 100, 50, 50);

        g.drawOval(300, 300, 50, 50);
        g.setColor(Color.green);
        g.fillOval(100, 100, 50, 50);

        g.drawOval(500, 500, 50, 50);
        g.setColor(Color.blue);
        g.fillOval(100, 100, 50, 50);

    }

    public static void main (String [] args){

        JFrame MainFrame = new JFrame();

        MainFrame.setSize(600, 600);

        Circles CirclesPanel = new Circles();

        MainFrame.add(CirclesPanel);

        MainFrame.setVisible(true);
    }

}
