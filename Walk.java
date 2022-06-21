/*
* --------------- 1697A  A.Parkway Walk -------------------
You are walking through a parkway near your house. The parkway has n+1 benches in a row numbered from 1 to n+1 from left to right.
The distance between the bench i and i+1 is ai meters.

Initially, you have m units of energy. To walk 1 meter of distance, you spend 1 unit of your energy.
You can't walk if you have no energy. Also, you can restore your energy by sitting on benches
(and this is the only way to restore the energy). When you are sitting, you can restore any integer amount 
of energy you want (if you sit longer, you restore more energy). Note that the amount of your energy can exceed m.

Your task is to find the minimum amount of energy you have to restore
(by sitting on benches) to reach the bench n+1 from the bench 1 (and end your walk).

You have to answer t independent test cases.

Input
The first line of the input contains one integer t (1≤t≤100) — the number of test cases.
Then t test cases follow.

The first line of the test case contains two integers n and m (1≤n≤100; 1≤m≤104).

The second line of the test case contains n integers a1,a2,…,an (1≤ai≤100),
where ai is the distance between benches i and i+1.

Output
For each test case, print one integer — the minimum amount of energy you have to restore (by sitting on benches)
to reach the bench n+1 from the bench 1 (and end your walk) in the corresponding test case.

Input:
3
3 1
1 2 1
4 5
3 3 5 2
5 16
1 2 3 4 5

Output:
3
8
0

*/

import java.util.Scanner;

public class Walk{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antal = input.nextInt();
        while(antal-- > 0){
            int n = input.nextInt();
            int m = input.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = input.nextInt();
            }
            int answer = 0;
            for (int i = 0; i < arr.length; i++) {
                int requiredEnergi = arr[i];
                m = m - requiredEnergi;
                if(m < 0){
                    m = m * -1;
                    answer += m;
                    m = 0;
                }

            }
            System.out.println(answer);
        }
        input.close();
    }
}