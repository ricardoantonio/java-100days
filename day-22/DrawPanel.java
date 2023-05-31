import javax.swing.*;
import java.awt.*;

public class DrawPanel {

  public static void main(String[] args) {
    DrawPanel draw = new DrawPanel();

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
    g.setColor(Color.orange);
    g.fillRect(20, 50, 100, 100);
  }
}
