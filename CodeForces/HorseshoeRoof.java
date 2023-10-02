/*
 *  Problem Link: https://codeforces.com/problemset/problem/228/A
 *  228A. Is your horseshoe on the other hoof?
 * Submission: https://codeforces.com/problemset/submission/228/212034669
*/

import java.util.Scanner;           // for taking inputs
import java.util.ArrayList;         // to make ArrayLists

public class HorseshoeRoof {
    public static void main(String[] args) {
        // takes input
        Scanner take = new Scanner(System.in);

        // initiates a new ArrayList
        ArrayList<Integer> shoes = new ArrayList<Integer>();

        // loop four times
        for (int i = 0; i < 4; i++) {
            int curr = take.nextInt(); // takes horseshoe color
            if (!shoes.contains(curr)) { // adds the input to the ArrayList if it's not present
                shoes.add(curr);
            }
        }
        take.close(); // close the Scanner
        System.out.println(4 - shoes.size()); // she would need to buy the number of shoes that adds up to 4
    }
}