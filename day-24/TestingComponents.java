import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class TestingComponents {

  public static void main(String[] args) {
    TestingComponents gui = new TestingComponents();
    gui.go();
  }

  public void go() {

    JFrame window = new JFrame("Playing with Swing Components");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel titleLabel = new JLabel("Playing With Swing Components");
    Font titleFont = new Font("serif", Font.BOLD, 28);
    titleLabel.setFont(titleFont);
    window.getContentPane().add(BorderLayout.NORTH, titleLabel);

    JPanel globalPanel = new JPanel();
    globalPanel.setLayout(new BoxLayout(globalPanel, BoxLayout.Y_AXIS));

    // Testing TextField
    JPanel textFieldPanel = new JPanel();
    JLabel nameLabel = new JLabel("Your name:");
    JTextField field = new JTextField(20);
    JButton clearNameButton = new JButton("Clear all");
    JButton selectNameButton = new JButton("Select name");

    field.setText("Write your name");
    clearNameButton.addActionListener(event -> {
      field.setText("");
      field.requestFocus();
    });

    selectNameButton.addActionListener(event -> {
      field.selectAll();
      field.requestFocus();
    });

    textFieldPanel.add(nameLabel);
    textFieldPanel.add(field);
    textFieldPanel.add(clearNameButton);
    textFieldPanel.add(selectNameButton);
    globalPanel.add(textFieldPanel);

    // Testing JTextArea
    JPanel textAreaPanel = new JPanel();
    JTextArea text = new JTextArea(10, 20);
    text.setLineWrap(true);
    JButton textButton = new JButton("Just Click it");
    textButton.addActionListener(event -> {
      text.append("button clicked \n");
    });

    JScrollPane scroller = new JScrollPane(text);
    scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
    scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

    textAreaPanel.add(scroller);
    textAreaPanel.add(textButton);
    globalPanel.add(textAreaPanel);

    window.getContentPane().add(globalPanel);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setSize(800, 600);
    window.setVisible(true);

  }

}
