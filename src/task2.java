import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class task2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(200,200);

        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.lightGray);
        jPanel.setPreferredSize(new Dimension(200,100));

        String[] items = {
                "Japan",
                "Australia",
                "China",
                "Russia"
        };

        JLabel jLabel = new JLabel(items[0], JLabel.CENTER);
        jPanel.add(jLabel);

        JComboBox comboBox = new JComboBox(items);
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jLabel.setText((String) comboBox.getSelectedItem());
            }
        });
        jPanel.add(comboBox);
        jFrame.getContentPane().add(jPanel);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
