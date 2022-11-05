/*
* -------------------- 669A Little Artam and Presents ---------------------
Little Artem got n stones on his birthday and now wants to give some of them to Masha.
He knows that Masha cares more about the fact of receiving the present, rather than
the value of that present, so he wants to give her stones as many times as possible.
However, Masha remembers the last present she received, so Artem can't give her the same
number of stones twice in a row. For example, he can give her 3 stones, then 1 stone, then again 3 stones,
but he can't give her 3 stones and then again 3 stones right after that.

How many times can Artem give presents to Masha?

Input
The only line of the input contains a single integer n (1 ≤ n ≤ 10^9) — number of stones Artem received on his birthday.

Output
Print the maximum possible number of times Artem can give presents to Masha.

Input:
4

Output:
3

*/

import java.util.Scanner;

public class Artem{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long num = input.nextLong();
        if(num < 3)
            System.out.println(1);
        else
        {
            long threes = num / 3;
            long threesTwo = threes * 2;
            long rest = num - (threes * 3); 
            long answer = 0;
            if(rest > 0)
            {
                answer = threesTwo + 1;
            }
            else
            {
                answer = threesTwo;
            }
            
            System.out.println(answer);
        }
        input.close();
    }
}