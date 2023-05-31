import javax.swing.*;
import java.awt.*;

public class DrawPanelG2 {

  public static void main(String[] args) {
    DrawPanelG2 draw = new DrawPanelG2();

    draw.go();
  }

  public void go() {
    JFrame frame = new JFrame("Draw Panel");

    MyDrawPanel panel = new MyDrawPanel();
    frame.getContentPane().add(panel);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(800, 600);
    frame.setVisible(true);

  }
}

class MyDrawPanel extends JPanel {
  public void paintComponent(Graphics g) {

    Graphics2D g2d = (Graphics2D) g;

    GradientPaint gradient = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);

    g2d.setPaint(gradient);

    g2d.fillOval(70, 70, 100, 100);
  }
}
