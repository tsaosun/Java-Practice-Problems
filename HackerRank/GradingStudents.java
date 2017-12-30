//Grading Students Problem: https://www.hackerrank.com/challenges/grading/problem

//Solution:
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        // Complete this function
        for (int j = 0; j < grades.length; j++){
            if ( ((grades[j]) >= 38) == true ){
                if(grades[j]%5 > 2){
                    grades[j] = grades[j]+ (5- (grades[j]%5));
                }
                else{
                    grades[j] = grades[j];
                }
            }
            else{
                grades[j] = grades[j];
            }
        }
        return grades;
    }    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
