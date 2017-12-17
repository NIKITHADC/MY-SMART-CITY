/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

import drone.cab_agent;
import drone.travel_agent;

/**
 *
 * @author D C NIKITHA
 */
public class practice {
    cab_agent c = new cab_agent();
    graph g = new graph(c.edg,travel_agent.nod);
    
    public void method()
    {
        System.out.println(g.calculateShortestDistances(2,19));
    
    }
    
    
}
