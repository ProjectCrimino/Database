package projectcrimino;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.Locale;
import java.lang.String;

public class login extends JFrame implements ActionListener 
{
    JLabel l1,l2,l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1,b2,b3;
   
    login()
    {
        //Move the text to the center
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("CRIMINO");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"CRIMINO");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l1 = new JLabel("WELCOME!!");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        
        l2 = new JLabel("OFFICER ID:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        
        l3 = new JLabel("PASSWORD:");
        l3.setFont(new Font("Raleway", Font.BOLD, 28));
        
        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);
        
        b1 = new JButton("SIGN IN");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("CLEAR");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        setLayout(null);
        
        l1.setBounds(175,50,450,200);
        add(l1);
        
        l2.setBounds(125,150,375,200);
        add(l2);
        
        tf1.setBounds(300,235,230,30);
        add(tf1);
        
        l3.setBounds(125,225,375,200);
        add(l3);
        
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
       
        
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300,310,230,30);
        add(pf2);
        
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setBounds(300,400,100,30);
        add(b1);
        
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setBounds(430,400,100,30);
        add(b2);
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(750,750);
        //setLocation(500,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        try{        
            String id  = tf1.getText();
            String pass  = pf2.getText();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectcrimino?serverTimezone=UTC","root","");
            System.out.println("successful");
            String query  = "select * from officers where IdNumber = ? and Password = ?";
            PreparedStatement pst=con.prepareStatement(query);
            pst.setString(1, id);
            pst.setString(2,pass);
          
                ResultSet rs=pst.executeQuery();
                   if(rs.next()){
                       home a=new home();
                       a.setVisible(true);
                       this.setVisible(false);
                       System.out.println("Login successful");
                       
                   }else{
                       JOptionPane.showMessageDialog(null, "Please Check Username or Password ");
                   }
                //rs.close();
                //con.close();
            
            if(ae.getSource()==b1){
                  if(rs.next()){
                    new home().setVisible(true);
                    setVisible(false);
                
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Password");
                    
                }
            }else if(ae.getSource()==b2){
                tf1.setText("");
                pf2.setText("");
            }
        }catch(Exception e){
                    e.printStackTrace();
                    System.out.println("error: "+e);
        }
            
    }
    
}
