/*
* ------ 888 A  Local Extrema --------

You are given an array a. Some element of this array ai is a local minimum iff it is strictly less than both of its
neighbours (that is, a(i) < a(i) - 1 and a(i) < a(i) + 1). Also the element can be called local maximum iff it is
strictly greater than its neighbours (that is, a(i) > a(i) - 1 and a(i) > a(i) + 1). Since a1 and an have only one
neighbour each, they are neither local minima nor local maxima.

An element is called a local extremum iff it is either local maximum or local minimum. Your task is to calculate
the number of local extrema in the given array.

Input
The first line contains one integer n (1 ≤ n ≤ 1000) — the number of elements in array a.

The second line contains n integers a1, a2, ..., an (1 ≤ a(i) ≤ 1000) — the elements of array a.

Output
Print the number of local extrema in the given array.

Input:
4
1 5 2 5

Output:
2

*/
import java.util.Scanner;


public class Extrema {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antal = input.nextInt();
        int[] arr = new int[antal];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int ans = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int left = arr[i - 1];
            int center = arr[i];
            int right = arr[i + 1];
            boolean ok = false;
            if(center < left && center < right)
            {
                ok = true;
            }else if(center > left && center > right)
            {
                ok = true;
            }else
            {
                ok = false;
            }
            if(ok)
                ans++;
        }
        System.out.println(ans);
        input.close();
    }
}
