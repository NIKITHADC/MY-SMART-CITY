/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drone;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author D C NIKITHA
 */
public class cop extends drone {
    String name;
    String designation;
    int batch;
    private int badge_id;
    public cop(String name, String designation,int batch,int badge_id)
    {
        this.badge_id=badge_id;
        this.batch= batch;
        this.designation = designation;
        this.name = name;
    }
    public int get_badgeid()
    {
        return(this.badge_id);
    }
    
    @Override
    void printdata(drone d)
    {
        cop c = (cop) d;
        System.out.println(c.name);
        System.out.println(c.badge_id);
        System.out.println(c.batch);
        System.out.println(c.designation);
    }
    
  
     
    public void checkrecords ()
    {
        
        try {
                Class.forName("java.sql.Driver");
                Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/final_project","root","dcn@2098"); 
                System.out.println("Conected sucessfully");
                Statement stat =(Statement) con.createStatement(); 
                String query = "Select * from suspected_people;"; 
                ResultSet rs = stat.executeQuery(query); 
                String query1 = "Select * from traveller_details;"; 
                ResultSet rs1 = stat.executeQuery(query); 
                ArrayList i = new ArrayList(); 
                System.out.println("statement");
                int flag = 0;          
                while(rs1.next())
                {
                    int sr = rs.getInt("id");
                    if(!i.contains(sr))
                    {
                        i.add(sr);
                    }
                    else
                    {
                        flag = 1;
                        break;
                    }
                    
                }
                
                if(flag == 1)
                {
                    while(rs.next())
                    {
                        int i1 = (int) i.get(i.size()-1);
                        if(i1==rs.getInt("id"))
                        {
                           String c = "THE PERSON"+ rs.getString("name")+"IS CONVICTED."; 
                           JOptionPane.showMessageDialog(null,"COVICTED",c,JOptionPane.OK_OPTION);
                        }
                    }
                }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
   
    
}
