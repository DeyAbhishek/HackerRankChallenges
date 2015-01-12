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
            char[] ch = line.toLowerCase().toCharArray();
            int n = line.length();
            if(n == 0) {
                System.out.print("not pangram"); return;
            }
            boolean[] bool = new boolean[256];
            for(int i = 0; i < n; i++){
                if(ch[i] != ' '){
                    bool[ch[i]] = true;
                }
            }
            int j;
            for(j = 'a'; j <= 'z';j++){
                //System.out.print(bool[j]);
                if(!bool[j]){System.out.print("not pangram"); break;}
            }
            if(j=='z' + 1) System.out.print("pangram");
        }
        catch(IOException ex){
            System.out.print("Exception");
        }
    }
}
