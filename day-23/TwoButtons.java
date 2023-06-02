import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TwoButtons {
  private JFrame frame;
  private JLabel label;

  public static void main(String[] args) {
    TwoButtons gui = new TwoButtons();
    gui.go();
  }

  public void go() {
    frame = new JFrame("Two Listeners");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JButton labelButton = new JButton("Change label");
    labelButton.addActionListener(new LabelListener());

    JButton colorButton = new JButton("Change circle");
    colorButton.addActionListener(new ColorListener());

    label = new JLabel("I'm a label");
    MyDrawPanel drawPanel = new MyDrawPanel();

    frame.getContentPane().add(BorderLayout.SOUTH, colorButton);
    frame.getContentPane().add(BorderLayout.CENTER, drawPanel);
    frame.getContentPane().add(BorderLayout.EAST, labelButton);
    frame.getContentPane().add(BorderLayout.WEST, label);

    frame.setSize(500, 400);
    frame.setVisible(true);

  }

  class LabelListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      label.setText("Ouch!");
    }
  }

  class ColorListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      frame.repaint();
    }
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
    g.fillOval(0, 0, 100, 100);
  }
}
