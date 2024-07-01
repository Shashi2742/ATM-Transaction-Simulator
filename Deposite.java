import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Deposite extends JFrame implements ActionListener{
    JButton deposite,back;
    JTextField ammount;
    String pin;
    void depositepage(String pinnumber){
        pin = pinnumber;
         setLayout(null);

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
         Image i2 = i1.getImage().getScaledInstance(900,900 ,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(0,0,900,900);
         add(image);
        
         JLabel text = new JLabel("Enter Ammount You Want Deposite");
         text.setForeground(Color.WHITE);
         text.setFont(new Font("Raleway",Font.BOLD,16));
         text.setBounds(190,300,400,20);
         image.add(text);

          ammount = new JTextField();
         ammount.setFont(new Font("Raleway",Font.BOLD,22));
         ammount.setBounds(170,350,320,25);
         image.add(ammount); 

         deposite =new JButton("Deposite");
        deposite.setBounds(355,485,150,30);
        deposite.addActionListener(this);
        image.add(deposite);

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
        try{        
            String amount = ammount.getText();
            Date date = new Date(ABORT);
            if(ae.getSource()==deposite){
                if(ammount.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                    Conn c1 = new Conn();
                    c1.s.executeUpdate("insert into bank values('"+pin+"', '"+date+"', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    Trasactions trasaction = new Trasactions();
                    trasaction.trasactionspage(pin);
                    trasaction.setVisible(true);
                }
            }else if(ae.getSource()==back){
                setVisible(false);
                Trasactions trasaction = new Trasactions();
                trasaction.trasactionspage(pin);
                trasaction.setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        
        Deposite deposite =new Deposite();
        deposite.depositepage("");

    }

}
