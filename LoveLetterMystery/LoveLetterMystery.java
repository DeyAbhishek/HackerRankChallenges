import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line = br.readLine();
            while((line = br.readLine())!=null){
                if(line == null){
                    System.out.println("0");
                    return;
                }
                int n = line.length();
                int mid = n/2;
                int count = 0;
                for(int i = 0; i < mid; i++){
                    int j = n - 1 - i;
                    if(line.charAt(i) != line.charAt(j)){
                        int a = line.charAt(i) - 'a';
                        int b = line.charAt(j) - 'a';
                        int c = Math.abs(a - b);
                        //System.out.print(line.charAt(i) +"  " + line.charAt(j) + "  " + c + "      ");
                        count += c;
                    }
                }
                
                System.out.println(count);
               // count = 0;
            }
        }
        catch(IOException ex){
            
        }
    }
}
