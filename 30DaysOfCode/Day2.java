//Problem: https://www.hackerrank.com/challenges/30-operators/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();


        double tip = (double)(tip_percent);
        tip = (meal_cost) * (tip/100);

        double tax = (double)(tax_percent);
        tax = (meal_cost) * (tax/100);

        double totalCost = meal_cost + tip + tax;
        int total = (int)(Math.round(totalCost));
        System.out.println("The total meal cost is "+ total +" dollars.");
    }
}
