/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array_task_1;

/**
 *
 * @author HP 840 G5
 */
public class Java2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] arrA = {25,14,12,74,58,74,98,84,15,24};
       int[] arrB = {87,11,10,81,60,94,74,82,15,87};
       double[] arrC = new  double[10];
       
       for (int i = 0; i < arrA.length; i++) {
    if (arrA[i] < arrB[i]) {
        arrC[i] = arrB[i] + (arrA[i] / 100.0);
    } else {
        arrC[i] = arrA[i] + (arrB[i] / 100.0);
    }
   
}
System.out.println("A "+" "+" B "+" "+" C");
       for(int i=0; i<=arrA.length-1; i++){
       System.out.println(arrA[i]+" "+arrB[i]+" "+arrC[i]);
       }
       
        
 
        
        
        
        
        
    }
    
}
