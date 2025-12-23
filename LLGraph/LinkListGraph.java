/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLGraph;

import java.util.LinkedList;

public class LinkListGraph {
    LinkedList<Integer>adj[];
    int noofVertix;
    int Vertixcount;
    int Edge;

    public LinkListGraph(int size) {
        this.noofVertix = size;
        adj=new LinkedList[size];
        this.Edge =Vertixcount = 0;
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
    
    public void insertEdge(int u, int v ){
        adj[u].add(v);
        //adj[v].add(u);
        Edge++;
    
}
    public void display(){
    char c='A';
      System.out.println("Vertex: "+Vertixcount);
      System.out.println("Edge: "+Edge);
      for(int i=0; i <noofVertix;i++){
           System.out.print((c++ )+":");
            for (int x:adj[i]) {
                System.out.print("|"+x+"|-->");
            }
            System.out.println("NULL");
      }
    }
}
