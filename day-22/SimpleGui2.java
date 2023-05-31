import javax.swing.*;
import java.awt.event.*;

public class SimpleGui2 implements ActionListener {
  private JButton button;
  private int count = 0;

  public static void main(String[] args) {
    SimpleGui2 gui = new SimpleGui2();
    gui.go();
  }

  public void go() {
    JFrame frame = new JFrame("Event Listeners");
    button = new JButton("Click me");

    button.addActionListener(this);

    frame.getContentPane().add(button);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 300);
    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
    count++;
    if (count == 1) {
      button.setText("I've ben clicked one time.");
      return;
    }
    button.setText("I've been clicked " + count + " times.");
  }
}
