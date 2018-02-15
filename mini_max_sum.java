import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void miniMaxSum(int[] arr) {
        List<Long> ints = new ArrayList<Long>();
        for (int o_cn = 0; o_cn < 5; o_cn++){
            long sum = 0;
            for(int arr_i = 0; arr_i < 5; arr_i++){
                if (arr_i != o_cn){
                    sum += arr[arr_i];
                }
            }
            ints.add(sum);
        }
        System.out.print(Collections.min(ints)+ " "+ Collections.max(ints));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}
