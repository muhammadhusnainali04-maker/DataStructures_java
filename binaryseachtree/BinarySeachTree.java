/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binaryseachtree;



/**
 *
 * @author HP 840 G5
 */
public class BinarySeachTree {

Node root=null;

 
    public BinarySeachTree() {
    this.root=null;
    }
    
    public void insert(int data){
       root= insertB(root  ,data);
    }
    
     public void search(int item){
        mySearch(root, item);
    }
    
    public Node insertB(Node node , int data){
    if (node==null) {
       Node newNode = new Node(data);
            return newNode;
    }
        if(data < node.data){
            node.left = insertB(node.left, data);
        }else if (data > node.data){
            node.right = insertB(node.right, data);
        }
        
        return node;
    
}
    public void mySearch(Node node , int data){
        if(node ==null){
        System.out.println("Not Found");
        }if(node.data == data){
            System.out.println("Item Found");
        }if(node.data<data){
            mySearch(node.left,data);
        }if(node.data>data){
            mySearch(node.right,data);
        }
    
    }
    public void preorderTT(Node node){
    if (node == null) return;
     
        System.out.println(node.data +" ");
        preorderTT(node.left);
        preorderTT(node.right);
}
}
    class Node{
        int data;
        Node right=null;
        Node left =null;
        public Node(int data) {
            this.data = data;
        }
        
}