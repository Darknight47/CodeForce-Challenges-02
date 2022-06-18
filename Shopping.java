/**
Today Patrick waits for a visit from his friend Spongebob.
To prepare for the visit, Patrick needs to buy some goodies in two stores located
near his house. There is a d1 meter long road between his house and the first
shop and a d2 meter long road between his house and the second shop.
Also, there is a road of length d3 directly connecting these two shops to each other.
Help Patrick calculate the minimum distance that he needs to walk in order to go to
both shops and return to his house.

Today Patrick waits for a visit from his friend Spongebob.
To prepare for the visit, Patrick needs to buy some goodies in
two stores located near his house. There is a d1 meter long road
between his house and the first shop and a d2 meter long road between
his house and the second shop. Also, there is a road of length d3 directly
connecting these two shops to each other. Help Patrick calculate the minimum
distance that he needs to walk in order to go to both shops and return to his house.

Input
The first line of the input contains three integers d1, d2, d3 (1 ≤ d1, d2, d3 ≤ 108) — the lengths of the paths.

d1 is the length of the path connecting Patrick's house and the first shop;
d2 is the length of the path connecting Patrick's house and the second shop;
d3 is the length of the path connecting both shops.
Output
Print the minimum distance that Patrick will have to walk in order to visit both shops and return to his house.

Input:
10 20 30

Output:
60

*/



import java.util.Arrays;
import java.util.Scanner;

public class Shopping{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d1 = input.nextInt();
        int d2 = input.nextInt();
        int d3 = input.nextInt();

        int basic = (d1*2) + (d2*2);
        int circle = d1 + d3 + d2;
        int long1 = (d1 * 2)+ (d3 * 2);
        int long2 = (d2 * 2) + (d3 * 2);
        
        int[] arr = {basic, circle, long1, long2};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        
        input.close();
    }
}