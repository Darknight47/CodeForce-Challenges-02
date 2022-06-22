/*
* ------------ 1551 B1 Wonderful Coloring --------------------- 
This is a simplified version of the problem B2. Perhaps you should read the problem B2 before you start solving B1.

Paul and Mary have a favorite string s which consists of lowercase letters of the Latin alphabet.
They want to paint it using pieces of chalk of two colors: red and green. Let's call a coloring
of a string wonderful if the following conditions are met:

1. each letter of the string is either painted in exactly one color (red or green) or isn't painted;
2. each two letters which are painted in the same color are different;
3. the number of letters painted in red is equal to the number of letters painted in green;
4. the number of painted letters of this coloring is maximum among all colorings of the string which meet the first three conditions.

Paul and Mary want to learn by themselves how to find a wonderful coloring of the string. But they are very young, so they need a hint.
Help them find k — the number of red (or green, these numbers are equal) letters in a wonderful coloring.

Input
The first line contains one integer t (1≤t≤1000) — the number of test cases. Then t test cases follow.

Each test case consists of one non-empty string s which consists of lowercase letters of the Latin alphabet. The number of characters in the string doesn't exceed 50.

Output
For each test case, output a separate line containing one non-negative integer k — the number of letters which will be painted in red in a wonderful coloring.

Input:
5
kzaaa
codeforces
archive
y
xxxxxx

Output:
2
5
3
0
1
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Wonderful {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int antal = input.nextInt();
        while(antal-- > 0){
            String str = input.next();
            char[] arr = str.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                char temp = arr[i];
                int existedOrDefault = map.getOrDefault(temp, 0);
                existedOrDefault++;
                if(existedOrDefault <= 2){
                    map.put(temp, existedOrDefault);
                }
            }
            int c1 = 0;
            int c2 = 0;
            for (Character c : map.keySet()) {
                int value = map.get(c);
                if(value == 1){
                    c1++;
                }else{
                    c2++;
                }
            }
            System.out.println(c2 + (c1 / 2));
        }
        input.close();
    }
}
