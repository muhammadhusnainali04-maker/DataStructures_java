/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Weighted_Array_Graph;

public class ArrayGraph {
    int adj[][];
    int noofVertix;
    int Vertixcount;

    public ArrayGraph(int size) {
        this.noofVertix = size;
        adj=new int[size][size];
        this.Vertixcount = 0;
    }
   
    public void addverticess(){
    if( noofVertix >Vertixcount){
    Vertixcount++;
    }else{
    System.out.println("Invalid VErtex");}
    }
    
    public void insertEdge(int u, int v ,int w){
        if(u<Vertixcount & v<Vertixcount){
        adj[u][v]=w;
        adj[v][u]=w;
    }else{
             System.out.println("Invalid Edge");
        }
}
    public void display(){
    char c='A';
      System.out.println("  A B C D E F G H");
      for (int arrx[] :adj){
        System.out.print((c++)+" ");
        for (int x:arrx){
          System.out.print(x+" ");}
         System.out.println(" ");
      }
        System.out.println(" ");
    }
}
