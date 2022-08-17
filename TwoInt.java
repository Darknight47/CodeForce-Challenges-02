/**
You are given two integers a and b.

In one move, you can choose some integer k from 1 to 10 and add it to a or subtract it from a. In other words, you choose an integer k∈[1;10] and perform a:=a+k or a:=a−k.
You may use different values of k in different moves.

Your task is to find the minimum number of moves required to obtain b from a.

You have to answer t independent test cases.

Input
The first line of the input contains one integer t (1 ≤ t ≤ 2⋅10^4) — the number of test cases. Then t test cases follow.

The only line of the test case contains two integers a and b (1 ≤ a,b ≤ 10^9).

Output
For each test case, print the answer: the minimum number of moves required to obtain b from a.

Input:
6
5 5
13 42
18 4
1337 420
123456789 1000000000
100500 9000

Output:
0
3
2
92
87654322
9150


*/
import java.util.Scanner;

public class TwoInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antal = input.nextInt();
        while(antal-- > 0)
        {
            int a = input.nextInt();
            int b = input.nextInt();
            int diff = 0;
            int answer = 0;
            if(a == b)
            {
                System.out.println(0);
            }
            else 
            {
                diff = Math.abs(a - b);
                int lastDigit = diff % 10;
                if(lastDigit != 0)
                {
                    answer++;
                }
                answer += (diff - lastDigit) / 10;
                System.out.println(answer);
            }
        }
        input.close();
    }
}
