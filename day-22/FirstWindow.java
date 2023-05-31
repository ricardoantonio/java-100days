import javax.swing.JButton;
import javax.swing.JFrame;

public class FirstWindow {
  public static void main(String[] args) {

    // Creates a new window.
    JFrame frame = new JFrame();

    // Make a widget
    JButton button = new JButton("I'm a button");

    // Adds the widget to the window
    frame.getContentPane().add(button);

    // Display the window (Give it a size and make it visible)
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}
