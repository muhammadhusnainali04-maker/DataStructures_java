/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author HP 840 G5
 */
public class Stack {

   int stackArr[];
    int top;
    
    Stack (int sizeofStack){
   stackArr= new int[sizeofStack];
   this.top=-1;
    }
    
    
    public void push(int item){
    if (top==stackArr.length-1){System.out.println("Stack Over Flow");}
    else{stackArr[++top]=item;}
    }
     
  
//    public char pop(){
//       if(top==-1){System.out.print("Stack Undeer Flow"); 
//       return 0; }
//      
//     for (int i =0;i<=top;i++){
//            System.out.print(stackArr[top - i]);
//         
//          } 
//      System.out.println("");
//          return stackArr[top--];
//     }
    
//     public String showLIFO(String st){
//       
//        for(int i =0;i<st.length();i++){
//            
//        push(st.charAt(i));
//        }
//        return st;
//    }
    
    
    public int pop(){
    if(top==-1){System.out.print("Stack Undeer Flow"); return -1;}
    else{System.out.println("pop item are"+stackArr[top]); }
    return stackArr[top--];
    }
    
    
    public boolean isempty(){
       
        return top == -1;
    }
    
   
    
    public int check_preference(int s[]){
        int check =0;
        int arr[]=new int [stackArr.length];
        
        
        for(int i=0 ;i<s.length;i++){
            
        if(isempty()){push(s[i]); return 0;}
        while (s[i]>stackArr[top]){int k=pop();
            arr[k]=s[i++];}
//        if (s[i++]>stackArr[top]){
//            int k=pop();
//            arr[k]=s[i++];
//        }else{push(s[i]);}
//        
//         if(top == -1){System.out.println("Invalid Expression");
//              return 0;
//          }else{if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')'){
//              char valueTopOfStack = pop();
//              char valueOfArray = s.charAt(i);
//              check=balance(valueTopOfStack, valueOfArray);
//          }
//         }
        }
        return check;
    }
    
    
    
    
//     public int check_parenthesis(String s){
//        int check =0;
//        for(int i=0 ;i<s.length();i++){
//        if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '('){
//        push(s.charAt(i));}
//         if(top == -1){System.out.println("Invalid Expression");
//              return 0;
//          }else{if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')'){
//              char valueTopOfStack = pop();
//              char valueOfArray = s.charAt(i);
//              check=balance(valueTopOfStack, valueOfArray);
//          }
//         }
//        }
//        return check;
//    }
//     
//     
//     public int balance(char a,char b){
//     if(a=='(' || a== ')' ){
//     return 1;}
//     if(a=='[' || a== ']' ){
//     return 1;}
//     if(a=='{' || a== '}' ){
//     return 1;}
//     else {return 0;}
//     }
//  
     
     
     //    public char pop(){
//    if(top==-1){System.out.print("Stack Undeer Flow"); return -1;}
//    else{System.out.println("pop item are"+stackArr[top]); }
//    return stackArr[top--];
//    }
    
     
//    public void factor(int n){
//        
//        for(int i=1; i<=n;i++){
//            if(n%i==0){
//                push(i);
//            }
//        }
//    }
//        
//    
//    public void primefactor(int n){
//        int i =2;
//    while(n!=1){
//        
//        while(n%i==0){
//            
//        push(i);
//        n=n/i;
//        }
//        i++;
//    }
//    }
//    
//    public void decimal2binary(int n){
//    
//    while(n!=0){
//
//        push(n%2);
//        n=n/2;
//    }
//    
//    }
//    
//    
    public void print(){
    for(int i =top; i>-1; i--){
    System.out.println(stackArr[i]); 
    }
    }
//    
//    public void reverse( Stack s9 , Stack s10){
//     while(this.top!=-1){
//         int ele=this.pop();
//         s9.push(ele);
//        
//     }
//     
//      while(s9.top!=-1){
//         int ele=s9.pop();
//         s10.push(ele);
//         
//     }
//      
//       while(s10.top!=-1){
//         int ele=s10.pop();
//         this.push(ele);
//      
//     }
//    }
//    
//    
//     public boolean isFull(){
//    
//        if(top==stackArr.length)
//            return true;
//        else
//            return false;
//    }
//    public boolean isEmpty(){
//    
//        if(top==-1)
//            return true;
//        else
//            return false;
//    }
    
    
    public static void main(String[] args) {
        
        int x[]={4,5,2,25};
         Stack s=new Stack(x.length);
         s.print();
        s.check_preference(x);
        s.print();
        
        
//         String x= "STACK";
//         System.out.println("The given string is "+x);
//         Stack s=new Stack(x.length());
//         s.showLIFO(x);
//         s.pop();
          
         //           s.pop();
//            s.pop();
        
        
//        String st= "{(A+B)+[(R-Y)(K-Z)]D}";
//        Stack s=new Stack(st.length());
//       int check = s.check_parenthesis(st);
//       if(check==1){System.out.print("paranthesis are balance ");}
//       else{System.out.print("paranthesis are NOT balance ");}
        
        
        
//        Stack s9=new Stack(5);
//        Stack s10=new Stack(5);
//        s.push(7);
//        s.push(6);
//        s.push(5);
//        s.push(4);
//        s.push(3);
//       
//        s.print();
////        s.pop();
////        s.pop();
////        s.pop();
////        s.pop();
////        s.push(2);
////        s.push(1);
////        s.print();
//        System.out.println(""); 
//        
//        
//        s.reverse( s9, s10);
//        s.print();
//         System.out.println(""); 
//        
//        
//        Stack s1=new Stack(6);
//        s1.factor(12);
//        s1.print();
//        System.out.println(""); 
//        
//        Stack s2=new Stack(6);
//        s2.primefactor(12);
//        s2.print();
//        System.out.println(""); 
//        
//        
//      Stack s3=new Stack(6);
//        s3.decimal2binary(4);
//        s3.print();
//        System.out.println(""); 
    }
    
}
