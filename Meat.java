/*
* ---------------- 588 A Duff and Meat --------------------
Duff is addicted to meat! Malek wants to keep her happy for n days.
In order to be happy in i-th day, she needs to eat exactly ai kilograms of meat.

There is a big shop uptown and Malek wants to buy meat for her from there.
In i-th day, they sell meat for pi dollars per kilogram. Malek knows all numbers a1, ..., an and p1, ..., pn.
In each day, he can buy arbitrary amount of meat, also he can keep some meat he has for the future.

Malek is a little tired from cooking meat, so he asked for your help. Help him to minimize the total money he spends to keep Duff happy for n days.

Input
The first line of input contains integer n (1 ≤ n ≤ 10(5)), the number of days.

In the next n lines, i-th line contains two integers ai and pi (1 ≤ a(i), p(i) ≤ 100), the amount of meat Duff needs and the cost of meat in that day.

Output
Print the minimum money needed to keep Duff happy for n days, in one line.

Input:
3
1 3
2 2
3 1

Output:
10

Input:
3
1 3
2 1
3 2

Output:
8
*/
import java.util.Scanner;

public class Meat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sze = input.nextInt();
        int[] kg = new int[sze];
        int[] prices = new int[sze];
        for (int i = 0; i < sze; i++) {
            kg[i] = input.nextInt();
            prices[i] = input.nextInt();
        }
        
        int index = 0;
        int answer = 0;
        while(index < sze){
            int tempKg = kg[index];
            int tempPrice = prices[index];
            for (int i = index + 1; i < sze; i++) {
                int tmwPrice = prices[i];
                if(tempPrice >= tmwPrice){
                    break;
                }else{
                    tempKg += kg[i];
                    index = i;
                }
            }
            answer += tempKg * tempPrice;
            index++;
        }
        System.out.println(answer);
        input.close();
    }   
}
