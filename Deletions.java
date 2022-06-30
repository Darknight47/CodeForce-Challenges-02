/*
* -------------- 1144 B Parity Alternated Deletions ---------------------

Polycarp has an array a consisting of n integers.

He wants to play a game with this array. The game consists of several moves.
On the first move he chooses any element and deletes it (after the first move the array contains n−1 elements).
For each of the next moves he chooses any element with the only restriction:
its parity should differ from the parity of the element deleted on the previous move.
In other words, he alternates parities (even-odd-even-odd-... or odd-even-odd-even-...) of the removed elements.
Polycarp stops if he can't make a move. 
Formally:

    * If it is the first move, he chooses any element and deletes it;
    * If it is the second or any next move:
        * if the last deleted element was odd, Polycarp chooses any even element and deletes it;
        * if the last deleted element was even, Polycarp chooses any odd element and deletes it.
    * If after some move Polycarp cannot make a move, the game ends.

Polycarp's goal is to minimize the sum of non-deleted elements of the array after end of the game.
If Polycarp can delete the whole array, then the sum of non-deleted elements is zero.

Help Polycarp find this value.

Input
The first line of the input contains one integer n (1 ≤ n ≤ 2000) — the number of elements of a.

The second line of the input contains n integers a1,a2,…,an (0 ≤ a(i)≤ 10(6)), where a(i) is the i-th element of a.

Output
Print one integer — the minimum possible sum of non-deleted elements of the array after end of the game.

Input:
5
1 5 7 8 2

Output:
0

Input:
2
1000000 1000000

Output:
1000000 

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Deletions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sze = input.nextInt();
        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        for (int i = 0; i < sze; i++) {
            int temp = input.nextInt();
            if(temp % 2 == 0){
                evens.add(temp);
            }else{
                odds.add(temp);
            }
        }
        Collections.sort(odds);
        Collections.sort(evens);
        int biggest = 0;
        int lowerBound = 0;
        boolean odd = false;
        if(odds.size() > evens.size()){
            biggest = odds.size();
            lowerBound = evens.size();
            odd = true;
        }else{
            biggest = evens.size();
            lowerBound = odds.size();
        }
        if(biggest == 0){
            System.out.println(0);
        }else{
            int sum = 0;
            int diff = (biggest - lowerBound) - 1;
            if(odd){
                for (int i = 0; i < diff; i++) {
                    sum += odds.get(i);
                }
            }else{
                for (int i = 0; i < diff; i++) {
                    sum += evens.get(i);
                }
            }
            System.out.println(sum);
        }
        input.close();
    }
}
