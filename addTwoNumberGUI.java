import java.awt.event.*;
import javax.swing.*;

public class addTwoNumberGUI {
    JFrame f;
    JTextField t1, t2, t3;
    JButton btn;
    JLabel l1, l2, l3;
    addTwoNumberGUI() {
        f = new JFrame("Addition");
        l1 = new JLabel("Number 1:");
        l1.setBounds(30, 20, 100, 30); 
        l2 = new JLabel("Number 2:");
        l2.setBounds(30, 70, 100, 30);      
        l3 = new JLabel("Result:");
        l3.setBounds(30, 120, 100, 30);
        t1 = new JTextField();
        t1.setBounds(140, 20, 170, 30);
        t2 = new JTextField();
        t2.setBounds(140, 70, 170, 30);
        t3 = new JTextField();
        t3.setBounds(140, 120, 170, 30);
        t3.setEditable(false); 
    
        btn = new JButton("Add");
        btn.setBounds(140, 170, 70, 30);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(t1.getText());
                    double num2 = Double.parseDouble(t2.getText());
                    double sum = num1 + num2;
                    t3.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(f, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(btn);
        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new addTwoNumberGUI();
    }
}
