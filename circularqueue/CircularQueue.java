/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circularqueue;

/**
 *
 * @author HP 840 G5
 */
public class CircularQueue {

  private String[] queue;
    private int front, rear, size;

    public CircularQueue(int capacity) {
        size = capacity;
        queue = new String[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(String patient) {
        if ((rear + 1) % size == front) {
            System.out.println("Overflow: Waiting area full. Cannot add.");
        } else {
            if(rear==-1 && front ==-1 ){
            front =rear=0;
            }else if(rear==size-1 && front !=0){
            rear=0;
            }else{
            rear = (rear+1)%size;
            }queue[rear]=patient;
        }
    }

    public void dequeue() {
        if (front == -1) {
            System.out.println("Underflow: No patients.");
        } else {
            String patient = queue[front];
            if(front==rear){front=rear=-1;}
            else if(front ==size-1){front=0;}
            else{front++;}
            
            System.out.println("Patient " + patient + " called.");
        }
    }
    public void display(){
       if (front == -1) {
            System.out.println("Underflow: No patients.");
        } else {System.out.print("Waiting list: ");
            int i = front;
            while (i != rear) {
                System.out.print(queue[i] + " ");
                i = (i +1 ) % size;
            }
            System.out.println(queue[rear]);
    }
    }
    
    public static void main(String[] args) {
       CircularQueue cq=new CircularQueue(5);
       cq.enqueue("Muhammad");
       cq.enqueue("Husnain");
       cq.enqueue("Ali");
       cq.enqueue("ABC");
       cq.enqueue("DEF");
       cq.display();
       cq.dequeue();
       cq.dequeue();
       cq.dequeue();
       cq.dequeue();
       cq.dequeue();
       cq.dequeue();
       cq.enqueue("GHI");
       cq.enqueue("LKL");
       cq.display();
    }
    
}
