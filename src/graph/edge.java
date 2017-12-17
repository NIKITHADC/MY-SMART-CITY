/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import drone.cab_agent;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author D C NIKITHA
 */
public class edge {
   public node node1;
    public node node2;
    float distance;
    
    public edge add_edge(node n1,node n2,float dis)
    {
        this.distance = dis;
        this.node1 = new node(n1.name,n1.s_no,n1.rating);
        this.node2 = new node(n2.name,n2.s_no,n2.rating);
        return (this);
    }
    
    public int getNeighbourIndex(int nodeIndex)
    {
        if ((this.node1.s_no) == nodeIndex) 
            return this.node2.s_no;
          
        else 
            return this.node1.s_no;
    }
}
