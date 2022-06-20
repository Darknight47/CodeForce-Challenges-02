/**
Petya has an array a consisting of n integers. He wants to remove duplicate (equal) elements.

Petya wants to leave only the rightmost entry (occurrence) for each element of the array.
The relative order of the remaining unique elements should not be changed.

Input
The first line contains a single integer n (1≤n≤50) — the number of elements in Petya's array.

The following line contains a sequence a1,a2,…,an (1≤ai≤1000) — the Petya's array.

Output
In the first line print integer x — the number of elements which will be left in Petya's array 
after he removed the duplicates.

In the second line print x integers separated with a space — Petya's array after he removed the duplicates.
For each unique element only the rightmost entry should be left.

Input:
6
1 5 5 1 6 1

Output:
3
5 6 1 

*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sze = input.nextInt();
        int[] arr = new int[sze];
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < sze; i++) {
            int temp = input.nextInt();
            arr[i] = temp;
            uniques.add(temp);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            if(uniques.contains(temp) && !ans.contains(temp)){
                ans.add(temp);
            }
        }
        System.out.println(uniques.size());
        for (int i = ans.size() - 1; i >= 0; i--) {
            System.out.print(ans.get(i) + " ");
        }
        input.close();
    }
}
