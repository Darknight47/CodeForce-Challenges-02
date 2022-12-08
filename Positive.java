/*
* ---------------------------- 1130 A Be Positive -------------------------------------------------
You are given an array of n integers: a1,a2,…,an. Your task is to find some non-zero integer d (−10^3 ≤ d ≤ 10^3) such that, after each number in the array
is divided by d, the number of positive numbers that are presented in the array is greater than or equal to half of the
array size (i.e., at least ⌈n2⌉). Note that those positive numbers do not need to be an integer (e.g., a 2.5 counts as a
positive number). If there are multiple values of d that satisfy the condition, you may print any of them. In case that
there is no such d, print a single integer 0.

Recall that ⌈x⌉ represents the smallest integer that is not less than x and that zero (0) is neither positive nor negative.

Input
The first line contains one integer n (1 ≤ n ≤ 100) — the number of elements in the array.

The second line contains n space-separated integers a1,a2,…,an (−10^3≤ a(i) ≤ 10^3).

Output
Print one integer d (−10^3 ≤ d ≤ 10^3 and d≠0) that satisfies the given condition. If there are multiple values of d that
satisfy the condition, you may print any of them. In case that there is no such d, print a single integer 0.

Input:
5
10 0 -7 2 6
Output:
4

Input:
7
0 0 1 -1 0 0 2
Output:
0
* 
*/

import java.util.Scanner;
import java.util.Arrays;

public class Positive
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sze = input.nextInt();
        int[] arr = new int[sze];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int positivesNeeded = (int) Math.ceil(sze / (double)2);

        Arrays.sort(arr);
        int positives = 0;
        int negatives = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0)
            {
                positives++;
            }
            else if(arr[i] < 0)
            {
                negatives++;
            }
            
        }
        if(positives >= positivesNeeded)
        {
            System.out.println(1);
        }
        else if(negatives >= positivesNeeded)
        {
            System.out.println(-1);
        }
        else
        {
            System.out.println(0);
        }

        input.close();
    }
}