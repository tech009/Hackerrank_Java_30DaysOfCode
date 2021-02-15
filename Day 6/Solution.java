import java.io.*;
import java.util.*;

public class Solution {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = Integer.parseInt(scanner.nextLine().trim());
        
        while(n>0)
        {
            String str = scanner.nextLine();
            boolean turn = false;
            
            String even = new String();
            String odd = new String();
            
            for(int i=0; i<str.length(); i++){
                if(turn){
                    odd += str.charAt(i);
                    turn = false;
                }
                else{
                    even += str.charAt(i);
                    turn = true;
                }
            }
            
            System.out.println(even+" "+odd);
            n--;
        }
    }
}