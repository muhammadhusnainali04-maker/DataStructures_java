/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author HP 840 G5
 */
public class Infix {

int postfix[];
int infix[];
int top;

    Infix(int len){
    
    postfix = new int[len];
    infix = new int[len];
    this.top=-1;
    }
    
     
    public void push(int item){
    if (top==infix.length-1){System.out.println("Stack Over Flow");}
    else{infix[++top]=item;}
    }
    
    
    public int pop(){
    if(top==-1){System.out.print("Stack Under Flow"); return 0;}
    else{
    return infix[top--];}
    }
    
 
       
       // AB+
    public int I2P(String n){
           for (int i=0;i<n.length();i++){
               
               postfix[i]=n.charAt(i)  - '0';
       }
           int sym;
           int result  =0;
           
           for (int i=0;i<n.length();i++){
           sym =n.charAt(i);
          
          
          if (precedence(sym)==1){
             int b=  pop();
             int a=  pop();

             switch(sym){
               
//              
                    case '+': result = a + b; break;
                    case '-': result = a - b; break;
                    case '*': result = a * b; break;
                    case '/': result = a / b; break;
               
          }push(result);
           
           }else{push(sym - '0');}
           
           
        
           }
//          
  System.out.println ("The result is "+result);
        return pop();
       }
    
    
    
  public int precedence(int op){
    switch(op){
        case '+':
        case '-':
        case '*':
        case '/':
        case '^':
            return 1;
        default:
            return 0;
        
    }
    }
    public static void main(String[] args) {
      String val = "623+-382/+*";
        Infix p=new Infix(val.length());
        p.I2P(val);
        
    }
    
}
