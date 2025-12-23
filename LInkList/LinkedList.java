/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist;

/**
 *
 * @author HP 840 G5
 */
public class LinkedList {
    Node first=null;
    Node last=null;
    
    public class Node{
        private String data;
        Node next;
        
        public Node(String data){
            this.data=data;
            this.next=null;
        }
       
    }
    public void addNodef(String data){
        Node newN =new Node(data);
        if (first==null){ first =last = newN;}
        else { 
            newN.next=first;
            first=newN;
        }
    }
    
    public void addNodel(String data){
    Node newN =new Node(data);
    if (first==null){ first =last = newN;}
    else { 
         last.next=newN;
        last = newN; 
        }
    }
    
     
    public void addMiddle(String data , int pos){
        int count=1;
        Node newN =new Node(data);
        if (pos<1){ System.out.println("Invalid POSITION"); return;}
        if(pos==1){newN.next=first;   first=newN; return;}
        //if (pos>count){ System.out.println("Invalid POSITION"); }
        Node current = first;
        for(int i=1;i<pos-1 && current!=null;i++){current=current.next; count++;}
          newN.next=current.next;
          current.next=newN;
       
    }
    
    public void searchN(String data){
    Node current = first;
    int position=1;
    while (current!=null){  
    if (current.data==data){ System.out.println("The Data '"+data+"' is at "+position +" Node");return;}
    position++;
    current=current.next;
    }
   System.out.println("The Data "+data+" is not ");
    }
    
    public void deletMiddle(int pos){
        if (pos<1){ System.out.println("Invalid POSITION"); return;}
        if(pos==1){first=first.next;}
        Node current = first;
        for(int i=1;i<pos-1 && current!=null;i++){current=current.next;}
        System.out.println("Deleted data is : "+current.next.data);  
        current.next=current.next.next;
          
    }
    
    public void printNode(){
        Node currNode = first;
        while(currNode!=null){
        System.out.print(currNode.data+" --> ");
        currNode=currNode.next;
        }
        System.out.print("NULL");
         System.out.println("");
        
    }
   
    
    public void deletf(){
        if (first==null){  System.out.print("NULL");}
        else{first=first.next;}
    }
    
    public void deletl(){
        Node current = first;
        if (first==null){  System.out.print("NULL");}
        else{
        while (current.next.next!=null){current=current.next;}
        current.next=null;
        }
    }
    
    public void duplicate(){
        Node current =first;
        while(current!=null){
            Node check =current;
            while(check.next!=null){
            if(check.next.data==current.data){
            check.next=check.next.next;
           
            }
            else{check=check.next;}
            
            }
            current=current.next;
        }
    }
    
//    public void combine(Node l4,Node l5){
//         if(l4.last!=null){
//       l1.last.next=l2.first;
//       l3.first=l1.first;
//       l3.last=l2.last;}
//       
//       if(l1.first==null){
//       l3.first=l2.first;
//       }
//       l3.printNode(); 
//       l3.countN();
//       l3.duplicate();
//       l3.printNode();
//    }
    
 
    public void printReverse(Node node){
    if(node == null) return;   // base case
    printReverse(node.next);   // go to next node
    System.out.print(node.data);  // print on return
}

// Call with:


    
    
    
    public void countN(){
    int count=0;
    Node current = first;
    while(current !=null){current=current.next;
    count++;}
    System.out.println("The totall number of count are : "+ count);
    
    }
    
    public static void main(String[] args) {
        
       System.out.println("<-------------L1---------------->");
       LinkedList l1=new LinkedList();
       l1.addNodef("Code");
       l1.addNodef("World");
       l1.addNodef("Hellow");
       //l1.printNode();
       l1.addMiddle("is", 3);
       //l1.printNode();
       l1.addMiddle("Basic", 4);
       //l1.printNode();
       l1.addMiddle("a", 3);
       //l1.printNode();
       l1.deletMiddle(3);
         l1.printNode();
        // l1.searchN("World");
         l1.searchN("is");
        l1.countN();  
        l1.printReverse(l1.first);
        System.out.println(" ");
       
       
       
       
       
       System.out.println("<-------------L2---------------->");
       LinkedList l2=new LinkedList();
       l2.addNodef("ALi");
       l2.addNodef("Husnaina");
       l2.addNodef("Muhammad");
       l2.addNodef("My");
       l2.addMiddle("name", 2);
       l2.addMiddle("is", 03);
       l2.printNode();
       l2.countN();
        System.out.println(" ");
       
       
         
       System.out.println("<-------------L3---------------->");
       LinkedList l3=new LinkedList();
       if(l1.last!=null){
       l1.last.next=l2.first;
       l3.first=l1.first;
       l3.last=l2.last;}
       
       if(l1.first==null){
       l3.first=l2.first;
       }
       l3.printNode(); 
       l3.countN();
       l3.duplicate();
       l3.printNode();
        System.out.println(" ");
   }
     
}







