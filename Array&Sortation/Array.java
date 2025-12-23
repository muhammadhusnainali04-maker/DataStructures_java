


import java.util.*;
public class Array {
 int arr[];
    int count;
    public Array(int len){
        arr=new int[len];
    }  
    
    
    public void insert2(int data){
        if(count>=arr.length){
            int arrr[]=new int[count*2];
            for(int i =0; i <count; i++){
                arrr[i]=arr[i];
            }arr=arrr;
        }
    arr[count++]=data;
    
    
    
    }
    
    public int insert(int data){
    if(count<arr.length){
    arr[count]=data;
    count ++;
    return data;
    }
    return -1;
    }
    
    public int bubblesort(){
    int n=arr.length;
    for (int i=0;i<n-1;i++){
    for (int j=0;j<n-i-1;j++){
        if(arr[j]>arr[j+1]){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
    }
    }return -1;
    }
    
    
    public int binary_search(int data){
    int first=0;
    int last =arr.length-1;
    while(first<=last){
    int mid =(first+last)/2;
    if(arr[mid]==data) return mid;
    else if (arr[mid]<data){first=mid+1; System.out.println(first); return first;}
    else if (arr[mid]>data){last=mid-1;  System.out.println(last); return last;}
    }
    return -1;
    }
    
            
            
    public int linear_search(int data){
        for (int i=0; i<arr.length;i++){
            if(arr[i]==data){ System.out.println(data+" data is at "+i );}
        }
        return-1;
    }
    
    public void print(){
    for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    
    }
    
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int input=sc.nextInt();
         Array a=new Array(input);
         a.insert(3);
         a.insert(4);
         a.insert(1);
         a.insert(2);
         a.insert(5);
         a.print();
         System.out.println(" ");
         a.linear_search(3);
          System.out.println(" ");
         a.bubblesort();
         a.print();
          System.out.println(" ");
         a.binary_search(4);
         System.out.println(" ");
         a.insert2(3);
         a.insert2(4);
         a.insert2(1);
         a.insert2(2);
         a.insert2(5);
         a.insert2(6);
         a.insert2(7);
         a.print();
         
     }
    
}
