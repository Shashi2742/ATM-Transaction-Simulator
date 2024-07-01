
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
JButton  signIn,clear,signUp;
JTextField cardTextField;
JPasswordField pinTextField;

    public void loginPage(){
        setTitle("WELCOME");
        setSize(850,600);
        setLocation(350,150);
        getContentPane().setBackground(Color.white);
       setLayout(null);
       
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,200,200);
        add(label);

         
      JLabel text = new JLabel("Welcome To ATM");
      text.setBounds(300,80,400,40);
      text.setFont(new Font("Osward",Font.BOLD,40));
      add(text);

      JLabel cardno = new JLabel("Card No.");
      cardno.setBounds(150,230,200,30);
      cardno.setFont(new Font("Raleway",Font.BOLD,30));
      add(cardno);

       cardTextField = new JTextField();
      cardTextField.setBounds(350,230,300,30);
      cardTextField.setFont(new Font ("Arial",Font.BOLD,14));
      add(cardTextField);

      JLabel pin = new JLabel("PIN ");
      pin.setBounds(150,290,100,30);
      pin.setFont(new Font("Raleway",Font.BOLD,30));
      add(pin);

       pinTextField = new JPasswordField();
      pinTextField.setBounds(350,290,300,30);
      add(pinTextField);

      signIn= new JButton("SIGN IN");
      signIn.setBounds(350,350,90,30);
      signIn.setBackground(Color.BLACK);
      signIn.setForeground(Color.WHITE);
      signIn.addActionListener(this);
      add(signIn);

       clear= new JButton("CLEAR");
      clear.setBounds(550,350,100,30);
      clear.setBackground(Color.BLACK);
      clear.setForeground(Color.WHITE);
      clear.addActionListener(this);
      add(clear);

       signUp= new JButton("SIGNUP");
      signUp.setBounds(350,400,300,30);
      signUp.setBackground(Color.BLACK);
      signUp.setForeground(Color.WHITE);
      signUp.addActionListener(this);
      add(signUp);


        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
      if(ae.getSource() == signIn){
         Conn conn =new Conn();
         String cardnumber = cardTextField.getText();
        String pin = pinTextField.getText();

         String query ="select * from login where cardNumber ='"+cardnumber+"' and pinnumber = '"+pin+"' ";
         try{
         ResultSet rs=conn.s.executeQuery(query);
         if(rs.next()){
              setVisible(false);
               
              Trasactions trasactions =new Trasactions();
              trasactions.trasactionspage("");
              trasactions.setVisible(true);
            }
            else{
              JOptionPane.showMessageDialog(null,"Invalid Card Number & PIN");
            }
         }
         catch (Exception e){
          System.out.println(e);
         }
      }
      else if(ae.getSource() == signUp){
        setVisible(false);
         SignupOne signupOne = new SignupOne();
        signupOne. SignupOnePage();
        signupOne.setVisible(true);
         


      }
      else if(ae.getSource() == clear){
        cardTextField.setText("");
        pinTextField.setText("");
      }

    }
  }
//     public static void main(String[] args){
       
//       Login login = new Login();

//        login.loginPage();
// }
// }