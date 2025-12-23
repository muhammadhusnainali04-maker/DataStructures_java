
package Weighted_Array_Graph;

public class MainGraph {
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
      
         ag.insertEdge(0,1, 6);
         ag.insertEdge(0, 4, 9);
         ag.insertEdge(1, 7, 8);
         ag.insertEdge(1, 2, 10);
         ag.insertEdge(4, 3, 6);
         ag.insertEdge(5, 5, 8);
         ag.insertEdge(6, 2, 4);
         ag.insertEdge(4, 7, 14);
     
         
         ag.display();
    }
}
