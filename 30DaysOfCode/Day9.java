//Problem: https://www.hackerrank.com/challenges/30-recursion/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int factorial(int n) {
        if(n <= 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    }
}
