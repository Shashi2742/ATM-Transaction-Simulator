

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener{
 
 JRadioButton r1,r2,r3,r4; 
 JCheckBox c1,c2,c3,c4,c5,c6,c7;
 JButton submit ,cancle; 
 String formno;  
   void sigupthreepage(String formno){
       this.formno = formno;
       setLayout(null);
       setTitle("Signup Three");



       

       JLabel l1 = new JLabel("Page 3: Account Details");
       l1.setFont(new Font("Raleway",Font.BOLD,30));
       l1.setBounds(250,40,400,50);
       add(l1);

       JLabel l2 = new JLabel("Account Type");
       l2.setFont(new Font("Raleway",Font.BOLD,23));
       l2.setBounds(100,100,400,50);
       add(l2);

       r1 = new JRadioButton("Saving Account");
       r1.setFont(new Font("Raleway",Font.BOLD,16));
       r1.setBounds(100,150,150,30); 
       add(r1);
       r2 = new JRadioButton("Fixed Deposite Account");
       r2.setFont(new Font("Raleway",Font.BOLD,16));
       r2.setBounds(270,150,250,30); 
       add(r2);
       r3 = new JRadioButton("Current Account");
       r3.setFont(new Font("Raleway",Font.BOLD,16));
       r3.setBounds(100,200,150,30); 
       add(r3);
       r4 = new JRadioButton("Recurring Deposite Account ");
       r4.setFont(new Font("Raleway",Font.BOLD,16));
       r4.setBounds(270,200,250,30); 
       add(r4);

       ButtonGroup buttonGroup = new ButtonGroup();
       buttonGroup.add(r1);
       buttonGroup.add(r2);
       buttonGroup.add(r3);
       buttonGroup.add(r4);

       JLabel carno = new JLabel("Card Number");
       carno.setFont(new Font("Raleway",Font.BOLD,23));
       carno.setBounds(100,250,200,50);
       add(carno);
       
       JLabel number = new JLabel("XXXX-XXXX-XXXX-2742");
       number.setFont(new Font("Raleway",Font.BOLD,23));
       number.setBounds(300,250,400,50);
       add(number);
      

       JLabel pin = new JLabel("PIN");
       pin.setFont(new Font("Raleway",Font.BOLD,23));
       pin.setBounds(100,300,200,50);
       add(pin);
       
       JLabel pinnumber = new JLabel("XXXX");
       pinnumber.setFont(new Font("Raleway",Font.BOLD,23));
       pinnumber.setBounds(300,300,200,50);
       add(pinnumber);
      

       JLabel service = new JLabel("Service Required");
       service.setFont(new Font("Raleway",Font.BOLD,23));
       service.setBounds(100,350,200,50);
       add(service);
       

         c1 = new JCheckBox("ATM CARD");
         c1.setBackground(Color.WHITE);
         c1.setFont(new Font("Raleway",Font.BOLD,16));
         c1.setBounds(100,400,150,20);
         add(c1);

         c2 = new JCheckBox("Internet Banking");
         c2.setBackground(Color.WHITE);
         c2.setFont(new Font("Raleway",Font.BOLD,16));
         c2.setBounds(300,400,150,20);
         add(c2);


         c3 = new JCheckBox("Mobile Banking");
         c3.setBackground(Color.WHITE);
         c3.setFont(new Font("Raleway",Font.BOLD,16));
         c3.setBounds(100,450,150,20);
         add(c3);


         c4 = new JCheckBox("EMAIL & SMS Alert");
         c4.setBackground(Color.WHITE);
         c4.setFont(new Font("Raleway",Font.BOLD,16));
         c4.setBounds(300,450,200,20);
         add(c4);

         c5 = new JCheckBox("Cheque Book");
         c5.setBackground(Color.WHITE);
         c5.setFont(new Font("Raleway",Font.BOLD,16));
         c5.setBounds(100,500,150,20);
         add(c5);

         c6 = new JCheckBox("E- Statement");
         c6.setBackground(Color.WHITE);
         c6.setFont(new Font("Raleway",Font.BOLD,16));
         c6.setBounds(300,500,150,20);
         add(c6);

         c7 = new JCheckBox("I hereby decleares that the above entered details are correct to the best of my knowledge");
         c7.setBackground(Color.WHITE);
         c7.setFont(new Font("Raleway",Font.BOLD,10));
         c7.setBounds(100,550,500,20);
         add(c7);

         

         submit = new JButton("Submit");
         submit.setBackground(Color.BLACK);
         submit.setForeground(Color.WHITE);
         submit.setFont(new Font("roleway",Font.BOLD,14));
         submit.setBounds(400,600,100,30);
         submit.addActionListener(this);
         add(submit);

         cancle = new JButton("Cancle");
         cancle.setBackground(Color.BLACK);
         cancle.setForeground(Color.WHITE);
         cancle.setFont(new Font("roleway",Font.BOLD,14));
         cancle.setBounds(550,600,100,30);
         cancle.addActionListener(this);
         add(cancle);
         
       setSize(850,700);
       setLocation(350,80);
       setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
     if(ae.getSource() == submit){
      String accountType = null;
            if(r1.isSelected()){
              accountType = "Saving Account";
            }
            else if(r2.isSelected()){
              accountType = "Fixed Deposite Account";
            }
            else if(r3.isSelected()){
              accountType = "Current Account";
            }
            else if(r4.isSelected()){
              accountType = "Reccuring Deposite Account";
            }

            Random random = new Random();
            long cardNumber=Math.abs((random.nextLong()%90000000L)+5040360000000000L);
            String pinnumber = ""+(Math.abs((random.nextInt()%9000)+1000));

            String facility="";
            if(c1.isSelected()){
              facility = facility + " ATM Card";
            }else if(c2.isSelected()){
              facility = facility + " Internet Banking";
            }else if(c3.isSelected()){
              facility = facility + " Mobile Banking";
            }else if(c4.isSelected()){
              facility = facility + " EMAIL & SMS Alerts";
            }else if(c5.isSelected()){
              facility = facility + " Cheque Book";
            }else if(c6.isSelected()){
              facility = facility + " E-Statement";
            }

            try{
             if(accountType==null){
              JOptionPane.showMessageDialog(null,"Account Type is Required");
             }
             else{
              Conn conn= new Conn();
              String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardNumber+"','"+pinnumber+"','"+facility+"')";
              String query2 = "insert into login values('"+formno+"','"+cardNumber+"','"+pinnumber+"')";
              conn.s.executeUpdate(query1);
              conn.s.executeUpdate(query2);

              JOptionPane.showMessageDialog(null,"Card Number :"+ cardNumber + "\n pin :"+pinnumber) ;
              
              setVisible(false);
             Deposite deposite = new Deposite();
             deposite.depositepage(pinnumber);
             deposite.setVisible(true);

             
             }
            }catch(Exception e){
              System.out.println(e);
            }
          }
     else if(ae.getSource()==cancle){
               setVisible(false);
               Login login=new Login();
               login.loginPage();
               login.setVisible(true);
     }
    }

    public static void main(String[] args){
        SignupThree signupthree =new SignupThree();
        signupthree.sigupthreepage("");
    }
}