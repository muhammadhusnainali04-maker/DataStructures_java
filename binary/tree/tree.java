/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binary.tree;

/**
 *
 * @author HP 840 G5
 */
public class tree {
    
    treeN root;

        public tree() {
            this.root = null;
        }
public void preorderTT(treeN node){
    if (node == null) return;
     
System.out.println(node.data +" ");
preorderTT(node.left);
preorderTT(node.right);
}
}


class treeN{
int data;
treeN left=null;
treeN right=null;

        public treeN(int data) {
            this.data = data;
          
        }

}
