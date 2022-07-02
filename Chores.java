/*
* ------------- 169 A Chores ------------------
Petya and Vasya are brothers. Today is a special day for them as their parents left them home alone
and commissioned them to do n chores. Each chore is characterized by a single parameter — its complexity.
The complexity of the i-th chore equals hi.

As Petya is older, he wants to take the chores with complexity larger than some value x (h(i) > x) to leave
to Vasya the chores with complexity less than or equal to x (h(i) ≤ x). The brothers have already decided that
Petya will do exactly a chores and Vasya will do exactly b chores (a + b = n).

In how many ways can they choose an integer x so that Petya got exactly a chores and Vasya got exactly b chores?

Input
The first input line contains three integers n, a and b (2 ≤ n ≤ 2000; a, b ≥ 1; a + b = n)
— the total number of chores, the number of Petya's chores and the number of Vasya's chores.

The next line contains a sequence of integers h1, h2, ..., h(n) (1 ≤ h(i) ≤ 109), hi is the complexity of
the i-th chore. The numbers in the given sequence are not necessarily different.

All numbers on the lines are separated by single spaces.

Output
Print the required number of ways to choose an integer value of x. If there are no such ways, print 0.

Input:
5 2 3
6 2 3 100 1

Output:
3
*/

import java.util.Arrays;
import java.util.Scanner;

public class Chores{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int chores = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();
        int[] arr = new int[chores];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        int upper = arr[chores - a];
        chores = chores - a;
        int lower = 0;
        if(chores > b){
            lower = arr[chores - b];
        }else{
            lower = arr[chores - 1];
        }
       

        int answer = Math.abs(upper - lower);
        System.out.println(answer);
        input.close();
    }
}