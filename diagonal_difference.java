import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a,int n) {
        int sum_primd = 0; //Sum of the primary diagonal
        int sum_secd = 0; //Sum of secondary diagonal

        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                if (a_i == a_j)
                    sum_primd += a[a_i][a_j];
                if (a_i + a_j == (n-1))
                    sum_secd += a[a_i][a_j];
            }
        }

        return Math.abs(sum_primd - sum_secd);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a,n);
        System.out.println(result);
        in.close();
    }
}
