import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       if(inputString == null || inputString.isEmpty()){
           System.out.print("NO");
           return;
       }
        String ans;
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        int[] arr = new int[256];
        int n = inputString.length();
        for(int i = 0; i < n; i++){
            arr[inputString.charAt(i)] += 1;
        }
        int count = 0;
        for(int j = 0; j < 256; j++){
           // if(arr[inputString.charAt(j)]%2 != 0) count++;
            if(arr[j]%2 != 0) count++;
        }
       // System.out.println(count);
        if(count > 1) ans = "NO";
        else
            ans = "YES";
        System.out.println(ans);
        myScan.close();
    }
}
