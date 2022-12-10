/**
Nastya owns too many arrays now, so she wants to delete the least important of them. However, she discovered that this array is magic! Nastya now knows that the array has the following properties:

In one second we can add an arbitrary (possibly negative) integer to all elements of the array that are not equal to zero.
When all elements of the array become equal to zero, the array explodes.
Nastya is always busy, so she wants to explode the array as fast as possible. Compute the minimum time in which the array can be exploded.

Input
The first line contains a single integer n (1 ≤ n ≤ 10^5) — the size of the array.

The second line contains n integers a1, a2, ..., an ( - 10^5 ≤ a(i) ≤ 10^5) — the elements of the array.

Output
Print a single integer — the minimum number of seconds needed to make all elements of the array equal to zero.

Input:
5
1 1 1 1 1
Output:
1
*/

import java.util.HashSet;
import java.util.Scanner;

public class Nastya
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sze = input.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < sze; i++) {
            int temp = input.nextInt();
            if(temp != 0)
            {
                set.add(temp);
            }
        }
        System.out.println(set.size());
        input.close();
    }
}