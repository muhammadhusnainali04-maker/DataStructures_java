/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Dynamic_Array_java;

/**
 *
 * @author HP 840 G5
 */
public class Java3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Array ar = new Array(3);
        
        System.out.println("=== Testing Custom Array Implementation ===");
        System.out.println("Initial capacity: " + ar.capacity());
        System.out.println();
        
        // Insert elements (more than initial capacity)
        System.out.println("1. Inserting elements:");
        ar.insert(10);
        ar.insert(20);
        ar.insert(30);
        ar.insert(40); 
        ar.insert(50);
        
        System.out.println("Array after inserting 5 elements: ");
     
        System.out.println("Current size: " + ar.size() + ", Capacity: " + ar.capacity());
        System.out.println();
        
        
        System.out.println("2. Testing indexOf method:");
        int index = ar.indexOf(30);
        System.out.println("Index of 30: " + index);
        
        index = ar.indexOf(100);
        System.out.println("Index of 100: " + index + " (not found)");
        System.out.println();
        
        // Test update method
        System.out.println("3. Testing update method:");
        System.out.print("Before update: ");
        ar.print();
        ar.update(2, 35); // Update element at index 2
        System.out.print("After updating index 2 to 35: ");
        ar.print();
        System.out.println();
        
        // Test remove method
        System.out.println("4. Testing remove method:");
        System.out.print("Before remove: ");
        ar.print();
        ar.remove(0); // Remove first element
        System.out.print("After removing index 0: ");
        ar.print();
        System.out.println("Current size: " + ar.size());
        System.out.println();
        
        // Insert more elements to show dynamic resizing
        System.out.println("5. Inserting more elements to demonstrate dynamic behavior:");
        for (int i = 60; i <= 100; i += 10) {
            ar.insert(i);
        }
        System.out.print("Array after inserting more elements: ");
        ar.print();
        System.out.println("Current size: " + ar.size() + ", Capacity: " + ar.capacity());
        System.out.println();
        
        // Test edge cases
        System.out.println("6. Testing edge cases:");
        
        // Remove multiple elements
        ar.remove(1);
        ar.remove(1);
        System.out.print("After removing two elements: ");
        ar.print();
        
        // Find index of non-existent element
        int result = ar.indexOf(999);
        System.out.println("Search for 999: " + result);
        
        // Insert at the end
        ar.insert(110);
        System.out.print("After inserting 110: ");
        ar.print();
    }
    
}
