/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini_project;

import drone.cab_agent;
import drone.cop;
import drone.drone;
import drone.travel_agent;
import drone.traveller;
import graph.practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author D C NIKITHA
 */
public class Mini_project {

    public static int s_no = 0;
   
    public static void main(String[] args) throws IOException 
    {
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<drone> d = new ArrayList();
        String tname = null;
        drone d1;
        int ch;
        do
        {
            System.out.println("Enter\n1. tourist guide\n2. cop\n3. traveller\n0. Stop inputting");
         ch = sc.nextInt();
        if(ch==1)
        {
            System.out.println("Enter\n1. travel-agent\n2. cab-agent"); 
            int ch1 = sc.nextInt();
            if(ch1==1)
            {
                System.out.println("Enter your name :");
                String name = reader.readLine();
                System.out.println("Enter your id");
                int id = sc.nextInt();
                d1=new travel_agent(name,id);
                System.out.println("Enter\n 1.)Adding Locations\n 2.) removing locations");
                int ch3 = sc.nextInt();
                
            }
            
            else if(ch1==2)
            {
                System.out.println("Enter your name :");
                String name = reader.readLine();
                System.out.println("Enter your id");
                int id = sc.nextInt();
                d1=new cab_agent(name,id);
                d1.add_edge();
                d.add(d1);
                
            }
        }
               
        else if(ch==2)
        {
            System.out.println("Enter your name :");
            String name = reader.readLine();
            System.out.println("Enter your batch year : ");
            int batch = sc.nextInt();
            System.out.println("Enter your designation");
            String designation = reader.readLine();
            System.out.println("enter your badge id");
            int badge_id = sc.nextInt();
            d1 = new cop(name,designation,batch,badge_id);
            //d1.check_activities(tname);
            d.add(d1);
        }
        
        else if(ch==3)
        {
            System.out.println("Enter your name :");
            tname = reader.readLine();
            System.out.println("Mr./Ms./Mrs."+tname+" Please store a picture of you with your surroundings on desktop for SECURITY REASONS");
            System.out.println("It will be very confidential and is only for the record of the cop");
            traveller t = new traveller(tname);
            int [] chs = new int[3];
            chs = t.take_input();
            d1 = new cab_agent();
            d1.suggest_location(chs);
            System.out.println("REMINDER");
            String s = "photo";
            System.out.println("Store an image named as \\033[0;1m\" + s]on your desktop");
            System.out.println("Enter 1 if you are ready :");
            int r = sc.nextInt();
            if(r==1)
                d1.take_picture2(tname);
             
              //d1.take_picture();
            
        }
            
    }while(ch!=0);
        
    }
    
}
