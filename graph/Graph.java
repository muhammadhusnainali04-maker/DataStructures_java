/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graph;

public class Graph {

    public static void main(String[] args) {
         ArrayGraph ag= new ArrayGraph(8);
         ag.addverticess();
         ag.addverticess();
         ag.addverticess();
         ag.addverticess();
         ag.addverticess();
         ag.addverticess();
         ag.addverticess();
         ag.addverticess();
      
         ag.insertEdge(0,1);
         ag.insertEdge(0, 4);
         ag.insertEdge(1, 7);
         ag.insertEdge(1, 2);
         ag.insertEdge(4, 3);
         ag.insertEdge(5, 5);
         ag.insertEdge(6, 2);
         ag.insertEdge(4, 7);
     
         
         ag.display();
    }
    
}
