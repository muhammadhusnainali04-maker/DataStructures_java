/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph_LinkedList_Weighted;

import java.util.LinkedList;

/**
 *
 * @author HP 840 G5
 */
public class GraphLLW {
     LinkedList<Edge>adj[];
    int noofVertix;
    int Vertixcount;
    int E;

    public GraphLLW(int size) {
        this.noofVertix = size;
        adj=new LinkedList[size];
        this.E =Vertixcount = 0;
         for (int i = 0; i < noofVertix; i++) {
            adj[i] = new LinkedList<>();
        }
    }
   
    public void addverticess(){
    if( noofVertix >Vertixcount){
    Vertixcount++;
    }else{
    System.out.println("Invalid VErtex");}
    }
    
    public void insertEdge(int u, int v ,int w){
       
        Edge edge = new Edge(u, v, w);
        adj[u].add(edge);
        E++;
    
}
    public void display(){
    char c='A';
      System.out.println("Vertex: "+Vertixcount);
      System.out.println("Edge: "+E);
      for(int i=0; i <noofVertix;i++){
           System.out.print((c++ )+":");
            for (Edge x:adj[i]) {
                System.out.print("|"+x.getDest()+"|"+x.getWi()+"|-->");
            }
            System.out.println("NULL");
      }
    }
}
