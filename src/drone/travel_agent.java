/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drone;

import graph.node;
import java.util.ArrayList;
import location.adventure;
import location.airport;
import location.chinese;
import location.groceries;
import location.historical_places;
import location.hotels;
import location.indian;
import location.location;
import location.malls;
import location.oriental;
import location.places_to_visit;
import location.railway_station;
import location.restaurants;
import location.shopping_area;
import location.stations;
import location.street_shops;
import location.temples;

/**
 *
 * @author D C NIKITHA
 */
public class travel_agent extends tourist_guide {
    
    private int id;
    public static ArrayList<node> nod = new ArrayList();
    static ArrayList<location> l1 = new ArrayList();

    public travel_agent() {
        
    }
    
    public void set_id(int id)
    {
        this.id= id;
    }
    public int get_id()
    {
        return(this.id);
    }
    
    public void printdata(drone d)
    {        tourist_guide t = (tourist_guide) d;
             System.out.println(t.name);
        //System.out.println(t.id);
    }

       
    public travel_agent(String name,int id)
    {
        this.set_id(id);
        this.name=name;
    }
    
    @Override
    public void add_location(String name,int typeloc,int type,float rating)
    {
        location l;
        if(typeloc == 1)
        {
            if(type == 1)
                l = new adventure(name,rating,nod);
            else if(type == 2)
                l = new temples(name,rating,nod);
            else
                l = new historical_places(name,rating,nod); 
            
            
        }
        else if (typeloc == 2)
        {
            if(type == 1)
                l = new chinese(name,rating,nod);
            else if(type == 2)
                l = new indian(name,rating,nod);
            else
                l = new oriental(name,rating,nod); 
        }
        else if (typeloc == 3)
        {
            if(type == 1)
                l = new groceries(name,rating,nod);
            else if(type == 2)
                l = new malls(name,rating,nod);
            else
                l = new street_shops(name,rating,nod); 
        }
        else
        {
            if(type == 1)
                l = new airport(name,rating,nod);
            else if(type == 2)
                l = new railway_station(name,rating,nod);
            else
                l = new hotels(name,rating,nod); 
        }
        
        l1.add(l);
        
    }
    
    
}
