/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postfix;

/**
 *
 * @author HP 840 G5
 */
public class Postfix {
char stack[];
char postfix[];
char infix[];
int top;

    Postfix(int len){
    stack = new char[len];
    postfix = new char[len];
    infix = new char[len];
    this.top=-1;
    }
    
     
    public void push(char item){
    if (top==stack.length-1){System.out.println("Stack Over Flow");}
    else{stack[++top]=item;}
    }
    
    
    public char pop(){
    if(top==-1){System.out.print("Stack Undeer Flow"); return '0';}
    else{
    return stack[top--];}
    }
    
 
       
       
    public void I2P(String n){
           for (int i=0;i<n.length();i++){
               infix[i]=n.charAt(i);
       }
           char sym;
           int j=0;
           for (int i=0;i<n.length();i++){
           sym = infix[i];
           switch(sym){
               case '(':
                   push(sym);
                   break;
                 case ')':
                     while(top != -1 && stack[top] != '('){
                        postfix[j++] = pop();
                    }
                     
                    pop(); // remove '('
                    break;
                case '+':
                case '-':
                case '*':
                case '/':
                case '^':

                   while(top != -1 && stack[top] != '(' && precedence(stack[top]) >= precedence(sym)) {
                        postfix[j++] = pop();
                    }

                    push(sym);
                    break;
                default:
                    postfix[j++] = sym;
           }
           
           
        
           }
           while(top != -1){
            postfix[j++] = pop();
        }

        // print postfix result
        System.out.print("Postfix: ");
        for(int i=0;i<j;i++){
            System.out.print(postfix[i]);
        }
        System.out.println();
       }
    
    
    public int precedence(char op){
    switch(op){
        case '+':
        case '-':
            return  1;
        case '*':
        case '/':
            return  2;
        case '^':
            return  3;
        default:
            return 0;
        
    }
    
    }
    public static void main(String[] args) {
      String val = "A+(B*C-(D/E^F)*G)*H";
        Postfix p=new Postfix(val.length());
        p.I2P(val);
        
    }
    
}
