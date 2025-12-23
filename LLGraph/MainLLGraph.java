/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LLGraph;

/**
 *
 * @author HP 840 G5
 */
public class MainLLGraph {
    public static void main(String[] args) {
     LinkListGraph lg =new LinkListGraph(5);
     
     lg.addverticess();
     lg.addverticess();
     lg.addverticess();
     lg.addverticess();
     lg.addverticess();
     
     
     lg.insertEdge(0, 1);
     lg.insertEdge(1, 2);
     lg.insertEdge(2, 3);
     lg.insertEdge(3, 4);
     lg.insertEdge(4, 0);
    
     
     lg.display();
    }
}
