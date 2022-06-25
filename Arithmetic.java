/*
* ----------- 1537A Arithmetic Array ---------------
An array b of length k is called good if its arithmetic mean is equal to 1. More formally, if
b(1)+⋯+b(k) / k = 1.
Note that the value b1+⋯+bk / k is not rounded up or down. For example, the array [1,1,1,2] has an arithmetic mean of 1.25, which is not equal to 1.

You are given an integer array a of length n. In an operation, you can append a non-negative integer to the end of the array. What's the minimum number of operations required to make the array good?

We have a proof that it is always possible with finitely many operations.

Input
The first line contains a single integer t (1 ≤ t ≤ 1000) — the number of test cases. Then t test cases follow.

The first line of each test case contains a single integer n (1 ≤ n ≤ 50) — the length of the initial array a.

The second line of each test case contains n integers a1,…,an (−10(4) ≤ a(i) ≤ 10(4)), the elements of the array.

Output
For each test case, output a single integer — the minimum number of non-negative integers you have to append to the array so that the arithmetic mean of the array will be exactly 1.

Input:
4
3
1 1 1
2
1 2
4
8 4 6 2
1
-2

Output:
0
1
16
1

*/

import java.util.Scanner;

public class Arithmetic{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antal = input.nextInt();
        while(antal-- > 0){
            int sze = input.nextInt();
            int[] arr = new int[sze];
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                int temp = input.nextInt();
                sum += temp;
                arr[i] = temp;
            }
            if(sum == sze){
                System.out.println(0);
            }else if(sum < sze){
                System.out.println(1);
            }else{
                System.out.println(sum - sze);
            }
        }
        input.close();
    }
}