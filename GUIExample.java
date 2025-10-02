// ignore this
// ignore this
// ignore this
// ignore this
// ignore this
// ignore this
import javax.swing.*;
import java.awt.event.*;

public class GUIExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI Example");
        JButton button = new JButton("Click Me");

        button.setBounds(100, 100, 150, 50);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.add(button);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
