/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


public class NextGreaterElement {
  int stack[];
    int top;

    NextGreaterElement(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int val) {
        if(top == stack.length - 1){
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = val;
        }
    }

    public int pop() {
        if(top == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public void printNGE(int arr[]) {
        for(int i = 0; i < arr.length; i++){
           
            while(top!=-1 && arr[i] > stack[top]) {
                int val = pop();
                System.out.println(val + " --> " + arr[i]);
            }
          
            push(arr[i]);
        }

        while(top!=-1 ){
            int val = pop();
            System.out.println(val + " --> -1");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 25};
        NextGreaterElement nge = new NextGreaterElement(arr.length);
        nge.printNGE(arr);
    }
}
