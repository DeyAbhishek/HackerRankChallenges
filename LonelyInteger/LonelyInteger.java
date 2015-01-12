import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static int lonelyinteger(int[] a) {
HashMap hm = new HashMap<Integer, Integer>();
    int n = a.length;
    int res = a[0];
    for(int i = 1; i < n; i++){
    //    if(!hm.containsKey(a[i])) {hm.put(a[i], 0);}
     //   Integer k = hm.get(a[i]);
       // hm.put(a[i], k + 1);
    res = res^a[i];
    }
    
    //for(Map.Entry<Integer, Integer> en : hm.entrySet()){
      //  if(en.getValue() == 1) return en.getKey().intValue();
    //}
return res;
    }
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        
        int _a_size = Integer.parseInt(in.nextLine());
        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }
        
        res = lonelyinteger(_a);
        System.out.println(res);
        
    }
}
