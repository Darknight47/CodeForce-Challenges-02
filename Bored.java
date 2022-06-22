/*
* ------------ 822 A Bored with life ---------------
Leha came up with a task for himself to relax a little.
He chooses two integers A and B and then calculates the greatest common divisor of integers "A factorial" and "B factorial".
Formally the hacker wants to find out GCD(A!, B!). It's well known that the factorial of an integer x
is a product of all positive integers less than or equal to x. Thus x! = 1·2·3·...·(x - 1)·x.
For example 4! = 1·2·3·4 = 24. Recall that GCD(x, y) is the largest positive integer q
that divides (without a remainder) both x and y.

Leha has learned how to solve this task very effective. You are able to cope with it not worse, aren't you?

Input
The first and single line contains two integers A and B (1 ≤ A, B ≤ 109, min(A, B) ≤ 12).

Output
Print a single integer denoting the greatest common divisor of integers A! and B!. 

Input:
4 3

Output:
6
*/

import java.util.Scanner;

public class Bored {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int afact = 1;
        int bfact = 1;
        for (int i = 1; i <= a; i++) {
            afact *= i;
        }

        for (int i = 1; i <= b; i++) {
            bfact *= i;
        }
        int answer = 0;
        if(afact > bfact){
            answer = gcdByEuclidsAlgorithm(afact, bfact);
        }else{
            answer = gcdByEuclidsAlgorithm(bfact, afact);
        }
        System.out.println(answer);
        input.close();
    }
    static int gcdByEuclidsAlgorithm(int n1, int n2) {
        //Subtracting the smaller one from the bigger one which doesn't change the gcd.
        //Using Modulo instead of subtracting, means many subtraction at a time.
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
