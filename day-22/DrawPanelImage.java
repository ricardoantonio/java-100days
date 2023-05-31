import javax.swing.*;
import java.awt.*;

public class DrawPanelImage {

  public static void main(String[] args) {
    DrawPanelImage draw = new DrawPanelImage();

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

    Image image = new ImageIcon("catzilla.jpg").getImage();

    g.drawImage(image, 3, 4, this);
  }
}
