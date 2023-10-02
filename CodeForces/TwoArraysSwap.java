/*
 *  Problem Link: https://codeforces.com/problemset/problem/1353/B
 *  1353 B. Two Arrays and Swaps
 * Submission: https://codeforces.com/contest/1353/submission/211796360
*/

// import needed libraries
import java.util.Scanner;           // scan inputs
import java.util.ArrayList;         // to hold elements
import java.util.Collections;      // used for sorting an ArrayList

public class TwoArraysSwap {
    public static void swapArrays(ArrayList<Integer> arrlis1, ArrayList<Integer> arrlis2, int bound) {
        /*
         * Swap elements between two ArrayList within bound.
        */
        int i = 0;                                   // looping needs
        boolean canChange = true;   // defines whether swapping still needs to be done or not
        while (i < bound && canChange) { // enters the loop

            if (arrlis1.get(0) > arrlis2.get(0)) {
                // no longer needs to be changed
                canChange = false;
            }

            if (canChange) {
                // adds the first element of an ArrayList to the other
                arrlis1.add(arrlis2.get(0));
                arrlis2.add(arrlis1.get(0));

                // delete the element involved before
                arrlis1.remove(0);
                arrlis2.remove(0);

                // sort again
                Collections.sort(arrlis1);
                Collections.sort(arrlis2, Collections.reverseOrder());

                i++; // iterator increases
            }
        }
    }

    public static int findArraySum(ArrayList<Integer> arrinp) {
        /*
         * Finds the sum of all elements inside an ArrayList.
         */
        int sum = 0; // initial sum setting
        for (int i = 0; i < arrinp.size(); i++) {
            // adds the traversed elements
            sum += arrinp.get(i);
        }
        return sum;
    }

    // public static void arrayPrinter(ArrayList<Integer> arrinp) {
    //     for (int i = 0; i < arrinp.size(); i++) {
    //         System.out.printf("%d ", arrinp.get(i));
    //     }
    // }

    public static void main(String[] args) {
        /*
         * Main component of the code.
         */

        // takes input
        Scanner take = new Scanner(System.in);
        int t = take.nextInt();

        // ArrayList initialization
        ArrayList<Integer> elements1 = new ArrayList<Integer>();
        ArrayList<Integer> elements2 = new ArrayList<Integer>();

        for (int a = 0; a < t; a++) {
            // loop through the elements
            int n, k;
            n = take.nextInt();
            k = take.nextInt();
            for (int b = 0; b < n; b++) {
                int curr1 = take.nextInt();
                elements1.add(curr1);
            }
            for (int c = 0; c < n; c++) {
                int curr2 = take.nextInt();
                elements2.add(curr2);
            }

            // sort the ArrayList
            Collections.sort(elements1);
            Collections.sort(elements2, Collections.reverseOrder());

            // call function and displays the result
            swapArrays(elements1, elements2, k);
            System.out.println(findArraySum(elements1));

            // clear the ArrayList in order to be used again
            elements1.clear();
            elements2.clear();
        }
        take.close(); // close the Scanner
    }
}