import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void plusMinus(int[] arr, int n) {
        int pos_no = 0;
        int neg_no = 0;
        int zero_no = 0;

        for(int arr_i = 0; arr_i < n; arr_i++){
            if (arr[arr_i] > 0)
                pos_no++;
            else if (arr[arr_i] < 0)
                neg_no++;
            else
                zero_no++;
        }

        System.out.println((float) pos_no/n);
        System.out.println((float) neg_no/n);
        System.out.println((float) zero_no/n);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr, n);
        in.close();
    }
}
