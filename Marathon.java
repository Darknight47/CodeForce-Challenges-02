
/**
You are given four distinct integers a, b, c, d.

Timur and three other people are running a marathon. The value a is the distance that
Timur has run and b, c, d correspond to the distances the other three participants ran.

Output the number of participants in front of Timur.

Input
The first line contains a single integer t (1≤t≤10(4)) — the number of test cases.

The description of each test case consists of four distinct integers a, b, c, d (0≤a,b,c,d≤104).

Output
For each test case, output a single integer — the number of participants in front of Timur.

Input:
4
2 3 4 1
10000 0 1 2
500 600 400 300
0 9999 10000 9998

Output:
2
0
1
3

*/
import java.util.Scanner;

public class Marathon{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antal = input.nextInt();
        while(antal-- > 0){
            int a = input.nextInt();
            int answer = 0;
            for (int i = 0; i < 3; i++) {
                int temp = input.nextInt();
                if(temp > a){
                    answer++;
                }
            }
            System.out.println(answer);
        }
        input.close();
    }
}