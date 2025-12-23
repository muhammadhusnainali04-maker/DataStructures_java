/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package myarraylist;

import java.util.*;
public class MyArrayList {

  
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        arr.add(3, 2);
         System.out.println(arr);
        
         System.out.println(arr.get(2));
         
          System.out.println(arr.size());
          
           System.out.println(arr.contains(2));
           
            System.out.println(arr.indexOf(2));
            
             
    }
    
}
