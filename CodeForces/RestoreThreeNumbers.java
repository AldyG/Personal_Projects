/*
 * Problem Link: https://codeforces.com/problemset/problem/1154/A
 * 1154A. Restoring Three Numbers
 * Submission: https://codeforces.com/problemset/submission/1154/212172219
 */

import java.util.Scanner;            // for taking inputs
import java.util.ArrayList;          // to make ArrayLists
import java.util.Collections;       // for certain operations involving ArrayLists

public class RestoreThreeNumbers {
    public static void main(String[] args) {
        // takes input
        Scanner take = new Scanner(System.in);

        // initiates ArrayList and inputs elements
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            int curr = take.nextInt();
            numbers.add(curr);
        }
        take.close();
        Collections.sort(numbers); // sort the ArrayList
        
        // variable initialization
        int first = 0, second = 0, third = 0;

        /*
            * after getting sorted, it is almost certain that the last element is a+b+c.
            * a = ((a + b) + (a + c) - (b + c)) / 2
        */
        first = (numbers.get(0) + numbers.get(1) - numbers.get(2))/2;
        second = (numbers.get(0) + numbers.get(2) - numbers.get(1))/2;
        third = (numbers.get(1) + numbers.get(2) - numbers.get(0))/2;

        // prints the result
        System.out.printf("%d %d %d\n", first, second, third);
    }
}
