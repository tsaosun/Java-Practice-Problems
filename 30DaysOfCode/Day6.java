//Problem: https://www.hackerrank.com/challenges/30-review-loop/problem

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String[] array = new String[i];
        for (int j = 0; j<array.length; j++){
            array[j] = scan.next();
        }
        for (String string: array){
            StringBuilder even = new StringBuilder("");
            StringBuilder odd = new StringBuilder("");
            for(int count = 0; count < string.length(); count++){
                String s = Character.toString(string.charAt(count));
                if (count%2 == 0){
                   even.append(s);
                }
                else{
                   odd.append(s);
                }
            }
            System.out.println(even + " " + odd);
        }
    }
}
