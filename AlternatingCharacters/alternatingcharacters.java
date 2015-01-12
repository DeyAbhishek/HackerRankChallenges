import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       try{ BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        while((line = br.readLine())!= null){
            System.out.println(del(line));
        }
    }
     catch(IOException ex){
         
     }   
    }
    
    public static int del(String str){
        int c = 0;
        char prev = str.charAt(0);
        int n = str.length();
        for(int i = 1; i < n; i++){
            if(str.charAt(i)==prev) c++;
            else prev = str.charAt(i);
        }
        return c;
    }
}
