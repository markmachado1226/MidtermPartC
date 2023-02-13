/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

import java.util.Scanner;

/** This class takes String input from user 
 * and calls method statusDetail to print the 
 * status of User-Rejected,Pending,Processing and Approved.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the status details. 
 * @author srinivsi 
 */
public class Status {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        
    Status status = new Status(); 
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the user status code (zero,one,two,three) in string");
    String code = in.next();
    
    Status progress = new Status();
    progress.getC(); 
    progress.getP(); 
    
    progress.setC(Code c); 
    progress.setP(Process p);
    
    
    
    
    for(int i=0; i < 1; i++) {
        
    
        
     if(code == "zero"){
         System.out.println("REJECTED"); 
     }
     else if(code == "one") {
      System.out.println("PENDING"); 
     }
     else if(code == "two") {
      System.out.println("PROCESSING"); 
     }
     else if(code == "three") {
      System.out.println("APPROVED"); 
     }
     else {
     System.out.println("NOT VALID CODE"); 
     }
     
    }
    }
    
}
