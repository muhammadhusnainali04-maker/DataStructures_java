/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taskmanager.priorq;

import java.util.PriorityQueue;
public class TaskmanagerPriorQ implements Comparable<TaskmanagerPriorQ>{
private int priority;
String task;
private int q[];

    public TaskmanagerPriorQ(String task,int priority) {
        this.task = task;
        this.priority=priority;
        
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public void setTask(String task) {
        this.task = task;
    }

   public static TaskmanagerPriorQ removeFirst(PriorityQueue<TaskmanagerPriorQ> q) {
        if (q.isEmpty()) {
            System.out.println("No tasks to remove.");
            return null;
        }
        return q.poll(); 
    }

    @Override
    public String toString() {
        return  "Task "+ task + " at priority  "+priority ; 
    }
    
    @Override
     public int compareTo(TaskmanagerPriorQ o){
         return this.priority > o.priority ? 1:-1  ;
     }
    public static void main(String[] args) {
        PriorityQueue<TaskmanagerPriorQ> prior= new PriorityQueue<>();
       TaskmanagerPriorQ p1=new TaskmanagerPriorQ("DS",3);
       TaskmanagerPriorQ p2=new TaskmanagerPriorQ("Ai",1);
       TaskmanagerPriorQ p3=new TaskmanagerPriorQ("Presientation",2);
       prior.add(p1);
       prior.add(p2);
       prior.add(p3);
       
       removeFirst(prior);
       while(!prior.isEmpty()){System.out.println(prior.poll()+" ");}
       
       System.out.println(prior);
    }
    
}
