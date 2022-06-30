/*
* ----------- 768 A Oath of the Night's Watch -------------- 
With that begins the watch of Jon Snow. He is assigned the task to support the stewards.

This time he has n stewards with him whom he has to provide support. Each steward has his own strength.
Jon Snow likes to support a steward only if there exists at least one steward who has strength strictly
less than him and at least one steward who has strength strictly greater than him.

Can you find how many stewards will Jon support?

Input
First line consists of a single integer n (1 ≤ n ≤ 105) — the number of stewards with Jon Snow.

Second line consists of n space separated integers a1, a2, ..., an (0 ≤ ai ≤ 109) representing the values assigned to the stewards.

Output
Output a single integer representing the number of stewards which Jon will feed.

Input:
2
1 5

Output:
0

Input:
3
1 2 5

Output:
1
*/

import java.util.Arrays;
import java.util.Scanner;

public class Stewards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sze = input.nextInt();
        int[] arr = new int[sze];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        Arrays.sort(arr);
        int first = arr[0];
        int last = arr[arr.length - 1];
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if(temp != first && temp != last){
                answer++;
            }
        }
        System.out.println(answer);
        input.close();
    }
}
