/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drone;




//import com.github.sarxos.webcam.Webcam;
import graph.node;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.imageio.ImageIO;
import javax.swing.JTable;

/**
 *
 * @author D C NIKITHA
 */
public abstract class drone {
    
    public String name;
    
    abstract void printdata(drone d);

    /**
     *
     * @param name
     * @param typeloc
     * @param type
     * @param rating
     */
    public void add_location(String name,int typeloc,int type,float rating)
    {  }
    
    public void add_edge()
    {
        
    }
     
    public HashMap<Float, String> suggest_location(int [] ch)
    {
        HashMap<Float, String> hmap = null;
        return hmap;
    }
    
  
    public void take_picture2(String name)
    {
        BufferedImage image = null;
        File f = null;
        String f1 = "E:\\cop\\"+name+".jpg";

    //read image file
    try{
      f = new File("C:\\Users\\D C NIKITHA\\Desktop\\photo.jpg");
      image = ImageIO.read(f);
    }catch(IOException e){
      System.out.println("Error: "+e);
    }
    
    //write image
    try{
      
        f = new File(f1);
      ImageIO.write(image, "jpg", f);
      System.out.println("Succesfully Stored");
    }catch(IOException e){
      System.out.println("Error: "+e);
    }
    
    }
    
    public void check_activities(String name,JTable t1)
    {
        
    }
}
