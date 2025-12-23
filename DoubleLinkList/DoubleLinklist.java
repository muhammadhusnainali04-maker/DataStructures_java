/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinklist;

/**
 *
 * @author HP 840 G5
 */
public class DoubleLinklist {
Node first =null;
Node last=null;
    public class Node{
        private int num;
        Node next;
        Node pre;
       public Node(int num){
           this .num=num;
           this.next=null;
           this.pre=null;
        }
    }
    
    public void addNode(int item, int pos){
        Node newN = new Node(item);
        if (pos<1 ){System.out.println("Invalid POSITION"); return;}
        if (pos==1){
            newN.next=first;
            if(first != null){
            first.pre=newN;
            }
            first=newN;
            return;
        }
        Node current = first;
        for(int i=1;i<pos-1 && current!=null;i++){current=current.next;}
          newN.next = current.next;
        if (current.next != null) {
            current.next.pre = newN;
        } else {
            last = newN;
        }
        newN.pre = current;
        current.next = newN;
    
    
    }
    public void deletN(int val){
    if (val==first.num){first=first.next;
    if(first!=null){first.pre=null;}
    return;
    }
    Node current = first;
   while (current != null) {
        if (current.num == val) {

            if (current == last) {
                last = current.pre;
                if (last != null) {
                    last.next = null;
                }
            }
            else {
                current.pre.next = current.next;
                current.next.pre = current.pre;
            }

            System.out.println("Deleted node with value: " + val);
            return;
        }

        current = current.next;
    }

    System.out.println("Value " + val + " not found.");
    }
    
    
    public void duplicateN(){
    Node current = first;
    while(current!=null){
     Node check = current.next;
        while(check!=null){
        if(check.num==current.num){
           // Node preNode = check.pre;
           // Node nextNode = check.next;
            if (check.pre !=null){check.pre.next=check.next;}
            if(check.next!=null){check.next.pre=check.pre;}
        }
        check=check.next;
            }
        current=current.next;
    }
    }
    
    
    public void print(){
     Node current = first;
     while(current!=null){
        System.out.print(current.num+" <--> ");
        current=current.next;
        }
        System.out.print("NULL");
         System.out.println("");
    }
    public static void main(String[] args) {
       DoubleLinklist Dll=new DoubleLinklist();
       Dll.addNode(5, 1);
       Dll.print();
       Dll.addNode(4, 2);
       Dll.print();
       Dll.addNode(6, 3);
       Dll.addNode(7, 1);
       Dll.print();
       Dll.addNode(7, 2);
       Dll.addNode(6, 1);
       Dll.addNode(5, 4);
       Dll.addNode(4, 5);
       Dll.addNode(8, 9);
       Dll.print();
       Dll.addNode(12, 10);
       Dll.deletN(12);
       Dll.print();
       
       Dll.duplicateN();
       Dll.print();
    }
    
}








