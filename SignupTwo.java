
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;



 public  class SignupTwo extends JFrame implements ActionListener {
    
 
    JComboBox regionField,categoryField,incomeField,educationalQualificationField,occupacationField;
    JTextField panNumberField,aadharNumberField;
    JRadioButton sYes,sNo,eYes,eNo;
    JButton next;
   
    
    String formno;

   public  void  signuptwopage( String formno){
    this.formno = formno;
    setLayout(null);
    

    setTitle("NEW ACCOUNT APPLICATION FORM PAGE 2");
 
      
   JLabel additionalDetails= new JLabel("Page 2 : Additional Details ");
   additionalDetails.setBounds(140,30,600,40);
   additionalDetails.setFont(new Font("Raleway",Font.BOLD,40));
   add(additionalDetails);

   JLabel personalDetails = new JLabel("Page 1 : Personal Details");
   personalDetails.setBounds(300,90,600,30);
   personalDetails.setFont(new Font("Raleway",Font.BOLD,25));
   add(personalDetails);

   JLabel religion = new JLabel("Religion :");
   religion.setBounds(150,150,100,30);
   religion.setFont(new Font("Raleway",Font.BOLD,15));
   add(religion);
   
   String valReligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
    regionField = new JComboBox(valReligion);
    regionField.setBounds(300,150,400,25);
   regionField.setFont(new Font ("Arial",Font.BOLD,15));
   add(regionField);

  
   JLabel category = new JLabel("Category :");
   category.setBounds(150,200,150,30);
   category.setFont(new Font("Raleway",Font.BOLD,15));
   add(category);
   

   String valCategory[] = {"General","OBC","SC","ST","NT","Other"};
   categoryField = new JComboBox(valCategory);
   categoryField.setBounds(300,200,400,25);
   categoryField.setFont(new Font ("Arial",Font.BOLD,15));
   add(categoryField);

   JLabel income = new JLabel("Income :");
   income.setBounds(150,250,150,30);
   income.setFont(new Font("Raleway",Font.BOLD,15));
   add(income);


   String valIncome[] = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
    incomeField = new JComboBox(valIncome);
    incomeField.setBounds(300,250,400,30);
    incomeField.setFont(new Font("Raleway",Font.BOLD,15));
   add(incomeField);

   
 
   JLabel educational = new JLabel("Educational");
   educational.setBounds(150,300,150,30);
   educational.setFont(new Font("Raleway",Font.BOLD,15));
   add(educational);
   JLabel qulification = new JLabel("Qualification :");
   qulification.setBounds(150,330,150,30);
   qulification.setFont(new Font("Raleway",Font.BOLD,15));
   add(qulification);

  
   String valEducationalQualification[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Other"};
   educationalQualificationField= new JComboBox(valEducationalQualification);
   educationalQualificationField.setBounds(300,330,400,30);
   educationalQualificationField.setFont(new Font ("Arial",Font.BOLD,15));
   add(educationalQualificationField);

   JLabel  occupacation= new JLabel("Occupation :");
   occupacation.setBounds(150,400,150,30);
   occupacation.setFont(new Font("Raleway",Font.BOLD,15));
   add(occupacation);
 
   String valOccupacation[] = {"Salaried","Self-Employed","","Bussiness","Student","Other"};
   occupacationField= new JComboBox(valOccupacation);
   occupacationField.setBounds(300,400,400,25);
   occupacationField.setFont(new Font ("Arial",Font.BOLD,15));
   add(occupacationField);
    
 


   JLabel panNumber = new JLabel("Pan Number:");
   panNumber.setBounds(150,450,150,30);
   panNumber.setFont(new Font("Raleway",Font.BOLD,15));
   add(panNumber);

   panNumberField = new JTextField();
   panNumberField.setBounds(300,450,400,25);
   panNumberField.setFont(new Font ("Arial",Font.BOLD,15));
   add(panNumberField );

   JLabel aadharNumber = new JLabel("Aaddhar No. :");
   aadharNumber.setBounds(150,500,150,30);
   aadharNumber.setFont(new Font("Raleway",Font.BOLD,15));
   add(aadharNumber);

   aadharNumberField = new JTextField();
   aadharNumberField.setBounds(300,500,400,25);
   aadharNumberField.setFont(new Font ("Arial",Font.BOLD,15));
   add(aadharNumberField);

   JLabel senoirCitizen = new JLabel("Senior Citizen:");
   senoirCitizen.setBounds(150,550,100,30);
   senoirCitizen.setFont(new Font("Raleway",Font.BOLD,15));
   add(senoirCitizen);

    sYes= new JRadioButton("Yes");
    sYes.setBounds(350,550,60,25);
    sYes.setFont(new Font ("Arial",Font.BOLD,15));
   add(sYes);
   sNo= new JRadioButton("No");
   sNo.setBounds(420,550,60,25);
   sNo.setFont(new Font ("Arial",Font.BOLD,15));
  add(sNo);

  ButtonGroup senior_citizeButtonGroup = new ButtonGroup();
  senior_citizeButtonGroup.add(sYes);
  senior_citizeButtonGroup.add(sNo);

   JLabel existingAccount = new JLabel("Existing Account:");
   existingAccount.setBounds(150,600,150,30);
   existingAccount.setFont(new Font("Raleway",Font.BOLD,15));
   add(existingAccount);
  
   eYes= new JRadioButton("Yes");
   eYes.setBounds(350,600,60,25);
   eYes.setFont(new Font ("Arial",Font.BOLD,15));
  add(eYes);
  eNo= new JRadioButton("No");
  eNo.setBounds(420,600,60,25);
  eNo.setFont(new Font ("Arial",Font.BOLD,15));
  add(eNo);

  ButtonGroup existingAccountButtonGroup = new ButtonGroup();
  existingAccountButtonGroup.add(eYes);
  existingAccountButtonGroup.add(eNo);
   

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
     
        
        String formno =this.formno ;
        String  religion =  (String)regionField.getSelectedItem();
        String  category = (String)categoryField.getSelectedItem();
        String income =(String)incomeField.getSelectedItem();
        String education_qualification =(String)educationalQualificationField.getSelectedItem();
        String occupation =(String)occupacationField.getSelectedItem();
        String  pannumber = panNumberField.getText();
        String  aadharnumber = aadharNumberField.getText();;
        String citizen = null;
        if(sYes.isSelected()){
            citizen="Yes";
        }
        else if(sNo.isSelected()){
           citizen ="No";
        }
      
        String existingAccount = null;
        if(eYes.isSelected()){
            existingAccount ="Yes";
        }
        else if(eNo.isSelected()){
            existingAccount = "No";
        }

       
    

    try{

            Conn con = new Conn();
            String query = "insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education_qualification+"','"+occupation+"','"+pannumber+"','"+aadharnumber+"','"+citizen+"','"+existingAccount+"')";
             con.s.execute(query); 
             
             setVisible(false);
             SignupThree signupthree = new SignupThree();
             signupthree.sigupthreepage(formno);
             signupthree.setVisible(true);
    }
         
    catch(Exception ae){
        System.out.println(ae);
    }
        }


    public static void main(String[] arg){
      //  SignupTwo signuptwo = new SignupTwo();
       // signuptwo.signuptwopage();
    
    }
}