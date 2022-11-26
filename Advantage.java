/**
 *
 *There are n participants in a competition, participant i having a strength of si.

Every participant wonders how much of an advantage they have over the other best participant.
In other words, each participant i wants to know the difference between si and sj, where j is the strongest participant
in the competition, not counting i (a difference can be negative).

So, they ask you for your help! For each i (1 ≤ i ≤ n) output the difference between si and the maximum strength of any participant other than participant i.

Input
The input consists of multiple test cases. The first line contains an integer t (1 ≤ t ≤ 1000) — the number of test cases.
The descriptions of the test cases follow.

The first line of each test case contains an integer n (2 ≤ n ≤ 2⋅10^5) — the length of the array.

The following line contains n space-separated positive integers s1, s2, ..., sn (1 ≤ si ≤ 10^9) — the strengths of the participants.

It is guaranteed that the sum of n over all test cases does not exceed 2⋅10^5.

Output
For each test case, output n space-separated integers. For each i (1 ≤ i ≤ n) output the difference between si and the maximum strength of any other participant.

Input:
5
4
4 7 3 5
2
1 2
5
1 2 3 4 5
3
4 9 4
4
4 4 4 4

Output:
-3 2 -4 -2 
-1 1 
-4 -3 -2 -1 1 
-5 5 -5 
0 0 0 0 

*/

import java.util.Scanner;

public class Advantage {
    static void merge(int array[], int lower, int middle, int upper) 
    { 
        int i, j, k; 
        int left[]=new int[middle-lower+1];//creating sub-array to store elements in the left portion of 'array[]'
        int right[]=new int[upper-middle];//creating sub-array to store elements in the right portion of 'array[]'
        for (i = 0; i < middle-lower+1; i++)//copying appropriate elements from array[] to left[]
        left[i] = array[lower + i];
        for (j = 0; j < upper-middle; j++)//copying appropriate elements from array[] to right[] 
            right[j] = array[middle + 1 + j];
        i = 0; // initial index of sub-array left[] 
        j = 0; // initial index of sub-array right[]
        k = lower; //initial index of merged array 
        for (k=lower;i < middle-lower+1 && j < upper-middle;k++) 
        {//THIS CONDITION SORTS IN ASCENDING ORDER 
            if (left[i] <= right[j]) array[k] = left[i++];//storing value of left[i] in array[k] if the former is smaller
            else array[k] = right[j++];//storing value of right[j] in array[j] if the former is smaller
        }
        while (i < middle-lower+1) array[k++] = left[i++];//copying back the remaining elements of left[] to array[]
        while (j < upper-middle) array[k++] = right[j++];//copying back the remaining elements of right[] to array[]
    }
    static void mergeSort(int array[],int lower,int upper)
    {
        if(lower>=upper)return;//signifies that array contains only one element
        mergeSort(array,lower,(lower+upper)/2);//sorting the left portion of the array
        mergeSort(array,((lower+upper)/2)+1,upper);//sorting the right portion of the array
        merge(array,lower,(lower+upper)/2,upper);//merging the two portions once sorting is done
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antal = input.nextInt();
        while(antal-- > 0)
        {
            int sze = input.nextInt();
            int[] arr = new int[sze];
            int[] cpyArr = new int[sze];
            for (int i = 0; i < arr.length; i++) {
                int temp = input.nextInt();
                arr[i] = temp;
                cpyArr[i] = temp;
            }

            mergeSort(cpyArr, 0, sze - 1);
            int biggest = cpyArr[sze - 1];
            int secondBiggest = cpyArr[sze - 2];
            for (int i = 0; i < arr.length; i++) {
                int diff = 0;
                if(biggest == arr[i])
                {
                    diff = arr[i] - secondBiggest;
                }
                else
                {
                    diff = arr[i] - biggest;
                }
                System.out.print(diff + " ");
            }
            System.out.println("");
        }
        input.close();
    }
}
