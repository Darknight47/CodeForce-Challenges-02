/**
According to a new ISO standard, a flag of every country should have a chequered field n × m,
each square should be of one of 10 colours, and the flag should be «striped»: each horizontal
row of the flag should contain squares of the same colour, and the colours of adjacent horizontal
rows should be different. Berland's government asked you to find out whether their flag meets the new ISO standard.

Input:
The first line of the input contains numbers n and m (1 ≤ n, m ≤ 100), n — the amount of rows,
m — the amount of columns on the flag of Berland. Then there follows the description of the flag:
each of the following n lines contain m characters. Each character is a digit between 0 and 9, and
stands for the colour of the corresponding square.

Output:
Output YES, if the flag meets the new ISO standard, and NO otherwise.

Input:
3 3
000
111
222

Output:
YES
 
* 
*/

import java.util.Scanner;

public class Flag {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        boolean notOk = false;
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            String str = input.next();
            strs[i] = str;
            char[] arr = str.toCharArray();
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] != arr[0])
                {
                    notOk = true;
                    break;
                }
            }
            if(notOk)
                break;    
        }
        if(notOk)
        {
            System.out.println("NO");
        }
        else
        {
            boolean same = false;
            for (int i = 1; i < strs.length; i++) {
                if(strs[i].equalsIgnoreCase(strs[i - 1]))
                {
                    same = true;
                    break;
                }
            }
            if(same)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
        input.close();
    }
}
