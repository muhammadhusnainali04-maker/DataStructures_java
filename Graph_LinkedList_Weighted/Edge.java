/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph_LinkedList_Weighted;

/**
 *
 * @author HP 840 G5
 */
public class Edge {
     private int source;
    private int dest;
    private int wi;

    public Edge(int source, int dest, int wi) {
        this.source = source;
        this.dest = dest;
        this.wi = wi;
    }

    public int getSource() {
        return source;
    }

    public int getDest() {
        return dest;
    }

    public int getWi() {
        return wi;
    }
}
