import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class DrawPanelCircle {

  public static void main(String[] args) {
    DrawPanelCircle draw = new DrawPanelCircle();

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
    g.fillRect(0, 0, this.getWidth(), this.getHeight());

    Random random = new Random();

    int red = random.nextInt(256);
    int green = random.nextInt(256);
    int blue = random.nextInt(256);

    Color randomColor = new Color(red, green, blue);

    g.setColor(randomColor);
    g.fillOval(70, 70, 100, 100);

  }
}
