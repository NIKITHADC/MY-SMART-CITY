/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import java.util.ArrayList;

/**
 *
 * @author D C NIKITHA
 */
public class node  {
    public String name;
    public int s_no;
    public float rating;
    
    //additional data members required for dijkstra's algorithm 
    float DistanceFromSource = Integer.MAX_VALUE;
    boolean isVisited = false;
    ArrayList<edge> edges = new ArrayList<edge>(); //edges associated with it
    
    public node()
    {
        
    }
    
    public node(String name,int no,float r)
    {
        this.name = name;
        this.rating = r;
        this.s_no = no;
        
        
    }
    
}
