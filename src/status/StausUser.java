/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser {
    
   public enum Code {ZERO, ONE, TWO, THREE}
   public enum Process {REJECTED, PENDING, PROCESSING, APPROVED, NOTVALIDCODE}
   private Process p; 
   private Code c; 
   
   
   public Code getC() {
       return c; 
   }
   
   public void setC(Code c){
   
       this.c = c;
   }
   
  

   
   
   public Process getP (){
       return p; 
   }
   
   public void setP(Process p) {
       this.p = p;
   }  
           
  
 
}
