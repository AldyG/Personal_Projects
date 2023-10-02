/*
 * Problem Link: https://codeforces.com/problemset/problem/1669/A
 * 1669A. Division?
 * Submission: https://codeforces.com/problemset/submission/1669/212208651
 */

import java.util.Scanner; // for taking input

public class Division {
    public static void main(String[] args) {
        // takes input
        Scanner take = new Scanner(System.in);
        int t = take.nextInt();

        for (int i = 0; i < t; i++) { // loops until number of testcases are fulfilled
            int rating = take.nextInt();

            // uses conditional to determine the rating division
            if (rating >= 1900) {
                System.out.println("Division 1");
            } else if (rating >= 1600) {
                System.out.println("Division 2");
            } else if (rating >= 1400) {
                System.out.println("Division 3");
            } else { // rating is lower than 1400
                System.out.println("Division 4");
            }
        }
        take.close(); // close the Scanner
    }
}
