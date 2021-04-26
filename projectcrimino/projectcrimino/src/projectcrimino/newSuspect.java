/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectcrimino;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.*;
import java.sql.*;
import java.util.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
/**
 *
 * @author Naomi
 */
public class newSuspect extends JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b1,b2,b3;
    JComboBox c1,c2,c3;
    
    newSuspect(){
        //Move the text to the center
        setFont(new Font("System", Font.BOLD, 22));
        Font f = getFont();
        FontMetrics fm = getFontMetrics(f);
        int x = fm.stringWidth("SUSPECT BOOKING FORM");
        int y = fm.stringWidth(" ");
        int z = getWidth() - x;
        int w = z/y;
        String pad ="";
        //for (int i=0; i!=w; i++) pad +=" ";   
        pad = String.format("%"+w+"s", pad);
        setTitle(pad+"SUSPECT BOOKING FORM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //l1 = new JLabel("APPLICATION FORM NO. "+first);
        l1 = new JLabel("SUSPECT BOOKING FORM");
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        
        l2 = new JLabel("Personal Details:");
        l2.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l3 = new JLabel("First Name:");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l4 = new JLabel("Last Name:");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l7 = new JLabel("ID No:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l8 = new JLabel("Photo:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l9 = new JLabel("Time of Arrest:");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l10 = new JLabel("Charge:");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        
        //20 = new JLabel("Charge:");
        //20.setFont(new Font("Raleway", Font.BOLD, 20));
        
        l11 = new JLabel("Arresting Officer:");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        
        //l12 = new JLabel("Arresting Officer");
        //l12.setFont(new Font("Raleway", Font.BOLD, 14));
        
        //l14 = new JLabel("Month");
        //l14.setFont(new Font("Raleway", Font.BOLD, 14));
        
        //l15 = new JLabel("Year");
        //l15.setFont(new Font("Raleway", Font.BOLD, 14));
        
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));
                
        b2 = new JButton("BROWSE");
        b2.setBounds(300,385,190,40);
        add(b2);
        
        //b3 = new JButton("INSERT");
        //b3.setBounds(500,385,190,40);
        //add(b3);
        
        b1 = new JButton("Next");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.WHITE);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.WHITE);
        
        //r3 = new JRadioButton("Married");
        ////r3.setFont(new Font("Raleway", Font.BOLD, 14));
        //r3.setBackground(Color.WHITE);
        
        //r4 = new JRadioButton("Single");
        //r4.setFont(new Font("Raleway", Font.BOLD, 14));
        //r4.setBackground(Color.WHITE);
        
        //r5 = new JRadioButton("Other");
        //r5.setFont(new Font("Raleway", Font.BOLD, 14));
        //r5.setBackground(Color.WHITE);
        
        
     
        /*String date[] = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        c1 = new JComboBox(date);
        c1.setBackground(Color.WHITE);
        
        String month[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        c2 = new JComboBox(month);
        c2.setBackground(Color.WHITE);
        
        String year[] = {"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002"};
        c3 = new JComboBox(year);
        c3.setBackground(Color.WHITE);*/
        
        
        
        setLayout(null);
        l1.setBounds(140,20,600,40);
        add(l1);
        
        l2.setBounds(290,70,600,30);
        add(l2);
        
        l3.setBounds(100,140,100,30);
        add(l3);
        
        l4.setBounds(100,190,200,30);
        add(l4);
        
        t1.setBounds(300,140,400,30);
        add(t1);
        
        t2.setBounds(300,190,400,30);
        add(t2);
        
        l16 = new JLabel("no file selected");
        l16.setBounds(500,385,190,40);
        add(l16);
        
        //l13.setBounds(300,240,40,30);
        //add(l13);
        
        //c1.setBounds(340,240,60,30);
        //add(c1);
        
        //l14.setBounds(410,240,50,30);
        //add(l14);
        
        //c2.setBounds(460,240,100,30);
        //add(c2);
        
        //l15.setBounds(570,240,40,30);
        //add(l15);
        
        //c3.setBounds(610,240,90,30);
        //add(c3);
        
        l6.setBounds(100,290,200,30);
        add(l6);
        
        r1.setBounds(300,290,60,30);
        add(r1);
        
        r2.setBounds(450,290,90,30);
        add(r2);
        
        l7.setBounds(100,340,200,30);
        add(l7);
        
        t3.setBounds(300,340,400,30);
        add(t3);
        
        l8.setBounds(100,390,200,30);
        add(l8);
        
        //r3.setBounds(300,390,100,30);
        //add(r3);
        
        //r4.setBounds(450,390,100,30);
        //add(r4);
        
        //r5.setBounds(635,390,100,30);
        //add(r5);
        
        
        
        l9.setBounds(100,440,200,30);
        add(l9);
        
        t4.setBounds(300,440,400,30);
        add(t4);
        
        l10.setBounds(100,490,200,30);
        add(l10);
        
        t5.setBounds(300,490,400,30);
        add(t5);
        
        l11.setBounds(100,540,200,30);
        add(l11);
        
        t6.setBounds(300,540,400,30);
        add(t6);
        
        //l12.setBounds(100,590,200,30);
        //add(l12);
        
        //t7.setBounds(300,590,400,30);
        //add(t7);
        
        b1.setBounds(620,660,80,30);
        //b.setBounds(620,550,80,30);
        add(b1);
        
        b1.addActionListener(this); 
        b2.addActionListener(this);
        //b3.addActionListener(this);
        getContentPane().setBackground(Color.WHITE);
        
        setSize(750,750);
        //setLocation(500,90);
        setVisible(true);
    }
    
 public void actionPerformed(ActionEvent ae){
        
        //String ac = (String)c1.getSelectedItem(); 
        //String bc = (String)c2.getSelectedItem();
        //String cc = (String)c3.getSelectedItem();
        
        String gend = null;
        if(r1.isSelected()){ 
            gend = "Male";
        }
        else if(r2.isSelected()){ 
            gend = "Female";
        }
       
        if(ae.getSource()== b1){
                new home().setVisible(true);
                setVisible(false);
        }
        
        if(ae.getSource()== b2){
                JFileChooser j = new JFileChooser();
                j.showOpenDialog(null);
                File f = j.getSelectedFile();
                String filename = f.getAbsolutePath();
                l16.setText(filename);
                Image getAbsolutePath = null;

        }
        
        /*if(ae.getSource()== b2){
         JFileChooser fileChooser = new JFileChooser();
         fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
         FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
         fileChooser.addChoosableFileFilter(filter);
         int result = fileChooser.showSaveDialog(null);
        
         if(result == JFileChooser.APPROVE_OPTION){
             File selectedFile = fileChooser.getSelectedFile();
             String path = selectedFile.getAbsolutePath();
             String s = path;
         }
         else if(result == JFileChooser.CANCEL_OPTION){
             System.out.println("No Data");
         }
     }
    
        
        /*if(ae.getSource()== b2){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg","gif","png");
            fileChooser.addChoosableFileFilter(filter);
            int result = fileChooser.showSaveDialog(null);
            if(result == JFileChooser.APPROVE_OPTION){
                File selectedFile = fileChooser.getSelectedFile();
                String path = selectedFile.getAbsolutePath();
                System.out.println("Data");
                //label.setIcon(ResizeImage(path));
                String s = path;
                System.out.println("s");
            }
            else if(result == JFileChooser.CANCEL_OPTION){
                System.out.println("No Data");
            }
        }*/
        
        /*if(ae.getSource()== b1){
            try{
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectcrimino?serverTimezone=UTC","root","");
               System.out.println("successful");
               PreparedStatement ps = con.prepareStatement("insert into suspects(FName,LName,Gender,SuspectID,Photo,TimeOfArrest,Charge,ArrestingOfficer) values(?,?,?,?,?,?,?,?)");
               String image = l16.getText();
               image = image.replace("\\", "\\\\");
               //InputStream is = new FileInputStream(new File(s));
               ps.setString(1, t1.getText());
               ps.setString(2, t2.getText());
               ps.setString(3, t3.getText());
               ps.setString(4, t4.getText());
               ps.setString(5,image);
               ps.setString(6, t5.getText());
               ps.setString(7, t6.getText());
               ps.setString(8, t7.getText());
               ps.executeUpdate();
               JOptionPane.showMessageDialog(null, "Data Inserted");
               
           }catch(Exception ex){
               ex.printStackTrace();
           }
        }*/
       }
    
public static void main(String[] args)
    {
        
    }   
    
} 

