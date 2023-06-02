import javax.swing.*;
import java.awt.*;

public class BoxLayoutPanel {

  public static void main(String[] args) {

    try {
      UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException
        | IllegalAccessException e) {
      e.printStackTrace();
    }

    BoxLayoutPanel gui = new BoxLayoutPanel();
    gui.go();

  }

  public void go() {
    JFrame frame = new JFrame("BoxLayout");
    JPanel panel = new JPanel();

    panel.setBackground(Color.darkGray);
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

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
