/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package priorityq;

import java.util.PriorityQueue;

public class PriorityQ implements Comparable<PriorityQ>{
private int data;
private int q[];

    public PriorityQ(int data) {
        this.data = data;
        
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return  data+"--> " ; 
    }
    
    @Override
     public int compareTo(PriorityQ o){
         return this.data > o.data ? 1:-1  ;
     }
   
  public static void main(String[] args) {
       PriorityQueue<PriorityQ> p= new PriorityQueue<>();
       PriorityQ p1=new PriorityQ(3);
       PriorityQ p2=new PriorityQ(1);
       PriorityQ p3=new PriorityQ(2);
       p.add(p1);
       p.add(p2);
       p.add(p3);
     
       while(!p.isEmpty()){System.out.print(p.poll());}
    }
    
}
