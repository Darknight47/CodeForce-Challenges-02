/*
* ---------- Prime Minister 1178 A -----------

Alice is the leader of the State Refactoring Party, and she is about to become the prime minister.

The elections have just taken place. There are n parties, numbered from 1 to n. The i-th party has received ai seats in the parliament.

Alice's party has number 1. In order to become the prime minister, she needs to build a coalition, consisting of her party and possibly some other parties. There are two conditions she needs to fulfil:

* The total number of seats of all parties in the coalition must be a strict majority of all the seats, i.e. it must have strictly more than half of the seats.
For example, if the parliament has 200 (or 201) seats, then the majority is 101 or more seats.
* Alice's party must have at least 2 times more seats than any other party in the coalition. For example, to invite a party with 50 seats, Alice's party must have at least 100 seats. 

For example, if n=4 and a=[51,25,99,25] (note that Alice'a party has 51 seats),
then the following set [a1=51,a2=25,a4=25] can create a coalition since both conditions will be satisfied. However, the following sets will not create a coalition:

Alice does not have to minimise the number of parties in a coalition. If she wants, she can invite as many parties as she wants (as long as the conditions are satisfied).
If Alice's party has enough people to create a coalition on her own, she can invite no parties.

Note that Alice can either invite a party as a whole or not at all. It is not possible to invite only some of the deputies (seats) from another party. In other words, if Alice invites a party, she invites all its deputies.

Find and print any suitable coalition.

Input
The first line contains a single integer n (2≤n≤100) — the number of parties.

The second line contains n space separated integers a1,a2,…,an (1≤ai≤100) — the number of seats the i-th party has.

Output
If no coalition satisfying both conditions is possible, output a single line with an integer 0.

Otherwise, suppose there are k (1≤k≤n) parties in the coalition (Alice does not have to minimise the number of parties in a coalition), and their indices are c1,c2,…,ck (1≤ci≤n).
Output two lines, first containing the integer k, and the second the space-separated indices c1,c2,…,ck.

You may print the parties in any order. Alice's party (number 1) must be on that list. If there are multiple solutions, you may print any of them.

Input:
3
100 50 50

Output:
2
1 2

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minister {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sze = input.nextInt();
        int[] arr = new int[sze];
        int totalSeats = 0;
        for (int i = 0; i < arr.length; i++) {
            int tmp =  input.nextInt();
            totalSeats += tmp;
            arr[i] = tmp;
        }
        int majority = totalSeats / 2;
        int alice = arr[0];
        int alicePlusParties = alice;
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i] * 2;
            if(alice >= temp)
            {
                alicePlusParties += arr[i];
                answer.add(i);
                if(alicePlusParties > majority)
                {
                    break;
                }
            }
        }
        if((answer.size() == 0 && alice <= majority) || alicePlusParties <= majority)
            System.out.println(0);
        else{
            System.out.println(answer.size() == 0 ? 1 : answer.size() + 1);
            System.out.print(1 + " ");
            for (int i = 0; i < answer.size(); i++) {
                System.out.print(answer.get(i) + 1 + " ");
            }   
        }
        

        input.close();
    }
}
