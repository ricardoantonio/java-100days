import javax.swing.*;
import java.awt.*;

public class FlowLayoutPanel {

  public static void main(String[] args) {
    FlowLayoutPanel gui = new FlowLayoutPanel();
    gui.go();

  }

  public void go() {
    JFrame frame = new JFrame("FlowLayout");
    JPanel panel = new JPanel();

    panel.setBackground(Color.darkGray);

    JButton button = new JButton("shock me");
    JButton button2 = new JButton("bliss");
    panel.add(button);
    panel.add(button2);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().add(BorderLayout.EAST, panel);
    frame.setSize(300, 300);
    frame.setVisible(true);

  }
}
