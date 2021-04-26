package projectcrimino;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class home extends JFrame implements ActionListener
{
    JLabel l1;
    JButton b1,b2,b3,b4,b5,b6,b7;
    
    home()
    {
       setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("CRIMINO");
        int y = fm.stringWidth(" ");
        int z = getWidth() - (3*x);
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"CRIMINO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
        l1 = new JLabel("What Would You Like To View?");
        l1.setFont(new Font("System", Font.BOLD, 38));
    
       
        b1 = new JButton("BOOK NEW SUSPECT");
        b1.setFont(new Font("System", Font.BOLD, 18));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
    
        b2 = new JButton("UPDATE SUSPECT STATUS");
        b2.setFont(new Font("System", Font.BOLD, 18));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        b3 = new JButton("CHECK SUSPECT STATUS");
        b3.setFont(new Font("System", Font.BOLD, 18));
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        
        b7 = new JButton("EXIT");
        b7.setFont(new Font("System", Font.BOLD, 18));
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        
        
        setLayout(null);
        
        l1.setBounds(100,100,700,40);
        add(l1);
        
        b1.setBounds(40,250,300,60);
        add(b1);
        
        b2.setBounds(440,250,300,60);
        add(b2);
        
        b3.setBounds(40,360,300,60);
        add(b3);
        
        
        b7.setBounds(240,600,300,60);
        add(b7);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        b7.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(800,800);
        setVisible(true);               
    }
        public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){ 
            new newSuspect().setVisible(true);
            setVisible(false);       
        }
        /*else if(ae.getSource()==b2){     
            new withdraw().setVisible(true);
            setVisible(false);          
        }
       //else if(ae.getSource()==b3){ 
            //new transfer().setVisible(true);
            //setVisible(false);
        //}
       /*else if(ae.getSource()==b4){ 
           new mywallet().setVisible(true);
           setVisible(false);
        }*/
       else if(ae.getSource()==b3){ 
            //rentDue a=new rentDue();
            //a.setVisible(true);
            //this.setVisible(false);
            String appNo = JOptionPane.showInputDialog("Enter Apartment No"); 
            int transfer = 0;
            int rent_due = 0;
            conn c1 = new conn();                  
            try {               
                ResultSet rs = c1.s.executeQuery(" select * from rent where AppNo = '"+appNo+"'");
                    if(rs.next()){
                        transfer = rs.getInt("Amount_transfered");
                        rent_due = rs.getInt("Rent_due");
                    }
                    
                   int newrent_due = 0;
                   newrent_due = rent_due - transfer;
                   
                   java.sql.Connection database1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/nnj","root","");
                   PreparedStatement updateRent_due = database1.prepareStatement("update rent set Rent_due =? where AppNo ='"+appNo+"'");
                   updateRent_due.setInt(1, newrent_due);
                   // updateTransfer.setString(2, tenant.getappNo());
                   updateRent_due.executeUpdate(); 
                   JOptionPane.showMessageDialog(null, "Kshs."+newrent_due+" is your rent due ");

               // JOptionPane.showMessageDialog(null,"Your Account Balance is Ksh."+balance);               
                
            } catch (Exception e) {  
                e.printStackTrace();          
            }  
           //new rentDue().setVisible(true);
           //setVisible (false);
        }
       else if(ae.getSource()==b6){  
//            balance a=new balance();
            //a.setVisible(true);
            //this.setVisible(false);
            String appNo = JOptionPane.showInputDialog("Enter Apartment No"); 
            conn c1 = new conn();                  
            try {               
                ResultSet rs = c1.s.executeQuery(" SELECT Balance_after FROM wallet WHERE AppNo = '"+appNo+"' ORDER BY date_ot DESC LIMIT 1");              
                if(rs.next()){              
                String balance = rs.getString("Balance_after");               
                JOptionPane.showMessageDialog(null,"Your Account Balance is Ksh."+balance);               
                }
            } catch (Exception e) {  
                e.printStackTrace();          
            }  
        }else if(ae.getSource()==b7){ 
            System.exit(0);
            
        }      
    }
    

    public static void main(String[] args){
       // new Transcations().setVisible(true);
       new home().setVisible(true);
    }
    
}
