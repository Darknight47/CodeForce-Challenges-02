/*
* ----------------------------- 386A Second-Price Auction ----------------------------------
In this problem we consider a special type of an auction, which is called the second-price auction.
As in regular auction n bidders place a bid which is price a bidder ready to pay.
The auction is closed, that is, each bidder secretly informs the organizer of the auction price he
is willing to pay. After that, the auction winner is the participant who offered the highest price.
However, he pay not the price he offers, but the highest price among the offers of other
participants (hence the name: the second-price auction).

Write a program that reads prices offered by bidders and finds the winner and the price he will pay.
Consider that all of the offered prices are different.

Input
The first line of the input contains n (2 ≤ n ≤ 1000) — number of bidders.
The second line contains n distinct integer numbers p1, p2, ... pn, separated by single spaces (1 ≤ p(i) ≤ 10000),
where p(i) stands for the price offered by the i-th bidder.

Output
The single output line should contain two integers: index of the winner and the price he will pay. Indices are 1-based.

Input:
2
5 7

Output:
2 5
*/ 
import java.util.Scanner;
import java.util.Arrays;

public class Auction
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sze = input.nextInt();
        int biggest = 0;
        int biggestIndex = 0;
        //int secondLargest = -1;
        int[] arr = new int[sze];
        for (int i = 0; i < sze; i++) {
            int temp = input.nextInt();
            if(temp > biggest)
            {
                biggest = temp;
                biggestIndex = i;
                //secondLargest = biggest;
            }
            arr[i] = temp;
        }
        Arrays.sort(arr);
        System.out.println((biggestIndex + 1) + " " + arr[sze - 2]);
        input.close();
    }
}