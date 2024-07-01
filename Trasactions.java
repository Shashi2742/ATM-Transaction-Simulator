import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Trasactions extends JFrame implements ActionListener{
  
  JButton deposite,cashWithdrawl,fastCash,miniStatement,pinChange,balanceEnquiry,exit;
  String pin;
    void  trasactionspage(String pin) {
      this.pin=pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Please Select Your Trasaction");
        text.setBounds(215,300,700,35);
        text.setFont(new Font("Raleway",Font.BOLD,17));
        text.setForeground(Color.WHITE);
        image.add(text);

        deposite = new JButton("Deposite");
        deposite.setBounds(170,415,150,30);
        deposite.addActionListener(this);
        image.add(deposite);
        cashWithdrawl = new JButton("Cash Withdrawal");
        cashWithdrawl.setBounds(350,415,150,30);
        cashWithdrawl.addActionListener(this);
        image.add(cashWithdrawl);
        fastCash = new JButton("Fast Cash");
        fastCash.setBounds(170,450,150,30);
        fastCash.addActionListener(this);
        image.add(fastCash);
        miniStatement = new JButton("Mini Statement");
        miniStatement.setBounds(350,450,150,30);
        miniStatement.addActionListener(this);
        image.add(miniStatement);
        
        pinChange= new JButton("Pin Change");
        pinChange.setBounds(170,485,150,30);
        pinChange.addActionListener(this);
        image.add(pinChange);
        balanceEnquiry = new JButton("Balance Enquiry");
        balanceEnquiry.setBounds(350,485,150,30);
        balanceEnquiry.addActionListener(this);
        image.add(balanceEnquiry);
        exit = new JButton("Exit");
        exit.setBounds(270,520,150,30);
        exit.addActionListener(this);
        image.add(exit);


        setSize(900,900);
        setLocation(300,0);
       // setUndecorated(true);
        setVisible(true);
     } 

 public void actionPerformed( ActionEvent ae){
    if(ae.getSource()==exit){
      setVisible(false);
      Login login = new Login();
      login.loginPage();
      login.setVisible(true);
    }else if(ae.getSource()==deposite){
      Deposite deposite = new Deposite();
      deposite.depositepage(pin);
    }else if(ae.getSource()==cashWithdrawl){
      setVisible(false);
      Withdrawl withdrawl = new Withdrawl();
      withdrawl.withdrawlpage(pin);
      withdrawl.setVisible(true);
    }
   else if(ae.getSource()==fastCash){
      setVisible(false);
      new FastCash("").setVisible(true);
    }
    else if(ae.getSource()==miniStatement){
      setVisible(false);
      new MiniStatement("").setVisible(true);
    }
    else if(ae.getSource()==pinChange){
      setVisible(false);
      new Pin("").setVisible(true);
    }
    else if(ae.getSource()==balanceEnquiry){
      setVisible(false);
      new BalanceEnquiry("").setVisible(true);
    }


 }
public static void main(String[] args) {
        
  Trasactions Withdrawl =new Trasactions();
  Withdrawl.trasactionspage("");

}

}