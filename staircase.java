import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void staircase(int n) {
        for(int i = 1; i <= n; i++){
            String one = repeat(' ',n-i);
            String two = repeat('#',i);
            System.out.print(one);
            System.out.println(two);
        }
    }

    public static String repeat(char c,int i){
         String tst = "";
         for(int j = 0; j < i; j++)
             {
             tst = tst+c;
         }
         return tst;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
