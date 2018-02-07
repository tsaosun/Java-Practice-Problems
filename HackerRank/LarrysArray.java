//Problem: https://www.hackerrank.com/challenges/larrys-array/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String larrysArray(int[] A) {
        int counter = 0;
        for(int i = 0; i<A.length-1; i++){
            for (int j = i+1; j<A.length; j++)
                if(A[i] > A[j]){
                    counter++;
                }
               else{
                continue;
               }
        }
        if ((counter % 2) == 0){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] A = new int[n];
            for(int A_i = 0; A_i < n; A_i++){
                A[A_i] = in.nextInt();
            }
            String result = larrysArray(A);
            System.out.println(result);
        }
        in.close();
    }
}
