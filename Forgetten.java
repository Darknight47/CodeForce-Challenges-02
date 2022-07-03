/*
* ------------------------- 1225 A Forgetting Things ----------------------------
Kolya is very absent-minded. Today his math teacher asked him to solve a simple problem with
the equation a+1=b with positive integers a and b, but Kolya forgot the numbers a and b.
He does, however, remember that the first (leftmost) digit of a was d(a), and the first (leftmost) digit of b was d(b).

Can you reconstruct any equation a+1=b that satisfies this property?
It may be possible that Kolya misremembers the digits, and there is no suitable equation, in which case report so.

Input
The only line contains two space-separated digits d(a) and d(b) (1 ≤ d(a) , d(b) ≤ 9).

Output
If there is no equation a+1=b with positive integers a and b such that the first digit of a is d(a), and the first digit of b is db, print a single number −1.

Otherwise, print any suitable a and b that both are positive and do not exceed 10^9. It is guaranteed that if a solution exists,
there also exists a solution with both numbers not exceeding 10^9. 

Input:
1 2

Output:
199 200

Input:
5 7 

Output: 
-1

*/

import java.util.Scanner;

public class Forgetten {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        if(a == b){
            b = b * 100 + 10;
            System.out.println(b - 1 + " " + b);
        }else if((a + 1) == b){
            System.out.println(a + " " + b);
        }else if(a == 9 && b == 1){
            System.out.println(a + " " + b * 10);
        }else{
            System.out.println(-1);
        }

       
        input.close();
    }
}
