/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binaryseachtree;

/**
 *
 * @author HP 840 G5
 */
public class Main_BST {
     public static void main(String[] args) {
 BinarySeachTree bt =new BinarySeachTree();
 
bt.insert(10);
bt.insert(9);
bt.insert(8);
bt.insert(7);
bt.insert(6);
bt.insert(5);
bt.insert(4);
bt.insert(3);
bt.insert(2);
bt.insert(1);
bt.insert(0);
 
bt.preorderTT(bt.root);

bt.search(5);

    }
    
}
