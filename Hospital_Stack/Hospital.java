/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital;

/**
 *
 * @author HP 840 G5
 */
public class Hospital {
   patient first=null;
   patient last=null;
   
    public class patient{
        private int id;
        private String name;
        private String illness;
        patient next;
        
        public patient(int id, String name, String illness){
        this.id=id;
        this.name=name;
        this.illness=illness;
        this.next=null;
        }
    }
    
    
  private int getSeverityLevel(String illness) {
        if (illness.equals("Critical")) return 1;
        if (illness.equals("Severe")) return 2;
        if (illness.equals("Moderate")) return 3;
        if (illness.equals("Mild")) return 4;
        return 5; 
    } 
    
    public void insertInfoEmergency(int id,String name,String illness){
    patient newP =new patient(id,name,illness);
    
     int newSeverity = getSeverityLevel(newP.illness);

        
        if (first == null || newSeverity < getSeverityLevel(first.illness) ) {
            newP.next = first;
            first = newP;
            return;
        }
    
        
         patient current = first;
        while (current.next != null && getSeverityLevel(current.next.illness) <= newSeverity) {
            current = current.next;
        }

        newP.next = current.next;
        current.next = newP;
    
  
    }
    
    

    
    
    public void print() {
    patient current = first;
    while (current != null) {
        int severity = getSeverityLevel(current.illness);
        System.out.println("Id: "+current.id + " " +" Name: "+ current.name + " " +" illness "+ current.illness + 
                         " (Severity: "+severity  + ") ----> ");
        current = current.next;
    }
    System.out.println("Null");
}

    
    
    public static void main(String[] args) {
       Hospital H=new Hospital();
       H.insertInfoEmergency(1, "stu", "Moderate");
       H.insertInfoEmergency(2, "000", "Severe");
       H.insertInfoEmergency(3, "Muhammad","Critical"); 
       H.insertInfoEmergency(4, "abc", "Mild"); 
       H.insertInfoEmergency(5, "Husnain", "Critical"); 
       H.insertInfoEmergency(6, "ghi", "Mild"); 
       H.insertInfoEmergency(7, "jkl", "Moderate"); 
       H.insertInfoEmergency(8, "mno", "Mild"); 
       H.insertInfoEmergency(9, "pqr", "Severe"); 
       H.insertInfoEmergency(0, "Ali", "Critical"); 
       
       
       H.print();
    }
    
}
