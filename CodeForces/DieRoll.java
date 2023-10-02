/*
 * Problem Link: https://codeforces.com/problemset/problem/9/A
 * 9A. Die Roll
 * Submission: https://codeforces.com/problemset/submission/9/212209979
 */

import java.util.Scanner; // for taking input

public class DieRoll {
    public static void main(String[] args) {
        // takes input
        Scanner take = new Scanner(System.in);
        int y = take.nextInt();
        int w = take.nextInt();
        take.close(); // close the Scanner

        // finds out the higher value between y and w
        int highest = 0;
        if (y >= w) {highest = y;} else {highest = w;}
        

        if ((7 - highest) % 2 == 0 || (7 - highest) == 3) {
            if ((7 - highest) == 6) { // if the highest is 1, it's absolutely a win
                System.out.println("1/1");
            } else if ((7 - highest) == 3) { // if the highest is 4, it's a 50/50
                System.out.println("1/2");
            } else { // determines the fraction
                System.out.printf("%d/%d\n", (7 - highest) / 2, 3);
            }
        } else { // determines the fraction
            System.out.printf("%d/%d\n", (7 - highest), 6);
        }
    }
}
