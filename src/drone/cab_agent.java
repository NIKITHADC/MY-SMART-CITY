/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drone;

import static drone.travel_agent.nod;
import graph.edge;
import graph.graph;
import graph.node;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import location.adventure;
import location.airport;
import location.chinese;
import location.groceries;
import location.historical_places;
import location.hotels;
import location.indian;
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
public class cab_agent extends tourist_guide {
    private int id;
    public static ArrayList<edge> edg = new ArrayList();
    edge e;
    public cab_agent()
    {
        
    }
    
    public cab_agent(String name,int id)
    {
        this.id = id;
        this.name=name;
    }
    
    @Override
    public void add_edge()
    {
        
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(0),travel_agent.nod.get(1),15));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(0),travel_agent.nod.get(5), (float) 10.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(1),travel_agent.nod.get(6),3));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(1),travel_agent.nod.get(7), (float) 2.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(1),travel_agent.nod.get(2),8));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(1),travel_agent.nod.get(3),7));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(1),travel_agent.nod.get(14),1));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(1),travel_agent.nod.get(15), (float) 0.5)); 
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(2),travel_agent.nod.get(8), (float) 4.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(2),travel_agent.nod.get(9),3));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(2),travel_agent.nod.get(11), (float) 0.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(3),travel_agent.nod.get(11),4));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(3),travel_agent.nod.get(10), (float) 6.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(3),travel_agent.nod.get(14),9));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(3),travel_agent.nod.get(17),1));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(3),travel_agent.nod.get(18), (float) 2.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(4),travel_agent.nod.get(14), (float) 1.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(4),travel_agent.nod.get(17),2));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(4),travel_agent.nod.get(18),2));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(4),travel_agent.nod.get(19),1));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(4),travel_agent.nod.get(22),5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(5),travel_agent.nod.get(6),2));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(5),travel_agent.nod.get(16),1));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(5),travel_agent.nod.get(21),3));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(5),travel_agent.nod.get(22),5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(6),travel_agent.nod.get(7),5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(7),travel_agent.nod.get(8),10));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(7),travel_agent.nod.get(9),1));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(8),travel_agent.nod.get(11),7));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(8),travel_agent.nod.get(10), (float) 2.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(9),travel_agent.nod.get(10),1));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(10),travel_agent.nod.get(12), (float) 1.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(11),travel_agent.nod.get(12), (float) 0.75));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(13),travel_agent.nod.get(14), (float) 1.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(14),travel_agent.nod.get(15),2));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(14),travel_agent.nod.get(16),2));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(14),travel_agent.nod.get(19),3));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(14),travel_agent.nod.get(21),6));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(17),travel_agent.nod.get(20), (float) 7.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(18),travel_agent.nod.get(19),4));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(20),travel_agent.nod.get(22), (float) 0.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(20),travel_agent.nod.get(23), (float) 2.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(21),travel_agent.nod.get(23), (float) 0.5));
        e = new edge();
        edg.add(e.add_edge(travel_agent.nod.get(22),travel_agent.nod.get(23),1));
    }
    
    @Override
    public HashMap<Float, String> suggest_location(int [] ch)
    {
        HashMap<Float, String> hmap = new HashMap<Float, String>();
        node n1 = new node();
        n1 = travel_agent.nod.get(ch[2]-1);
        node n2;
        float dis,value;
        for(int i = 0;i<travel_agent.l1.size();i++)
        {
            
            //places to visit
            if(ch[0]==1)
            {
                if(ch[1]==1&&travel_agent.l1.get(i) instanceof adventure)
                {
                    n2 = new node();
                    n2 = travel_agent.nod.get(i);
                    graph g = new graph(cab_agent.edg,travel_agent.nod);
                    dis = g.calculateShortestDistances(n1.s_no,n2.s_no);
                    value = (float) ((4/dis)+(0.6*n2.rating)); 
                    hmap.put(value,n2.name);
                }
                if(ch[1]==2&&travel_agent.l1.get(i) instanceof temples)
                {
                    n2 = new node();
                    n2 = travel_agent.nod.get(i);
                    graph g = new graph(edg,travel_agent.nod);
                    dis = g.calculateShortestDistances(n1.s_no,n2.s_no);
                    value = (float) ((4/dis)+(0.6*n2.rating)); 
                    hmap.put(value,n2.name);
                }
                if(ch[1]==3&&travel_agent.l1.get(i) instanceof historical_places)
                {
                    n2 = new node();
                    n2 = travel_agent.nod.get(i);
                    graph g = new graph(edg,travel_agent.nod);
                    dis = g.calculateShortestDistances(n1.s_no,n2.s_no);
                    value = (float) ((4/dis)+(0.6*n2.rating)); 
                    hmap.put(value,n2.name);
                }
           }
           //restaurants
           if(ch[0]==2)
            {
                if(ch[1]==1&&travel_agent.l1.get(i) instanceof chinese)
                {
                    n2 = new node();
                    n2 = travel_agent.nod.get(i);
                    graph g = new graph(edg,travel_agent.nod);
                    dis = g.calculateShortestDistances(n1.s_no,n2.s_no);
                    value = (float) ((4/dis)+(0.6*n2.rating)); 
                    hmap.put(value,n2.name);
                }
                if(ch[1]==2&&travel_agent.l1.get(i) instanceof indian)
                {
                    n2 = new node();
                    n2 = travel_agent.nod.get(i);
                    graph g = new graph(edg,travel_agent.nod);
                    dis = g.calculateShortestDistances(n1.s_no,n2.s_no);
                    value = (float) ((4/dis)+(0.6*n2.rating)); 
                    hmap.put(value,n2.name);
                }
                if(ch[1]==3&&travel_agent.l1.get(i) instanceof oriental)
                {
                    n2 = new node();
                    n2 = travel_agent.nod.get(i);
                    graph g = new graph(edg,travel_agent.nod);
                    dis = g.calculateShortestDistances(n1.s_no,n2.s_no);
                    value = (float) ((4/dis)+(0.6*n2.rating)); 
                    hmap.put(value,n2.name);
                }
           }
           //shopping area
           if(ch[0]==3)
            {
                if(ch[1]==1&&travel_agent.l1.get(i) instanceof groceries )
                {
                    n2 = new node();
                    n2 = travel_agent.nod.get(i);
                    graph g = new graph(edg,travel_agent.nod);
                    dis = g.calculateShortestDistances(n1.s_no,n2.s_no);
                    value = (float) ((4/dis)+(0.6*n2.rating)); 
                    hmap.put(value,n2.name);
                }
                if(ch[1]==2&&travel_agent.l1.get(i) instanceof malls)
                {
                    n2 = new node();
                    n2 = travel_agent.nod.get(i);
                    graph g = new graph(edg,travel_agent.nod);
                    dis = g.calculateShortestDistances(n1.s_no,n2.s_no);
                    value = (float) ((4/dis)+(0.6*n2.rating)); 
                    
                    hmap.put(value,n2.name);
                    
                }
                if(ch[1]==3&&travel_agent.l1.get(i) instanceof street_shops)
                {
                    n2 = new node();
                    n2 = travel_agent.nod.get(i);
                    graph g = new graph(cab_agent.edg,travel_agent.nod);
                    dis = g.calculateShortestDistances(n1.s_no,n2.s_no);
                    value = (float) ((4/dis)+(0.6*n2.rating)); 
                    hmap.put(value,n2.name);
                }
           }
           //stations
           if(ch[0]==4)
            {
                if(ch[1]==1&&travel_agent.l1.get(i) instanceof airport)
                {
                    n2 = new node();
                    n2 = travel_agent.nod.get(i);
                    graph g = new graph(edg,travel_agent.nod);
                    dis = g.calculateShortestDistances(n1.s_no,n2.s_no);
                    value = (float) ((4*dis)+(0.6*n2.rating)); 
                    hmap.put(value,n2.name);
                }
                if(ch[1]==2&&travel_agent.l1.get(i) instanceof railway_station)
                {
                    n2 = new node();
                    n2 = travel_agent.nod.get(i);
                    graph g = new graph(edg,travel_agent.nod);
                    dis = g.calculateShortestDistances(n1.s_no,n2.s_no);
                    value = (float) ((4*dis)+(0.6*n2.rating)); 
                    hmap.put(value,n2.name);
                }
                if(ch[1]==3&&travel_agent.l1.get(i) instanceof hotels)
                {
                    n2 = new node();
                    n2 = travel_agent.nod.get(i);
                    graph g = new graph(edg,travel_agent.nod);
                    dis = g.calculateShortestDistances(n1.s_no,n2.s_no);
                    value = (float) ((4*dis)+(0.6*n2.rating)); 
                    hmap.put(value,n2.name);
                    
                }
           }
           
        }
            /*Map<Float, String> map  = new TreeMap<Float, String>(hmap);
            Set set2 = map.entrySet();
            Iterator iterator2 = set2.iterator();
            System.out.print("Preferences");
            System.out.println("Name");
            while(iterator2.hasNext()) 
            {
               
                Map.Entry me2 = (Map.Entry)iterator2.next();
                System.out.print(me2.getKey() + ": ");
                System.out.println(me2.getValue());
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the serial no of your preference ");
            int s = sc.nextInt();
            System.out.println("YOU WILL VE ASSIGNED A CAB AGENT");
            */
            return hmap;
        
        
    }
    @Override
    void printdata(drone d) {
        
    }
    
}
