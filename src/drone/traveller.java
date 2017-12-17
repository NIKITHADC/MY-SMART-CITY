/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drone;

import java.awt.Dimension;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.lang.Exception;

/**
 *
 * @author D C NIKITHA
 */
public class traveller {
    String name;
    Scanner sc = new Scanner(System.in);
    
    
    public traveller(String name)
    {
        this.name = name;
    }
    
    public int[] take_input()
    {
        JFrame frame1 = new JFrame("Map");
        frame1.setLocationRelativeTo(null);
        frame1.setMinimumSize(new Dimension(1100,1300));
        frame1.add(new JLabel(new ImageIcon("C:/Users/D C NIKITHA/Desktop/map2.png")));
        frame1.setVisible(true);
        int[] ch = new int[3];
        System.out.println("A map would appear");
        System.out.println("Enter your Present location Serial No.");
        int loc_no = sc.nextInt();
        
        System.out.println("Enter your preferences for the next Location You want to visit :");
        System.out.println("Enter\n1.)Places to visit\n2.)Restaurants\n3.)Shopping\n4.)Stations(Includes Hotels)");
        ch[0] = sc.nextInt();
        
        if(ch[0]==1)
        {
            System.out.println("Enter\n1.)Adventure\n2.)Temples\n3.)Historical Places");
            ch[1] = sc.nextInt();
        }
        
        if(ch[0]==2)
        {
            System.out.println("Enter\n1.)Chinese Cuisine\n2.)Indian Cuisine\n3.)Oriental Food");
            ch[1] = sc.nextInt();
        }
        
        if(ch[0]==3)
        {
            System.out.println("Enter\n1.)Grocerries\n2.)Malls\n3.)Street Shopping");
            ch[1]= sc.nextInt();
        }
        
        if(ch[0]==4)
        {
            System.out.println("Enter\n1.)Airport\n2.)Railway Station\n3.)Hotels");
            ch[1] = sc.nextInt();
        }
        
        ch[2] = loc_no;
        return ch;
    }
    
}
