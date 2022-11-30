/*
The girl lives in house m of a village. There are n houses in that village, lining in a straight line from left to right:
house 1, house 2, ..., house n. The village is also well-structured: house i and house i + 1 (1 ≤ i < n) are exactly 10 meters away.
In this village, some houses are occupied, and some are not. Indeed, unoccupied houses can be purchased.

You will be given n integers a1, a2, ..., an that denote the availability and the prices of the houses.
If house i is occupied, and therefore cannot be bought, then ai equals 0. Otherwise, house i can be bought,
and a(i) represents the money required to buy it, in dollars.

As Zane has only k dollars to spare, it becomes a challenge for him to choose the house to purchase, so that he could
live as near as possible to his crush. Help Zane determine the minimum distance from his crush's house to some house
he can afford, to help him succeed in his love.

Input
The first line contains three integers n, m, and k (2 ≤ n ≤ 100, 1 ≤ m ≤ n, 1 ≤ k ≤ 100) — the number of houses in the village, the house where the girl lives, and the amount of money Zane has (in dollars), respectively.

The second line contains n integers a1, a2, ..., an (0 ≤ ai ≤ 100) — denoting the availability and the prices of the houses.

It is guaranteed that am = 0 and that it is possible to purchase some house with no more than k dollars.

Output
Print one integer — the minimum distance, in meters, from the house where the girl Zane likes lives to the house Zane can buy.

Input:
5 1 20
0 27 32 21 19

Output:
40

*/
import java.util.Scanner;

public class House {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int houses = input.nextInt();
        int girlsHouse = input.nextInt();
        int money = input.nextInt();
        int[] arr = new int[houses];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int right = 0;
        int left = 0;
        boolean boughtRight = false;
        boolean boughtLeft = false;
        for (int i = girlsHouse; i < arr.length; i++) {
            int temp = arr[i];
            right++;
            if(money >= temp && temp != 0)
            {
                boughtRight = true;
                break;
            }
        }
        for (int i = girlsHouse - 2; i > 0; i--) {
            int temp = arr[i];
            left++;
            if(money >= temp && temp != 0)
            {
                boughtLeft = true;
                break;
            } 
        }
        if(!boughtRight)
            right = 0;    
        if(!boughtLeft)
            left = 0;
        right = right * 10;
        left = left * 10;

        if(left == 0 && right > 0)
            System.out.println(right);
        else if(right == 0 && left > 0)
            System.out.println(left);
        else if(right > left && left != 0)
            System.out.println(left);
        else if(left > right && right != 0)
            System.out.println(right);

        input.close();
    }
}
