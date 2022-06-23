/*
* ------------------- 746B Decoding ---------------
Polycarp is mad about coding, that is why he writes Sveta encoded messages.
He calls the median letter in a word the letter which is in the middle of the word.
If the word's length is even, the median letter is the left of the two middle letters.
In the following examples, the median letter is highlighted: contest, info.
If the word consists of single letter, then according to above definition this letter is the median letter.

Polycarp encodes each word in the following way:
he writes down the median letter of the word, then deletes it and repeats the process until there are no letters left.
For example, he encodes the word volga as logva.

You are given an encoding s of some word, your task is to decode it.

Input
The first line contains a positive integer n (1 ≤ n ≤ 2000) — the length of the encoded word.

The second line contains the string s of length n consisting of lowercase English letters — the encoding.

Output
Print the word that Polycarp encoded.

Input:
5
logva

Output:
volga

Input:
2
no

Output:
no
*/

import java.util.Scanner;

public class Decoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sze = input.nextInt();
        String str = input.next();
        char[] arr = new char[sze];
        char[] sarr = str.toCharArray();
        int middle = -1;
        if(sze % 2 == 1){
            middle = sze / 2;
        }else{
            middle = (sze / 2) - 1;
        }
        arr[middle] = sarr[0];
        int index = 1;
        int left = middle - 1;
        int right = middle + 1;
        if(sze % 2 == 0){
            while(index < sze){
                char c = sarr[index];
                if(index % 2 == 1){
                    arr[right] = c;
                    right++;
                }else{
                    arr[left] = c;
                    left--;
                }
                index++;
            }
        }
        else{
            while(index < sze){
                char c = sarr[index];
                if(index % 2 == 1){
                    arr[left] = c;
                    left--;
                }else{
                    arr[right] = c;
                    right++;
                }
                index++;
            }
        }
        System.out.println(String.valueOf(arr));
        input.close();
    }
}
