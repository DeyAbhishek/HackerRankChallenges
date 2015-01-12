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
            while((line = br.readLine()) != null){
                int a = Integer.parseInt(line);
                int b = 1;
                if(a == 0) {
                    System.out.println("1");
                    continue;
                }
                for(int i = 1; i <= a; i++){
                    if(i%2 != 0){
                        b *= 2;
                    }
                    else{
                        b += 1;
                    }
                    
                }
                System.out.println(b);
            }
            
        }
        catch(IOException ex){
            
        }
    }
}
