/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

import drone.travel_agent;
import graph.node;
import java.util.ArrayList;
import static mini_project.Mini_project.s_no;

/**
 *
 * @author D C NIKITHA
 */
public class adventure extends places_to_visit {
    
    /**
     *
     * @param name
     * @param rating
     */
    public adventure(String name, float rating,ArrayList<node>nod) {
        this.name = name;
        this.rating = rating;
        this.n1 =new node(name,s_no,rating);
        s_no++;
        nod.add(this.n1);
        
    }
    
}
