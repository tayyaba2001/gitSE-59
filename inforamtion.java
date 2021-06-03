import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
	
 class inforamtion extends JFrame implements AdjustmentListener ,ActionListener, 
         TextListener ,ItemListener
         {
     
     
     
     
     
     
JLabel lko1,label1,label2,label3,label4,label5,label6,out,display,display1;
 JLabel display2,display3,display4,display5;
JTextField t1,t2;
JRadioButton male,female;
  JComboBox d1,m1;
JTextArea address;
        JTextField f1,l1,m11,m12,m13,m14,m15,m16,m17,m18,m19,n1,o1,p1,q1;
        JButton b1,b2;
TextField f9;
Scrollbar sb;  	
JTextField t11;

Frame f;
inforamtion()
{

f=new Frame("information"); 

 	 	f.setVisible(true); 
 	 	f.setLayout(new FlowLayout()); 
 	 	f.setSize(1000,1000); 

label1=new JLabel(" First Name");
label1.setBounds(40,50,100,20);
f.add(label1);
f1=new JTextField("         ");
f1.setBounds(100,50,100,20);
f.add(f1);

label2=new JLabel(" Last Name");
label2.setBounds(250,50,100,20);
f.add(label2);
l1=new JTextField("             ");
l1.setBounds(270,50,100,20);
f.add(l1);

f9=new TextField(25);

label3=new JLabel(" address  ");
label3.setBounds(400,50,100,20);
f.add(label3);
sb= new Scrollbar( ); 
t11=new JTextField("wtf");
 t11.setBounds(470,50,100,20);
 	f.add(sb);
f.add(t11); 
sb.addAdjustmentListener(this);
 	
 	 


label4=new JLabel(" Gender");
label4.setBounds(600,50,100,20);
f.add(label4);

male=new JRadioButton("Male");
male.setBounds(600,70,100,20);
f.add(male);

female=new JRadioButton("feMale");
female.setBounds(600,90,100,20);
f.add(female);

ButtonGroup gen=new ButtonGroup();
lko1=new JLabel("       ");

male.addItemListener(this);
female.addItemListener(this);
gen.add(male);
gen.add(female);
male.setSelected(true);
label5=new JLabel(" Qualification");
label5.setBounds(20,100,100,20);
f.add(label5);


String d[]={"software","civil","mechanical","electronic","computer"};
String m[]={"BS","MS","PHD","UNDERGRAD"};

d1=new JComboBox(d);
d1.setBounds(150,100,100,20);
f.add(d1);

 m1=new JComboBox(m);
m1.setBounds(270,100,100,20);
f.add(m1);



b1=new JButton("Submit Form"); 	
b1.setBounds(300,100,150,20);
  f.add(b1);	 
  

 m11=new JTextField("                    ");
m11.setBounds(400,89,100,20);
f.add(m11);
 
display=new JLabel("         ");
display.setBounds(500,200,100,20);
f.add(display);
 	 
 	
 m12=new JTextField("                    ");
m12.setBounds(600,100,100,20);
f.add(m12);




display1=new JLabel("         ");
display1.setBounds(700,100,100,20);
f.add(display1);
   
        
   m13=new JTextField("                    ");
m13.setBounds(900,100,150,20);
 f.add(m13);      
 display3=new JLabel("         ");
display3.setBounds(1000,100,100,20);
f.add(display3);
 
 
 
   m14=new JTextField("                    ");
m14.setBounds(150,200,100,20);
f.add(m14);      
     lko1.setBounds(250,100,100,20);
 	f.add(lko1);   
        
        
     m15=new JTextField("                    ");
m15.setBounds(350,100,170,20);

 	f.add(m15);  
        
        
        
    display4=new JLabel("       ");
display4.setBounds(700,100,100,20);
f.add(display4); 
    
   display5=new JLabel("       ");
display5.setBounds(700,100,100,20);
f.add(display5);       
  
 b1.addActionListener(this);

b2=new JButton("cancel"); 	
f.add(b2);

}



    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        
        
        	int i= sb.getValue();
  //To change body of generated methods, choose Tools | Templates.
    }
    
   
public void actionPerformed(ActionEvent e)//override actionperformed method 
	{ 
    
	String str="First name";//method returns string value of button 
	 	m11.setText(str);  
                
          String str1="Last name";//method returns string value of button 
	 	m12.setText(str1);        
          String str2="Address";//method returns string value of button 
	 	m13.setText(str2);        
            String str3="Gender";//method returns string value of button 
	 	m14.setText(str3);      
             String str4="Qualification";//method returns string value of button 
	 	m15.setText(str4);  
               display.setText(f1.getText());
                display1.setText(l1.getText());
                 display3.setText(t11.getText());
                 
                 
           display4.setText(d1.getSelectedItem()+" "+m1.getSelectedItem());       
	// last1.setText("first"+last.getText());
        /*   String str5=f1.getText();
               f1.setText(str5);
               display.setText(str5);*/
         // String data=d1.getSelecteddisplay.setText(str5);
                 
              //display4.setText(data);
             
             
	} 

    
public static void main(String[] args)
{


inforamtion f=new inforamtion();

}

    @Override
    public void textValueChanged(TextEvent Fe) {
        
        JTextField f1=(JTextField) Fe.getSource();
        String s1=f1.getText();        
        display.setText(s1);
        
         JTextField l1=(JTextField) Fe.getSource();
        String s2=l1.getText();        
      display1.setText(s2); 
        
        
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
    
        
if(e.getSource() == male)
{
if(e.getStateChange() == 1)
{
lko1.setText("male");
}}
else
{
if(e.getStateChange() == 1)
{
lko1.setText("female");
}

}





//To change body of generated methods, choose Tools | Templates.
    }



}