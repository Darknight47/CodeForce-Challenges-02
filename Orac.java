/*
 ----------------- 1350A ---------------------
Orac is studying number theory, and he is interested in the properties of divisors.

For two positive integers a and b, a is a divisor of b if and only if there exists an integer c, such that a⋅c=b.

For n≥2, we will denote as f(n) the smallest positive divisor of n, except 1.

For example, f(7)=7,f(10)=2,f(35)=5.

For the fixed integer n, Orac decided to add f(n) to n.

For example, if he had an integer n=5, the new value of n will be equal to 10. And if he had an integer n=6, n will be changed to 8.

Orac loved it so much, so he decided to repeat this operation several times.

Now, for two positive integers n and k, Orac asked you to add f(n) to n exactly k times (note that n will change after each operation, so f(n) may change too) and tell him the final value of n.

For example, if Orac gives you n=5 and k=2, at first you should add f(5)=5 to n=5, so your new value of n will be equal to n=10, after that, you should add f(10)=2 to 10, so your new (and the final!) value of n will be equal to 12.

Orac may ask you these queries many times.

Input
The first line of the input is a single integer t (1≤t≤100): the number of times that Orac will ask you.

Each of the next t lines contains two positive integers n,k (2 ≤ n ≤ 10^6,1 ≤ k ≤ 10^9), corresponding to a query by Orac.

It is guaranteed that the total sum of n is at most 106.

Output
Print t lines, the i-th of them should contain the final value of n in the i-th query by Orac.

Input:
3
5 1
8 2
3 4

Output:
10
12
12

*/

import java.util.Scanner;

public class Orac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antal = input.nextInt();
        while(antal-- > 0)
        {
            int n = input.nextInt();
            int k = input.nextInt();
            int answer = 0;
            if(n % 2 == 0)
            {
                answer = n + 2 * k;
            }
            else
            {
                int smallest = 0;
                int sq = (int) Math.sqrt(n);
                int j = 2;
                while(j <= sq)
                {
                    if(n % j == 0)
                    {
                        smallest = j;
                        break;
                    }
                    j++;
                }
                if(j > sq)
                {
                    smallest = n;
                }
                answer = n + 2*(k - 1) + smallest;
            }
            System.out.println(answer);
        }
        input.close();
    }
}
