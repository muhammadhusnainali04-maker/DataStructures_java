/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binary.tree;



public class BinaryTree {




    public static void main(String[] args) {
 tree bt =new tree();
 
 treeN t1=new treeN(5);
 treeN t2=new treeN(6);
 treeN t3=new treeN(7);
 treeN t4=new treeN(8);
 treeN t5=new treeN(9);
 treeN t6=new treeN(10);
 
 bt.root=t1;
 bt.root.left=t2;
 bt.root.right=t3;
 bt.root.left.right=t4;
 bt.root.left.left=t5;
 bt.root.right.right=t6;
 bt.preorderTT(bt.root);
    }
    
    
}
