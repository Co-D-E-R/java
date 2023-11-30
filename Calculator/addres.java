/*

Input Count 1
Input Count 2

check for valid input
input should be positive integer

Display the total admission count

After correct display input fields cannot be changed

*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class addres implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2;
    JButton b1;
    Font myFont = new Font("Ink free", Font.BOLD, 20);

    addres() {

        JFrame frame = new JFrame("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 550);
        frame.setLayout(null);
        frame.getContentPane().setBackground(new Color(9, 222, 172));

        l1 = new JLabel("Enter the count 1 ");
        l1.setBounds(25, 25, 300, 20);
        l1.setFont(myFont);

        t1 = new JTextField();
        t1.setBounds(25, 50, 200, 30);
        t1.setBackground(new Color(156, 247, 198));
        t1.setFont(myFont);

        l2 = new JLabel("Enter the count 2");
        l2.setBounds(25, 100, 300, 20);
        l2.setFont(myFont);

        t2 = new JTextField();
        t2.setBounds(25, 125, 200, 30);
        t2.setBackground(new Color(156, 247, 198));
        t2.setFont(myFont);

        b1 = new JButton("Sumbit");
        b1.setBounds(25, 175, 100, 40);
        b1.addActionListener(this);
        b1.setFocusable(false);
        b1.setFont(myFont);
        b1.setBackground(new Color(45, 128, 83));

        l3 = new JLabel("Result :: ");
        l3.setBounds(25, 225, 300, 40);
        l3.setFont(myFont);

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(b1);
        frame.add(l3);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new addres();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String str1 = t1.getText();
            String str2 = t2.getText();
            if (str1.isEmpty() || str2.isEmpty()) {
                l3.setText("Result : Input Field empty");
            } else {

                try {
                    int a = Integer.parseInt(str1);
                    int b = Integer.parseInt(str2);

                    if (a <= 0 || b <= 0) {
                        l3.setText("Result : Value cannot be less than 1");
                    } else {
                        int sum = a + b;
                        String res = Integer.toString(sum);
                        l3.setText("Result :: " + res);
                        // t1.setEnabled(false);
                        // t2.setEnabled(false);
                    }
                } catch (Exception ex) {
                    l3.setText("Result : Invalid Input");

                }
            }
        }
    }

}
