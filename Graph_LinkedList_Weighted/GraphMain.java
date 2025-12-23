/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph_LinkedList_Weighted;



/**
 *
 * @author HP 840 G5
 */
public class GraphMain {
    public static void main(String[] args) {
     GraphLLW lg =new GraphLLW(5);
     
     lg.addverticess();
     lg.addverticess();
     lg.addverticess();
     lg.addverticess();
     lg.addverticess();
     
     
     lg.insertEdge(0, 1, 9);
     lg.insertEdge(1, 2, 8);
     lg.insertEdge(2, 3, 16);
     lg.insertEdge(3, 4, 12);
     lg.insertEdge(4, 0, 0);
    
     
     lg.display();
    }
}
