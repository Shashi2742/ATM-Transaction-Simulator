import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.xml.crypto.Data;

public class Withdrawl extends JFrame implements ActionListener{
    JButton Withdraw,back;
    JTextField ammount;
    String pin;
    void withdrawlpage(String pin){
        pin = this.pin;
         setLayout(null);

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
         Image i2 = i1.getImage().getScaledInstance(900,900 ,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(0,0,900,900);
         add(image);
        
         JLabel text = new JLabel("Enter Ammount You Want Withdrawl");
         text.setForeground(Color.WHITE);
         text.setFont(new Font("Raleway",Font.BOLD,16));
         text.setBounds(190,300,400,20);
         image.add(text);

          ammount = new JTextField();
         ammount.setFont(new Font("Raleway",Font.BOLD,22));
         ammount.setBounds(170,350,320,25);
         image.add(ammount); 

         Withdraw =new JButton("Withdrawl");
        Withdraw.setBounds(355,485,150,30);
        Withdraw.addActionListener(this);
        image.add(Withdraw);

         back =new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);




        setSize(900,900);
        setLocation(300,0);
        //setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        String number =ammount.getText();
        
        Date date = new Date();
        if(ae.getSource()==back ){
            setVisible(false);
            Trasactions trasaction = new Trasactions();
            trasaction.trasactionspage(pin);
            trasaction.setVisible(true);
        }
       
         if(number.equals("")){
           
                JOptionPane.showMessageDialog(null,"Please Enter Amount you Want Withdraw");   
             }
              
         else{
            try{
                Conn conn = new Conn();
                String query = "insert into bank values ('"+pin+"','"+date+"','"+number+"')";
                 conn.s.execute(query);
                  JOptionPane.showMessageDialog(null, " Rs "+number+" Withdrawl Successfully");
                
            }
            catch(Exception e){
                System.out.println(e);
            }
         }
         

        
    }

    public static void main(String[] args) {
        
        Withdrawl Withdrawl =new Withdrawl();
        Withdrawl.withdrawlpage("");

    }

}
