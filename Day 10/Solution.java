import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void consecutive1s(String s){
        boolean one = false;
        int count = 0;
        int max = 0;
        for (int i=0; i<s.length();i++){
            if((s.charAt(i)=='1') && (one==true)){
                count++;
            }
            else{
                if((s.charAt(i)=='1') && (one==false)){
                    if (max < count)
                        max=count;
                    one = true;
                    count = 1;
                }
                else{
                    one = false;
                    if (max < count)
                        max = count;
                }
            }
            
        }
        if (max < count)
            max = count;

        System.out.println(max); 
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int i = 1;
        int pow = 0;
        
        String bits = Integer.toBinaryString(n);
        consecutive1s(bits);
        scanner.close();
    }
}
