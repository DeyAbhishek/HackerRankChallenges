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
            int n = Integer.parseInt(line);
            long[] arr = new long[n];
            int j =0;
            while((line = br.readLine())!=null){
            arr[j++] = Long.parseLong(line);
            }
            long max = arr[0];
            
            for(int i = 1; i <= n - 1; i++){
                max = Math.max(max, arr[i]);
            }
            ArrayList<Long> list = new ArrayList<Long>();
            long zero = 0, one = 1;
            list.add(zero);
            list.add(one);
            long a = 0, b = 1;
            while(b <= max){
                long c = a + b;
                list.add(c);
                a = b;
                b = c;
            }
            
            
            for(int k = 0; k < n ; k++){
                if(list.contains(arr[k]))
                    System.out.println("IsFibo");
                else
                    System.out.println("IsNotFibo");
            }
                
        }
        catch(IOException ex){
            
        }
    }
}
