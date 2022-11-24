/**
A triangular number is the number of dots in an equilateral triangle uniformly filled with dots.
For example, three dots can be arranged in a triangle; thus three is a triangular number.
The n-th triangular number is the number of dots in a triangle with n dots on a side.
You can learn more about these numbers from Wikipedia (http://en.wikipedia.org/wiki/Triangular_number).

Your task is to find out if a given integer is a triangular number.

Input
The first line contains the single number n (1 ≤ n ≤ 500) — the given integer.

Output
If the given integer is a triangular number output YES, otherwise output NO.
 
Input:
1
Output:
YES

Input:
2
Output:
NO
*/

import java.util.Scanner;

public class Triangular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int startIndex = 0;
        int steps = 0;
        while(startIndex < number)
        {
            steps++;
            startIndex += steps;
            if(startIndex > number)
                break;
        }
        if(startIndex == number)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }

        input.close();
    }   
}
