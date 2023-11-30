import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Revesecnt implements ActionListener{
    JTextField t1;
    JButton b1,b2;
    JLabel l1,l2;

    Font myFont = new Font("Ink free",Font.BOLD,30);

    Revesecnt(){
        JFrame fr = new JFrame();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(450,550);
        fr.setLayout(null);

        l1=new JLabel("Enter the Number ::");
        l1.setBounds(25,25,300,50);
        l1.setFont(myFont);

        t1 = new JTextField();
        t1.setBounds(25,70,300,50);
        t1.setBackground(new Color(156, 247, 198));
        t1.setFont(myFont);

        b1 =new JButton("Submit");
        b1.setBounds(25,125,150,50);
        b1.setFocusable(false);
        b1.setFont(myFont);
        b1.setBackground(new Color(45, 128, 83));
        b1.addActionListener(this);

        b2 = new JButton("String");
        b2.setBounds(25,175,150,50);
        b2.setFocusable(false);
        b2.setFont(myFont);
        b2.setBackground(new Color(45, 128, 83));
        b2.addActionListener(this);

        l2 =new JLabel("Result::");
        l2.setBounds(25,225,400,50);
        l2.setFont(myFont);



        
        fr.add(l1);
        fr.add(t1);
        fr.add(b1);
        fr.add(l2);
        fr.add(b2);
        fr.setVisible(true);
    }

     public static void main(String args[]){
        new Revesecnt();
    }
    public void actionPerformed(ActionEvent e){
    if(e.getSource()==b1){
        try{
          int rev=0;
        int n = Integer.parseInt(t1.getText());
        while(n!=0){
            int rem = n%10;
            rev =rev*10+rem;
            n=n/10;
        }
            l2.setText("Result :: "+rev);
        }catch(Exception ex){
             l2.setText("Enter the valid number");
        }
        
    }
    if(e.getSource()==b2){
        try{
            StringBuffer sb = new StringBuffer(t1.getText());
            sb.reverse();
            l2.setText("Result :: "+sb);
        }catch(Exception ex){
            l2.setText("Enter First Button for String");
        }
    }

}

} 


