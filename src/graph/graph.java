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
public class graph {
  public  ArrayList<node> nodes ;
  public  ArrayList<edge> edges;
  int noOfNodes;
  int noOfEdges;
  
  public graph(ArrayList<edge> edges,ArrayList<node>nodes)
  {
    this.edges = new ArrayList();
    this.edges = edges;
    this.nodes = new ArrayList();
    this.nodes = nodes;
    this.noOfEdges = this.edges.size();
    this.noOfNodes = this.nodes.size();
    for(int i= 0;i<noOfEdges;i++)
    {
        this.nodes.get(this.edges.get(i).node1.s_no).edges.add(this.edges.get(i));
        this.nodes.get(this.edges.get(i).node2.s_no ).edges.add(this.edges.get(i));
    }
    
     
  }
  
   public float calculateShortestDistances(int n1,int n2) {
    // node n1 as source
    nodes.get(n1).DistanceFromSource = 0;
    int nextNode = n1;
    
    // visit every node
    for (int i = 0; i < nodes.size(); i++) 
    {
      // loop around the edges of current node
      
      ArrayList<edge> currentNodeEdges = nodes.get(nextNode).edges;//edges associated with the current edge
      
      
      for (int joinedEdge = 0; joinedEdge < currentNodeEdges.size(); joinedEdge++) 
      {
      
        int neighbourIndex = currentNodeEdges.get(joinedEdge).getNeighbourIndex(nextNode);
         
        // only if not visited
        if (!nodes.get(neighbourIndex).isVisited) 
        {
          float tentative = nodes.get(nextNode).DistanceFromSource+ currentNodeEdges.get(joinedEdge).distance;
          
          if (tentative < nodes.get(neighbourIndex).DistanceFromSource) 
          {
            nodes.get(neighbourIndex).DistanceFromSource = tentative;
          }
        }
        
        
      }
      // all neighbours checked so node visited
      
      nodes.get(nextNode).isVisited = true;
      // next node must be with shortest distance
      nextNode = getNodeShortestDistanced(n1);
     
   }
    return nodes.get(n2).DistanceFromSource;
  }
  // now we're going to implement this method in next part !
  
  
  int getNodeShortestDistanced(int n1) {
    int storedNodeIndex = n1;
    float storedDist = Integer.MAX_VALUE;
    for (int i = 0; i < nodes.size(); i++) 
    {
      float currentDist = nodes.get(i).DistanceFromSource;
      
      if (!nodes.get(i).isVisited && currentDist < storedDist) 
      {
        storedDist = currentDist;
        storedNodeIndex = i;
      }
    }
    
    return storedNodeIndex;
  }
  
}
