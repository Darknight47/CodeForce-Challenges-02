/**
Oleg the bank client loves money (who doesn't), and decides to take advantage of this failed robbery and steal
some money from the safes. There are many safes arranged in a line, where the i-th safe from
the left is called safe i. There are n banknotes left in all the safes in total.
The i-th banknote is in safe xi. Oleg is now at safe a.
There are two security guards, one of which guards the safe b such that b < a, i.e.
the first guard is to the left of Oleg. The other guard guards the safe c so that c > a,
i.e. he is to the right of Oleg.

The two guards are very lazy, so they do not move.
In every second, Oleg can either take all the banknotes from the current safe
or move to any of the neighboring safes. However, he cannot visit any safe that is guarded by security guards at any time, becaues he might be charged for stealing. Determine the maximum amount of banknotes Oleg can gather.

Input
The first line of input contains three space-separated integers, a, b and c (1 ≤ b < a < c ≤ 109), denoting the positions of Oleg, the first security guard and the second security guard, respectively.

The next line of input contains a single integer n (1 ≤ n ≤ 105), denoting the number of banknotes.

The next line of input contains n space-separated integers x1, x2, ..., xn (1 ≤ xi ≤ 109), denoting that the i-th banknote is located in the xi-th safe. Note that xi are not guaranteed to be distinct.

Output
Output a single integer: the maximum number of banknotes Oleg can take

Input:
5 3 7
8
4 7 5 5 3 6 2 8

Output:
4

*/
import java.util.Scanner;

public class Robbery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pos = input.nextInt();
        int guardOne = input.nextInt();
        int guardTwo = input.nextInt();
        int sze = input.nextInt();
        int answer = 0;
        for (int i = 0; i < sze; i++) {
            int num = input.nextInt();
            if(num < guardTwo && num > guardOne){
                answer++;
            }
        }
        System.out.println(answer);
        input.close();
    }
}
