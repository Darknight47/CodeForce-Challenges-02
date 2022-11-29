/*
* --------------------------- 276A Lunch Rush --------------------------
Having written another programming contest, three Rabbits decided to grab some lunch.
The coach gave the team exactly k time units for the lunch break.

The Rabbits have a list of n restaurants to lunch in: the i-th restaurant is characterized by two integers f(i) and t(i).
Value t(i) shows the time the Rabbits need to lunch in the i-th restaurant. If time ti exceeds the time k that the coach
has given for the lunch break, then the Rabbits' joy from lunching in this restaurant will equal f(i) - (t(i) - k). Otherwise, the Rabbits get exactly f(i) units of joy.

Your task is to find the value of the maximum joy the Rabbits can get from the lunch, depending on the restaurant.
The Rabbits must choose exactly one restaurant to lunch in. Note that the joy value isn't necessarily a positive value.

Input
The first line contains two space-separated integers — n (1 ≤ n ≤ 104) and k (1 ≤ k ≤ 109) — the number of restaurants in the Rabbits' list and the time the coach
has given them to lunch, correspondingly. Each of the next n lines contains two space-separated integers — f(i) (1 ≤ f(i) ≤ 109) and ti (1 ≤ t(i) ≤ 109) — the characteristics of the i-th restaurant.

Output
In a single line print a single integer — the maximum joy value that the Rabbits will get from the lunch.

*/
import java.util.Scanner;

public class Rush
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int restaurants = input.nextInt();
        int k = input.nextInt();
        long maximumJoy = Long.MIN_VALUE;
        while(restaurants-- > 0)
        {
            long f = input.nextLong();
            long t = input.nextLong();
            long temp = 0;
            if(t > k)
            {
                temp = f - (t - k);
            }
            else
            {
                temp = f;
            }

            if(temp > maximumJoy)
            {
                maximumJoy = temp;
            }
        }
        System.out.println(maximumJoy);
        input.close();
    }
}