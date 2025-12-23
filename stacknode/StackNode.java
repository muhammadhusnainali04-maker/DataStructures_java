/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stacknode;

/**
 *
 * @author HP 840 G5
 */
public class StackNode {
    Node top = null;
    
    
    public class Node{
    int data;
    Node next;
    
        Node(int data){
        this.data=data;
        this.next=null;
        }
    }
    
    public void push(int data){
            Node newN=new Node(data);
            if(top==null){top=newN; return;
        }else{newN.next=top;  top=newN;}
        
    }
    
    public void pop(){
    if(top==null){System.out.println("Stack Under Flow"); return;}
    else{System.out.println("pop item is "+top.data);}
    top=top.next;
    }
    
        
    public void print(){
    Node current = top;
    while(current!=null){
    System.out.println(current.data);
            current=current.next;
    }
    }
    
   
   
    
    public static void main(String[] args) {
       StackNode sn=new StackNode();
       sn.push(4);
       sn.push(3);
       sn.push(2);
       sn.push(1);
       sn.print();
       sn.pop();
    }
    
}
