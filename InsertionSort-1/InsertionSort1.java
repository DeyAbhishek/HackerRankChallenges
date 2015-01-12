import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function  
        int n = ar.length;
        if(n == 1){
            printArray(ar);
            return;
        }
        int a = ar[n - 1];
    //   System.out.println(n);
        int i;
        for( i = n - 2; i >= 0; i--){
           // System.out.println("Entered");
            if(a < ar[i]) 
            {
            //    System.out.println("Entered");
                ar[i + 1] = ar[i];
            printArray(ar);
            }
            else{
              //  System.out.println("Entered");
                ar[i + 1] = a;
               printArray(ar);
                break;
            }
        }
        if(i == -1){
            ar[0] = a;
            printArray(ar);
        }
        
    }
    
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
