//Problem: https://www.hackerrank.com/challenges/30-data-types/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
          /* Declare second integer, double, and String variables. */
         int secondInt = 1;
         double secondDouble = 1.0;
         String secondString = "example";
         /* Read and save an integer, double, and String to your variables.*/
         // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
             secondInt = scan.nextInt();
             secondDouble = scan.nextDouble();
         //}

         /* Print the sum of both integer variables on a new line. */
         System.out.println(i+secondInt);

         /* Print the sum of the double variables on a new line. */
         System.out.println(d+secondDouble);

         /* Concatenate and print the String variables on a new line;
           the 's' variable above should be printed first. */
         while(scan.hasNext()){
               secondString = scan.nextLine();
         }

        System.out.println(s+secondString);
        scan.close();
   }
}
