
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import com.toedter.calendar.JDateChooser;


 public  class SignupOne extends JFrame implements ActionListener {
    
    int  random;
    JTextField nameField,fatherNameField ,emailAddressField,addressField,cityField,stateField, pinCodeField;
    JDateChooser dateChooser;
    JButton next;
    JRadioButton male,female,other,married ,unmarried;
    
    

   public  void  SignupOnePage(){
    setLayout(null);
  Random ran = new Random();
    random = Math.abs(ran.nextInt() % 9000)+1000;
      
   JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
   formno.setBounds(140,30,600,40);
   formno.setFont(new Font("Raleway",Font.BOLD,40));
   add(formno);

   JLabel personalDetails = new JLabel("Page 1 : Personal Details");
   personalDetails.setBounds(300,90,600,30);
   personalDetails.setFont(new Font("Raleway",Font.BOLD,25));
   add(personalDetails);

   JLabel name = new JLabel("Name:");
   name.setBounds(150,150,100,30);
   name.setFont(new Font("Raleway",Font.BOLD,15));
   add(name);
   
    nameField = new JTextField();
   nameField.setBounds(300,150,400,25);
   nameField.setFont(new Font ("Arial",Font.BOLD,15));
   add(nameField);

   JLabel fatherName = new JLabel("Father's Name:");
   fatherName.setBounds(150,200,150,30);
   fatherName.setFont(new Font("Raleway",Font.BOLD,15));
   add(fatherName);
   
   fatherNameField = new JTextField();
   fatherNameField.setBounds(300,200,400,25);
   fatherNameField.setFont(new Font ("Arial",Font.BOLD,15));
   add(fatherNameField);

   JLabel dateOfBirth = new JLabel("Date of Birth:");
   dateOfBirth.setBounds(150,250,150,30);
   dateOfBirth.setFont(new Font("Raleway",Font.BOLD,15));
   add(dateOfBirth);

    dateChooser = new JDateChooser();
   dateChooser.setBounds(300,250,400,30);
   dateChooser.setFont(new Font("Raleway",Font.BOLD,15));
   add(dateChooser);

   JLabel gender = new JLabel("Gender:");
   gender.setBounds(150,300,150,30);
   gender.setFont(new Font("Raleway",Font.BOLD,15));
   add(gender);

    male = new JRadioButton("Male");
   male.setBounds(300,300,60,30);
   add(male);

   female = new JRadioButton("Female");
   female.setBounds(360,300,70,30);
   add(female);

    other = new JRadioButton("Other");
   other.setBounds(430,300,100,30);
   add(other);

   ButtonGroup genderGroup = new ButtonGroup();
   genderGroup.add(male);
   genderGroup.add(female);
   genderGroup.add(other);
 
   JLabel emailAddress = new JLabel("Email Address:");
   emailAddress.setBounds(150,350,150,30);
   emailAddress.setFont(new Font("Raleway",Font.BOLD,15));
   add(emailAddress);

   emailAddressField = new JTextField();
   emailAddressField.setBounds(300,350,400,25);
   emailAddressField.setFont(new Font ("Arial",Font.BOLD,15));
   add( emailAddressField );

   JLabel marital_statusStatus = new JLabel("marital_status Status:");
   marital_statusStatus.setBounds(150,400,150,30);
   marital_statusStatus.setFont(new Font("Raleway",Font.BOLD,15));
   add(marital_statusStatus);

    married = new JRadioButton("Married");
   married.setBounds(310,400,70,30);
   add(married);

   unmarried = new JRadioButton("Unmarried");
   unmarried.setBounds(380,400,90,30);
   add(unmarried);


   ButtonGroup marital_statusGroup = new ButtonGroup();
   marital_statusGroup.add(married);
   marital_statusGroup.add(unmarried);
 


   JLabel address = new JLabel("Address:");
   address.setBounds(150,450,150,30);
   address.setFont(new Font("Raleway",Font.BOLD,15));
   add(address);

    addressField = new JTextField();
   addressField.setBounds(300,450,400,25);
   addressField.setFont(new Font ("Arial",Font.BOLD,15));
   add(addressField );

   JLabel city = new JLabel("City:");
   city.setBounds(150,500,150,30);
   city.setFont(new Font("Raleway",Font.BOLD,15));
   add(city);

    cityField = new JTextField();
   cityField.setBounds(300,500,400,25);
   cityField.setFont(new Font ("Arial",Font.BOLD,15));
   add(cityField);

   JLabel state = new JLabel("State:");
   state.setBounds(150,550,150,30);
   state.setFont(new Font("Raleway",Font.BOLD,15));
   add(state);

   stateField = new JTextField();
   stateField.setBounds(300,550,400,25);
   stateField.setFont(new Font ("Arial",Font.BOLD,15));
   add(stateField);

   JLabel pinCode = new JLabel("PIN Code:");
   pinCode.setBounds(150,600,150,30);
   pinCode.setFont(new Font("Raleway",Font.BOLD,15));
   add(pinCode);

    pinCodeField = new JTextField();
   pinCodeField.setBounds(300,600,400,25);
   pinCodeField.setFont(new Font ("Arial",Font.BOLD,15));
   add(pinCodeField);

    next = new JButton("NEXT");
   next.setBounds(600,650,100,30);
   next.setBackground(Color.BLACK);
   next.setForeground(Color.WHITE);
   next.setFont(new Font("Arial",Font.BOLD,15));
   next.addActionListener(this);
   add(next);

    getContentPane().setBackground(Color.white);
    setSize(850,800);
    setLocation(350,40);
    setVisible(true);

    }
     public void actionPerformed(ActionEvent e){
     
        
        String formno = "" + random;
        String  name =  nameField.getText();
        String  fname = fatherNameField.getText();
        String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
           gender ="Female";
        }
        else if(other.isSelected()){
            gender = "Other";
        }

        String email = emailAddressField.getText();
        String marital_status = null;
        if(married.isSelected()){
            marital_status ="Married";
        }
        else if(unmarried.isSelected()){
            marital_status = "Unmarried";
        }

        String address = addressField.getText();
        String city = cityField.getText();
        String state = stateField.getText();
        String pin = pinCodeField.getText();
    

    try{
        // if(name.equals("")){
        //            JOptionPane.showMessageDialog(null,"Name is Required");
        // }
        // else if(fname.equals("")){
        //     JOptionPane.showMessageDialog(null,"Father Name is Required" );

        // }
        // else if(dob.equals("")){
        //     JOptionPane.showMessageDialog(null," Birthdate  is Required" );

        // }
        // else if(gender.equals("")){
        //     JOptionPane.showMessageDialog(null," Please Select Gender" );

        // }
        // else if(email.equals("")){
        //     JOptionPane.showMessageDialog(null," Email is Required" );
        // }
        // else if(marital_status.equals("")){
        //         JOptionPane.showMessageDialog(null,"Please Select marital_status Status" );
        // }
        //  else if(address.equals("")){
        //         JOptionPane.showMessageDialog(null," Address is Required" );
    
        // }
        //  else if(city.equals("")){
        //         JOptionPane.showMessageDialog(null," City  Name is Required" );
        //  }
        //  else if(state.equals("")){
        //         JOptionPane.showMessageDialog(null," State  Name is Required" );
        //     }
        // else if(pin.equals("")){
        //             JOptionPane.showMessageDialog(null," PIN Code is Required" );
        
        //         }
      //  else{
            Conn con = new Conn();
            String query = "insert into signupone values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital_status+"','"+address+"','"+city+"','"+state+"','"+pin+"')";

            con.s.execute(query);
           //System.out.println("Next Button Clicked");

           setVisible(false);
         SignupTwo signuptwo = new SignupTwo();
        signuptwo.signuptwopage(formno);
        signuptwo.setVisible(true);
         

       // }
        
        
    }
         
    catch(Exception ae){
        System.out.println(ae);
    }
        }


    public static void main(String[] arg){
         SignupOne signupone = new SignupOne();
        
         signupone.SignupOnePage();
    
    }
}