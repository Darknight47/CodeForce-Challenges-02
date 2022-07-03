/**
You are given two arrays A and B consisting of integers, sorted in non-decreasing order.
Check whether it is possible to choose k numbers in array A and choose m numbers in array B
so that any number chosen in the first array is strictly less than any number chosen in the second array.

Input
The first line contains two integers n(A), n(B) (1 ≤ n(A), n(B) ≤ 105), separated by a space — the sizes of arrays A and B, correspondingly.

The second line contains two integers k and m (1 ≤ k ≤ n(A), 1 ≤ m ≤ n(B)), separated by a space.

The third line contains n(A) numbers a(1), a(2), ... a(n(A)) ( -10^9 ≤ a(1) ≤ a(2) ≤ ... ≤ a(n(A)) ≤ 10^9), separated by spaces — elements of array A.

The fourth line contains n(B) integers b(1), b(2), ... b(n(B)) ( -10^9 ≤ b(1) ≤ b(2) ≤ ... ≤ b(n(B)) ≤ 10^9), separated by spaces — elements of array B.


Output
Print "YES" (without the quotes), if you can choose k numbers in array A and m numbers in array B so that any number chosen
in array A was strictly less than any number chosen in array B. Otherwise, print "NO" (without the quotes).

Input:
3 3
2 1
1 2 3
3 4 5

Output:
YES

Input:
3 3
3 3
1 2 3
3 4 5

Output:
NO


*/

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrSze = input.nextInt();
        int[] arr = new int[arrSze];
        int barSze = input.nextInt();
        int[] barr = new int[barSze];
        int k = input.nextInt();
        int m = input.nextInt();
        for (int i = 0; i < arrSze; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < barSze; i++) {
            barr[i] = input.nextInt();
        }
        int lowerBound = arr[--k];
        int upperBound = barr[barSze - m];
        if(upperBound > lowerBound){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        input.close();
    }
}
