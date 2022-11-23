/**
 * ------------------------------ 1056A Determine Line ---------------------------------
Arkady's morning seemed to be straight of his nightmare. He overslept through the whole morning and,
still half-asleep, got into the tram that arrived the first. Some time after, leaving the tram,
he realized that he was not sure about the line number of the tram he was in.

During his ride, Arkady woke up several times and each time he saw the tram stopping at some stop.
For each stop he knows which lines of tram stop there. Given this information, can you help Arkady
determine what are the possible lines of the tram he was in?

Input
The first line contains a single integer n (2 ≤ n ≤ 100) — the number of stops Arkady saw.

The next n lines describe the stops. Each of them starts with a single integer r (1 ≤ r ≤ 100) — the number of tram
lines that stop there. (r) distinct integers follow, each one between 1 and 100, inclusive,
— the line numbers. They can be in arbitrary order.

It is guaranteed that Arkady's information is consistent, i.e. there is at least one tram line that Arkady could take.

Output
Print all tram lines that Arkady could be in, in arbitrary order. 

Input:
3
3 1 4 6
2 1 4
5 10 5 6 4 1

Output:
1 4
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Line{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leng = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < leng; i++){
            int temp = input.nextInt();       
            while(temp > 0){
                arr.add(input.nextInt());
                temp--;
            }
        }
        Set<Integer> lst = new HashSet<>();
        for(int w = 0; w < arr.size(); w++){
            int temp = arr.get(w);
            int nums = 0;
            for(int j = 0; j < arr.size(); j++){
                if(arr.get(j) == temp){
                    nums++;
                }
            }
            if(nums == leng){
                lst.add(temp);
            }
        }
        for (Integer integer : lst) {
            System.out.print(integer + " ");
        }
 
        input.close();
    }
}