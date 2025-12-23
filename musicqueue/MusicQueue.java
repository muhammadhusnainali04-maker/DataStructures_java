/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package musicqueue;

/**
 *
 * @author HP 840 G5
 */
public class MusicQueue{

     private String[] queue;
    private int front, rear, size;
    private int curr;
    public MusicQueue(int len) {
        size=len ;
        front=-1;
        rear=-1;
        curr=-1;
        queue=new String[size];
    }
    
    public void enqueue(String song) {
        if ((rear + 1) % size == front) {
            System.out.println("Overflow: Waiting area full. Cannot add.");
        } else {
            if(rear==-1 && front ==-1 ){
            front =rear=0;
            }else if(rear==size-1 && front !=0){
            rear=0;
            }else{
            rear = (rear+1)%size;
            }queue[rear]=song;
        }
        if (curr == -1) {  // first song added becomes currently playing
            curr = front;
        }
         System.out.println(song + " added to playlist.");
    }
    
     public void display(){
       if (front == -1) {
            System.out.println("Underflow: No Song.");
        } else {System.out.print("Play list: ");
            int i = front;
            while (i != rear) {
                System.out.print(queue[i] + " , ");
                i = (i +1 ) % size;
            }
            System.out.println(queue[rear]);
    }
    }
     
     public void playNext() {
        if (curr == -1) {
            System.out.println("No songs in the playlist.");
            return;
        }

        curr = (curr + 1) % size;

        // Skip empty slots (because dequeue isn’t used here)
        while (queue[curr] == null) {
            curr = (curr + 1) % size;
        }

        System.out.println("Now playing: " + queue[curr]);
    }

    // Bonus: Show current song
    public void showCurrent() {
        if (curr == -1) {
            System.out.println("No song is currently playing.");
        } else {
            System.out.println("Currently playing: " + queue[curr]);
        }
    }
    
    public static void main(String[] args) {
        MusicQueue mp=new MusicQueue(5);
        mp.enqueue("tyu");
        mp.enqueue("fdg");
        mp.enqueue("asd");
        mp.display();
        mp.showCurrent();
        mp.playNext();
        
    }
    
}
