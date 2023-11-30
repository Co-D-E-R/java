import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class frametest implements ActionListener{

    ImageIcon image = new ImageIcon("sp1.png");
    JPanel pa1= new JPanel();
    JPanel pa2 = new JPanel();
    JLabel l1,l2;
    JButton b1;
    Font myFont = new Font("Ink free", Font.BOLD, 20);
     frametest(){
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(430,550);
        fr.setLayout(new BorderLayout());
         fr.getContentPane().setBackground(new Color(50,50,50));

        l1 = new JLabel(); 
        l1.setText("Click The Button");
        l1.setFont(myFont);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setVerticalAlignment(JLabel.CENTER);
        // pa1.setLayout(new BorderLayout());
        pa1.setBounds(0,0,400,300);
        pa1.setPreferredSize(new Dimension(400,50));
        pa1.setBackground(Color.red);
        pa1.add(l1);

        b1 = new JButton("Click ME");
        b1.setFont(myFont);
        b1.setFocusable(false);
        b1.addActionListener(this);
        pa2.add(b1);
        
        pa2.setBounds(0,300,400,300);
        pa2.setBackground(new Color(50,50,50));

        l2 = new JLabel();
        l2.setIcon(image);


        fr.add(pa2);
        fr.add(pa1,BorderLayout.NORTH);
        fr.setVisible(true);



    }

   
        public static void main(String args[]){
             new  frametest();
        }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1){
            l1.setText("You Clicked the Button");
            pa2.add(l2);
        }

    }

}


