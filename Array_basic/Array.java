package Array_basic;




public class Array {
  
    private int arr[];
    private int count;
    
    public Array(int limit){
    arr =new int [limit];
    } 
    public void printArray(){
        for (int i=0 ; i<count ; i++) {System.out.print(arr[i]+" ");}
    }
    public void insertinArray(int ele){
        if (count == arr.length) {
            int artiarray[] = new int[2*count];   
     
             for (int i=0 ; i<count ;i++){ artiarray[i] = arr[i];}
             arr = artiarray;
    
        }
        arr[count++]=ele;
    }
    
    public static void main(String[] args) {
        Array array = new Array(2);
         
        array.insertinArray(9);
        array.insertinArray(10);
        array.insertinArray(11);
        array.insertinArray(2);
        array.insertinArray(13);
        array.insertinArray(14);
        array.insertinArray(15);
        array.insertinArray(16);
        array.insertinArray(17);
        array.insertinArray(18);
        array.insertinArray(19);
        array.insertinArray(20);
        
        array.printArray();    
    }

 
}
