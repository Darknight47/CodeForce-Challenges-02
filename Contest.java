/*
* ----------- 501A Contest -----------
Misha and Vasya participated in a Codeforces contest.
Unfortunately, each of them solved only one problem, though successfully submitted it at the first attempt.
Misha solved the problem that costs a points and Vasya solved the problem that costs b points.
Besides, Misha submitted the problem c minutes after the contest started and
Vasya submitted the problem d minutes after the contest started.
As you know, on Codeforces the cost of a problem reduces as a round continues.
That is, if you submit a problem that costs p points t minutes after the contest started, you get Max(3p/10, p - p/250 * t)  points.

Misha and Vasya are having an argument trying to find out who got more points. Help them to find out the truth.

Input
The first line contains four integers a, b, c, d (250 ≤ a, b ≤ 3500, 0 ≤ c, d ≤ 180).

It is guaranteed that numbers a and b are divisible by 250 (just like on any real Codeforces round).

Output
Output on a single line:

"Misha" (without the quotes), if Misha got more points than Vasya.

"Vasya" (without the quotes), if Vasya got more points than Misha.

"Tie" (without the quotes), if both of them got the same number of points.

Input:
500 1000 20 30

Output:
Vasya

*/

import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int c = input.nextInt();
        int d = input.nextInt();

        int misha1 = Math.abs((3 * a) / 10);
        int misha2 = Math.abs(((a * c) / 250) - a);
        int misha = Math.max(misha1, misha2);
        int vasya1 = Math.abs((3 * b) / 10);
        int vasya2 = Math.abs(((b * d) / 250) - b);
        int vasya = Math.max(vasya1, vasya2);

        if(misha > vasya){
            System.out.println("Misha");
        }else if(misha == vasya){
            System.out.println("Tie");
        }else{
            System.out.println("Vasya");
        }
        input.close();
    }
}
