/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dynamic_Array_java;
/**
 *
 * @author HP 840 G5
 */
public class Array {
    private int[] arr;
    private int count;
    
    public Array(int item){
        arr=new int[item];
        count=0;
    }
    
   public void insert(int element) {
       
        if (count == arr.length) {
            int[] newarr = new int[count * 2];
           
            for (int i = 0; i < count; i++) {
                newarr[i] = arr[i];
            }
           
            arr = newarr;
        }
        
        arr[count] = element;
        count++;
    }
   
   
    public void remove(int index) {
       
        if (index < 0 || index >= count) {
            System.out.println("Index out of bounds");
        }
       
        for (int i = index; i < count - 1; i++) {
            arr[i] = arr[i + 1];
        }
        
        count--;
    }
    
    
     public int indexOf(int element) {
        for (int i = 0; i < count; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1; 
    }
    
     
      public void update(int index, int newValue) {
        if (index < 0 || index >= count) {
            System.out.println("Index out of bounds");
        }
        arr[index] = newValue;
    }
    
      
       public void print() {
        
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
       
    }
       
        public int size() {
        return count;
    }
    
    
    public int capacity() {
        return arr.length;
    }
}
      
      











