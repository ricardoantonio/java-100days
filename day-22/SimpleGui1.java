import javax.swing.*;

public class SimpleGui1 {
  public static void main(String[] args) {

    JFrame frame = new JFrame("My First GUI");
    JButton button = new JButton("Click me");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().add(button);

    frame.setSize(300, 300);

    frame.setVisible(true);

  }
}
